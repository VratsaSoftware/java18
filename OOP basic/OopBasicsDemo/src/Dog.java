public class Dog extends Animal{

    private String color;
    private String kind;

    public Dog() {
        this.color = "white";
        this.kind = "pitbul";
    }

    public Dog(String color, String kind) {
        this.color = color;
        this.kind = kind;
    }

    public Dog(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String sayBau() {
        return "Bau bau";
    }

    public void run() {
        System.out.println("I run");
    }
}
