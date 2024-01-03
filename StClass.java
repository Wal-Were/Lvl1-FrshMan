import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;

public class StClass {
    private Clip clip;
    private int h = 7;
    private int min = 45;
    private int shower = 0;
    private String name;
    private int gender;
    private int course;

    public StClass(int gender, int course, String name) {
        this.gender = gender;
        this.course = course;
        this.name = name;

        playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\smartphone_vibrating_alarm_silent-7040.wav");

        JOptionPane.showMessageDialog(null, "Groggly, you opened your eyes to the blaring noise of your alarm,");

        do {

            if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
            }

            Object[] options = getOptions();

            String time = h + ":" + String.format("%02d", min);
            JOptionPane.showMessageDialog(null, "The time is " + time + " Am.");

            int choice = JOptionPane.showOptionDialog(null, "Alarm: " + time + " Class is at 8:30" +"\nWhat do you do?", "Alarm",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            updateState(choice);

        } while (shower < 3);

        String time = h + ":" + String.format("%02d", min);
        JOptionPane.showMessageDialog(null, "The time is " + h + ":" + min + " AM.");

        if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
            }
    }

    private Object[] getOptions() {
        if (shower == 0) {
            return new Object[]{"5 more minutes", "Get Up and Shower(15 mins)"};
        } else if (shower == 1) {
            return new Object[]{"5 more minutes", "Get Dressed(5 mins)"};
        } else if (shower == 2) {
            return new Object[]{"5 more minutes", "Leave for Class(5 mins)", "Check ID(1 min)"};
        } else {
            return new Object[]{};
        }
    }

    private void updateState(int choice) {
        if (choice == 0) {
            System.out.println("you napped for 5 minutes");
                if(shower == 0){
                JOptionPane.showMessageDialog(null, "You snoozed your alarm and return to your slumber,"+
                                                                    "Only to be awaken once more by it.");   
                min += 5;
                if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
                }
                }else if(shower > 0){
                JOptionPane.showMessageDialog(null, "Feeling lazy, you decided to binge around in your room,\n"+
                                                                    "Before getting a notification from your newly set alarm,\n"+  
                                                                    "Reminding you of your classes");  
                min += 5;
                if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
                }
            }


        } else if (choice == 1) {
            if (shower == 0) {
                min += 15;
                if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
            }
                stopSound();
                JOptionPane.showMessageDialog(null, "You took a shower,\n"+
                                                                    "It was refreshing.");
                                                                    shower++;
            } else if (shower == 1) {
                min += 5;
                if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
            }
            JOptionPane.showMessageDialog(null, "You decided to get dressed,\n"+
                                                                    "Very Stylish.");
                                                                    shower++;
            } else if (shower == 2) {
                min += 5;
                if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
            }
                JOptionPane.showMessageDialog(null, "You leave for class.");
                

                switch (course) {
        case 1:
            new EngMeet(gender, course, name, h, min);
            break;
        case 2:
            new ArtMeet(gender, course, name, h, min);
            break;
        case 3:
            new CrimMeet(gender, course, name, h, min);
            break;
                }
            }
        } else if (choice == 2 && shower == 2) {
            min += 1;
            if (min >= 60) {
                h += min / 60; 
                min = min % 60; 
            }
            JOptionPane.showMessageDialog(null, "You decided to check your ID.");
   
            String message = "Name: " + name + "\n";

            if(gender == 1){
                message += "Sex: Male\n";
            } else if(gender == 2){
                message += "Sex: Female\n";
            }
            
            if(course == 1){
                message += "Course: Engineering\n";
            } else if(course == 2){
                message += "Course: Art\n";
            } else if(course == 3){
                message += "Course: Criminology\n";
            }
            
            JOptionPane.showMessageDialog(null, message);
        
}

}

    //=========================================Do Not Touch=====================================================

    public void playSound(String filePath) {
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // This will start the audio clip in a loop
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stopSound() {
        if (clip.isRunning()) {
            clip.stop(); 
        }
    }
}