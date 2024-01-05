public class Computer {
    private final String name;
    private final String vendor;
    private Processor processor;
    private Ram ram;
    private Disk disk;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String name, String vendor) {
        this.name = name;
        this.vendor = vendor;
    }

    public double totalWeight() {
        double road = processor.getWeightProcessor() + ram.getWeightRam() +screen.getWeightScreen() +
                disk.getWeightDisk() + keyboard.getWeightKeyboard();
        return Math.floor(road * 100) / 100;
    }

    // Getter
    public String getName() {
        return name;
    }
    public String getVendor() {
        return vendor;
    }
    public Processor getProcessor() {
        return processor;
    }
    public Ram getRam() {
        return ram;
    }
    public Disk getDisk() {
        return disk;
    }
    public Screen getScreen() {
        return screen;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }

    //Setter

    public Computer setName(String name) {
        return new Computer(name, vendor);
    }
    public Computer setVendor(String vendor) {
        return new Computer(name, vendor);
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    public void setDisk(Disk disk) {
        this.disk = disk;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return    "Название: " + name + "\n"
                + "Производитель: " + vendor + "\n"
                + "Комплектующие: "  + "\n" + "\n"
                + processor.toString() + "\n" + "\n"
                + ram.toString() + "\n" + "\n"
                + disk.toString() + "\n" + "\n"
                + screen.toString()+ "\n" + "\n"
                + keyboard.toString() + "\n" + "\n"
                +  "Общий вес компьютера: " + totalWeight()
                ;

    }
}
