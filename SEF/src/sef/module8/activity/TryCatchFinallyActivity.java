package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan(); //This failed

		System.out.println("You are visitor number 100");
	}

	void catchMeIfYouCan() {
		try {
			int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

			for (int i = 0; i <= 10; i++) {

				System.out.println(arr[i]);

			}
		} catch (Exception e) {
			System.out.println("This is catch block, Error is expected there");


		}





	finally	{
			System.out.println("This is finally block");
			System.out.println("This should print even in case of exception");
		}
	}
}
