package ru.avk.Shildt.Classes;

import java.util.Stack;

/*****************
  *  Класс Stack
  *  с.174
  **************************                                */


class TestStack {
  public static void main(String[] args) {
      Stack mystack1 = new Stack();
      Stack mystack2 = new Stack();

      for (int i = 0; i < 10; i++) mystack1.push(i);
      for (int i = 10; i < 20; i++) mystack2.push(i);


      System.out.print("Содержимое стека 1:  ");
      for (int i = 0; i < 10; i++)
      System.out.print(mystack1.pop());

      System.out.println();

      System.out.print("Содержимое стека 2:  ");
      for (int i = 0; i < 10; i++)
      System.out.print(mystack2.pop() + " ");
  }
}
