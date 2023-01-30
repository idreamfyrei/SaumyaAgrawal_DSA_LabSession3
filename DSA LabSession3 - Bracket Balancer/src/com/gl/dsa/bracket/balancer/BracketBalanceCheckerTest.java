package com.gl.dsa.bracket.balancer;


public class BracketBalanceCheckerTest {
	public static void main(String[] args) {
		
		test("{[()]}");
		test("{}");
		test("m[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("m[]w");
		test("[<>");
		
	}
	

	private static void test(String brackets) {
			
		BracketBalanceChecker checker = new BracketBalanceChecker(brackets);
		Result result = checker.check();
		System.out.println(result);
	}

}
