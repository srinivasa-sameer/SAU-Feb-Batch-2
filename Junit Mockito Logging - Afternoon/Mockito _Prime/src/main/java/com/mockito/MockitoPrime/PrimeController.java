package com.mockito.MockitoPrime;

public class PrimeController{
	PrimeChecker primechecker;
	public boolean Prime(int n) {
		return primechecker.isPrime(n);
	}
	public PrimeChecker getObj() {
		return primechecker;
	}
	public void setObj(PrimeChecker primechecker) {
		this.primechecker = primechecker;
	}
}
