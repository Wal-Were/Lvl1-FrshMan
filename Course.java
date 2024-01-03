import javax.swing.*;

public class Course {
    public Course(int feeling, int gender) {
        int course = 0;
        Object[] options = {"Proceed"};

        int n = JOptionPane.showOptionDialog(null, "What course did you pick?", "Lvl 1: Freshman",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (n == JOptionPane.OK_OPTION) {
            String[] courses = {"Engineering", "Art", "Criminology"};
            int input = JOptionPane.showOptionDialog(null, "Choose a course", "Lvl 1: Freshman",
    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, courses, courses[0]);
                    switch (input) {
                        case 0:
                            course = 1;
                            if(feeling == 1){
                                String message = "Fascinated by its intricate components,\n" +
                                                 "Wires, chips, circuits, and more,\n" +
                                                 "All working in unison to make the machine run,\n" +
                                                 "So, you decided to further your understanding of it.";
                                JOptionPane.showOptionDialog(null, message, "College Life", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                            } else if(feeling == 2 || feeling == 4){
                                String message = "While you were capable to enroll in any course, you decided you take it,\n" +
                                                 "For the potential high salary job offers, before and after graduation,\n" +
                                                 "After all, money is power,\n" +
                                                 "Those with the money can enjoy life.";
                                JOptionPane.showOptionDialog(null, message, "College Life", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                            } else if(feeling == 3){
                                JOptionPane.showMessageDialog(null, "You picked computer engineering because your friends chose it also,\n" +
                                              "But when you failed to get enroll together in the same school,\n" +
                                              "You were left alone and with a course you have no love,\n" +
                                              "And when you saw how difficult it was,\n"+
                                              "It was more than enough to want to change course...");
                    
                                JOptionPane.showMessageDialog(null, "But your parents already paid your tuition,\n" +
                                              "So it's too late to back out now...\n"+
                                              "So you have to deal with it.");
                            }
                            break;

                        case 1:
                            course = 2;
                            if(feeling == 1){
                                String message = "At a young age, you enjoying pouring your passion into each work.\n" +
                                                 "While you were fascinated in all types of art,\n" +
                                                 "You decided to pick Literature Art as your course in college\n" +
                                                 "To write stories that bring others to smile, cry, or fear\n" +
                                                 "The power in every pen and paper\n" +
                                                 "Excited to life to those blank pages";
                                JOptionPane.showOptionDialog(null, message, "College Life", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                            } else if(feeling == 2 || feeling == 4){
                                String message = "You chose Art not because of passion, but because of its reputation.\n" +
                                                 "You've heard that artists often lead interesting, unconventional lives,\n" +
                                                 "and you wanted to break free from the monotony of the usual career paths.\n" +
                                                 "You thought, 'Why not give it a shot?'";
                                JOptionPane.showOptionDialog(null, message, "College Life", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                            } else if(feeling == 3){
                                JOptionPane.showMessageDialog(null, "You figured, it can't be that hard, to write something on a piece of paper,\n"+
                                                                                    "So with your inaccurate information and your friends' encouragement\n" +
                                                                                    "Only to be smacked in the face with how difficulty it is\n" +
                                                                                    "There is more than just a story, but you didn't have captured the essence of a good story\n" +
                                                                                    "But your parents already paid your tuition, so its too late to back out now"+
                                                                                    "So you have to deal with it");
                            }
                            break;

                        case 2:
                            course = 3;
                            JOptionPane.showMessageDialog(null, "Criminology, the course of the body");
    
    if(feeling == 1){
        JOptionPane.showMessageDialog(null, "You were always active as a child,\n" + 
                                                            "Running around, playing with the other kids,\n" +
                                                            "Now, you decided to use your energy and body to help the community,\n" +
                                                            "So you decided to take Criminology as your course");
    } else if(feeling == 2 || feeling == 4){
        JOptionPane.showMessageDialog(null, "You chose Criminology for its potential in providing a stable career.\n" +
                                                            "You've heard that there's always a demand for law enforcement,\n" +
                                                            "and you thought it would be a safe choice for job security.");
    } else if(feeling == 3){
        JOptionPane.showMessageDialog(null, "Criminology, a course that promised less of the academic grind you despised, \n" +
                                                            "You've always found the traditional school setting stifling, the endless cycle of lectures and exams draining,\n " +
                                                            "You yearned for something more hands-on, more connected to the real world, \n" +
                                                            "So, you ended up in Criminology,\n" +
                                                            "It wasn't your first choice, but it offered an escape,\n" +
                                                            "But even then, you couldn't shake off the feeling of dread,\n" +
                                                            "You're just counting down the days until you can finally say goodbye to school for good.");
    
    break;
    }
                    }

                    switch (course) {
                        case 1:
                            new EngiClass(feeling, gender, course);
                            break;
                        case 2:
                            new ArtClass(feeling, gender, course);
                            break;
                        case 3:
                            new CrimClass(feeling, gender, course);
                            break;

            }
        }
    }
}