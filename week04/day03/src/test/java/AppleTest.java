import org.junit.Assert;
import org.junit.Test;
//Create a test class
public class AppleTest {

    //Create a test method
    @Test
    public void getApple_newApple_shouldBeApple() {
        //Instantiate an Object from your class in the method
        Apple aplle = new Apple();
        //Use the assertEquals()
        Assert.assertEquals("apple", aplle.getApple());
    }
}
