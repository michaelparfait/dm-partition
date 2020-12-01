package fr.mtongle.test.partition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.mtongle.fuctional.partion.Partition;

public class PartitionTest {

	/**
	 * Test partition avec un tableau vide
	 */
	@Test
	public void partition_is_empty( ) {
		
		//Ma liste à partitionner
		List<Integer> listElement = Arrays.asList();
		//Ma liste partitionée
		List<List<Integer>> listOfPartition = Partition.partition(listElement, 5);
		List<List<Integer>> listInteger = new ArrayList<>();
		
		assertTrue(listElement.isEmpty());
		assertTrue(listOfPartition.isEmpty());
		assertTrue(listInteger.isEmpty());
		assertEquals(listInteger, listOfPartition);	
	}

	/**
	 * Test partition de deux
	 */
	@Test
	public void test_partition_two() {
		
		//Ma liste à partitionner
		List<Integer> listElement = Arrays.asList(1, 2, 3, 4, 5);
		//Ma liste partitionée
		List<List<Integer>> listOfPartition = Partition.partition(listElement, 2);
		
		List<List<Integer>> listInteger = new ArrayList<>();
		listInteger.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(5)));
		assertEquals(listInteger, listOfPartition);	
	}
	
	/**
	 * Test partition de troix
	 */
	@Test
	public void test_partition_three() {
		
		//Ma liste à partitionner
		List<Integer> listElement = Arrays.asList(1, 2, 3, 4, 5);
		//Ma liste partitionée
		List<List<Integer>> listOfPartition = Partition.partition(listElement, 3);
		
		List<List<Integer>> listInteger = new ArrayList<>();
		listInteger.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(4, 5)));
		
		assertEquals(listInteger, listOfPartition);
	}
	
	/**
	 * Test partition de un
	 */
	@Test
	public void test_partition_one() {
		
		//Ma liste à partitionner
		List<Integer> listElement = Arrays.asList(1, 2, 3, 4, 5);
		//Ma liste partitionée
		List<List<Integer>> listOfPartition = Partition.partition(listElement, 1);
		
		List<List<Integer>> listInteger = new ArrayList<>();
		listInteger.add(new ArrayList<Integer>(Arrays.asList(1)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(2)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(3)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(4)));
		listInteger.add(new ArrayList<Integer>(Arrays.asList(5)));
		
		assertEquals(listInteger, listOfPartition);
	}
}
