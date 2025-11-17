public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Omar"));
        shelter.enqueue(new Cat("Dumbo"));
        shelter.enqueue(new Dog("Lonya"));
        shelter.enqueue(new Cat("Mariia"));

        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueDog());
        System.out.println(shelter.dequeueCat());
    }
}
