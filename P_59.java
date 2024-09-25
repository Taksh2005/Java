// 59. WAP to check whether 2 singly linked lists are same or not.

import java.util.Scanner;

public class P_59 {
    /*
     * In this programme check two linklist as same or not while it is same than
     * print same and not same than print list is not same
     * 
     */

    // * Making Node
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    // Making method to insertElement into last position
    public Node first = null;

    public void insertEle(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    public static void checkDuplicate(P_59 f, P_59 s) {
        System.out.println("Enter in method");
        int c1 = 0;
        int c2 = 0;
        Node t1 = f.first;
        Node t2 = s.first;
        while (t1.link != null) {
            t1 = t1.link;
            c1++;
        }
        while (t2.link != null) {
            t2 = t2.link;
            c2++;
        }
        System.out.println(c1 + " " + c2);
        if (c1 != c2) {
            System.out.println("List is not same...........");
            return;
        }
        int count = 0;
        while (t1.link != null) {
            if (t1.data == t2.data) {
                t1 = t1.link;
                t2 = t2.link;
            } else {
                count++;
                return;
            }
        }

        if (count != 0) {
            System.out.println("List is not same");
        } else {
            System.out.println("list is same");
        }
    }

    public static void main(String[] args) {
        P_59 l1 = new P_59();
        P_59 l2 = new P_59();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First List: ");
        while (true) {
            System.out.println("Enter 1 for insert and 2 for stop.");
            int num = sc.nextInt();
            if (num == 2) {
                break;
            }
            switch (num) {
                case 1:
                    System.out.print("Enter number: ");
                    int data = sc.nextInt();
                    l1.insertEle(data);
                    break;
            }
        }

        System.out.println("Enter Second List:");

        while (true) {
            System.out.println("Enter 1 for insert and 2 for stop.");
            int num = sc.nextInt();
            if (num == 2) {
                break;
            }
            switch (num) {
                case 1:
                    System.out.print("Enter number: ");
                    int data = sc.nextInt();
                    l2.insertEle(data);
                    break;
            }
        }
        checkDuplicate(l1, l2);

    }
}
