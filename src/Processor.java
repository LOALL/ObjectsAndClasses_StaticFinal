public class Processor {

    private final double frequency;
    private final int numbersCore;
    private final Manufactures manufactures;
    private final double weightProcessor;

    public Processor(double frequency, int numbersCore, Manufactures manufactures,
                     double weightProcessor) {
        this.frequency = frequency;
        this.numbersCore = numbersCore;
        this.manufactures = manufactures;
        this.weightProcessor = weightProcessor;
    }

    // Getter
    public double getFrequency() {
        return frequency;
    }
    public int getNumbersCore() {
        return numbersCore;
    }
    public Manufactures getManufactures() {
        return manufactures;
    }
    public double getWeightProcessor() {
        return weightProcessor;
    }


        //Setter
    public Processor setFrequency(double frequency) {
        return new Processor(frequency, numbersCore, manufactures, weightProcessor);
    }
    public Processor setNumbersCore(int numbersCore) {
        return new Processor(frequency, numbersCore, manufactures, weightProcessor);
    }
    public Processor setManufactures(Manufactures manufactures) {
        return new Processor(frequency, numbersCore, manufactures, weightProcessor);
    }
    public Processor setWeightProcessor(double weightProcessor) {
        return new Processor(frequency, numbersCore, manufactures, weightProcessor);
    }

    @Override
    public String toString() {
        return "Процессор: " + "\n"
                + "Частота: " + frequency +  "\n"
                + "Количество ядер: "  + numbersCore + "\n"
                + "Производитель: " + manufactures + "\n"
                + "Вес: " + weightProcessor;
    }
}
