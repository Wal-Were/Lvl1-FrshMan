import javax.swing.JOptionPane;

public class Exam {

    private int study;
    private int performance;
    private int inp;

    public Exam(int study, int performance, int inp) {
        this.study = study;
        this.performance = performance;
        this.inp = inp;

        JOptionPane.showMessageDialog(null, "The air was filled with nervous tension as students slowly answered their test,\n"+
                                                            "Some stared at their paper while others staring at the roo.\n"+
                                                            "Of course, there are few that looked at others,only to be quickly caught,\n"+
                                                            "With your exam paper in hand\n You sit at the front and mentally prepared yourself");

        int ready = JOptionPane.showOptionDialog(null, "Again, are you ready?", "Choose an option",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yes", "No"}, null);

        JOptionPane.showMessageDialog(null, "It doesn't matter, you did your best to answer it and prayed you were correct");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        JOptionPane.showMessageDialog(null, "After a few days, your exam papers return,");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        JOptionPane.showMessageDialog(null, "And...");

        try {
            Thread.sleep(5000); 
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        if(study < 5 || inp < 5){
            JOptionPane.showMessageDialog(null, "Sadly, you didn't study enough. Best we moved on. For, there is nothing else you can do");
        }else {
            JOptionPane.showMessageDialog(null, "You got more than half of the exam. \n But, did you study enough to pass? \n Guess we have to wait and see the report");
            performance += 1; 
        }

        End endInstance = new End(performance);
    }
}