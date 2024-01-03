import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.sound.sampled.*;
import java.io.File;

public class Party {
    private Clip clip;

    public Party() {
        // Play the sound at the beginning
        clip = playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\Something You Could Never Own (Clean) - NEFFEX.wav");

        String choice;
        String message1 = "The time has come for the party,\n" +
            "A quick text, he send the address and you found yourself before a large house,\n" +
            "Two stories tall, loud trashy party music played with students rhythmlessly moving to the beat,\n" +
            "\"Welcome!!!\" The classmate, who invited you, greeted,\n" +
            "\"Drink?\" He asked, handing a drink to you,";

        String message2 = "You accepted the drink and he leaves you to host the party,\n" +
            "Soon, you lose yourself to the rhymm and drinks..\n" +
            "5 hours later..." ;

            stopSound();
        String message3 = "The party slowly dying, most of the students already left,\n" +
            "Except you, the owner and his close friends,\n" +
            "Remembering you had a quiz tomorrow, you decided to leave as well to prepare,\n" +
            "\"Oh, come on,\" the owner complained, \"but the after party is about to start\"\n";

        JOptionPane.showMessageDialog(null, message1);
        JOptionPane.showMessageDialog(null, message2);
        JOptionPane.showMessageDialog(null, message3);

        JOptionPane.showMessageDialog(null, "\"5 mins, just stay for 5 mins\" he begged,");

        Object[] options = {"Leave", "Stay for 5 minutes"};
        int n = JOptionPane.showOptionDialog(null,
            "What do you do?",
            "Make a choice",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

        switch(n) {
            case 0:
                stopSound();
                JOptionPane.showMessageDialog(null, "you politely decline to prepare for tomorrow,\n"+
                                                                    "They were a bit of disappointed but decided to let you go");
                
                break;
            case 1:
                stopSound();
                JOptionPane.showMessageDialog(null, "You decided to stay, intrigued by the after party,\n"+
                                                                    "Once you and a few of the host's friends were left,\n"+
                                                                    "The host guide you upstairs to his room,\n"+
                                                                    "From under his bed, he pulled a small plastic bag with some white powder,\n");
                                    clip = playSound("C:\\Users\\Wayne_Llamado\\OneDrive\\Desktop\\working\\heartbeat-drum-sound-83410.wav");
                JOptionPane.showMessageDialog(null, "One by one, he and his friend took a sniff,\n"+
                                                                    "Until the host offers the bag to you,\n"+
                                                                    "Pressuring you to join them");

                Object[] options2 = {"Yes", "No"};
                int m = JOptionPane.showOptionDialog(null,
                    "Do you take it?",
                    "Make a choice",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                switch(m) {
                    case 0:
                        stopSound();
                        JOptionPane.showMessageDialog(null,"Suddenly, the room started spinning. You felt a rush of euphoria, then darkness,\n"+
                                                                            "you woke up to the sound of sirens. The room was empty, the party-goers had vanished,\n"+
                                                                            "the door burst open, and police officers stormed in. You were arrested on the spot,"+
                                                                            "during your trial, you were found guilty,\n"+
                                                                            "but regardless how you defend yourself,\n"+
                                                                            "the police was unable to find the host or his freinds,\n"+
                                                                            "and you spent majority of life behind bars.");

                        JOptionPane.showMessageDialog(null, "Your decision had led to an unexpected and unfortunate consequence.\n"+
                                                                            "Remember, real life is not a game. Make responsible choices.\n"+
                                                                            "Secret Ending: \"Party Fever\".");
                        System.exit(0);
                        
                        break;
                    case 1:
                        stopSound();
                        JOptionPane.showMessageDialog(null, "You decided to leave the room, realizing that staying was not a good idea.");
                        JOptionPane.showMessageDialog(null,"You left the party and went home to prepare for your exam.");
                        JOptionPane.showMessageDialog(null,"It was a close call, but you made the right choice.");
                        
                        break;
                } 
                break;
        }
    }

    public Clip playSound(String soundName) {
        Clip clip = null;
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the sound continuously
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        return clip;
    }

    public void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); // Stop the sound
        }
    }
}