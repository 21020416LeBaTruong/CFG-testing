import static org.junit.Assert.assertEquals;
import static com.example.Main.price;

import org.junit.Test;

public class Testing {
    @Test
    public void boundary_testing1() {
        assertEquals(-1, price(-2));
    }

    @Test
    public void boundary_testing2() {
        assertEquals(60, price(2));
    }

    @Test
    public void boundary_testing3() {
        assertEquals(150, price(6));
    }

    @Test
    public void boundary_testing4() {
        assertEquals(200, price(9));
    }

    @Test
    public void boundary_testing5() {
        assertEquals(-1, price(17));
    }

}
