class OperatorDemo{
	public static void main (String[] args) {	
		int a=20;
		int b=10;
		if(a<b){
			System.out.println("A is small");
			if(a%3==0){
				System.out.println("A is divisble by 3");
			}
		}else if (a==b){
			System.out.println("Equal");
			if(a*b <=400){
				System.out.println("a*b is lte 400");
			}
		}else {
			System.out.println("B is small");
			if(b%7==0){
				System.out.println("B is disvible by 7");
			}else{
				System.out.println("B is not divisble by 7");
			}
		}
	}
}