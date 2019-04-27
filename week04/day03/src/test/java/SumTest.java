import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SumTest {

    @Test
    public void Sum_test_list_of_arrays(){
        List<Integer>integerList = new ArrayList<>();
        Sum sum = new Sum(integerList);

        assertEquals(integerList, sum.inputNumbers);
    }

    public void Sum_test_empty_elements(){
        List<Integer>emptyList = new ArrayList<>();


    }

    @Test
    public void Sum_test_one_element(){
        List<Integer>oneElementList = new ArrayList<>();
    }

    @Test
    public void Sum_test_multiple_elements (){
        List<Integer>multipleElements = new ArrayList<>();

    }

    @Test
    public void Sum_test_null (){
        List<Integer>nullInside = new ArrayList<>();

    }


}
