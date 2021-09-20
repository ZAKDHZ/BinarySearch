package com.search.binary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BinarySeachApplication {

	static int binarySearch(int tab[], int startIndex, int endIndex, int x) {

		if (endIndex >= startIndex) {

			int middle = startIndex + (endIndex - startIndex) / 2;

			if (tab[middle] == x)
				return middle;

			if (tab[middle] > x) {
				return binarySearch(tab, startIndex, middle - 1, x);
			}
			return binarySearch(tab, middle + 1, endIndex, x);

		}

		return -1;

	}

	public static void main(String[] args) {
		SpringApplication.run(BinarySeachApplication.class, args);

		int[] tab = new int[] { 2, 4, 6, 12, 23, 34, 665 };

		int start = 0;
		int end = tab.length - 1;
		int x = 0;
		System.out.println(binarySearch(tab, start, end, x));
	}

}
