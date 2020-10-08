package com.mycompany.maths;

import org.apache.log4j.Logger;

public class Operations{
	private static Logger logger = Logger.getLogger(Operations.class);
	
	public int add(int a, int b){
		logger.info("Method ADD");
		return a+b;
	}
	public int sub(int a, int b){
		logger.info("Method SUB");
		return a-b;
	}
	public int mul(int a, int b){
		logger.info("Method MUL");
		return a*b;
	}
	public int div(int a, int b){
		logger.info("Method DIV");
		return a/b;
	}
	public int mod(int a, int b){
		logger.info("Method MOD");
		return a%b;
	}
}
