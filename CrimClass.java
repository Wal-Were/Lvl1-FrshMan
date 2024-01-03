import javax.swing.*;

public class CrimClass {
    public CrimClass(int feeling, int gender, int course) {
        String engine;
        String name = ""; 

        if(feeling == 1){
            JOptionPane.showMessageDialog(null, "Excitedly, you opened the door\nEager to get to start learning");
        } else if(feeling == 2){
            JOptionPane.showMessageDialog(null, "You opened the door casually");
        } else if(feeling == 3){
            JOptionPane.showMessageDialog(null, "You opened the door, bottling in your frustration\nBegging for an easy college life");
        }

        {
            String message = "Your teacher was first to notice you,\n" +
                            "As he examined you,\n" +
                            "You stood attentively at his authoritative gaze,\n" +
                            "\"Your name,\" he requested";
    
            JOptionPane.showMessageDialog(null, message, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);
        }

        name = JOptionPane.showInputDialog("Please Enter your first name");

        String greeting = "Good Morning, ";
        if(gender == 1){         
            greeting += "Mister " + name;
        } else if(gender == 2){
            greeting += "Miss " + name;
        }
        JOptionPane.showMessageDialog(null, greeting);

        {

            String message = "\"You're late\" He commented. Pointing at the last empty seat,\n" +
                            "Once you sitted, your teacher checked the attendance again\n" +
                            "Once everyone was present, he spoke with control,\n" ;
        }
        {

            String message = "\"Today, I will not be giving any class.\"\n" +
                      " \"But tomorrow, I want everyone at attendance for important announcement\"\n" +
                      "And so, with class dismissed, you leave";
            
    
                            JOptionPane.showMessageDialog(null, message, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);
    }

    JOptionPane.showMessageDialog(null, "Clearing his voice, your teacher grabbed the class's attention,\n"+
                                                            "And so began your first day in college,\n"+
                                                            "Since it was just the first day, you barely had any classes,\n"+
                                                            "So you returned to your dorm and relax,\n"+
                                                            "Welcome to College, " + name);
            new StClass(gender, course, name);

    }

}