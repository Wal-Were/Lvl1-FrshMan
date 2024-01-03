import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Checkone {
    private Clip clip1;
    private Clip clip2;

    public Checkone(int feeling, int gender) {
        clip1 = playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\crowd_talking-6762.wav");
        Object[] options = {"Proceed"};

        String message = "Leaving the area, you walked around the school,\n"+
                          "Up some stairs, down some halls, you walked, \n"+
                          "until you finally stood before  the door to your first class,\n"+
                          "You felt...";

JOptionPane.showMessageDialog(null, message);

        switch (feeling) {
            case 1:
                try {
                    JOptionPane.showMessageDialog(null, "Excited inside, you can't wait to enter class, \n After all, you were able to enroll in your dream course.");
                    break;
                } catch (Exception e) {
                }
            case 2:
                String message1 = "Empty inside, you stared at the classroom's sign beside the door,\n" +
                                 "after all, you just picked a course that interested you at the time.";
                                 
                JOptionPane.showMessageDialog(null, message1);
                break;
            case 3:
                String message2 = "Frustration, you rather be anywhere but here,\n" +
                                 "After all, you picked a course that your friends picked,\n" +
                                 "but you quickly lost interest when they enrolled in different schools.";
                JOptionPane.showMessageDialog(null, message2);
                break;
            case 4:
                try {
                    clip2 = playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\heartbeat-drum-sound-83410.wav");

                    String message3 = "Doubtful, what is the point when you can just earn a living without a diploma,\n"+
                        "Closing your eyes, you decided to think carefully of your decision,\n"+
                        "The pros and cons,\n"+
                        "The risk and rewards,\n"+
                        "The benefits and consequences,\n"+
                        "And in the end...";

JOptionPane.showMessageDialog(null, message3);
        boolean isCorrect = new java.util.Random().nextBoolean();
        if (isCorrect) {
            String message4 = "You decided to drop out of school.\n" +
                 "Believing that you can make it far without a diploma.\n" +
                 "After all, some of the richest people didn't finish high school.\n" +
                 "Some call it risky.\n" +
                 "Others would call it dumb,\n" +
                 "But for you, it's your choice.\n" +
                 "So you turned around and left school.\n";

JOptionPane.showMessageDialog(null, message4);

boolean isLuckier = new java.util.Random().nextBoolean();
            if (isLuckier) {

    String messageLuckier = "Years later, you find yourself as a successful entrepreneur,\n" +
                            "proving that success isn't always about formal education.\n"+
                            "As you stare outside your window, you remember the moment when you drop out of college,\n"+
                            "Till this day, you don't regret it.";

    JOptionPane.showMessageDialog(null, messageLuckier);
    JOptionPane.showMessageDialog(null, "Secret Ending: Drop Out and Rise Up.");
     System.exit(0);
            } else {

            String message5 = "Years later, you find yourself working as a cashier in,\"Seven-24\",\n" +
                 "Everyday, you find students, from your old college, entering the store,\n" +
                 "Their eyes, revealing their excitment for learning,\n" +
                 "Seeing their excited face, made you question if dropping out was a wise action,\n" +
                 "Sadly, its too late for that now,\n" +
                 "Perhaps, it will get better someday...\n" +
                 "Or not.";

JOptionPane.showMessageDialog(null, message5);
JOptionPane.showMessageDialog(null, "Secret Ending: Drop Out and Luck Out.");
            System.exit(0);  
            }
        } else {
            JOptionPane.showMessageDialog(null, "You decided to stay in school.");
            JOptionPane.showMessageDialog(null, "After all, \nit would be a waste of your parent's money, \nsince they already paid your tuiton.");
        }
    } catch (Exception e) {
    }
    break;
}
        stopSound(clip1);
        stopSound(clip2);
        new Course(feeling, gender);
        
    }


public Clip playSound(String soundName) {
        Clip clip = null;
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        return clip;
    }

    public void stopSound(Clip clip) {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}