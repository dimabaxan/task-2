class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Name" + " says: Meow!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}
