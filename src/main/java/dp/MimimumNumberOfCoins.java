package dp;

public class MimimumNumberOfCoins {
	
	public static int minimumCoins(int[] coins,int num) {
		int res = 0;
		for(int i=0;i<coins.length;i++) {
			if(num==0) {
				break;
			}
			int quotient = num/coins[i];
			res+=quotient;
			num = num-(coins[i]*quotient);
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] coins  = {10,5,2,1};
		
		System.out.println(minimumCoins(coins,43));

	}

}
