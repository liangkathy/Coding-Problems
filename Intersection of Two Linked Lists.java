public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode aPointer = headA;
        ListNode bPointer = headB;

        while(aPointer != bPointer){
            if(aPointer == null){ //at end of list
                aPointer = headB;
            } else {
                aPointer = aPointer.next;
            }

            if(bPointer == null){ //at end of list
                bPointer = headA;
            } else {
                bPointer = bPointer.next;
            }
        }
        //while loop ends once two pointers are equal
        //can return either pointer
        return aPointer;
    }
}
