package assignment;

public class Assignment3Main {

	public static void main(String[] args) {
		int[] arr = {5, 232, 121, 15, 2, 4, 9, 11, 18, 25, -616, 26, 31, -1, -16, -8};
		int[] arr1 = {2, 5, 7, 8};
		int[] arr2 = {20, 11, 25, 120};
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n = arr.length;
		Assignment3 asg = new Assignment3();
		asg.elementsDivisibleBy5(arr, n);
		asg.evenIdxElements(arr, n);
		asg.evenElements(arr, n);
		asg.oddIdxElements(arr, n);
		asg.oddElements(arr, n);
		asg.evenPositiveElements(arr, n);
		asg.firstAndLastElements(arr, n);
		System.out.println("sum of elements are: " + asg.sumOfElements(arr, n));
		System.out.println("sum of even elements are: " + asg.sumOfEvenElements(arr, n));
		System.out.println("sum of odd elements are: " + asg.sumOfOddElements(arr, n));
		System.out.println("avg of elements(rounded to nearest int) is: " + asg.avgOfElements(arr, n));
		System.out.println("avg of even elements(rounded to nearest int) is: " + asg.avgOfEvenElements(arr, n));
		System.out.println("difference of even and odd sum is: " + asg.diffOfEvenAndOddSum(arr, n));
		System.out.println("armstrong numbers in arr is: " + asg.armstrongNumber(arr, n));
		asg.allArmstrongNumbers(arr, n);
		asg.palindromeElements(arr, n);
		asg.primenumberElements(arr, n);
		System.out.println("Is array palindrome: " + asg.isArrPalindrome(arr, n));
		asg.copyArray(arr, n);
		int[] copiedArray = asg.copyArray(arr, n);
		System.out.print("Previous array: ");
		asg.printArray(arr, n);
		System.out.print("New copied array: ");
		asg.printArray(copiedArray, n);
		System.out.print("array before insertion at idx: ");
		asg.printArray(arr, n);
		System.out.print("array after insertion at idx: ");
		asg.insertAtIdx(arr, n, 3, 100);
		System.out.print("array 1 before merging: ");
		asg.printArray(arr1, n1);
		System.out.print("array 2 before merging: ");
		asg.printArray(arr2, n2);
		System.out.print("array after merging arr1 and arr2: ");
		asg.printArray(asg.mergeTwoArrays(arr1, arr2, n1, n2), n1+n2);
		System.out.print("array before revrsing: ");
		asg.printArray(arr, n);
		System.out.print("array after revrsing: ");
		asg.printArray(asg.reversedArray(arr, n), n);
		System.out.print("array before revrsing each element: ");
		asg.printArray(arr, n);
		System.out.print("array after revrsing each element: ");
		System.out.print("array before insertion at position: ");
		asg.printArray(arr, n);
		System.out.print("array after insertion at position: ");
		asg.printArray(asg.insertAtPosition(arr, n, 3, 100), n);
		asg.printArray(asg.revrseElemntsInArray(arr, n), n);
		System.out.println("largest element in array is: " + asg.largestElement(arr, n));
		System.out.println("second largest element in array is: " + asg.secondLargest(arr, n));
	}

}
