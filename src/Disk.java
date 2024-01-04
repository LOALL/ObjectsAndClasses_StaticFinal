public class Disk {
    private final TypeDisk typeDisk;
    private final int valumeDisk;
    private final double weightDisk;

    public Disk(TypeDisk typeDisk, int valumeDisk, double weightDisk) {
        this.typeDisk = typeDisk;
        this.valumeDisk = valumeDisk;
        this.weightDisk = weightDisk;
    }

    //Getter
    public TypeDisk getTypeDisk() {
        return typeDisk;
    }
    public int getValumeDisk() {
        return valumeDisk;
    }
    public double getWeightDisk() {
        return weightDisk;
    }

    //Setter
    public Disk setTypeDisk(TypeDisk typeDisk) {
        return new Disk(typeDisk, valumeDisk, weightDisk);
    }
    public Disk setValumeDisk(int valumeDisk) {
        return new Disk(typeDisk, valumeDisk, weightDisk);
    }
    public Disk setWeightDisk(double weightDisk) {
        return new Disk(typeDisk, valumeDisk, weightDisk);
    }

    @Override
    public String toString() {
        return "Жёсткий диск: " + "\n"
                + "Тип: " + typeDisk + "\n"
                + "Обьём: " + valumeDisk + "\n"
                + "Вес: " + weightDisk ;
    }
}
