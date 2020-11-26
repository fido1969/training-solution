package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrive {

    @Test
    public void Test() {
        String s = "John Doe";
        s = s.toUpperCase();
        assertEquals("JOHN DOE", s);

        String u = new String("John Doe");
        String t = new String("John Doe");
        System.out.println(u.equals(t));
        assertEquals(u,t);

        String str = "AAAA";
        str = str.concat("fff");
        System.out.println(str);
        assertEquals("AAAAfff",str);

        String aa ="hhzz";
        String bb=aa+"ll";
        System.out.println(bb);
        assertEquals("hhzzll",bb);

        String szam= 1+2+"value";
        assertEquals("3value",1+2+"value");

        int i =8;
        String mm=""+i;
        System.out.println(mm);
        assertEquals("8",mm);
        mm=Integer.toString(i);
        assertEquals("8",mm);



    }

}
