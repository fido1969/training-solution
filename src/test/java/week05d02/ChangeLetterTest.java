package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void createTest(){
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("*****mnbvCxy*íűáéLKjhgfdsúőpztRWqóüö",changeLetter.changeVowels0("AeIoUmnbvCxyaíűáéLKjhgfdsúőpztRWqóüö"));
    }

    @Test
    public void createTest1(){
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("mnbvCxyíűáéLKjhgfdsúőpztRWqóüö",changeLetter.changeVowels0("mnbvCxyíűáéLKjhgfdsúőpztRWqóüö"));
    }

    @Test
    public void createTest2(){
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("",new ChangeLetter().changeVowels0(""));
    }
}
