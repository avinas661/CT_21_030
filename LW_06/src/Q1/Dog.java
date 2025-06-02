package Q1;

public class Dog extends Pet {
    public double weight =0;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Dog(String name) {
        super(name);
    }

    public String speak (){
        return "";
    }
}
