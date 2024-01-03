import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ArtMeet {

    private String name;
    private int gender;
    private int course;
    private Clip clip;


    public ArtMeet(int gender, int course, String name, int h, int min) {
        this.gender = gender;
        this.course = course;
        this.name = name;

        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\classroom-background-54177.wav");

        String time = h + ":" + String.format("%02d", min);
        JOptionPane.showMessageDialog(null, "The time is " + time + " Am.");

        if(h == 7 ){
            JOptionPane.showMessageDialog(null, "Some of your classmates has not yet arrived, \n"+
                                                                "So you just picked a seat in the middle, \n"+
                                                                "Since you came so early, you waited for the teacher to arrive,"+
                                                                "Surprising, the teacher came late, entering the class with a yawn and a smile");
        } else if(h == 8 && min < 30){
            JOptionPane.showMessageDialog(null, "Most of your classmates are there already,\n"+
                                                                        "Since you arrived on time, you expected the teacher to be there,\n"+
                                                                        "But surprisingly, she isn't there,\n"+ 
                                                                        "Eventually, she entered the class with a yawn and a smile as she sat down on her desk");

        } else if( h == 8 && min >= 30){
            JOptionPane.showMessageDialog(null, "Your instructor was already there when you arrive,\n"+
                                                                "She looks tired, but she greeted you with a smile and gestured for you to sit down,\n"+
                                                                "Once you sat down, she clapped her hands and address the class");
        }

            JOptionPane.showMessageDialog(null, "\"Good Morning, class\" She called out\n" +
                                                                "\"The school wants me to give everyone a quiz every week, until your prelim\"\n" +
                                                                "\"It may be overwhelming, but I believe each and everyone can do it\"She spoked");

            JOptionPane.showMessageDialog(null, "\"I won't grade you by your academics, but by the inspiration that drives you\"\n"+
                                                                "\"So, without further,\" She spoked, \"Let's begin with our lessons\"");
    
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
