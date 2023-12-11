package dp;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

	int value, weight;

	public FractionalKnapsack(int val, int wt) {
		this.value = val;
		this.weight = wt;
	}

	public static double maxValue(FractionalKnapsack[] frr, int wt, int n) {
		Arrays.sort(frr, new Compare());

		// Printing the sorted array according to per unit value
		for (FractionalKnapsack f : frr) {
			System.out.println(f.weight);
		}
		int currentWeight = 0;
		double maxValue = 0;
		for (int i = 0; i < n; i++) {

			if (currentWeight + frr[i].weight <= wt) {
				currentWeight += frr[i].weight;
				maxValue += frr[i].value;
			} else {
				int remaining = wt - currentWeight;
				maxValue += remaining * frr[i].value / frr[i].weight;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int n = 3;
		int wt = 50;
		FractionalKnapsack[] frr = new FractionalKnapsack[n];
		frr[0] = new FractionalKnapsack(100, 20);
		frr[1] = new FractionalKnapsack(60, 10);
		frr[2] = new FractionalKnapsack(120, 30);

		System.out.println(maxValue(frr, wt, n));

	}

}


// How Does Comparator Work?
// Answer : x.comapareTo(y)
// Negative Value : if(x<y) (x should appear first) (In Descending)
// Zero Value : if(x==y)
// Positive Value : if(x>y) (x should appear second)

class Compare implements Comparator<FractionalKnapsack> {

	@Override
	public int compare(FractionalKnapsack a, FractionalKnapsack b) {
		double a1 = (double) (a.value) / (double) (a.weight);
		double b1 = (double) (b.value) / (double) (b.weight);
		
		return (int) ((int) b1-a1);
	}

}