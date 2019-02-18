public class Cat {

    String color;
    byte age;

    public Cat(String color, byte age) {
        this.color = color;
        this.age = age;
    }

    public Cat() {
        this.color = color;
        this.age = age;
    }

    public Cat(String color) {
        this.color = color;
        this.age = 5;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void sayMiau() {
        System.out.println("Miau");
    }


}
