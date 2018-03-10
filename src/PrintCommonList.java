/**
 * 打印两个有序链表的公共部分
 * Created by ztk on 2018/3/10.
 */
public class PrintCommonList {

    /**
     * 此题解题关键:
     * 两个链表有序
     * @param head1
     * @param head2
     */
    public static void printCommonList(Node head1,Node head2){
        while(head1!=null && head2 !=null){
            if(head1.value<head2.value){
                head1 = head1.next;
            }else if(head1.value>head2.value){
                head2 = head2.next;
            }else {
                System.out.println(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
    public static void main(String[] args){
        Node head1 = new Node(1);
        Node head2 = new Node(1);
        Node head1Next = new Node(3);
        head1.next = head1Next;
        Node head1NextNext = new Node(8);
        head1Next.next = head1NextNext;
        head2.next = head1NextNext;
        printCommonList(head1,head2);
    }

}
