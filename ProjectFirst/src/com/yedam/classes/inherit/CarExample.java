package com.yedam.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0 ; i < 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 kumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 16);
				break;
			case 3:
				System.out.println("뒤왼쪽 kumhoTire 교체");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 17);
				break;
			case 4:
				System.out.println("뒤오른쪽 kumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 19);
				break;
			}
			System.out.println("===========================");
		}// end of for loop
	} //end of main()
}
