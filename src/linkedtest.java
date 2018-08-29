//import java.nio.file.NotDirectoryException;
//
//public class linkedtest {
//    class Node{
//        int id;
//        Node next;
//        Node(int id){
//            this.id=id;
//            this.next=null;
//        }
//    }
//
//    Node head=null;
//
//    public void addNode(int id){
//        Node node=new Node(id);
//        if (head==null){
//            head=node;
//            return;
//        }
//        Node tmp=head;
//        while (tmp.next!=null){
//            tmp=tmp.next;
//        }
//        tmp.next=node;
////        node.next=head.next;
////        head.next=node;
//    }
//
//    public boolean delNode(int index){
//        if (index<1||index>length()){
//            return false;
//        }
//        if (index==1){
//            head=head.next;
//            return true;
//        }
//        int i=2;
//        Node prenode=head;
//        Node curnode=prenode.next;
//        while (curnode!=null){
//            if (i==index){
//                prenode.next=curnode.next;
//                return true;
//            }
//            i++;
//            prenode=curnode;
//            curnode=curnode.next;
//        }
//        return false;
//    }
//
//    public int length(){
//        int length=0;
//        Node tmp=head;
//        while (tmp!=null){
//            length++;
//            tmp=tmp.next;
//        }
//        return length;
//    }
//
//    public void print(){
//        while (head!=null){
//            System.out.println(head.id);
//            head=head.next;
//        }
//    }
//
//    public Node Reverse(Node head){
//
//    }
//
//    public static void main(String[] args){
//        linkedtest l=new linkedtest();
//        l.addNode(3);
//        l.addNode(2);
//        l.addNode(155);
//        l.delNode(3);
//        l.print();
//    }
//}
//
