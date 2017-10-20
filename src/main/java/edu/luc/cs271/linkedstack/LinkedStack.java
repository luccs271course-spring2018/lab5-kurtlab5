package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top = new Node<E>(obj, top);
    return null;
  }

  @Override
  public E peek() {
    if (top != null) {
      return top.data;
    }
    return null;
  }

  @Override
  public E pop() {
    if (top == null) {
      throw new NoSuchElementException();
    }
    Node<E> temp = top;
    top = top.next;
    return temp.data;
  }

  @Override
  public boolean isEmpty() {
    if (top == null) {
      return true;
    }
    return false;
  }

  @Override
  public List<E> asList() {
    ArrayList<E> list;
    Node<E> temp = top;
    int i = 0;
    while (temp != null) {
      i++;
      temp = temp.next;
    }
    temp = top;
    list = new ArrayList<E>(i);
    while (temp != null) {
      list.add(temp.data);
      temp = temp.next;
    }
    return list;
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
  }
}
