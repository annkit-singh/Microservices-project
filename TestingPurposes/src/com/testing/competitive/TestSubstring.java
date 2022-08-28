package com.testing.competitive;

public class TestSubstring {
	
	  public static void findSubstring(String str,String output){
	        
	        if(str.length()==0){
	            System.out.println(output);
	            return ;
	        }
	        char ch=str.toCharArray()[0];
//	        System.out.println(ch);
	        String reducedStr=str.substring(1);
	        findSubstring(reducedStr,output+ch);
	        findSubstring(reducedStr,output);
	        
	    }
	
	public static void main(String[] args) {
		System.out.println("hello World");
		findSubstring("abc","");
		
		
	}

}
