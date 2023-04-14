package testing;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
	SelectionSort temp1 = new SelectionSort();
	arr = temp1.basicSelectionSort(arr);
/** add tests to check for this unit test **/
assertEquals("Wrong pos 0", Sortedarr[0], arr[0]);
assertEquals("Wrong pos 1", Sortedarr[1], arr[1]);
assertEquals("Wrong pos 2", Sortedarr[2], arr[2]);
assertEquals("Wrong pos 3", Sortedarr[3], arr[3]);
assertEquals("Wrong pos 4", Sortedarr[4], arr[4]);
}
public void testNegative(){
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = -9;
	arr[2] = -7;
	arr[3] = -10;
	arr[4] = -2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -10;
	Sortedarr[1] = -9;
	Sortedarr[2] = -8;
	Sortedarr[3] = -7;
	Sortedarr[4] = -2;
	SelectionSort temp1 = new SelectionSort();
	arr = temp1.basicSelectionSort(arr);
/** Test data contains negative values only **/
	assertEquals("Wrong neg 0", Sortedarr[0], arr[0]);
	assertEquals("Wrong neg 1", Sortedarr[1], arr[1]);
	assertEquals("Wrong neg 2", Sortedarr[2], arr[2]);
	assertEquals("Wrong neg 3", Sortedarr[3], arr[3]);
	assertEquals("Wrong neg 4", Sortedarr[4], arr[4]);
}
public void testMixed(){
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = -9;
	arr[2] = 0;
	arr[3] = -10;
	arr[4] = 2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -10;
	Sortedarr[1] = -9;
	Sortedarr[2] = 0;
	Sortedarr[3] = 2;
	Sortedarr[4] = 8;
	SelectionSort temp1 = new SelectionSort();
	arr = temp1.basicSelectionSort(arr);
/** Test data contains with both positive, negative and zeros **/
	assertEquals("Wrong mix 0", Sortedarr[0], arr[0]);
	assertEquals("Wrong mix 1", Sortedarr[1], arr[1]);
	assertEquals("Wrong mix 2", Sortedarr[2], arr[2]);
	assertEquals("Wrong mix 3", Sortedarr[3], arr[3]);
	assertEquals("Wrong mix 4", Sortedarr[4], arr[4]);
}
public void testDuplicates(){
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = 7;
	arr[2] = 7;
	arr[3] = 10;
	arr[4] = 2;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = 2;
	Sortedarr[1] = 7;
	Sortedarr[2] = 7;
	Sortedarr[3] = 8;
	Sortedarr[4] = 10;
	SelectionSort temp1 = new SelectionSort();
	arr = temp1.basicSelectionSort(arr);
/** Test data contains duplicates **/
	assertEquals("Wrong dupe 0", Sortedarr[0], arr[0]);
	assertEquals("Wrong dupe 1", Sortedarr[1], arr[1]);
	assertEquals("Wrong dupe 2", Sortedarr[2], arr[2]);
	assertEquals("Wrong dupe 3", Sortedarr[3], arr[3]);
	assertEquals("Wrong dupe 4", Sortedarr[4], arr[4]);
}
}
