package com.moshi.singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
     //OuterClass.InnerClass in1 = OuterClass.getInstance();
       //OuterClass.InnerClass in2 = OuterClass.getInstance();
        System.out.println(OuterClass.getInstance()==OuterClass.getInstance());
    }
}
