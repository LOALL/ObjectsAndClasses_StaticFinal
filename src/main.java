public class main {
    public static void main(String[] args) {
        Computer one = new Computer("Stir", "QWER");
        Computer two = new Computer("RIR", "YOU");

        //Processor
        Processor processorOne = new Processor(22.2,8,Manufactures.INTEL,34.3);
        Processor processorTwo = new Processor(12.2,13,Manufactures.AMD,12.3);

        //Ram
        Ram ramOne = new Ram(TypeRam.DDR3,16,12.4);
        Ram ramTwo = new Ram(TypeRam.DDR4, 8,8.1);

        //Disk
        Disk diskOne = new Disk(TypeDisk.SSD, 500, 3.1);
        Disk diskTwo = new Disk(TypeDisk.HDD, 1000, 1.2);

        //Screen
        Screen screenOne = new Screen(27.3, TypeScreen.VA, 1.0);
        Screen screenTwo = new Screen(28.4, TypeScreen.IPS, 2.2);

        //Keyboard
        Keyboard keyboardOne = new Keyboard(TypeKeyboard.mechanical, Illumination.NO, 1.2);
        Keyboard keyboardTwo = new Keyboard(TypeKeyboard.membrane, Illumination.YES, 1.7);


        one.setProcessor(processorOne);
        one.setRam(ramOne);
        one.setDisk(diskOne);
        one.setScreen(screenOne);
        one.setKeyboard(keyboardOne);

        two.setProcessor(processorTwo);
        two.setRam(ramTwo);
        two.setDisk(diskTwo);
        two.setScreen(screenTwo);
        two.setKeyboard(keyboardTwo);


        System.out.println(one);
        System.out.println();
        System.out.println(two);

    }
}
