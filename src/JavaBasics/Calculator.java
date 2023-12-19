package JavaBasics;

import java.util.ArrayDeque;
import java.util.Deque;

 public class Calculator {
     Deque<Object> memory = new ArrayDeque<>();

     Deque<Object> getMemory() {
         return memory;
     }

     public int calculate(char op, int a, int b) {
         int result = 0;
         switch (op) {// Напишите свое решение ниже
             case ('+') : {
                 memory.addFirst(a + b);
                 result = a + b;
                 break;
             }
             case ('-'):  {
                 memory.addFirst(a - b);
                 result = a - b;
                 break;
             }
             case ('/'): {
                 memory.addFirst(a / b);
                 result = a / b;
                 break;
             }
             case ('*'): {
                 memory.addFirst(a * b);
                 result = a * b;
                 break;
             }
             case ('<'): {
                 memory.removeFirst();
                 return (int) memory.getFirst();
             }
             default : {
                 break;
             }
         }
         return result;
     }
 }