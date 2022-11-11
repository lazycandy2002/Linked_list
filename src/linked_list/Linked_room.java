/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author makul
 */
public class Linked_room {

    public String LaptopName;
    public int cost;
    public Linked_room next;

    public Linked_room() {

    }

    public Linked_room(String LaptopName, int cost) {
        this.LaptopName = LaptopName;
        this.cost = cost;

    }

    public void display() {
        System.out.println("Laptop Name : " + LaptopName + " Cost : P " + cost + "000.00");
    }

    public String toString() {
        return LaptopName;

    }
}

class Link_List {

    public Linked_room First_Link;

    Link_List() {
        First_Link = null;

    }

    public boolean isEmpty() {
        return (First_Link == null);
    }

    public void insert_First_Linked(String Laptop_Name, int cost) {

        Linked_room newlink = new Linked_room(Laptop_Name, cost);

        newlink.next = First_Link;
        First_Link = newlink;
    }

    public void display() {
        Linked_room link = First_Link;

        while (link != null) {
            link.display();
            System.out.println("New Set :" + link.next);
            link = link.next;
            System.out.println();
        }
    }

    public Linked_room find(String laptop_name) {

        Linked_room theLink = First_Link;

        if (!isEmpty()) {

            while (theLink.LaptopName != laptop_name) {

                if (theLink.next == null) {

                    return null;

                } else {

                    theLink = theLink.next;
}}
        } else {
            System.out.println("Empty LinkedList");
        }

        return theLink;

    }

}
