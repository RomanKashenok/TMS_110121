package funcInt;

import java.util.function.Predicate;

public class FunctionalInterfaceTest {
	public static void main(String[] args) {

		Car audiA3 = new Car("AudiA3", true, true);
		Car audiA6 = new Car("AudiA6", true, false);

///*1*/		CarCheckerInterface vasilij = new CarCheckerVasilij();
//
///*1*/		budkaDlyaProverki(audiA3, vasilij);
///*1*/		budkaDlyaProverki(audiA6, vasilij);
		
		
///*2*/		budkaDlyaProverki(audiA3, new CarCheckerInterface() {
//			@Override
//			public boolean checkCar(Car car) {
//				return car.isFullDrive() && car.isGasEngine();
//			}
//		});
///*2*/		budkaDlyaProverki(audiA6, new CarCheckerInterface() {
//			@Override
//			public boolean checkCar(Car car) {
//				return car.isFullDrive() && car.isGasEngine();
//			}
//		});

///*3*/		budkaDlyaProverki(audiA3, (car) -> car.isFullDrive() && car.isGasEngine());
///*3*/		budkaDlyaProverki(audiA6, (car) -> car.isFullDrive() && car.isGasEngine());

//		CarCheckerInterface chacker = (car) -> car.isFullDrive() && car.isGasEngine();

		budkaDlyaProverki(audiA3, (car) -> car.isFullDrive() && car.isGasEngine());
	}

//	private static void budkaDlyaProverki(Car car, CarCheckerInterface cci) {
//		if (cci.checkCar(car)) {
//			System.out.println(car);
//		}
//	}
	
	private static void budkaDlyaProverki(Car car, Predicate<Car> cci) {
		if (cci.test(car)) {
			System.out.println(car);
		}
	}
	
	
}
