import javax.sound.sampled.*;
import java.io.File;
import javax.swing.*;
import java.awt.*;

public class Data {
    
    private Clip clip; 

    public Data() {
        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\montage-66880.wav");
        
        UIManager.put("OptionPane.background", new Color(255, 218, 185)); // Peach background
        UIManager.put("Panel.background", new Color(255, 218, 185)); // Peach background
        UIManager.put("OptionPane.messageForeground", Color.BLACK); // Gray text
        UIManager.put("OptionPane.messageFont", new Font("Helvetica Neue", Font.PLAIN, 21)); 
        
        Object[] options = {"Proceed"};
        
        String message1 = "Welcome to, \"Lvl 1: Freshman\",\n" +
                          "The game will follow you (the student),\n" +
                          "As you survive college,\n" +
                          "Well, until preliminary anyway,\n" +
                          "So it will be a short but fun game,\n" +
                          "Where your choices will affect how the stories fortold,\n" +
                          "So...";
        
        int n = JOptionPane.showOptionDialog(null, message1, "Lvl 1: Freshman",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (n == JOptionPane.YES_OPTION) {
            String message2 = "Welcome to College.";
            n = JOptionPane.showOptionDialog(null, message2, "Lvl 1: Freshman",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            
            if (n == JOptionPane.YES_OPTION) {
                try {
                    Thread.sleep(1500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                stopSound(); 
                new Feel();
            }
        }
    }

    public void playSound(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    public void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); 
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(1000,800)); 
        new Data();
    }
}