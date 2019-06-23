package view;

public class Question {
    
    private int x = (int)(Math.random() * 100);
    private int y = (int)(Math.random() * 100);
    private int ans;
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void getNewQuestion(){
        x = (int)(Math.random() * 100);
        y = (int)(Math.random() * 100);
        ans = 0;
    }

    public void checkAnswer(){
        if(ans == x+y){
            count++;
        }
        getNewQuestion();
    }


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
}
