import javax.swing.JOptionPane;

public class End {

    private int end;

    public End(int performance) {
        this.end = performance;

        if(end >= 3){
            JOptionPane.showMessageDialog(null, "Congratulations! You've excelled in your preliminary examinations,\n"+ 
                                                                "your relentless dedication and hard work have truly paid off,\n"+
                                                                "you've shown that you can rise to the challenge and surpass expectations.\n\n"+
                                                                "Outside the examination hall, you can't help but wonder what the future holds.\n"+
                                                                "Will the rest of your journey be just as successful? Only time will tell...\n"+
                                                                "Normal Ending: High Potential");
        }else if(end == 2){
            JOptionPane.showMessageDialog(null, "Well done! You've passed your preliminary examinations,\n"+
                                                                "it wasn't easy, but your effort has paid off,\n"+ 
                                                                "you've shown that with perseverance, you can overcome challenges.\n\n"+
                                                                "As you leave the examination hall, you feel a sense of relief.\n"+
                                                                "But there's also anticipation...\n"+
                                                                "What will the next part of your journey bring?\n"+
                                                                "Normal Ending: Barely Floating");
        }else if(end <= 1){
            JOptionPane.showMessageDialog(null, "The preliminary examinations were tough,\n"+
                                                                "and unfortunately, you didn't pass.\n\n"+
                                                                "But remember, failure is not the end,\n"+
                                                                "it's an opportunity to learn and grow.\n\n"+
                                                                "You know the journey ahead won't be easy,\n"+ 
                                                                "but you're ready to face the challenge...\n"+
                                                                "Normal Ending: An upward hill");
        }
    }
}