public class Person {
    private String Name;
    private double Weight;
    private double Height;

    public Person(String name, double weight, double height) {
        Name = name;
        Weight = weight;
        Height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Weight=" + Weight +
                ", Height=" + Height +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
}
