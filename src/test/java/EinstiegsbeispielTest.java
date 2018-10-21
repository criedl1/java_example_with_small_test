import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EinstiegsbeispielTest {

    @Test
    public void testPalindrome(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();

        int x = positivetest.isPalindrome("anna");
        assertEquals(1,x);



    }
}