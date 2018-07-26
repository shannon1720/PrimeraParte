package com.cenfotec.object;

public class ui {

	
	
	 public static void main(String[] args) throws Exception {
		 
		 
		 
		 
		 int []num= CribaEratostenes.generaCriba(1);
		 
//		 System.out.println(num.length);
		 for(int i=0;i<num.length;i++) {
			 
			 System.out.print(num[i]+"-"+i+"\n");
			 
		 }
	 }
	
	
}
