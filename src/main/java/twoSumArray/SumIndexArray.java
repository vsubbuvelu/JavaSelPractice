package twoSumArray;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumIndexArray {

	@Test
	public void testSum() {
		Integer[] intArray = {5,2,4};
//		Assert.assertEquals(6, testSum(intArray,6));
//		Assert.assertEquals(6, testSum(intArray,6));
	//	Assert.assertEquals
		//System.out.println(testSum(intArray,6));
		System.out.println(testSumMap1(intArray,6));
	}

	private Integer testSumMap(Integer[] intArray, int target) {
		Map<Integer,Integer> complements = new HashMap<>();
		for (int i = 0; i < intArray.length; i++) {
			Integer compIndex = complements.get(intArray[i]);
			if(compIndex!=null) {
				System.out.println(i+""+compIndex);
				return i+compIndex;
			}
			complements.put(target-intArray[i], i);
		}
		return target;
	}

	private Integer testSum(Integer[] intArray,Integer target) {
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i+1; j < intArray.length; j++) {
				if(intArray[i]+intArray[j] == target)
				{
					System.out.println(i+" "+j);
					return intArray[i]+intArray[j];
				}
					
				
			}
		}
		return 3;
	}
	
	private Integer testSumMap1(Integer[] intArray, int target) {
		Map<Integer,Integer> complements = new HashMap<>();
		for (int i = 0; i < intArray.length; i++) {
			int tmp = target - intArray[i];
			
			
		}
		return target;
	}

}
