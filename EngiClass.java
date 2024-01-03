import java.util.Random;
import javax.swing.*;

public class EngiClass {
    public EngiClass(int feeling, int gender, int course) {
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
                        "His posture tells on a man who's passionate in their field,\n" +
                        "While maintaing the authorative aura around him,\n" +
                        "\"You're late\" He commented,\n";

        JOptionPane.showMessageDialog(null, message, "College Life", JOptionPane.PLAIN_MESSAGE);
}
{
        String message ="\"Since you are late. Care to answer my question\" He said. " + 
                        " pointing at the board,\n" +
                        "The eqaution seems familar";

        JOptionPane.showMessageDialog(null, message, "College Life", JOptionPane.PLAIN_MESSAGE);
}

        Object[] options = {"Attempt to answer", "Apologize for being late", "Stall for time"};
        int choice = JOptionPane.showOptionDialog(null, "What would you do?", "Choose an option",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:  
                if(feeling == 1){
                    String message = "Closer look on the equation,\n" +
                                     "You realized you know the answer to this,\n" +
                                     "So you answered it with confidence and your teacher smiled,\n" +
                                     "\"Correct,\" He said, \"Please, sit down,\" ";
      
                    JOptionPane.showMessageDialog(null, message, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);
                } else if(feeling == 2 || feeling == 4){
                    Random rand = new Random();
                    boolean isCorrect = rand.nextBoolean();

                    if (isCorrect) {
                    JOptionPane.showMessageDialog(null, "Try as hard as you can.");
                    JOptionPane.showMessageDialog(null, "You can't solve the problem.");
                    JOptionPane.showMessageDialog(null, "Disappointed with your performance, he silently pointed at the empty chair at the back of the room");
                    JOptionPane.showMessageDialog(null, "You rush to the sit, wishing to be ridden of that embarrassment.");
    }else{
            JOptionPane.showMessageDialog(null, "Blessed by lady luck, you managed to solve the problem,\n"+
            "Seeing that you were able to answer his question. He gestured to an empty chair,\n"+
            "You sat down as you were thankful of getting a lucky break.");

    }
                } else if(feeling == 3){
                    String message = "You never paid close attention in school,\n" +
                                     "So, you were left standing there. Embarrassing yourself,\n" +
                                     "\"Nevermind Just sit down.\" He ordered,\n" +
                                     "And so you did. ";
                
                    JOptionPane.showMessageDialog(null, message, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);

            }
            break;
            case 1:
                if(feeling == 3){
                JOptionPane.showMessageDialog(null, "Hearing your unsincere apology, he glares for you to sit down");
            } else {
                JOptionPane.showMessageDialog(null, "\"Just sit down.\" he spoke, Tired with all the same apologies,\nYou avoided his gaze as you sat down.");
            
            
            }
            break;
            case 2:  
    String message = "You just stood there, awkwardly,\n" +
                     "Your teacher raised an eyebrow at this bizarre event,\n" +
                     "\"Nevermind,\" He said, letting you sit down ";
    JOptionPane.showMessageDialog(null, message, "Lvl 1: Freshman", JOptionPane.PLAIN_MESSAGE);
break;
                            }
        JOptionPane.showMessageDialog(null, "\"Name please,\" He asked");

        name = JOptionPane.showInputDialog("Enter your first name");
        String greeting = "Good Morning, ";
        if(gender == 1){         
            greeting += "Mister " + name;
        } else if(gender == 2){
            greeting += "Miss " + name;
        }
        JOptionPane.showMessageDialog(null, greeting);

        JOptionPane.showMessageDialog(null, "Clearing his voice, your teacher grabbed the class's attention,\n"+
                                                            "And so began your first day in college,\n"+
                                                            "Since it was just the first day, you barely had any classes,\n"+
                                                            "So you returned to your dorm and relax,\n"+
                                                            "Welcome to College, " + name);

            new StClass(gender, course, name);
        }
    }
    
    





