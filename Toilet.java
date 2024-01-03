import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Random;

public class Toilet {
    private int gender;
    private Clip clip;
    private Random random = new Random();

    public Toilet(int feeling) {
        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\crowd_talking-6762.wav");
        Object[] options = {"Proceed"};
        
        String message = "You checked your schedule and the time,\n" +
                         "and realized that you had some time before your first class would start, \n" +
                         "but just as you were about to start walking, a student bumped into you and left,\n" +
                         "wanting to avoid more embarrassment, you quickly got up and examine yourself,\n" +
                         "unkept hair, messy uniform, you can't accept letting others see you like this,\n" +
                         "so you walked a but, ignoring the gaze from students and staffs,\n" +
                         "until you eventually found a toilet.";
        
        int n = JOptionPane.showOptionDialog(null, message, "Lvl 1: Freshman",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        Object[] genderOptions = {"Enter the male's toilet", "Enter the female's toilet"};
        int genderChoice = JOptionPane.showOptionDialog(null, "Which do you enter?", "Restroom Choice",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, genderOptions, genderOptions[0]);

        String[] maleMessages = {
            "You straighten your shirt and pants, flash a smile at your reflection, and leave.",
            "You fixed your clothes, washed your face, and stepped out feeling refreshed.",
            "You took a moment to tidy up your clothes and hair, then left the restroom with a confident stride."
        };

        String[] femaleMessages = {
            "You adjust your skirt and blouse, put away your makeup, and leave.",
            "But sadly, it was crowded. So you only wetted your cloth and freshen up, and left the crowded toilet behind you",
            "It was brightly lit and smelled of lavender. \n You adjusted your outfit, touched up your makeup, and left, \nready to take on the world."
        };

        switch (genderChoice) {
            case 0:
                gender = 1;
                String maleMessage = "You enter the male's toilet.\nYour gender will now be recorded as male.\n" + maleMessages[random.nextInt(maleMessages.length)];
                JOptionPane.showMessageDialog(null, maleMessage);
                break;
            case 1:
                gender = 2;
                String femaleMessage = "You enter the female's toilet.\nYour gender will now be recorded as female.\n" + femaleMessages[random.nextInt(femaleMessages.length)];
                JOptionPane.showMessageDialog(null, femaleMessage);
                break;
        }
        stopSound();
        new Checkone(feeling, gender);
    }

    public static void main(String[] args) {
        new Toilet(1);
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