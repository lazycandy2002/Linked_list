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
public class Linked_list {

    public static void main(String[] args) {

        Link_List the_list = new Link_List();

        the_list.insert_First_Linked(" Acer", 21);
        the_list.insert_First_Linked(" Apple",41);
        the_list.insert_First_Linked(" Hp", 11);

        the_list.display();
        
        the_list.find("Hp");

    }

}
