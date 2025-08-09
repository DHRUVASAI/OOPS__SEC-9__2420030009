public class stringImmutability {
    public static void main(String[] args)

    {

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
        s1=s1.concat("World");
        System.out.println(s1==s2);
        String s3="HelloWorld";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s3));
    }
}