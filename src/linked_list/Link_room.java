/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author Jared Gamutin
 */
public class Link_room {
    public String Laptop_name,model,color;
    public int size,cost;
    
   public Link_room nextpo;
   
   public Link_room(String name,String model,String color,int size,int cost){
       this.Laptop_name = name;
       this.color = color;
       this.model = model;
       this.size = size;
       this.cost = cost;
   }
    public void displayme (){
        System.out.println(Laptop_name + "--" + model + "--" + color +"--"+ size +"--"+cost);
        
    }
    public String toString(){
        return Laptop_name;
    }
}
class Link_list {
    public Link_room firstLink;

    public Link_list() {
    firstLink = null;
    }
    
    public boolean  isEmpty(){
       return (firstLink == null);
    }
 public void insertFirstLink(String name,String model,String color,int size,int cost){
   
     Link_room newLink  =new Link_room(name,model,color,size,cost);
     
     newLink.nextpo = firstLink;
     firstLink = newLink;
 }   
   public Link_room removeFirstLink(){
       Link_room linkReference = firstLink;
       if (! isEmpty()){
           firstLink = firstLink.nextpo;
       } else{
           System.out.println("Empty LinkedList");
       }
       return linkReference;
   }
   
   public void display(){
       Link_room thelink = firstLink;
       
       while (thelink!= null){
           thelink.displayme();
           System.out.println("Next Set : "+thelink.nextpo);
           thelink = thelink.nextpo;
           System.out.println("");
       }
   }
   public Link_room find (String lappyname){
   Link_room Thelink = firstLink;
   if (!isEmpty()){
       while (Thelink.Laptop_name !=lappyname){
           if (Thelink.nextpo == null){
           return null;
       }else{
               Thelink = Thelink.nextpo;
           }
           
       }
   }else{
       System.out.println("Empty linkedList");
   }
   return Thelink;
   }
    public Link_room removelink(String name){
        Link_room currentLink = firstLink;
        Link_room previousLink = firstLink;
        while (currentLink.Laptop_name != name){
            if (currentLink.nextpo == null){
                return null;
            }else{
                previousLink = currentLink;
                currentLink = currentLink.nextpo;
            }
        }
        if(currentLink == firstLink){
            firstLink = firstLink.nextpo;
            
        }else{
            previousLink.nextpo = currentLink.nextpo;
        }
        return currentLink;
    }
}
