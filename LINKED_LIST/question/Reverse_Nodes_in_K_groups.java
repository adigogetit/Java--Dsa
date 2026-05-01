import java.util.Stack;

public class Reverse_Nodes_in_K_groups {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // using stack
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st = new Stack<>();
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode start = head;

        while(head != null){
            //  k node stack
            while(head != null && st.size()>k){
                st.push(head);
                head = head.next;
            }
            if(k == st.size()){
                while(!st.isEmpty()){
                    dummy.next = st.pop();
                    dummy = dummy.next;
                }
                dummy.next = null;
            }else{
                dummy.next = start;
            }
            start = head;
        }
        return temp.next;

    }
















    // using reverse code
    // public ListNode reverseKGroup(ListNode head, int k) {
    //     // check if there are k elements 
    //     ListNode curr = head;
    //     for(int i=0;i<k;i++){
    //         if(curr == null)return head;
    //         curr = curr.next;
    //     }

    //     // reverse k elements
    //     ListNode prev = null;
    //     curr = head;
    //     // ListNode next = null;

    //     for(int i=0;i<k;i++){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     // recursive call for next k elements
    //     // head is now the last node of this reversed group
    //     head.next = reverseKGroup(curr,k);

    //     // return new head of this group
    //     return prev;
    // }
}
