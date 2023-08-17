package LinkedList;

public class Main {

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;
    } 

    void addLast(int val,LinkedList list){
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
        if(list.size == 0){
            list.head = list.tail = temp;
        }else{
            list.tail.next = temp;
            list.tail = temp;
        }
        list.size++;
    }

    public int size(LinkedList list){
        return list.size;
    }

    public void display(LinkedList list){
        Node temp = list.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst(LinkedList list){
        if(list.size == 0){
            System.out.println("List is empty");
        }else if(list.size == 1){
            list.head = list.tail = null;
            list.size=0;
        }else{
            list.head = list.head.next;
            list.size--;
        }
    }

    public int getFirst(LinkedList list){
        if(list.size == 0){
            System.out.println("List is empty");
            return -1;
        }else{
            return list.head.data;
        }
    }

    public int getLast(LinkedList list){
        if(list.size == 0){
            System.out.println("List is empty");
            return -1;
        }else{
            return list.tail.data;
        }
    }

    public int getAt(int index, LinkedList list){
        if(list.size == 0){
            System.out.println("List is empty");
            return -1;
        }else if(index < 0 || index >= list.size){
            System.out.println("Invaild arguments");
            return -1;
        }else{
            Node temp = list.head;
            for(int i =0; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addFirst(LinkedList list, int val){
        Node temp = new Node();
        temp.data = val;
        if (list.size == 0){
            list.head = list.tail = temp;
        }else{
            temp.next = list.head;
            list.head = temp;
        }
        list.size++;
    }

    public void addAt(LinkedList list, int idx, int val){
        if(idx<0 || idx>list.size){
            System.out.println("Invalid arguments");
        }else if(idx == 0){
            addFirst(list, val);
        }else if(idx == list.size){
            addLast(val, list);
        }else{
            Node node = new Node();
            node.data = val;

            Node temp = list.head;
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            
            node.next = temp.next;
            temp.next = node;

            list.size++;
        }
    }

    public void removeLast(LinkedList list){
        Node temp = list.head;
        for(int i=0; i<list.size-1; i++){
            temp = temp.next;
        }
        temp.next = null;
        list.tail = temp;
        list.size --;
    }

    

    public static void main(String []args){

    }
}
