/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;

        // PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (a, b) -> a.val - b.val);
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1, ListNode o2)
            {
                return o1.val - o2.val;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        for(ListNode list : lists)
        {
            if(list != null)
            {
                queue.add(list);
            }
        }
        
        while(!queue.isEmpty()){
            
            cur.next = queue.poll();
            cur = cur.next;
            if(cur.next != null)
            {
                queue.add(cur.next);
            }
        }
        
        return dummy.next;
    }
}