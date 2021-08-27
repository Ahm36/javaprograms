/*Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
and static nested class RAM (memory, manufacturer). Create an object of CPU and print
information of Processor and RAM.*/

public class CPU {
    int price = 21000;

    class Processor {
        int no_of_cores = 4;
        String manufaturer = "Intel";
    }

    static class RAM {
        int memory = 16;
        String manufaturer = "Corsair";
    }

    public static void main(String[] args) {
        CPU a = new CPU();
        CPU.Processor intel = a.new Processor();
        RAM corsair = new RAM();
        System.out.println("CPU price : " + a.price);
        System.out.println("Processor Manufacturer : " +intel.manufaturer);
        System.out.println("Number of core is  : " + intel.no_of_cores);
        System.out.println("RAM Manufacturer : " + corsair.manufaturer);
        System.out.println("RAM Size : " + corsair.memory + " GB");

    }
}