package fr.mtongle.partion;

import java.util.Arrays;
import java.util.List;

import fr.mtongle.fuctional.partion.Partition;

public class Main {

	public static void main(String[] args) {
		//Ma liste � partitionner
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
		//Ma liste partition�e
		List<List<Integer>> listPartition = Partition.partition(myList, 2);
		System.out.println(" resultat :  " + listPartition);
	}
}
