import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.StreamSupport.stream;

public class test1 {
    //Count the number of names starting with alphabet A in list
    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Allen");
        names.add("John");
        names.add("Adam");
        names.add("Rochell");
        names.add("Anna");
        int count=0;

        for (int i=0; i< names.size(); i++)
        {
            String actual = names.get(i);
            if (actual.startsWith("A"))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void streamFilter()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Allen");
        names.add("John");
        names.add("Adam");
        names.add("Rochell");
        names.add("Anna");

        //there is no life intermediate op if there is no terminal op
        //terminal operation will execute only if inter op (filter) returns true
        //we can create stream
        //how to use filter in stream API

        Long c = names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);

        long d = Stream.of("Allen","John","Adam","Rochell","Anna").filter(s->
        {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);

        //Print all the names of ArrayList
        //names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
    }

    @Test
    public void streamMap()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("man");
        names.add("Don");
        names.add("women");

        //Print names which have last letter as "n" with Uppercase
        Stream.of("Allen","John","Adam","Rochell","Anna").filter(s -> s.endsWith("n"))
                .map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));


        //Print names which have first letter as "a" with uppercase and sorted
        List<String> names1 = Arrays.asList("Allen","John","Adam","Rochell","Anna");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        //Merging 2 different lists
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        //newStream.sorted().forEach(s -> System.out.println(s));


        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    }

    @Test
    public void streamCollect()
    {
        List<String> ls = Stream.of("Allen","John","Adam","Rochell","Anna").filter(s -> s.endsWith("n"))
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(0));


        //Print unique number from below array
        //sort the array - 3rd index - 1,2,3,5,7,9
        List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
        //values.stream().distinct().forEach(s -> System.out.println(s));
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));



    }
}
