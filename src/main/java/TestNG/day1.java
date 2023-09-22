package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

    @AfterTest
    public void lastExecution()
    {
        System.out.println("I will execute last");
    }

    public void Demo()
    {
        System.out.println("Hello");
    }

    @Test(enabled = false)
    public void SecondTest()
    {
        System.out.println("bye");
    }

    @Test(groups = {"smoke"})
    @BeforeTest
    public void prerequisite()
    {
        System.out.println("I will execute first");
    }
}
