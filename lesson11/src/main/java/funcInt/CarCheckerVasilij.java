package funcInt;

public class CarCheckerVasilij implements CarCheckerInterface {

	@Override
	public boolean checkCar(Car car) {
		return car.isFullDrive() && car.isGasEngine();
	}

}
