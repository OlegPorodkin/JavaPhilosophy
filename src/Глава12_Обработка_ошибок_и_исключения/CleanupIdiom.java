//: exceptions/CleanupIdiom.java
package Глава12_Обработка_ошибок_и_исключения; /* Added by Eclipse.py */
// Each disposable object must be followed by a try-finally

class NeedsCleanup { // Construction can't fail
  private static long counter = 1;
  private final long id = counter++;
  public void dispose() {
    System.out.println("NeedsCleanup " + id + " disposed");
  }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
  // Construction can fail:
  public NeedsCleanup2() {}
}

public class CleanupIdiom {
  public static void main(String[] args) throws ConstructionException {
    // Section 1:
    NeedsCleanup nc1 = new NeedsCleanup();
    try {
      // ...
    } finally {
      nc1.dispose();
    }

    // Section 2:
    // If construction cannot fail you can group objects:
    NeedsCleanup nc2 = new NeedsCleanup();
    NeedsCleanup nc3 = new NeedsCleanup();
    try {
      // ...
    } finally {
      nc3.dispose(); // Reverse order of construction
      nc2.dispose();
    }

    // Section 3:
    // If construction can fail you must guard each one:
    NeedsCleanup2 nc4 = new NeedsCleanup2();
    try {
      NeedsCleanup2 nc5 = new NeedsCleanup2();
      try {
        // ...
      } finally {
        nc5.dispose();
      }
    } finally {
      nc4.dispose();
    }
  }
} /* Output:
NeedsCleanup 1 disposed
NeedsCleanup 3 disposed
NeedsCleanup 2 disposed
NeedsCleanup 5 disposed
NeedsCleanup 4 disposed
*///:~
