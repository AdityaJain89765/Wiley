package BankingProject;

import java.util.*;

public class Denomination {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int den[] = { 100, 50, 20, 10 };
		int count[] = { 10, 10, 10, 10 };
		while (true) {
			System.out.println("Enter the amount to withdraw");
			int with = sc.nextInt();
			int taken[] = new int[den.length];
			for (int z = 1; z <= 5; z++) {

				for (int x = 0; x < den.length; x++) {
					if (with >= den[x]) {
						int notes = with / den[x];
						if (notes != 0) {
							if (notes < 0.7 * count[x]) {
								count[x] = count[x] - notes;
								with = with - notes * den[x];
								taken[x] += notes;
							} else {
								notes = (int) (count[x] * 0.7);
								count[x] = count[x] - notes;
								with = with - notes * den[x];
								taken[x] += notes;
							}
						}
					}
					}
//				System.out.println("During "+z);
//				for(int y=0;y<den.length;y++) {
//					System.out.println(den[y]+   "   "+count[y]);
//				}
			}
			if (with != 0) {
				System.out.println("Sorry! Not enough balance");
				for (int x = 0; x < taken.length; x++) {
					count[x] += taken[x];
				}
			} else {
				for (int x = 0; x < taken.length; x++) {
					System.out.println(den[x] + "    " + taken[x]);
				}
			}
		}
	}
}
