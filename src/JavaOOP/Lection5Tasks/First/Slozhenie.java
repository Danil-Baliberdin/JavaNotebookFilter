package JavaOOP.Lection5Tasks.First;

public class Slozhenie extends Operation{
    public Slozhenie(int firstNum, int secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public int operation() {
        return (firstNum+secondNum);
    }
}
