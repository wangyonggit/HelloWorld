import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import javax.print.attribute.IntegerSyntax;



public class HelloWorld {
	
	public static class TreeNode {
	     int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode next;
		 TreeNode(int x) { val = x; left = null; right = null; next=null;}
	 }
	
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; next=null;}
	 }
	
	public static void main(String argv[])
	{
		System.out.print("Hello World!\n");
		
		//Tree
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(1);
		TreeNode e = new TreeNode(3);
		TreeNode f = new TreeNode(5);
		TreeNode g = new TreeNode(1);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		//c.left = f;
		//c.right = g;
		
		//List<List<Integer>> result = verticalOrder(a);
//		connect(a);
		
		//List<List<Integer>> result = findLeaves(a);
		
		//System.out.print("\n");
		//System.out.print("Result = "+result);
		
//		List<Integer> result = inorderTraversal(a);
//		System.out.print("In Order Result = "+result);
//		
//		result = preorderTraversal(a);
//		System.out.print("\nPreOrder Result = "+result);		
//		
//		result = preorderTraversal2(a);
//		System.out.print("\nPreOrder 2 Result = "+result);	
//		
//		result = postorderTraversal(a);
//		System.out.print("\nPostOrder Result = "+result);
//
//		result = postorderTraversal2(a);
//		System.out.print("\nPostOrder 2 Result = "+result);
		//List
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(10);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(8);
		ListNode l7 = new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;

		
//		ListNode m1 = new ListNode(5);
//		ListNode m2 = new ListNode(6);
//		ListNode m3 = new ListNode(4);
//		m1.next=m2;
//		m2.next=m3;
//		
//		ListNode l1 = new ListNode(5);
//		ListNode l2 = new ListNode(5);
		
//		ListNode n = plusOne(l1);
//		
//		System.out.print("result = [");
//		while(n!=null)
//		{
//			System.out.print(n.val+"->");
//			n=n.next;
//		}
//		System.out.print("]");
//		
	
		//Matrix
		//int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
		int[][] matrix = {{1,2},{3,3}};
		//int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		//int[][] matrix = {{0},{1}};
		//int[][] matrix = {{1,2,3}};
		//int[][] matrix = {{1},{2},{3}};
		//int[][] matrix = {{2,5,8},{4,0,-1}};
		//char[][] matrix = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		//char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

		//char[][] grid = {{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
		//int[][] matrix1 = {{1,0,0},{-1,0,3}};
		//int[][] matrix2 = {{7,0,0},{0,0,0},{0,0,1}};
		
		//int result = kthSmallest(matrix, 2);
		//System.out.print("Result = "+result);

//		for(int i=0; i<matrix.length; i++)
//		{
//			System.out.print("[");
//			for(int j=0; j<matrix[0].length; j++)
//			{
//				System.out.print(matrix[i][j]);
//				if (j<matrix[0].length-1)
//					System.out.print(",");
//			}
//			System.out.print("]");
//			System.out.print("\n");
//		}
		
		//int result = CountPath(4, 7);
		
		//System.out.print("\n");
		//System.out.print("Result = "+result);
//		for(int i=0; i<matrix.length; i++)
//		{
//			System.out.print("[");
//			for(int j=0; j<matrix[0].length; j++)
//			{
//				System.out.print(matrix[i][j]);
//				if (j<matrix[0].length-1)
//					System.out.print(",");
//			}
//			System.out.print("]");
//			System.out.print("\n");
//		}
		
		
		
		int[] nums = {0};
//		int[] preorder = {1,2,4,5,3,6,7};
//		int[] inorder = {4,2,5,1,6,3,7};
//		int[] postorder = {4,5,2,6,7,3,1};
		//int[] preorder = {1};
		//int[] inorder = {4};
		//String beginWord = "hit";
		//String endWord = "cog";
		//Set<String> wordList = new HashSet<>(Arrays.asList("hot","dot","dog","lot","log"));
		//String[] strs = {"hot","dot","dog","lot","log"};
		//String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		//String s = "/a/./b/../../c/";
		//String t = "45";
		//String pattern = "abab";
		//String str = "dog cat cat dog";
		//String str = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
		String s = "ababbc";
		String t = "3[a2[c]]";
		//String t = "a2[c]";
		//int n = 12;
		//for (int i=0; i<nums.length; i++)
		//	System.out.print("Result = "+nums[i]);
		//int n = -2147483648;

		//String [] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
		//String word1 = "makes";
		//String word2 = "coding";
		
		//String [] dictionary = {"door", "door"};
		String word = "word";
		//int[][] prerequisites = new int[][]{{1,0},{2,0},{3,1},{3,2}};
		int[][] people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		//int[][] edges = new int[][]{{1,0},{1,2},{1,3}};
		//int[][] edges = new int[][]{};

		//String[][] tickets = new String[][]{{"MUC", "LHR"},{"JFK", "MUC"},{"SFO", "SJC"},{"LHR", "SFO"},{"SFO", "SJD"}};

		//sortColors(nums);
		//List<String> result = sortColors(s);
		//TreeNode a = sortedListToBST(l1);
		//List<List<Integer>> result = travesal2(a);
		
//		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
//		triangle.add(Arrays.asList(2));
//		triangle.add(Arrays.asList(3,4));
//		triangle.add(Arrays.asList(6,5,7));
//		triangle.add(Arrays.asList(4,1,8,3));
//		int result = minimumTotal(triangle);
		
		//int[] result = kthSmallest(nums, -1, 3, 5);		
		//movezero(nums);
		

		int result = hIndex2(nums);	
		System.out.print("\n");
		System.out.print("Result = "+result);

		//for(int[] p:result)
		//{
		//	System.out.print("["+p[0]+","+p[1]+"]");
		//}
		
		//nums=result;
		//System.out.print("[");
		//for (int i=0; i<nums.length; i++)
		//	System.out.print(nums[i]+",");
		//System.out.print("]");

	}
	public static int hIndex2(int[] citations) {
//        int length = citations.length;
//        if (length == 0) {
//        	return 0;
//        }
//        
//        int[] count = new int[length + 1];
//
//		for (int i = 0; i < length; i++) {
//			if (citations[i] > length)
//				count[length]++;
//			else
//				count[citations[i]]++;
//		}
//
//		int result = 0;
//		for (int i = count.length - 1; i >= 0; i--) {
//			result += count[i];
//			if (result > i)
//				return result;
//		}
//
//		return 0;
		
		int length = citations.length;
        if (length == 0) {
        	return 0;
        }
        
        int[] array2 = new int[length + 1];
        for (int i = 0; i < length; i++) {
        	if (citations[i] > length) {
        		array2[length] += 1;
        	} else {
        		array2[citations[i]] += 1;
        	}
        }
        int t = 0;
        int result = 0;

        for (int i = length; i >= 0; i--) {
        	t = t + array2[i];
        	if (t >= i) {
        		return i;
        	}
        }
        return 0;
	}

	public static int hIndex(int[] citations) {
		   if (citations.length<=0)
		         return 0;  
		     
		    Arrays.sort(citations);
		    for( int i = 0; i < citations.length/2; ++i ) 
		    { 
		      int temp = citations[i]; 
		      citations[i] = citations[citations.length - i - 1]; 
		      citations[citations.length - i - 1] = temp; 
		    }
		    	 
			for (int i=0; i<citations.length; i++)
		    {
		    	if (i>=citations[i] )
		    	{
		    		return i;
		    	}
		    }
		        
		    return citations.length;
		}

	
