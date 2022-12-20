public class 2 {
    //display the list
public void display(){
    //start from the beginning
    Link current = first;
    //navigate till the end of the list
    System.out.print("[ ");
    while(current != null){
       //print data
       current.display();
       //move to next item
       current = current.next;
       System.out.print(" ");
    }
    System.out.print(" ]");
 }
}
