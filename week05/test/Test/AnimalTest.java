import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    //MethodName_
    @Test
    public void eat_PositiveInput_DecreaseByValue(){
        Animal animal = new Animal(87);
        animal.eat(20);

        assertEquals(67, animal.hunger);
    }
}
