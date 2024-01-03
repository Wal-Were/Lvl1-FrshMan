import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Prty {
    
    private int course;
    private int study = 0; 
    private int party = 0;
    private Clip clip; 

    public Prty(int course) {
        this.course = course;

        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\classroom-background-54177.wav");

        Object[] options = {"Listen to the lecture", "Talk to your classmates"};
int n = JOptionPane.showOptionDialog(null,
    "As the teacher discuss, you decided what to do now",
    "Make a choice",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,     
    options,  
    options[0]);

switch(n) {
            case 0: 
                JOptionPane.showMessageDialog(null, "You paid close attention to lecture");
                JOptionPane.showMessageDialog(null, "it took a while, but you slowly understand the lessons");
                study += 2;
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Whispering to your seatmate,\n"+
                                                                            "You strike a conversation with them,\n"+
                                                                            "After a while, he told something to you,\n"+
                                                                            "\"Yo, there's gonna be a party later this week,\" He whispered,\n"+
                                                                            "\"Friday. 8pm. Be there\".");
                party = 1; 
                break;
        }

        JOptionPane.showMessageDialog(null, "After class, you went back to your dorm to rest for next day.");
        
        stopSound();
        
        new Sched(course, party, study);
    }

    public void playSound(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            
            // Loop the sound
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            
            // Start the sound
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); // Stop the sound
        }
    }
}