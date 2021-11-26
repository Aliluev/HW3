package com.mycompany.collection.list;
import com.mycompany.collection.list.ILinkedList;

import java.util.Iterator;


public class MyLinkedList<E> implements ILinkedList<E> {

    public class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }


    private Node<E> first;
    private Node<E> last;
    private int size = 0;


    @Override
    public void insertFirst(E element) {

        Node<E> firstNode = first;
        Node<E> newNode = new Node<>( element, firstNode,null);
        if (firstNode == null) {
            last = newNode;
            first = newNode;
        }
        else {
            firstNode.prev = newNode;
            first=newNode;
        }
        size++;

       // System.out.println(first.data+" add");

        /*

        if(size==0){
            last=new Node<>(element,null,null);
            first=new Node<>(element,null,null);
            System.out.println("в нуле");
            size++;
        } else {
            Node<E> temporary_last=last;
            Node<E> temporary_first=first;
            last=first;
            first=new Node<>(element,first,null);
            System.out.println("Не в нуле");
            size++;
        }

         */
    }

    @Override
    public void insertLast(E element) {

        Node<E> temporary_last=new Node<>(element,null,last);
        last.next=temporary_last;
        last=temporary_last;
        size++;

    }

    @Override
    public void insertBetween(int index, E element){
        Node<E> temporary_first=first;


        for(int i=0;i<index;i++){

            temporary_first=temporary_first.next;

        }
        Node<E> temporary_between=new Node<>(element,temporary_first.next,temporary_first);

        temporary_first.next=temporary_between;
        size++;

    }


    @Override
    public void add(E element) {
        insertFirst(element);
    }

    @Override
    public void add(int index, E element) {
      insertBetween(index,element);
    }

    @Override
    public void clear(int index) {
        Node<E> temporary_first=first;

        for(int i=0;i<index-1;i++){
            temporary_first=temporary_first.next;
        }
        temporary_first.next=temporary_first.next.next;
        temporary_first.next.next.prev=temporary_first;
        size--;
    }

    @Override
    public E get(int index) {
        Node<E> temporary_first=first;

        for(int i=0;i<index;i++){
            temporary_first=temporary_first.next;
        }
        return temporary_first.data;
    }

    @Override
    public int indexOf(E element) {
        Node<E> temporary_first=first;
        if(temporary_first.data.equals(element)){
            return 0;
        }
        for(int i=0;i<=size;i++){
 
            temporary_first=temporary_first.next;
            if(temporary_first.data.equals(element)){
                return i+1;
            }
        }

        return -1;
    }

    @Override
    public E remove(int index) {

        Node<E> temporary_first=first;

        for(int i=0;i<index-1;i++){
            temporary_first=temporary_first.next;
        }
        Node<E> deleteObject=temporary_first.next;
        temporary_first.next=temporary_first.next.next;
        temporary_first.next.next.prev=temporary_first;
        size--;
        return deleteObject.data;

    }

    @Override
    public void set(int index, E element) {
        Node<E> temporary_first=first;

        for(int i=0;i<index-1;i++){

            temporary_first=temporary_first.next;

        }
        Node<E> temporary_between=new Node<>(element,temporary_first.next.next,temporary_first);
        temporary_first.next.next.prev=temporary_between;
        temporary_first.next=temporary_between;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <E1> E1[] toArray(E1[] a) {
        if (a.length < size)
            a = (E1[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.data;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.data;
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return get(index++);
            }
        };
    }


    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder=new StringBuilder();
        Node<E> firstNode = first;
        for(int i=0;i<size;i++){
            //System.out.println("-------зашёл---------");
            stringBuilder.append(firstNode.data+ " ");
            //System.out.println(firstNode.data);
            firstNode=firstNode.next;
        }
        return stringBuilder.toString();

    }
}
