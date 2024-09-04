class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Name" + " says: Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}