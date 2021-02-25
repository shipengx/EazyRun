package mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarTester {

    @Mock
    Engine engine;

    @Mock
    EngineOil engineOil;

    @InjectMocks
    Car car;

    @Test
    public void test() {
        when(engine.getEngineOil()).thenReturn(engineOil);
        when(engineOil.getName()).thenReturn("kunlun");
        Engine engine1 = car.getEngine();
        EngineOil engineOil1 = engine1.getEngineOil();
        Assert.assertEquals("kunlun", engineOil1.getName());
    }

}
