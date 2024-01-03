import javax.sound.sampled.*;
import java.io.File;
import javax.swing.JOptionPane;

public class EngMeet {

    private String name;
    private int gender;
    private int course;
    private Clip clip;

    public EngMeet(int gender, int course, String name, int h, int min) {
        this.gender = gender;
        this.course = course;
        this.name = name;

        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\classroom-background-54177.wav");

        String time = h + ":" + String.format("%02d", min);
        JOptionPane.showMessageDialog(null, "The time is " + time + " Am.");

        if(h == 7 ){
            JOptionPane.showMessageDialog(null, "Some of your classmates has not yet arrived, \n"+
                                                                "So you just picked a seat in the middle, \n"+
                                                                "The instructor soon came after and marked the attendanced");
        } else if(h == 8 && min < 30){
            JOptionPane.showMessageDialog(null, "Most of your classmates are there already,\n"+
                                                                "As you sat down, your teacher entered the class and survey the class,\n"+
                                                                "Noting those that are late with a frown,\n"+
                                                                "Thankfully you arrived on time");
        } else if( h >= 8 && min >= 30){
            JOptionPane.showMessageDialog(null, "Your instructor was already there when you arrive,\n"+
                                                                "Silently staring at you as you were mark tardy in the records,\n"+
                                                                "Should have spend less time slacking");
        }

        JOptionPane.showMessageDialog(null, "Once attendance was recorded, your instructor got everyone's attendance\n"+
                                                            "\"Important announcement, every week, I will be giving an quiz until your prelim\"\n"+
                                                            "\"Your prelims will be at the end of this month\"\n"+
                                                            "\"So, good luck,\" he remarked and began turtoring");

        stopSound();
        new Prty(course);
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
}