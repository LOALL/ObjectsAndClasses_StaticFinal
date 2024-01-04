public class Keyboard {
    private final TypeKeyboard typeKeyboard;
    private final Illumination illumination;
    private final double weightKeyboard;

    public Keyboard(TypeKeyboard typeKeyboard, Illumination illumination, double weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.illumination = illumination;
        this.weightKeyboard = weightKeyboard;
    }

    //Getter
    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public Illumination getIllumination() {
        return illumination;
    }

    public double getWeightKeyboard() {
        return weightKeyboard;
    }

    //Setter
    public Keyboard setTypeKeyboard(TypeKeyboard typeKeyboard) {
        return new Keyboard(typeKeyboard, illumination, weightKeyboard);
    }

    public Keyboard setIllumination(Illumination illumination) {
        return new Keyboard(typeKeyboard, illumination, weightKeyboard);
    }

    public Keyboard setWeightKeyboard(double weightKeyboard) {
        return new Keyboard(typeKeyboard, illumination, weightKeyboard);
    }

    @Override
    public String toString() {
        return "Клавиатура: " + "\n"
                + "Тип: " + typeKeyboard + "\n"
                + "Подсветка:" + illumination + "\n"
                + "Вес: " + weightKeyboard
                ;
    }
}
