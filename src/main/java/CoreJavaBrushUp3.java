public class CoreJavaBrushUp3 {
    public static void main(String[] args) {

        //String is an object --> Using String literal

        //String s1 = "Prajakta Pataskar QA Automation";
        String s5 = "Hello";

        // Using new keyword
        String s2 = new String("Welcome");
        String s3 = new  String("Welcome");

        String s = "QA Prajakta Pataskar";
        String[] splittedString = s.split("Prajakta");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());
        for (int i=s.length()-1; i>=0; i--)
        {
            System.out.println(s.charAt(i));
        }


    }
}
