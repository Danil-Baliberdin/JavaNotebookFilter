package JavaOOP.dz6.secondTaskRefactor;

//public interface Storage <T>{
////    public void store(T item);         Изначальный код
////    public void retreive(T item);      Здесь согласно 4ому приципу (разделения интерфейсов) можно выделить 2
//                                         отдельных интерфейса
//    //                                   Один будет будет отвечать за первую функцию , а второой за вторую
//    //                                   Еще для примера добавим 3ий интерфейс UpdateItem (наследуется от Storage)-
//    //                                   если нам потребуется функционал обоновления Т - то мы просто имплементим
//    //                                   Storage(Пример второго принципа - Open-Closed)
//}
public interface Storage <T>{
    public void storage(T item);
}

