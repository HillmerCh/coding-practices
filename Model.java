public class Model {
	public static void main(String[] args) throws InterruptedException {
		var x = runModel( true );
		System.out.println(x);
	}


	/*
	 * This method run the model
	 * */
	public static int runModel(boolean lazy) throws InterruptedException {
		var total = 0;
		var pushDoor1 = false;
		var pushDoor1Button = false;
		var pushDoor2 = false;
		var pushDoor2Button = false;

		int[] currentPosition = { 0, 0 } ; //Variable to store the current position
		int x = 0;
		int y = 1;

		Thread.sleep(4000);
		total = total + 2000;
		if(lazy){
			pushDoor1Button = false;
		}else{
			pushDoor1 = true;
		}

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 1;
		currentPosition[y]= 0;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 2;
		currentPosition[y]= 0;

		Thread.sleep(2000);
		total = total + 2000;
		currentPosition[x]= 2;
		currentPosition[y]= 1;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 2;
		currentPosition[y]= 2;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 2;
		currentPosition[y]= 3;


		Thread.sleep(2000);
		total = total + 2000;
		currentPosition[x]= 3;
		currentPosition[y]= 3;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 4;
		currentPosition[y]= 3;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 5;
		currentPosition[y]= 3;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 6;
		currentPosition[y]= 3;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 7;
		currentPosition[y]= 3;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 8;
		currentPosition[y]= 2;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 9;
		currentPosition[y]= 1;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 10;
		currentPosition[y]= 0;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 11;
		currentPosition[y]= 0;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 12;
		currentPosition[y]= 0;
		Thread.sleep(1000);
		total = total + 1000;

		currentPosition[x]= 13;
		currentPosition[y]= 0;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 14;
		currentPosition[y]= 0;

		Thread.sleep(1000);
		total = total + 1000;
		currentPosition[x]= 15;
		currentPosition[y]= 0;

		Thread.sleep(4000);
		total = total + 1000;
		if(lazy){
			pushDoor2Button = false;
		}else{
			pushDoor2 = true;
		}

		System.out.println( currentPosition[x] + " " + currentPosition[y]  );
		return total;
	}
}
