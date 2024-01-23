package JavaOOP.Lection5Tasks.First;

public abstract class Operation {
    protected int firstNum;
    protected int secondNum;

    public Operation(int firstNum,int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
     public abstract int operation();
}
