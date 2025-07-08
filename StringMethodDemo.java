public class StringMethodDemo {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        System.out.println("Original String: \"" + str + "\"");
        System.out.println("Length: " + str.length());
        String trimmed = str.trim();
        System.out.println("Trimmed: \"" + trimmed + "\"");
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        System.out.println("Char at index 1: " + trimmed.charAt(1));
        System.out.println("Substring (0 to 5): " + trimmed.substring(0, 5));
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));
        System.out.println("Index of 'J': " + trimmed.indexOf('J'));
        System.out.println("Last Index of 'l': " + trimmed.lastIndexOf('l'));
        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));
        System.out.println("Equals 'Hello Java World': " + trimmed.equals("Hello Java World"));
        System.out.println("EqualsIgnoreCase 'hello java world': " + trimmed.equalsIgnoreCase("hello java world"));
        String[] words = trimmed.split(" ");
        System.out.println("Split by space:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        System.out.println("Starts with 'Hello': " + trimmed.startsWith("Hello"));
        System.out.println("Ends with 'World': " + trimmed.endsWith("World"));
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
    }
}