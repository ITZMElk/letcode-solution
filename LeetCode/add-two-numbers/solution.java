// Source: https://leetcode.com/problems/add-two-numbers/


            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}
