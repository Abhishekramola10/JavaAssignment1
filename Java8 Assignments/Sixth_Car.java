    interface Vehicle {

        default String turnAlarmOn() {          //Default method 1
            return "Turning the vehicle alarm on.";
        }

        default String turnAlarmOff() {         //Default method 2
            return "Turning the vehicle alarm off.";
        }

        static void getHorsePower(int rpm, int torque) {     //Static method
            System.out.println((rpm * torque)/ 5252);
        }
    }

public class Sixth_Car implements Vehicle
{
    public static void main(String[] args) {
        Vehicle car = new Sixth_Car();
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        Vehicle.getHorsePower(2500, 480);
    }
}
