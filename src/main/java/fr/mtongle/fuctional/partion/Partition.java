package fr.mtongle.fuctional.partion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Michael Tongle
 */
public class Partition {

	/**
	 * @param <T>
	 * @param listT
	 * @param n
	 * @return liste de sous liste
	 */
	public static <T> List<List<T>> partition(List<T> listT, int n) {

		List<List<T>> partitions = new ArrayList<List<T>>();
		
//			for (int i = 0; i < listT.size(); i += n) {
//				partitions.add(listT.subList(i, n + i));
//			}

		int nbPartitions = (int) Math.ceil(listT.size() / (double) n);

		for (int i = 0; i < nbPartitions; i++) {
			int nbDonneesPartition = listT.size() % n != 0 && i == nbPartitions - 1 ? listT.size() % n : n;
			List<T> listPartitions = new ArrayList<T>(nbDonneesPartition);
			for (int j = 0; j < nbDonneesPartition; j++) {
				final int index = i * n + j;
				listPartitions.add(listT.get(index));
			}
			partitions.add(listPartitions);
		}

		return partitions;
	}
}
