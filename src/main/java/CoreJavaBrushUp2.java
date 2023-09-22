import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};

        //2,4,6,8,10,122
        //Check if array has multiple of 2

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;
            } else {
                System.out.println(arr2[i] + "is not multiple of 2");
            }
        }

            ArrayList<String> a = new ArrayList<String>();
            a.add("Prajakta");
            a.add("Pataskar");
            a.add("QA Automation Engineer");
            a.add("At Coditas");
            System.out.println(a.get(3));

            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }
            System.out.println("*****************");

            for (String val : a) {
                System.out.println(val);
            }

            //Item is present in ArrayList
            System.out.println(a.contains("QA Automation Engineer"));
            String[] name = {"Prajakta", "Pataskar", "At Coditas"};
            List<String> nameArrayList = Arrays.asList(name);
            nameArrayList.contains("QA Automation Engineer");


            //create object of the class - object.method

        }
}

