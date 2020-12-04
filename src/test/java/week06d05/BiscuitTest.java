package week06d05;

import org.junit.jupiter.api.Test;
import week06d04.Item;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    public void biscuitTest(){
        Biscuit biscuit0 = new Biscuit(BiscuitType.FIDO,50);
        assertEquals(50,biscuit0.getGramAmount());
        assertEquals(BiscuitType.FIDO,biscuit0.getType());

        Biscuit biscuit1 =Biscuit.of(BiscuitType.MIZO,18);
        assertEquals(18,biscuit1.getGramAmount());
        assertEquals(BiscuitType.MIZO,biscuit1.getType());

        Biscuit biscuit2 =Biscuit.of(BiscuitType.MIZO,18);
        assertEquals(10,biscuit2.getType().getGramAmount());
    }

    @Test
    void biscuitTestBiscuitType(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Biscuit(null, 10));
        assertEquals("Type is missing!",ex.getMessage());
    }

    @Test
    void biscuitTestBiscuitTypeGramAmount(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Biscuit(BiscuitType.FITI, 0));
        assertEquals("There must be a valid gramm amount!",ex.getMessage());
    }

}