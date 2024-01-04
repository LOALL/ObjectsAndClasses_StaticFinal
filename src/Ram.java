public class Ram {
    private final TypeRam typeRam;
    private final int valumeRam;
    private final double weightRam;

    public Ram(TypeRam typeRam, int valumeRam, double weightRam) {
        this.typeRam = typeRam;
        this.valumeRam = valumeRam;
        this.weightRam = weightRam;
    }

    //Getter
    public TypeRam getTypeRam() {
        return typeRam;
    }
    public int getValumeRam() {
        return valumeRam;
    }
    public double getWeightRam() {
        return weightRam;
    }

    //Setter
    public Ram setTypeRam(TypeRam typeRam) {
        return new Ram(typeRam, valumeRam, weightRam);
    }
    public Ram setValumeRam(int valumeRam) {
        return new Ram(typeRam, valumeRam, weightRam);
    }

    public Ram setWeightRam(double weightRam) {
        return new Ram(typeRam, valumeRam, weightRam);
    }

    @Override
    public String toString() {
        return "Оперативная память: " + "\n"
                + "Тип: " + typeRam + "\n"
                + "Обьём: " + valumeRam + "\n"
                + "Вес: " + weightRam ;
    }
}
