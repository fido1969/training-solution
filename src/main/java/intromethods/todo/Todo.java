package intromethods.todo;

public class Todo {

    private String caption;
    private boolean finished;

    public void finish() {
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }

    public String getCaption() {
        return caption;
    }

    public Todo(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return caption + " (" + (finished ? "finished" : "not finished") + ")";
    }
}
