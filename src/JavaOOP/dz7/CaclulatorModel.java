package JavaOOP.dz7;

public class CaclulatorModel extends Calculator implements StringRedactor{

    @Override
    public double[] makeNumbers(String text) {
        text = text
                .toLowerCase()
                .replace("i","");
        String[] tmp = text.split(" ");
        double[] answer = new double[2];
        answer[0] = Integer.parseInt(tmp[0]);
        answer[1] = Integer.parseInt(tmp[1]);
        return answer;
    }

    @Override
    public double[] addition(double[] first, double[] second) {
       double[] answer = new double[2];
       answer[0] = (first[0]+second[0]);
       answer[1] = (first[1]+second[1]);
       return answer;
    }

    @Override
    public double[] substraction(double[] first, double[] second) {
        double[] answer = new double[2];
        answer[0] = (first[0]-second[0]);
        answer[1] = (first[1]-second[1]);
        return answer;
    }

    @Override
    public double[] multiply(double[] first, double[] second) {
       double[] answer = new double[2];
       answer[0] = ((first[0]*second[0])+(-1)*(first[1]*second[1]));
       answer[1] = (first[0]*second[1])+(first[1]*second[0]);
        return answer;
    }
}
