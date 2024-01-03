import javax.swing.JOptionPane;
import java.util.Random;

public class Sched {
    
    private int course;
    private int study;
    private int party;
    private int day = 3;
    private int half = 0;
    private int inp = 0;
    private int str = 0;
    private int quiz = 0;
    private int check = 0;
    private int performance;

    public Sched(int course, int party, int study) {
        int performance = 0;
        this.course = course;
        this.party = party;
        this.study = study;
    
        makeChoice();
    }

    public void makeChoice() {
        Random rand = new Random();

        String message = "Waking up, you check your schedule and decide on what to do.\n" +
                 "You could attend classes to become smarter.\n" +
                 "Or, you could explore the nearby forest for some inspiration.\n" +
                 "Or, you can go to a nearby gym to tone your body.";

        JOptionPane.showMessageDialog(null, message);

        do {
            if(day == 6 || day == 13  || day == 20){

                JOptionPane.showMessageDialog(null, "It is day " + day);

                JOptionPane.showMessageDialog(null, "Today is Saturday, since there is no school, you can't study in the library,\n"+
                                                                    "You could spend your time studying in you room,\n"+
                                                                    "But you spend the day relaxing in your room,\n"+
                                                                    "Again, you did the same for tomorrow,\n"+
                                                            "#Me Time");
                day++;
                day++;

            }

            if(day == 4 || day == 11 || day == 18){

                JOptionPane.showMessageDialog(null, "Alarm blaring, it was reminding you that your quiz is tomorrow.");

            }
            
            if(day == 22){

                JOptionPane.showMessageDialog(null, "You woke up to your alarm blaring, reminding you that your exam is this week.");
                if(course == 3){
                    JOptionPane.showMessageDialog(null, "Atleast, there is no obstacle course to finish, only practical part, \n");
                }

            }
            
            if(day == 5 || day == 12 || day == 19 ){
                if(course == 1){
                    int check = EngWork.EngWork(study, quiz);
                    JOptionPane.showMessageDialog(null, "Quiz is over, you have the afternoon to do something.");
                    quiz++;
                    half += 1;
                    performance += check;
                    study = 0;

                }else if(course == 2){
                    int check = ArtWork.ArtWork(inp, quiz, study);
                    JOptionPane.showMessageDialog(null, "Quiz is over, you have the afternoon to do something.");
                   quiz++;
                    half += 1;
                    performance += check;
                    inp = 0;

                }else if(course == 3){
                    double check = CriWork.CriWork(study, str, quiz);
                    JOptionPane.showMessageDialog(null, "Quiz is over, you have the afternoon to do something.");
                    quiz++;
                    half += 1;
                    performance += check;
                    study = 0;
                    str = 0;
                    

                }
            }
            
            if(day == 4 && half == 1 && party == 1){
                JOptionPane.showMessageDialog(null, "You were receive a notification from your alarm,\n" +
                                                    "Reminding you of the party you were invited to,\n" +
                                                    "Its up for you to decide,\n" +
                                                    "If you will go or not.\n");
            }

            if(half == 0){
                message = "It is day " + day + "\n Its the morning, \n what do you want to do?";
            
            }else if(half == 1){
                message = "It is day " + day + "\nIts the afternoon. \n What do you want to do?";
            }

            String[] initialOptions = {"Study in Class", "Go to somewhere else"};
            int initialChoice = JOptionPane.showOptionDialog(null,
                message,
                "Make a choice",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                initialOptions,
                initialOptions[0]);


                switch(initialChoice) {
                    case 0: 
                    int event = rand.nextInt(4);
                    switch(event) {
                        case 0: 
                            JOptionPane.showMessageDialog(null, "You went to your class and listened attentively. You feel yourself getting smarter.");
                            half++;
                            study++;
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Class is cancelled because the teacher did not show up. You have some extra free time.");
                            
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Class is cancelled because the teacher sent an announcement. You decide to use this time to study.");
                            half++;
                            study++;
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Your teacher assigned some challenging homework today. You decided to start working on it immediately after class.");
                            half++;
                            study++;
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Your class had a group discussion today. You contributed some good points and learned from your classmates.");
                            half++;
                            study++;
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Your teacher gave an interesting lecture today. You took detailed notes to study later.");
                            half++;
                            study++;
                            break;
                    }
                    break;
                    case 1:
                        String[] options;
                        if (party == 1 && half == 1 && day == 4) {
                            options = new String[]{"Gym", "Walk around the area", "Party", "Back"};
                        } else {
                            options = new String[]{"Gym", "Walk around the area", "Back"};
                        }
    
                        int choice = JOptionPane.showOptionDialog(null,
                            "Enter your choice",
                            "Choice Menu",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);
    
                        switch(choice) {
                            case 0:
                                JOptionPane.showMessageDialog(null, "You chose to go to the gym,");
                            JOptionPane.showMessageDialog(null, "You feel yourself get stronger.");
                            str += 1;
                            half += 1;
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "You chose to walk around the area,");
                            JOptionPane.showMessageDialog(null, "You feel yourself become more inspired,");
                            JOptionPane.showMessageDialog(null, "Eventually, you return to civilization.");
                            inp += 1;
                            half += 1;

                            break;
                        case 2:
                            if (party == 1 && half == 1 && day == 4) {
                                JOptionPane.showMessageDialog(null, "You went to party.");
                                Party party = new Party();

                                JOptionPane.showMessageDialog(null, "You return from the party.\n"+
                                                                                    "Haven't enough of the crowd.");
                                half++;

                            } else {
                                
                            }
                            break;
                        case 3:
                            if (party == 1) {
                            }
                            break;
                        }
                    break;
            }

            if(half == 2){
                JOptionPane.showMessageDialog(null, "Night falls and you walked towards your dorm,\n"+
                                                                    "On the way, you found a food stall to eat in,\n"+
                                                                    "\"Welcome to \'Grab Box\'!\" the worker greeted you,");
                
                String message9 = "Finally, you reached your room after a satisfying dinner,\n" +
                                 "Eventually, you lay in bed and quickly drifting to sleep,\n" +
                                 "As you sleep, you think of what you accomplished so far.\n";

                String message10 = "Study: " + study + "\n" +
                                 "Strength: " + str + "\n" +
                                 "Inspiration: " + inp + "\n" +
                                 "Performance: " + performance;

                JOptionPane.showMessageDialog(null, message9, "College Life", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, message10, "College Life", JOptionPane.PLAIN_MESSAGE);


                JOptionPane.showMessageDialog(null, "Waking up to your alarm and a new day.");

                day += 1;
                half -= 2;
            }
        } while (day % 26 != 0);

        JOptionPane.showMessageDialog(null, "The time has come...\nYou stood before the room for your exam...\nAre you ready?");

        Object[] options = {"Yes", "No"};
        int choice = JOptionPane.showOptionDialog(null, "Are you ready?", "Choose an option",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        JOptionPane.showMessageDialog(null, "It doesn't matter, if you are ready or not\nBest you can do is pray you studied enough");

        JOptionPane.showMessageDialog(null, "Taking a deep breath, you entered the room");

        
        new Exam(study, performance, inp);
    }
}