package mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    @Mock
    CalculatorService calculatorService;

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    /*
    @Before
    public void init() {
        //Create the mock object of calculator service
        calculatorService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calculatorService);
    }
    */

    @Test
    public void testAdd(){
        //add the behavior of calc service to add two numbers
        when(calculatorService.add(10.0,20.0)).thenReturn(30.00);


        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);

        Mockito.verify(calculatorService, atLeast(1)).add(10.0, 20.0);

        Mockito.verify(calculatorService, atLeastOnce()).add(10.0, 20.0);

    }

}
