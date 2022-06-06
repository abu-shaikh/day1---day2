class MethodDemo{
	
	static void add(int a, int b){
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	static void mult(int a, int b){
		int result=a*b;
		//System.out.println(result);
		return result;
	}
	
	
	
	
	public static void main (String[] args) {	
		add(10,20);
		int res=mult(10,20);
		System.out.println("Mult Result="+res);
	}
}