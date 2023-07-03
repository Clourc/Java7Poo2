class Hangar {
    public static void main(String[] args){
        Car myCar = new Car("Clio", 80000);
        Boat titanic = new Boat("Titanic", 1587);

        System.out.println(myCar.doStuff());
        System.out.println(titanic.doStuff());
    }
}