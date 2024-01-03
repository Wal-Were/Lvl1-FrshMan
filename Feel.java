import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Feel {
    int n;
    private Clip clip; 

    public Feel() {
        Object[] options = {"Proceed"};

        if (n == JOptionPane.OK_OPTION) {
            playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\crowd_talking-6762.wav");
            String message = "As students rush around to their next class,\n" +
                             "and staff personnels preparing today's lesson,\n" +
                             "you stand at the gate of the school,\n" +
                             "recalling why you are there...";
            n = JOptionPane.showOptionDialog(null, message, "Lvl 1: Freshman",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        }
        if (n == JOptionPane.OK_OPTION) { 
            String[] feelings = {"I am excited", "I don't care", "I hate school!", "I don't know"};
            String[][] messages = {
                {"You find learning fun,\nreading various topics, \nand nurturing your passion for learning."},
                {"It doesn't matter if you love it or hate it,\nall you care about is getting a job after once you finally graduated."},
                {"You hated being there, you rather be anywhere,\n but you can't leave with the security guard guyardung the entrance"},
                {"You don't know how you feel,\n your parents told you that college is necessary, \n but is it really?"}
            };
    
            int feelingChoice = JOptionPane.showOptionDialog(null, "How do you feel about college?", "Lvl 1: Freshman",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, feelings, feelings[0]);
    
            JOptionPane.showMessageDialog(null, messages[feelingChoice], "Message", JOptionPane.INFORMATION_MESSAGE);

            if (n == JOptionPane.OK_OPTION) {
                stopSound(); 
                new Toilet(feelingChoice + 1);  
            }
        }
    }

    public static void main(String[] args) {
        new Feel();
    }
    public void playSound(String soundFile) { 
        try {
            File f = new File(soundFile);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(f);
            clip = AudioSystem.getClip(); 
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void stopSound() {
        if (clip.isRunning()) {
            clip.stop(); 
        }
    }
}