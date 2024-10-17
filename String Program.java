import java.util.*;
class Main {
    public static void main(String[] args) {
        String string = "  Hello, World!  ";

        boolean hasUpper = string.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = string.chars().anyMatch(Character::isLowerCase);

        int length = string.length();
        String trimmedString = string.trim();

        System.out.println("Has uppercase: " + hasUpper);
        System.out.println("Has lowercase: " + hasLower);
        System.out.println("Length of the string: " + length);
        System.out.println("Trimmed string: " + trimmedString);
    }
}
