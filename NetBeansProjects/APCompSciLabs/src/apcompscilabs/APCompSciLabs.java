package apcompscilabs;

public class APCompSciLabs {
	static int factoredNum = 1;
	static String factorialWork = "";
	static int index=0;
	static int countOfWords = 0;
	public static void main(String[] args) 
	{	
		
		Coin MyCoin = new Coin();
                MyCoin.flip();
                System.out.println(MyCoin.getCount());
                
	}
	
	public static int coinFlip(){
		
		
		
		return 1;
	}
	
	public static int countWords(String a, String b)
	{
		while(index>=0)
		{
			if(b.indexOf(a, index)==-1){
				break;
			}
			index = b.indexOf(a, index)+a.length()-1;
			countOfWords++;
		}
		
		return countOfWords-1;
	}
	
	public static int factorial(int n){
		factoredNum = 1;
		for(int i=n;i>=1;i--){
			factoredNum *= i;
		}
		return factoredNum;
	}
	
	public static String factorial2(int n){
		factorialWork += n + "! = ";
		factoredNum = 1;
		for(int i=n; i>=0; i--){
			if(i>0){factoredNum *= i;}
			if(factorialWork.indexOf("2")>0){
				factorialWork+=" * 1 = " + factoredNum;
				break;
			}
			else{
				factorialWork+=i + " * ";
			}
		}
		return factorialWork;
	}

}

class Coin{
	private static double randomSide;
        private static String side;
        private static int countOf;
        private static int tries;
        
        public static void flip(){
            
            while(countOf<10){
                randomSide = Math.random();
                if(Math.rint(randomSide)==0){
                    side="heads";
                    countOf++;
                }
                else
                {
                    side="tails";
                    countOf=0;
                }
                tries++;
            }
        }
        
        public Coin(){
            randomSide = 0;
            side=null;
            countOf=0;
        }
        
        public static int getCount(){
            return tries;
        }
}