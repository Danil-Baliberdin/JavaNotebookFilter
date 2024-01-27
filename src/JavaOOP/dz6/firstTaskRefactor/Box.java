package JavaOOP.dz6.firstTaskRefactor;

public class Box<T> {
//    private T content;          Изначальный код
//
//    public Box(T content) {
//        this.content = content;
//    }
//    public T getContent(){
//        return content;
//    }
//    public void setContent(T content){
//        this.content = content;
//    }
//    public void  printContent(){
//        System.out.println(content);
private T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent(){
        return content;
    }
    public void setContent(T content){
        this.content = content;
    }
    }

    // В качестве рефактроринга можно 1)если у нас появиться необходимость добавления новых методов создать для этого отдельные классы
    //                                в соответвтвии с первым принципом - единственной ответственности - для примера создадим отдельный
    //                                класс Printer, который будет барть функцию печати переменной контент
