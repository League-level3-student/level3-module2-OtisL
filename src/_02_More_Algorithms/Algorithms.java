package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> list) {
		int number = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(true)) {
				number++;
			}
		}
		return number;
	}

	public static Double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String currentLongest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > currentLongest.length()) {
				currentLongest = words.get(i);
			}
		}
		return currentLongest;
	}

	public static boolean containsSOS(List<String> code) {
		for (int i = 0; i < code.size(); i++) {
			if (code.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					double first = results.get(i);
					double second = results.get(i + 1);
					results.set(i + 1, first);
					results.set(i, second);
					swap = true;

				}
			}

		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsorted) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < unsorted.size() - 1; i++) {
				if (unsorted.get(i).length() > unsorted.get(i + 1).length()) {
					String first = unsorted.get(i);
					String second = unsorted.get(i + 1);
					unsorted.set(i + 1, first);
					unsorted.set(i, second);
					swap = true;

				}
			}

		}
		return unsorted;
	}

	public static List<String> sortWords(List<String> unsorted) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < unsorted.size() - 1; i++) {
				if (unsorted.get(i).compareTo(unsorted.get(i + 1)) > 0) {
					String first = unsorted.get(i);
					String second = unsorted.get(i + 1);
					unsorted.set(i + 1, first);
					unsorted.set(i, second);
					swap = true;

				}

			}

		}
		return unsorted;
	}
}
