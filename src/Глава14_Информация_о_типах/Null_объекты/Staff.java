package Глава14_Информация_о_типах.Null_объекты;

import java.util.ArrayList;

class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        this.title = jobTitle;
        this.person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }

    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null) person = Person.NULL;
    }

    @Override
    public String toString() {
        return "Position " + title + " " + person;
    }
}

public class Staff extends ArrayList<Position> {
    public void add(String title, Person person){
        add(new Position(title, person));
    }

    public void add(String... titles){
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public Staff(String... titles) {add(titles);}

    public boolean positionAvailable(String title){
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL){
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person hire){
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL){
                position.setPerson(hire);
                return;
            }
            throw new RuntimeException("Position " + title + " not available");
        }
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President","CTO","Marketing manager","Product manager","Project lead",
                "Software Engineer","Software Engineer","Software Engineer","Software Engineer","Test engineer",
                "Technical writer");
        staff.fillPosition("President",
                new Person("Oleg", "Porodkin", "The Top, Lonely At"));
        staff.fillPosition("Product manager",
                new Person("Natasha", "Vais", "The Top, Lonely"));
        if (staff.positionAvailable("Software Engineer"))staff.fillPosition("Software Engineer",
                new Person("Bob", "Coder", "Bright Light City"));
        System.out.println(staff);

    }
}
