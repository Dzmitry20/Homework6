package academy.belhard;

public class Motorcycle extends Vehicle implements Costable{
    private  int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getCost() {
        return 500 + 30 * wheelCount + maxSpeed;
    }

    @Override
    protected void printInfo() {
       System.out.print("Транспортное средство: Мотоцикл - Количество колес: " + wheelCount);
       System.out.println(" Максимальная скорость : "+ maxSpeed + " км/ч");
    }
}