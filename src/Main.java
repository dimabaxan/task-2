import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3, "Golden Retriever"),
                new Cat("Whiskers", 2, "Black"),
                new Dog("Rex", 5, "German Shepherd"),
                new Cat("Fluffy", 1, "White")
        };

        for (Animal animal : animals) {
            System.out.println(animal);


            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println("Method makeSound not found or not accessible.");
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}