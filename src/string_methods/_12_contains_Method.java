package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        -retur
        -returns boolena
        -non-static
        -takes one argument as CharSequence same like String

 */


        String s= "TechGlobal School";

        System.out.println(s.contains("Tech")); //True
        System.out.println(s.contains("School"));//true
        System.out.println(s.contains("a")); //true
        System.out.println(s.contains("E"));//false

        //IMPORTANT

       System.out.println(s.contains(" ")); //True
        System.out.println(s.contains(s));//true
        System.out.println(s.contains("Education")); //false
    }
}
