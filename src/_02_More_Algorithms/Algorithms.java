package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> list) {
		int number = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(true)) {
				number++;
			}
		}
		return number;
	}
	public static Double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for(int i=0; i<peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest=peeps.get(i);
			}
		}
		return tallest;
	}
	public static String findLongestWord(List<String> words) {
		String currentLongest = "";
		for(int i=0; i<words.size(); i++) {
			if(words.get(i).length()>currentLongest.length()) {
				currentLongest=words.get(i);
			}
		}
		return currentLongest;
	}
	public static boolean containsSOS(List<String> code) {
		for(int i=0; i<code.size(); i++) {
			if(code.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
}
