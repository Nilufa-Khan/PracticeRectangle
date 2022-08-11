import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rec;
    @BeforeEach
    public  void setUp(){
        rec = new Rectangle();

    }
    @AfterEach
    public void tearDown(){
        rec = null;
    }
    @Test
    public void getAreaTest(){
        double actual = rec.getArea();
        double expected = 160.0;
        assertEquals(expected,actual);
    }

}