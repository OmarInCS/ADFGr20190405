package view;

public class QuizMB {
    private int x = (int)(Math.random() * 100);
    private int y = (int)(Math.random() * 100);
    private int ans;
    private int correct;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public int getAns() {
        return ans;
    }

    public QuizMB() {
        super();
    }
    
    public void getNewQuestion(){
        x = (int)(Math.random() * 100);
        y = (int)(Math.random() * 100);
    }
    
    public void getNewQuestionForTrain(){
        if(ans == x+y){
            correct++;
            System.out.println(correct + "/5");
        }
        x = (int)(Math.random() * 100);
        y = (int)(Math.random() * 100);
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getCorrect() {
        return correct;
    }
}
