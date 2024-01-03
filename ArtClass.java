import java.util.Random;
import javax.swing.*;


public class ArtClass {
    
    public ArtClass(int feeling, int gender, int course) {
        String engine;
        String name;

        if(feeling == 1){
            JOptionPane.showMessageDialog(null, "Excitedly, you opened the door\nEager to get to start learning");
        } else if(feeling == 2){
            JOptionPane.showMessageDialog(null, "You opened the door casually");
        } else if(feeling == 3){
            JOptionPane.showMessageDialog(null, "You opened the door, bottling in your frustration\nBegging for an easy college life");
        }

{

        String message = "Your teacher was first to notice you,\n" +
                        "Waving with a smile, she pointed at at a chair and waited for you to sit down,\n" +
                        "Her relaxed posture, hides a sense of expertises in the her chosen field,\n" +
                        "\"Excuse me\" She called out to you, \"May I have your name.\"";

                        JOptionPane.showMessageDialog(null, message, "College Life", JOptionPane.PLAIN_MESSAGE);
}

        name = JOptionPane.showInputDialog("Enter your first name");

        JOptionPane.showMessageDialog(null, "\"Ah, I see...\" She said, \" Well welcome to my class, ");

        String greeting = "Good Morning, ";
        if(gender == 1){         
            greeting += "Mister " + name;
        } else if(gender == 2){
            greeting += "Miss " + name;
        }
        JOptionPane.showMessageDialog(null, greeting);

        {

        String message = "\"Since you are the last to join us\" She commented, \"Care to answer my question\" \n " +
                        "Putting her hands together, she smiled as she gave her question \n " +
                        "\"What is the meaning of art?\" She asked you";

                        JOptionPane.showMessageDialog(null, message, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);
}


        Object[] options = {"Attempt to answer", "Stall for time"};
        int choice = JOptionPane.showOptionDialog(null, "What would you do?", "Choose an option",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                switch (choice) {
                    case 0:  
                        String message = "";  
                        switch (feeling) {
                            case 1:
                                message = "Remembering what art meant to the person themselves,\n" +
                                          "She smiled at your answer and motion for you to sit down again, \n" +
                                          "\"Thank you,\" She said, \"now may I have your attention \"";
                                break;
                            case 2:
                                message = "You gave an answer you heard a famous artist said on what art is, \n" +
                                          "After you gave your answer, you notice your teacher frown a bit, before smiling again, \n" +
                                          "But you ignored it and sat down as she was address the class.";
                                break;
                            case 3:
                                message = "Since you have no love for arts, you just the first thing in mind, \n" +
                                          "\"The meaning of art is that it is art\" You answered, \n" +
                                          "She gave a short nod, before looking down at some paper, " +
                                          "Finally, she address the class.";
                                break;
                             case 4:
                                message = "You gave an answer you heard a famous artist said on what art is, \n" +
                                          "After you gave your answer, you notice your teacher frown a bit, before smiling again, \n" +
                                          "But you ignored it and sat down as she was address the class.";
                                break;
                        }
                        
                        JOptionPane.showMessageDialog(null, message);
                        break;
                
                    case 1:  
                        String message2 = "You stalled for time,\n" +
                                          "However, sensing your uneasiness,\n" +
                                          "She canceled her request and captured the class's attention.";
                        JOptionPane.showMessageDialog(null, message2, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                JOptionPane.showMessageDialog(null, "Clearing his voice, your teacher grabbed the class's attention,\n"+
                "And so began your first day in college,\n"+
                "Since it was just the first day, you barely had any classes,\n"+
                "So you returned to your dorm and relax,\n"+
                "Welcome to College, " + name);

            new StClass(gender, course, name);
        }
    }
    

    