public static List<Integer> lexicalOrder2(int n) {
int curr = 1;
List<Integer> result = new ArrayList<>();
for (int i = 1; i <= n; i++) {
	result.add(curr);
	if (curr * 10 <= n)
		curr = curr * 10;
	else if (curr % 10 != 9 && curr + 1 <= n)
		curr = curr + 1;
	else {
		while ((curr / 10) % 10 == 9)
			curr = curr / 10;
		curr = curr / 10 + 1;

	}
}
	return result;
}
	public static List<String> findItinerary2(String[][] tickets) {
	    Map<String, PriorityQueue<String>> targets = new HashMap<>();
	    for (String[] ticket : tickets)
	    {
	    	if (!targets.containsKey(ticket[0]))
	    	{
	    		targets.put(ticket[0], new PriorityQueue<String>());
	    	}
	    	targets.get(ticket[0]).add(ticket[1]);
	    }
	    
	    List<String> route = new LinkedList();
	    Stack<String> stack = new Stack<>();
	    stack.push("JFK");
	    while (!stack.empty()) {
	    	String from = stack.peek();
	        while (targets.containsKey(from) && !targets.get(from).isEmpty())
	        {
	        	String to = targets.get(from).poll();
	            stack.push(to);
	            from = to;
	        }
	        route.add(0, stack.pop());
	    }
	    return route;
	}



    
public static boolean verifyPreorder(int[] preorder) {

	Stack<Integer> mStack = new Stack<>();
	int minLow = Integer.MIN_VALUE;
	for (int val : preorder) {
		if (val < minLow)
			return false;
		while (!mStack.empty() && val > mStack.peek()) {
			minLow = mStack.pop();
		}

		mStack.push(val);
	}
	return true;
}

public static List<List<Integer>> travesal(TreeNode root) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
   if (root==null)
		   return result;
   
	Queue<TreeNode> mQue = new LinkedList<>();
	mQue.add(root);
	int levelIndex=0;
	while(!mQue.isEmpty())
	{
		levelIndex++;
		int levelnum= mQue.size();
		List<Integer>row = new ArrayList<>();
		for(int i=0; i<levelnum; i++)
		{
			TreeNode currNode = mQue.peek();
			if (currNode.left!=null)
				mQue.add(currNode.left);
			if (currNode.right!=null)
				mQue.add(currNode.right);
			
			if (levelIndex%2==1)
				row.add(currNode.val);
			else
				row.add(0, currNode.val);
			mQue.poll();
		}
		result.add(row);
	}
    return result;
}
	
public static List<List<Integer>> travesal2(TreeNode root) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
    DFSTraversal(root, result, 1);
    return result;
}

public static void DFSTraversal(TreeNode root, List<List<Integer>> result, int level) {
	if (root==null)
			return;
	
	if (result.size()<level)
	{
		result.add(new ArrayList<Integer>());
	}
	
	DFSTraversal(root.left, result, level+1);
	DFSTraversal(root.right, result, level+1);
    result.get(level-1).add(root.val);
}



}
