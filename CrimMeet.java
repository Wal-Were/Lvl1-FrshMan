import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class CrimMeet {

    private String name;
    private int gender;
    private int course;
    private Clip clip;


    public CrimMeet(int gender, int course, String name, int h, int min) {
        this.gender = gender;
        this.course = course;
        this.name = name;

        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\classroom-background-54177.wav");

        String time = h + ":" + String.format("%02d", min);
        JOptionPane.showMessageDialog(null, "The time is " + time + " Am.");

        if(h == 7 ){
            JOptionPane.showMessageDialog(null, "Majority of your classmates have already arrived,\n"+
                                                                        "wanting to stay on the teacher's good side,\n"+
                                                                        "they made sure they were there long before she arrived,\n" +
                                                                        "So you sat at the middle of the class.\n\n"+
                                                                        "Soon, the instructor arrived,\n"+
                                                                        "everyone turned silent as he silently recorded the attendance.");
        } else if(h == 8 && min < 30){
            JOptionPane.showMessageDialog(null, "Most of your classmates are there already,\n"+
                                                                        "just as you enter the classroom, the teacher arrived after you ");
        } else if( h == 8 && min >= 30){
            JOptionPane.showMessageDialog(null, "Your instructor was already there when you arrived,\n"+
                                                                        "silently staring at you as he marked you tardy.\n"+
                                                                        "Should have spent less time slacking.");
        }
            
        JOptionPane.showMessageDialog(null, "\"Morning, class!\" He greeted.\n"+
                                                                    "\"Every week, I will be examining your capability, both mentally and physically!\" He explained,\n"+
                                                                    "\"There will be a written part and a practical part so be sure you are ready for both!\",\n"+
                                                                    "\"So, I will begin our lessons!\"");
        stopSound();
        new Prty(course);
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

