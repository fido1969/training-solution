package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Learning", "computer programming");

        task.setDuration(120);
        System.out.println("Duration: "+task.getDuration());
        task.start();
        System.out.println("Day and time: "+task.getStartDateTime());
        System.out.println("Title: "+task.getTitle());
        System.out.println("Description: "+task.getDescription());
        System.out.println();

        System.out.println(task.toString());
    }
}
