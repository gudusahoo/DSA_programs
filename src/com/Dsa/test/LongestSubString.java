package com.Dsa.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString { 
	public static int lengthOfLongestSubStringUsingSet(String s) {
		Set<Character> window=new HashSet<Character>();
		int left=0;
		int maxlength=0;
		for (int right = 0; right < s.length(); right++) {
			char current=s.charAt(right);
			while (window.contains(current)) {
				window.remove(s.charAt(left));
				left++;
			}
			window.add(current);
			maxlength=Math.max(maxlength, right-left+1);
			
		}
		
		return maxlength;
		
	}
	
	public static int lengthOfLongestSubStringUsingmap(String s) { 
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		int left=0;
		int maxlength=0;
		for(int right=0;right<s.length();right++) {
			char current=s.charAt(right);
			if(map.containsKey(current)) {
				left=Math.max(left, map.get(current)+1);
				
			}
			map.put(current, right);
			maxlength=Math.max(maxlength, right-left+1);
			
		}
		
		
		
		return maxlength;
	}
	 public static void main(String[] args) {

			
			  System.out.println(lengthOfLongestSubStringUsingmap("abcabcbb"));
			  System.out.println(lengthOfLongestSubStringUsingmap("bbbbb"));
			  System.out.println(lengthOfLongestSubStringUsingmap("pwwkew"));
			  System.out.println(lengthOfLongestSubStringUsingmap("abba"));
			  }
}
