import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.JButton;



public class DirectionsPage extends EssentialScheduling{

    private boolean hasDoneTutorial = false;
    ArrayList<ImageIO> panels = new ArrayList<>();
    File imageFile;
    final File tutorialImages = new File(/*preset file will be created*/"");
    JButton goBack = new JButton();
    JButton goForward = new JButton();
    JButton showPercentageBar = new JButton();


    public void addImageFile(String fileName){
        imageFile = new File(fileName);
    }

    public void runTutorial(){
        if(hasDoneTutorial = false){
            /*
            run tutorial by displaying images in tutorialImages file
            and using mouse input to scroll through
            */
            this.hasDoneTutorial = true;
        }
    }

    public void PercentageBar(){
        showPercentageBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //undoes the back function
            }
        });
    }

    public void back(){
        showPercentageBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //undoes the back function
            }
        });
    }


    public void forward(){
        showPercentageBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            //undoes the back function
        }
        });
    }

}

