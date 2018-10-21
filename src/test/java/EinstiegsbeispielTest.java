import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EinstiegsbeispielTest {

    Einstiegsbeispiel x;
    @BeforeEach
    public void setup(){
        x = new Einstiegsbeispiel();
    }

    @AfterEach
    public void tearDown(){
        x = null;
    }

    @Test
    public void validTest1(){
        int y = x.isPalindrome("anna");
        assertEquals(1,y);
    }

    @Test
    public void validTest2(){
        int y = x.isPalindrome("OTTO");
        assertEquals(1,y);
    }
    @Test
    public void invalidTest1(){
        int y = x.isPalindrome("Peter");
        assertEquals(0,y);
    }
    @Test
    public void invalidInput(){
        boolean y = x.digitTest("123");
        assertEquals(true,y);
    }
}