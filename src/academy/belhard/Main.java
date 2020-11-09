package academy.belhard;


class Main {

    public static void main(String[] args) {

        Car car1 =  new Car(4,4);
        Car car2 =  new Car(6,5);

        Motorcycle moto1 = new Motorcycle(2,170);
        Motorcycle moto2 = new Motorcycle(2,200);

        car1.printInfo();

        car2.printInfo();

        moto1.printInfo();

        moto2.printInfo();

        System.out.println("Стоимость транспортного средства car1 : " + car1.getCost() + " $");

        System.out.println("Стоимость транспортного средства car2 : " + car2.getCost() + " $");

        System.out.println("Стоимость транспортного средства moto1 : " + moto1.getCost() + " $");

        System.out.println("Стоимость транспортного средства moto2 : " + moto2.getCost() + " $");




    }

}
