package pl.nadoba.jvm.reflection.json.converter;

public class ClassWithPrimitives {
    public String name = "John";
    public int favoriteNumber = 12;
    public boolean male = true;
    private double height = 300.2;

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public boolean isMale() {
        return male;
    }
}
