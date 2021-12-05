package com.mycompany.collection.list;

  import java.util.LinkedList;

public interface ILinkedList<E> extends Iterable<E> {

    void add(E element);
    void add(int index,E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    void set(int index,E element);
    int size();
    <A> A[] toArray(A[] a);
    Object[] toArray();
    String toString();

}
