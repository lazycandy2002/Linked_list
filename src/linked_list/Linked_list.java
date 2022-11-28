/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import java.util.Scanner;

/**
 *
 * @author makul
 */
public class Linked_list {

    public static int a;
    static Link_list the_list = new Link_list();
    static Scanner reply = new Scanner(System.in);
    static Scanner reply_0 = new Scanner(System.in);
    static Scanner reply_1 = new Scanner(System.in);
    static Scanner reply_2 = new Scanner(System.in);
    static Scanner reply_3 = new Scanner(System.in);
    static Scanner reply_4 = new Scanner(System.in);
    static Scanner reply_5 = new Scanner(System.in);
    static Scanner reply_6 = new Scanner(System.in);

    public static void main(String[] args) {

        start();
    }

    public static void start() {
        System.out.println("--------------------------------");
        the_list.display();
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 1. Insert Element into the Link List");
        System.out.println("      2. Delete FirstLink into the Link List");
        System.out.println("      3. Find LaptopName from the Link List");

        System.out.println("");
        filter_1();

    }

    static void filter_1() {
        int reply_a = reply.nextInt();
        a = reply_a;
        switch (a) {

            case 1:
                String name,
                 model,
                 color;
                int size,
                 cost;
                System.out.println("Enter Name:");
                String reply_b = reply_0.nextLine();
                System.out.println("Enter Model:");
                String reply_c = reply_1.nextLine();
                System.out.println("Enter Color:");
                String reply_d = reply_2.nextLine();
                System.out.println("Enter Size:");
                int reply_e = reply_3.nextInt();
                System.out.println("Enter Cost:");
                int reply_f = reply_4.nextInt();
                name = reply_b;
                model = reply_c;
                color = reply_d;
                size = reply_e;
                cost = reply_f;
                the_list.insertFirstLink(name, model, color, size, cost);
                start();
                break;
            case 2:

                System.out.println("");
                System.out.println("Y/N?:");
                String reply_g = reply_5.nextLine();

                switch (reply_g) {

                    case "Y":
                        the_list.removeFirstLink();
                    case "N":
                        start();
                    default:
                        System.out.println("INVALID, TRY AGAIN");
                        filter_1();
                }
                break;
            case 3:
                System.out.println("");
                System.out.println("TYPE THE LAPTOP NAME:");
                String reply_h = reply_6.nextLine();
                String fname;
                fname = reply_h;
                if (the_list.find(fname)!= null){
                    System.out.println("Search result : "+fname +" was not foundon the Linked List");
                }else{
                    System.out.println("Search result : "+fname + " was on the Linked List");
                };
                start();
                break;

            default:
                System.out.println("INVALID, TRY AGAIN");
                filter_1();
                break;

        }
    }
}
