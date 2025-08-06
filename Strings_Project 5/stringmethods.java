public class stringmethods {
    public static void main(String[] args) {
        String str1 = "  Hello World  ";
        String str2 = "hello world";

        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2, 7));
        System.out.println(str1.equals(str2));
        System.out.println(str1.trim().equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.trim().compareToIgnoreCase(str2));
        System.out.println(str1.contains("World"));
        System.out.println(str1.startsWith("  He"));
        System.out.println(str1.endsWith("ld  "));
        System.out.println(str1.indexOf("World"));
        System.out.println(str1.lastIndexOf("l"));
        System.out.println(str1.trim());
        System.out.println(str1.replace('l', 'x'));
        System.out.println(str1.replaceAll("o", "0"));
        System.out.println(str1.replaceFirst("o", "O"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        for (char c : str1.toCharArray()) System.out.print(c + " ");
        System.out.println();
        System.out.println("".isEmpty());
        System.out.println(String.valueOf(100));
    }
}
