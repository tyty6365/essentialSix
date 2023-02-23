public class AutoSave implements Displayable{

    // Class variables

    private String filename;

    private int interval;

    private boolean active;


    public AutoSave() {

    }
        // Constructor

    public AutoSave(String filename, int interval, boolean active) {

        this.filename = filename;

        this.interval = interval;

        this.active = active;

    }

    @Override
    public void display() {

    }
}


