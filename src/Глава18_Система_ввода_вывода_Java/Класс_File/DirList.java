package Глава18_Система_ввода_вывода_Java.Класс_File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File file = new File(".");
        String[] s;
        if (args.length == 0)
            s = file.list();
        else
            s = file.list(new DirFilter(args[0]));
        Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : s) {
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String arg) {
        pattern = Pattern.compile(arg);
    }
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}

