package com.mycompany.collection.list;

  import java.util.LinkedList;

public interface ILinkedList<E> extends Iterable<E> {

    void insertFirst(E element);
    void insertLast(E element);
    void insertBetween(int index, E element);
    void add(E element);
    void add(int index,E element);
    void clear(int index);
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    void set(int index,E element);
    int size();
    <E> E[] toArray(E[] a);
    Object[] toArray();
    String toString();

}
