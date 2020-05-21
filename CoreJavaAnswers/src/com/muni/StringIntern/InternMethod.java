package com.muni.StringIntern;

public class InternMethod {
public static void main(String[] args) {
	String s1 = new String("Muni");   //Creating object in heap memory
	String s2 ="Muni";   //Creating object in String Constant Pool
	String s3 =s1.intern();  //  Copying object from Heap memory to SCP if content is not available else refer old objec alone
	System.err.println(s1==s2);
	System.err.println(s1==s3);
	System.err.println(s3 ==s2);
}
}
