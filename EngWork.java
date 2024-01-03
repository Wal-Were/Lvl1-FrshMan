import java.util.Random;
import javax.swing.JOptionPane;

public class EngWork {

    public static int EngWork(int study, int quiz) {
        int check = 0;
        Random random = new Random();

        String message1 = "As you entered the exam room, the instructor reminded everyone.\n" +
                          "\"You have until the afternoon, so take your time to answer the exam.\"\n." +
                          "\"It doesn't matter if you finish first or last, as long you finish right\" he said, handing your exams.";
        JOptionPane.showMessageDialog(null, message1);

        JOptionPane.showMessageDialog(null, "You sit down on a random desk and began answering the exam.");

        if(quiz == 0){
            if(study < 5){
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. odmfow3", "B. K5=-V323D", "C. KDEP-d3dp", "D. MELSPQRc2x"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question\nWhat year was the first computer created?",
                    "Engineering Quiz 1",
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

            } else if(study >= 5 && study < 6){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");

                Object[] options2 = {"A. 1957", "B. 1985", "C. 1987", "D. 1974"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question\n What year was the first personnel computer created?",
                    "Engineering Quiz 1",
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

            } else if(study >= 6){
                    JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");

                    Object[] options2 = {"A. Correct", "B. Wrong", "C. Wrong", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question\nWhat year was the first computer created?",
                    "Engineering Quiz 1",
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
        }
        }else if(quiz == 1){
            if(study < 5){ 
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. ,D3PFMR", "B. PRFWv4f", "C. 0mc2idm", "D. MDcm0em"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question\nWhat is the time complexity of binary search?",
                    "Engineering Quiz 2",
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
            
            }else if(study >= 5 && study < 6){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");
                Object[] options2 = {"A. O(log n)", "B. O(n^2)", "C. O(n log n)", "D. O(n)"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question\nWhat is the time complexity of binary search?",
                    "Engineering Quiz 2",
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
            
            } else if(study >= 6){
                JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");
                Object[] options2 = {"A. Wrong", "B. Wrong", "C. Correct", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question\nWhat is the time complexity of binary search?",
                    "Engineering Quiz 2",
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
                }
        } else if(quiz == 2){
            if(study < 5){
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. mf3rjk", "B. mf-3dm", "C. a,3-J", "D. MF02dl"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \nWhich of the following sorting algorithms is not a comparison sort?",
                    "Engineering Quiz 3",
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

            } else if(study >= 5 && study < 6){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");

                Object[] options2 = {"A. Bubble Sort", "B. Merge Sort", "C. Counting Sort", "D. Quick Sort"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last question \nWhich of the following sorting algorithms is not a comparison sort?",
                    "Engineering Quiz 3",
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

            } else if(study >= 6){
                    JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");
                    Object[] options2 = {"A. Wrong", "B. Correct", "C. Wrong", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last question \nWhich of the following sorting algorithms is not a comparison sort?",
                    "Engineering Quiz 3",
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
            }
        }
        return check;
    }
}