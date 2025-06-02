package Q1;

public class Cat extends Pet {
    public String coatColor="";

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public Cat(String name) {
        super(name);
    }

    public String speak (){
        return "";
    }
}
