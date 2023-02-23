public class EssentialScheduling {

    public static void main(String args[]){

        //create a new instance of the class
        AutoSave as = new AutoSave();
        CourseSelection cs = new CourseSelection();
        Taskbar tb = new Taskbar();
        Welpage wp = new Welpage();
        FlowChart fc = new FlowChart();
        EngMajor em = new EngMajor();
        DirectionsPage dp = new DirectionsPage();

        as.display();
        cs.display();
        tb.display();
        wp.display();
        fc.display();
        em.display();
        dp.display();
    }


}
