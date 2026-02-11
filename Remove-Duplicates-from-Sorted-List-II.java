1import java.util.*;
2
3class Solution {
4    public ListNode deleteDuplicates(ListNode head) {
5        if (head == null) return null;
6
7        Set<Integer> duplicates = new HashSet<>();
8        ListNode temp = head;
9        
10        while (temp != null && temp.next != null) {
11            if (temp.val == temp.next.val) {
12                duplicates.add(temp.val);
13            }
14            temp = temp.next;
15        }
16
17        ListNode summa = new ListNode(0);
18        summa.next = head;
19        ListNode prev = summa;
20        ListNode current = head;
21
22        while (current != null) {
23            if (duplicates.contains(current.val)) {
24                prev.next = current.next;
25            } else {
26                prev = current;
27            }
28            current = current.next;
29        }
30
31        return summa.next;
32    }
33}