import java.util.Scanner;
import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfCommands = scanner.nextLine();
        
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        
        for (int i = 0; i < Integer.parseInt(numberOfCommands); i++) {
            String command = scanner.nextLine();
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "addFirst":
                    list.addFirst(Integer.parseInt(commands[1]));
                    break;
                case "addLast":
                    list.addLast(Integer.parseInt(commands[1]));
                    break;
                case "removeFirst":
                    list.removeFirst();
                    break;
                case "removeLast":
                    list.removeLast();
                    break;
                case "reverse":
                    list.reverse();
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(list.toString());
    }
}

class DoublyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DoublyLinkedList() {
        size = 0;
    }
    
    public Node<E> getHead() {
        return head;
    }
    
    public Node<E> getTail() {
        return tail;
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void addFirst(E elem) {
        Node<E> tmp = new Node<>(elem, head, null);

        if (size == 0) {
            head = tail = tmp;
        } else {
            head.prev = tmp;
            head = tmp;
        }
        size++;
    }
    
    public void addLast(E elem) {
        Node<E> tmp = new Node<>(elem, null, tail);

        if (size == 0) {
            head = tail = tmp;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }
    
    public void removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
    }
    
    public void remove(Node<E> curr) {
        if (curr == null) {
            throw new NoSuchElementException();
        }

        if (curr.prev == null) {
            removeFirst();
            return;
        }
        if (curr.next == null) {
            removeLast();
            return;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
    }
    
    public void reverse() {
        Node<E> temp = null;
        Node<E> current = head;
        tail = head; 

        while (current != null) {
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    
    public String toString() {
        Node<E> tmp = head;
        StringBuilder result = new StringBuilder();

        while (tmp != null) {
            result.append(tmp.value).append(" ");
            tmp = tmp.next;
        }
        return result.toString();
    }
    
    static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> prev;
        
        Node(E element, Node<E> next, Node<E> prev) {
            this.value = element;
            this.next = next;
            this.prev = prev;
        }
        
        Node<E> getNext() {
            return next;
        }
        
        Node<E> getPrev() {
            return prev;
        }
        
        E getValue() {
            return value;
        }
    }
}
