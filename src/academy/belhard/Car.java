package academy.belhard;


public class Car extends Vehicle implements Costable{
    private  int doorsCount;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    public int getCost() {
        return  1000 + 20 * wheelCount;
    }

    @Override
    protected void printInfo() {
        System.out.print("Транспортное средство : Машина - Количество дверей: " + doorsCount+" Количество колес: "+ wheelCount);
        System.out.println(" Стоимость транспортного средства : " +getCost() + " $");

    }
}


