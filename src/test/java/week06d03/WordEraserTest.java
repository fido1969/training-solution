package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {

    @Test
    public  void wordEraserTest(){
        WordEraser we = new WordEraser();
        String original="alma körte barack alma szilva körte birsalma";
        String result = "körte barack szilva körte birsalma";
        assertEquals(result,we.eraseWord(original,"alma"));
        System.out.println(result);
    }

    @Test
    public  void wordEraserWithScannerTest(){
        WordEraser we = new WordEraser();
        String original="alma körte barack alma szilva körte birsalma";
        String result = "körte barack szilva körte birsalma";
        assertEquals(result,we.eraseWordWithScanner(original,"alma"));
        System.out.println(result);
    }

}