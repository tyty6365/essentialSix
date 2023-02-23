import java.util.*;
public class Taskbar implements Displayable{
    @Override
    public void display() {

    }

    public class HomePage {
        // Class Variables
        private String linkToAccount;

        // Constructor
        public HomePage(String link)
        {
            linkToAccount = link;
        }

        // Getter and Setter Methods
        public String GetAccountLink()
        {
            return linkToAccount;
        }

        public void SetAccountLink(String link)
        {
            linkToAccount = link;
        }
    }

    public class FAQ {
        // Class Variables
        private String faqFile;

        // Constructor
        public FAQ(String pathToFAQ)
        {
            faqFile = pathToFAQ;
        }

        // Getter and Setter Methods
        public String GetFAQFile()
        {
            return faqFile;
        }

        public void SetFAQFile(String newFile)
        {
            faqFile = newFile;
        }

        public void DisplayFAQ()
        {
            // Code that reads and displays the FAQ file
        }
    }

    public class ITSupport {
        // Class Variables
        private String groupEmail;

        // Constructor
        public ITSupport(String pathToFile)
        {
            groupEmail = pathToFile;
        }

        // Getter and Setter Methods
        public String GetGroupEmail()
        {
            return groupEmail;
        }

        public void SetGroupEmail(String newFile)
        {
            groupEmail = newFile;
        }
    }
}