import java.util.Random;
import javax.swing.JOptionPane;

public class ArtWork {

    public static int ArtWork(int inp, int quiz, int study) {
        int check = 0;
        Random random = new Random();

        String message1 = "As you entered the exam room, the instructor reminded everyone.\n" +
                          "\"You have until the afternoon, so take your time to answer the exam.\"\n" +
                          "\"It doesn't matter if you finish first or last, as long you finish right\" he said, handing your exams.";
        JOptionPane.showMessageDialog(null, message1);

        JOptionPane.showMessageDialog(null, "\" You sit down on a random desk and began answering the exam \".");

        if(quiz == 0){
            if(inp >= 5 || study >= 5){
                JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");
            
                Object[] options2 = {"A. Correct", "B. Wrong", "C. Wrong", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Who is the author of “Romeo and Juliet”?",
                    "Literature Art Quiz 1",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                switch(m) {
                    case 0:
                        check += 1;
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            } else if((inp >= 4 && inp < 5) || (study >= 4 && study < 5)){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");
            
                Object[] options2 = {"A. Mark Twain", "B. Jane Austen", "C. Charles Dicken", "D. William Shakespear"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Who is the author of “Romeo and Juliet”?",
                    "Literature Art Quiz 1",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                switch(m) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        check += 1;
                        break;
                }
            } else if(inp < 4 || study < 4){
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. odmfow3", "B. K5=-V323D", "C. KDEP-d3dp", "D. MELSPQRc2x"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Who is the author of “Romeo and Juliet”?",
                    "Literature Art Quiz 1",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                // Generate a random number between 0 and 1
                int answer = random.nextInt(2);
                // If the random number is 1, the student gets the question right
                if(answer == 1){
                    check += 1;
                }
            }
        }else if(quiz == 1){
            if(inp >= 6 || study >= 6){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");
                Object[] options2 = {"A. Wrong", "B. Wrong", "C. Correct", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Which novel is not written by Jane Austen?",
                    "Literature Art Quiz 2",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                switch(m) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        check += 1;
                        break;
                    case 3:
                        break;
                }
            } else if(inp >= 5 && inp < 6 || (study >= 5 && study < 6)){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");
                Object[] options2 = {"A. Wuthering Heights", "B. Pride and Prejudice", "C. Sense and Sensibility", "D. Emma"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Which novel is not written by Jane Austen?",
                    "Literature Art Quiz 2",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                switch(m) {
                    case 0:
                        check += 1;
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            } else if(inp < 5 || study < 5){ 
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. ,D3PFMR", "B. PRFWv4f", "C. 0mc2idm", "D. MDcm0em"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Which novel is not written by Jane Austen?",
                    "Literature Art Quiz 2",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                // Generate a random number between 0 and 1
                int answer = random.nextInt(2);
                // If the random number is 1, the student gets the question right
                if(answer == 1){
                    check += 1;
                }
            }
        } else if(quiz == 2){
            if(inp >= 6 || study >= 6){
                JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");
                Object[] options2 = {"A. Wrong", "B. Correct", "C. Wrong", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Which is not a work of Edgar Allan Poe?",
                    "Literature Art Quiz 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                switch(m) {
                    case 0:
                        break;
                    case 1:
                        check += 1;
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            } else if(inp >= 5 && inp < 6 || (study >= 5 && study < 6)){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");
            
                Object[] options2 = {"A. Annabel Lee", "B. The Tell-Tale Heart", "C. Moby-Dick", "D. The Raven"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Which is not a work of Edgar Allan Poe?",
                    "Literature Art Quiz 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                switch(m) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        check += 1;
                        break;
                    case 3:
                        break;
                }
            } else if(inp < 5 || study < 5){ 
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. mf3rjk", "B. mf-3dm", "C. a,3-J", "D. MF02dl"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Which is not a work of Edgar Allan Poe?",
                    "Literature Art Quiz 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);
            
                // Generate a random number between 0 and 1
                int answer = random.nextInt(2);
                // If the random number is 1, the student gets the question right
                if(answer == 1){
                    check += 1;
                }
            }
        }
        return check;
    }
}