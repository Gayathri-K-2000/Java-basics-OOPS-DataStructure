public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data=d;
            next=null;
        }
    }
        
        public static Main insert(LinkedList list,int data){
            Node newnode=new Node(data);
            newnode.next=null;
            
            if(list.head==null){
                list.head=newnode;
            }
            
            else{
                Node last=list.head;
                while(last.next!=null){
                    last=last.next;
                }
                last.next=newnode;
            }
            return list;
        }
        
        public static void print(LinkedList list){
            Node currnode=list.head;
            
            System.out.println("Linked list is:  ");
            while(currnode!=null){
                System.out.println(currnode.data+" ");
                currnode=currnode.next;
            }
            
        }
        
        public static void main(String args[]){
            
            LinkedList list=new LinkedList();
            
            list=insert(list,1);
            list=insert(list,2);
            list=insert(list,3);
            list=insert(list,4);
            list=insert(list,5);
            list=insert(list,6);
            list=insert(list,7);
            
            print(list);
            
        }
        
        public void add(String string){
            
        }
    
}
