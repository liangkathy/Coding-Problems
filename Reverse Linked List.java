class Solution {
    public ListNode reverseList(ListNode head) {
        //update prev while reversing
        ListNode prev = null;

        while (head !=null){
            ListNode next = head.next;
            //move pointer to next (null for first head loop since it is the end)
            head.next = prev;
            //set prev to current head
            prev = head;
            //now head becomes the next node set above
            head = next;
        }

        return prev;
    }
}
