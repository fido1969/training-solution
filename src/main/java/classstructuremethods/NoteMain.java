package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note=new Note();
        note.setName("Szabadkai János");
        note.setTopic("IntelliJ programming");
        note.setText("Learning about Methods in Java.");

        System.out.println(note.getNoteText());
    }
}
