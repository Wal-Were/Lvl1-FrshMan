import java.util.Random;
import javax.swing.JOptionPane;

public class CriWork {

    public static double CriWork(int study, int str, int quiz) {
        double check = 0;
        Random random = new Random();

        String message1 = "As you entered the exam room, the instructor reminded everyone.\n" +
        "\"You have until the afternoon, so take your time to answer the exam, \"\n" +
        "\"It doesn't matter if you finish first or last, as long you finish right \" he said, handing your exams.";
        JOptionPane.showMessageDialog(null, message1);

        JOptionPane.showMessageDialog(null, "You sit at a random desk and began answering.");

        if(quiz == 0){
            if(study < 2){
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. fpfpdf", "B. f,e0,e,", "C. ,wdd0", "D. ,fepdf"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Who is considered the \"father of modern criminology\"?",
                    "Criminology Quiz 1",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                // Generate a random number between 0 and 1
                int answer = random.nextInt(2);
                // If the random number is 1, the student gets the question right
                if(answer == 1){
                    check += 0.5;
                }

            } else if(study >= 2 && study < 3){
                JOptionPane.showMessageDialog(null, "Confident and nervous, you scan through every question,");
                JOptionPane.showMessageDialog(null, "Some questions, you answered  confidently while others, you began second guessing yourself.");

                Object[] options2 = {"A. Sigmund Feud", "B. Karl Marx", "C. Isaac Newton", "D. Cesare Lombroso"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Who is considered the \"father of modern criminology\"??",
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
                            check += 0.5;
                            break;
                    }

            } else if(study >= 3){
                    JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");

                    Object[] options2 = {"A. Wrong", "B. Wrong", "C. Wrong", "D. Correct"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Who is considered the \"father of modern criminology\"?",
                    "Criminology Quiz 1",
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
                            check += 0.5;
                            break;
            }
        }
        }else if(quiz == 1){
            if(study < 2){ 
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. cm-0rkad", "B. 3dkk2ws", "C. 0K@DMI", "D. F0!@#$"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Under the Revised Penal Code of the Philippines, what is the age of criminal responsibility?",
                    "Criminology Quiz 2",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                // Generate a random number between 0 and 1
                int answer = random.nextInt(2);
                // If the random number is 1, the student gets the question right
                if(answer == 1){
                    check += 0.5;
                }
            
            }else if(study >= 2 && study < 3){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");
                Object[] options2 = {"A. 9 years old", "B. 18 years old", "C. 15 years old", "D. 12 years old"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Under the Revised Penal Code of the Philippines, what is the age of criminal responsibility?",
                    "Criminology Quiz 2",
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
                            check += 0.5;
                            break;
                        case 3:
                            break;

                    }
            
            } else if(study >= 3){
                JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");
                Object[] options2 = {"A. Wrong", "B. Correct", "C. Wrong", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n Under the Revised Penal Code of the Philippines, what is the age of criminal responsibility?",
                    "Criminology Quiz 2",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                    switch(m) {
                        case 0:
                            break;
                        case 1:
                            check += 0.5;
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }
                }
        } else if(quiz == 2){
            if(study < 2){
                JOptionPane.showMessageDialog(null, "Struggling with the exam, you took great time to answer every question, sweating in fear. Fortunately, you reach the last question.");
                Object[] options2 = {"A. r0,s0dk", "B. 0EM0)2", "C. 3eok12re", "D. 0KMsm2,"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n What is the first thing a forensic investigator should do at a crime scene?",
                    "Criminology Quiz 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                // Generate a random number between 0 and 1
                int answer = random.nextInt(2);
                // If the random number is 1, the student gets the question right
                if(answer == 1){
                    check += 0.5;
                }

            } else if(study >= 2 && study < 3){
                JOptionPane.showMessageDialog(null, "Confident and nervous, as you scan through every question, you answered some confidently and some you second guessing yourself.");

                Object[] options2 = {"A. Interview Witnesses", "B. Take Photos of the Scene", "C. Collect Evidence", "D. Look for the suspect"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n What is the first thing a forensic investigator should do at a crime scene?",
                    "Criminology Quiz 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                    switch(m) {
                        case 0:
                            break;
                        case 1:
                            check += 0.5;
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }

            } else if(study >= 3){
                    JOptionPane.showMessageDialog(null, "With your diligent studying, you breeze through the questions, answering each one with confidence.");
                    Object[] options2 = {"A. Wrong", "B. Correct", "C. Wrong", "D. Wrong"};
                int m = JOptionPane.showOptionDialog(null,
                    "Last Question \n What is the first thing a forensic investigator should do at a crime scene?",
                    "Criminology Quiz 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[0]);

                    switch(m) {
                        case 0:
                            break;
                        case 1:
                            check += 0.5;
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                }
            }
        }

        String message = "After the written part of it, it was time for the practical part,\n" +
                              "Following the instructor's instructions, you reach the area,\n"+
                              "There, you find the instructor waiting for all of you.";

        JOptionPane.showMessageDialog(null, message);

                JOptionPane.showMessageDialog(null, " \"Welcome to the practical part of your exam!\"He shouted");

        String message2 = "Behind him, was an obstacle course that will tested your physical capability in various ways,\n" +
                          "You had to hop over some hurdles,\\n" +
                          "balance on a beam,\n" +
                          "weave through some tires,\n" +
                          "climb up a rope,\n" +
                          "before finally sprinting to the finish line.";

        JOptionPane.showMessageDialog(null, message2);

        JOptionPane.showMessageDialog(null, "\"You are to complete the course within a time limit,\" He shouted.\n"+
                                                            "\"fail to finish it in time is an automatic fail,\" He threatened.");

        String message3 = "You and the rest of the students there were intimidating, but regardless of the difficulty,\n"+
                          "You have no choice but to accomplish the task";

        JOptionPane.showMessageDialog(null, message3);

        JOptionPane.showMessageDialog(null, "\"So, who will go first?\" The instructor questioned.");

        JOptionPane.showMessageDialog(null, "One by one, students attempted, some passed, while other failed,\n"+
                                                            "finally, it was your turn.\n"+
                                                            "\"You may begin\" He said.");

        JOptionPane.showMessageDialog(null, "And so you rushed across the obstacle...");

        if(str > 4){

            String message4 = "Eventually, it became obvious,\n" +
                              "Your body was not meant to handle this level of physically test,\n" +
                              "You failed to finsh the obstacle in time,\n" +
                              "So, you return to the bleacher with a dissappointed look on your instructor's face,\n" +
                              "You avoid his gaze and sat down, resting as the other studnets did the obstacle";

        JOptionPane.showMessageDialog(null, message4);


        }else{

            String message5 = "You were able to finish the obstacle course without overexhausting yourself,\n" +
                              "You successfully  finsh the obstacle in time,\n"+
                              "With a satisfied look, your teacher gave you a nod as you sat down on the bleacher,\n" +
                              "There, you rested and watched as other students attempted the obstacle course.";

        JOptionPane.showMessageDialog(null, message5);

            check += 0.5;

        }

         JOptionPane.showMessageDialog(null, "Soon, the last student done and the instructor dismmised all of you.");

    return check;
    }
    
}