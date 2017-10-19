package edu.luc.cs271.linkedstack;

import java.util.Scanner;
 
public class ReverseLines {

  public static void main(String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order



    final Scanner input = new Scanner(System.in);
    String line;
    LinkedStack<String> stack = new LinkedStack<String>();
    System.out.println("Please input a string");
    line = input.next();
    while (!line.equals("esc")) {
      System.out.println("Please input a string to continue, or input 'esc' to finish");
      stack.push(line);
      line = input.next();
    }
    while (stack.peek() != null){
      System.out.println(stack.pop());
    }
  }
}
