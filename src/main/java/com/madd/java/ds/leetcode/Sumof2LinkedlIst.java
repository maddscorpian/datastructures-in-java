package com.madd.java.ds.leetcode;

public class Sumof2LinkedlIst {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 
        int power = 0;
        int num1 = 0;
        
        while (l1 != null){
            num1 += l1.val*Math.pow(10,power);
        } 
        System.out.println(num1);
		
		
		
		int sum = 807;
		while (sum !=0) {
			sum -= sum*Math.log10(sum);
			System.out.println(sum);
		}
		
		
		return l2;
		// First convert the list into a number.

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
