package Exeptions.FirstSeminar;

public class RunTimeExeption {
    //Следующий способ обработки ошибок это обозначить условие для отлова ошибки и выбросить Исключение
    //синтаксис следующий - throw new RuneTimeExeption
    int[][] matrix;
    public RunTimeExeption(int[][] matrix){
        this.matrix = matrix;
    }
    public void sum(){
        int sum = 0;
        try{
            System.out.println(matrix[12][1]);
        }
        catch (RuntimeException e){
            System.out.println("Runtime catched");
        }
        System.out.println(sum);
    }
}
