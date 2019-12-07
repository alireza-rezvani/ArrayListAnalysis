package ir.maktab32.java.projects.homework5.arraylistanalysis;

public class Utilities {
    public static boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}