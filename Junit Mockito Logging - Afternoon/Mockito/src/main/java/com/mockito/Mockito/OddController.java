package com.mockito.Mockito;

public class OddController{
	OddChecker oddchecker;
	public boolean Odd(int n) {
		return oddchecker.isOdd(n);
	}
	public OddChecker getObj() {
		return oddchecker;
	}
	public void setObj(OddChecker oddchecker) {
		this.oddchecker = oddchecker;
	}
}
