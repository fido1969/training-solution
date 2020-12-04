package stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    public void concatNameHungarianStyleTest(){
        assertEquals("Dr. Szabadkai Fido János",new Name("Szabadkai", "János", "Fido", Title.DR).concatNameHungarianStyle());
        System.out.println(new Name("Szabadkai", "János", "Fido", Title.DR).concatNameHungarianStyle());

        assertEquals("Dr. Szabadkai János",new Name("Szabadkai", "János", "", Title.DR).concatNameHungarianStyle());
        System.out.println(new Name("Szabadkai", "János", "", Title.DR).concatNameHungarianStyle());

        assertEquals("Dr. Szabadkai János",new Name("Szabadkai", "János", null, Title.DR).concatNameHungarianStyle());
        System.out.println(new Name("Szabadkai", "János", null, Title.DR).concatNameHungarianStyle());

        assertEquals("Szabadkai Fido János",new Name("Szabadkai", "János", "Fido", null).concatNameHungarianStyle());
        System.out.println(new Name("Szabadkai", "János", "Fido", null).concatNameHungarianStyle());
    }

    @Test
    public void concatNameWesternStyleTest(){
        assertEquals("Dr. János Fido Szabadkai",new Name("Szabadkai", "János", "Fido", Title.DR).concatNameWesternStyle());

        assertEquals("Dr. János Szabadkai",new Name("Szabadkai", "János", "", Title.DR).concatNameWesternStyle());

        assertEquals("Dr. János Szabadkai",new Name("Szabadkai", "János", null, Title.DR).concatNameWesternStyle());;

        assertEquals("János Fido Szabadkai",new Name("Szabadkai", "János", "Fido", null).concatNameWesternStyle());
    }

    @Test
    public void invalidParametersShouldThrowExceptionNullFamilyName() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Name(null, "John", "G",Title.DR));
        assertEquals("Family name and Given name must be given!", ex.getMessage());
    }

    @Test
    public void invalidParametersShouldThrowExceptionEmptyFamilyName() throws IllegalArgumentException{
        Exception exception=assertThrows(IllegalArgumentException.class,()-> new Name("","John","",null));
        assertEquals("Family name and Given name must be given!",exception.getMessage());
    }

    @Test
    public void invalidParametersShouldThrowExceptionNullGivenName() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class,()->new Name("Smith",null,null,null));
        assertEquals("Family name and Given name must be given!",ex.getMessage());
    }

    @Test
    public void invalidParametersShouldThrowExceptionEmptyGivenName()throws IllegalArgumentException{
        Exception exception=assertThrows(IllegalArgumentException.class, ()->new Name("Smith","","",null));
        assertEquals("Family name and Given name must be given!",exception.getMessage());

    }

}