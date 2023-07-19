package com.string;

public class ArraySpace {
	public void getarrayspace(String str) {
		int spacecount =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')spacecount++;{
		}	
		
		
		}

		System.out.println("total space"+spacecount);	
			
}
		
	public static void main(String[] args) {
		
		 ArraySpace arrayspace = new ArraySpace();
		 arrayspace.getarrayspace("abhay bulbule is learning java at velocity pune , !");
		
	
	

	}
}
