public class Computer {

    String model;
    int cost;
    Ram ram;
    Hdd hdd;
    String asus;
    String hp;
    String vneshnij;


    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
        ram = new Ram(null, 15);
        hdd = new Hdd(null, 15,vneshnij);
    }

    public Computer(String model, int cost, Ram ram, Hdd hdd) {
        this.model = model;
        this.cost = cost;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void printComputer (){
        System.out.println("Computer: " + model + ", cost: " + cost + ", RAM: " + ram.printRam() + " , HDD: " + hdd.printHdd());
    }
}
