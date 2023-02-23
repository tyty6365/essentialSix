import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


    public class CourseSelection implements Displayable{
        String subjectName;
        String time;
        String professor;
        String section;
        ArrayList<String> currentSchedule = new ArrayList<>();
        JButton goBack = new JButton();

        public CourseSelection(){}

        public CourseSelection(String name, String time1, String professor1, String section1) {
            this.subjectName = name;
            this.time = time1;
            this.section = section1;
            this.professor = professor1;
        }
        public void display ( String subjectName1){
            display(subjectName1);
        }

        public  void addClass( String subjectName1){
            currentSchedule.add(subjectName1);
        }

        public void seeFriends(){
            listOfFriends(subjectName);
        }

        public ArrayList<String> listOfFriends( String subjectName){
            ArrayList<String> friends = new ArrayList<>();
            return friends;
        }

        public void backToHomePage(){

            goBack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)            {
                    System.out.println("You have arrived at home page");
                }
            });
        }

        @Override
        public void display() {

        }
    }
