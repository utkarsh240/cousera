public LinkedList reverse() { 
    LinkedList reversedlist = new LinkedList();
    Link nextLink = null;     
    reversedlist.insertFirst(first.key, first.data);
 
    Link currentLink = first;       
    // Until no more data in list, 
    // insert current link before first and move ahead.
    while(currentLink.next != null){
       nextLink = currentLink.next;           
       // Insert at start of new list.
       reversedlist.insertFirst(nextLink.key, nextLink.data); 
       //advance to next node
       currentLink = currentLink.next;            
    }      
    return reversedlist;
 }