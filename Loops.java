class Loops{
	public static void main (String[] args) {	
	
	/*
		for (int i=1;i<=10;i++){
			if (i%2 !=0){
				continue;
			}
		System.out.println(i+" ");
		}
		*/
		
		
		
		outerLoop : for (int i=1;i<=10;i++){
			innerLoop : for (int j=0;j<10;j++){
			if (j==5){
				continue outerLoop;
			}
			System.out.println(i+" "+j);
			}
			
			if(i==6){
				break outerLoop;
			}
		}
	}
}