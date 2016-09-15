package base;

public class MyInteger {
	
	private int iValue = 0;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isOdd() {
		if (iValue % 2 == 0)
			return false;
		else 
			return true;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < iValue/2; iValue++) {
	        if(iValue % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean isEven(int j) {
		if (j % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(int j) {
		if (j % 2 == 0)
			return false;
		else 
			return true;
	}
	
	public static boolean isPrime(int j) {
		for (int i = 2; i < j/2; j++) {
	        if(j % i == 0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger j) {
		return j.isEven();
	}
	
	public static boolean isOdd(MyInteger j) {
		return j.isOdd();
	}
	
	public static boolean isPrime(MyInteger j) {
		return j.isPrime();
	}
	
	public boolean equals(int j) {
		return this.iValue == j;
	}
	
	public boolean equals(MyInteger j){
		return this.iValue == j.iValue;
	}

	public static void main(String[] args){
		MyInteger t = new MyInteger(3);
		System.out.println(t.isEven());
		MyInteger u = new MyInteger(2);
		
		System.out.println(t.equals(u));
		
		
	}
}
