public class Screen {
    private final double diagonal;
    private final TypeScreen typeScreen;
    private final double weightScreen;

    public Screen(double diagonal, TypeScreen typeScreen, double weightScreen) {
        this.diagonal = diagonal;
        this.typeScreen = typeScreen;
        this.weightScreen = weightScreen;
    }

    //Getter
    public double getDiagonal() {
        return diagonal;
    }

    public TypeScreen getTypeScreen() {
        return typeScreen;
    }

    public double getWeightScreen() {
        return weightScreen;
    }

    //Setter
    public Screen setDiagonal(double diagonal) {
        return new Screen(diagonal, typeScreen, weightScreen);
    }

    public Screen setTypeScreen(TypeScreen typeScreen) {
        return new Screen(diagonal, typeScreen, weightScreen);
    }

    public Screen setWeightScreen(double weightScreen) {
        return new Screen(diagonal, typeScreen, weightScreen);
    }

    @Override
    public String toString() {
        return "Монитор: " + "\n"
                + "Диагональ: " + diagonal + "\n"
                + "Тип: " + typeScreen + "\n"
                + "Вес: " + weightScreen
                ;
    }
}
