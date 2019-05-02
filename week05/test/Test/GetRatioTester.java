import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GetRatioTester {
    //Recommended naming of the tst method:
    // [MethodName_StateUnderTest_ExpectedBehavior]


    @Test
    public void getRatio_PositiveInput_ReturnsRetio() {
        //Act

        double ratio = Main.getRatio(6, 2); // volame getRatio z mainu


        // do everithing neccesery to determine if the expected
        assertEquals(3, ratio, 0.0001);


    }

    @Test
    public void getRatio_DivideByZero_ReturnsRatio_ReturnsZero() {
        double ratio = Main.getRatio(6, 0);

    }

}




