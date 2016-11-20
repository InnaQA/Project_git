package Tests;

import org.junit.*;
import com.company.java.Methods;
import com.company.java.Main;
public class MethodsTest {
    @BeforeClass
    public static void precondition(){
        Methods square = new Methods ();
        System.out.println("Test cases was started. ");
    }
    @Before
    public void messageStart(){
        System.out.println("Test started.");
    }
    @After
    public void messageFinish(){
        System.out.println("Test finished!");
    }

    @org.junit.Test (timeout = 3000)
    public void getSquareCircle() throws Exception {
Methods first = new Methods ();
        Assert.assertEquals(true,first.getSquareCircle(2)); // почему он не пройден? что не так?
    }

    @org.junit.Test (timeout = 3000)
    public void getSideTriangle() throws Exception {
Methods second = new Methods ();
        Assert.assertEquals(true,second.getSideTriangle(2,2,4)); // почему он не пройден? что не так?
    }

    @org.junit.Test (timeout = 3000)
    public void getEvenNumber() throws Exception {
Methods third = new Methods();
        Assert.assertEquals(true,third.getEvenNumber(7)); // почему он не пройден? что не так?
    }

    @org.junit.Test (timeout = 3000)
    public void getFirstHigher() throws Exception {
Methods fourth = new Methods ();
        Assert.assertEquals(false,fourth.getFirstHigher(12,35));


        Assert.assertEquals(true,fourth.getFirstHigher(35,12));
    }

    @org.junit.Test (timeout = 3000)
    public void getFirstHigher1() throws Exception {
        Methods fourth = new Methods ();
        Assert.assertEquals(true,fourth.getFirstHigher(35,12));
    }

}