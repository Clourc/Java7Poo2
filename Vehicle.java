public abstract class Vehicle {
    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters
    public String getBrand(){
        return this.brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    //setters
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public void setKilometers(int newKilometers){
        this.kilometers = newKilometers;
    }

    //abstract method
    public abstract String doStuff();
}