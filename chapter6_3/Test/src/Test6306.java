abstract class Vehicle {
    private String name;
    abstract public String getName(String val);
    public String getName() {
        return "Vehicle name:" + name;
    }
    public void setName(String val) {
        name = val;
    }
}
class Car extends Vehicle {
    public Car(String val) {
        setName(val);
    }
    public String getName(String val)
    {
        return "Car name :" + val;
    }
}
public class Test6306 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        System.out.print(obj.getName());    // 파라미터가 없으므로 Vehicle 클래스의 getName() 메소드를 호출
    }
}
