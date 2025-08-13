public class ass2 {
    public static void main (String[] args){
        String str1,str2,str3;
        str1="Hello World";
        str2="hello world";
        str3="Hello World";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
    }
}
