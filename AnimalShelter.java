import java.util.LinkedList;
import java.util.NoSuchElementException;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public Dog dequeueDog() {
        if (dogs.isEmpty()) {
            throw new NoSuchElementException("No dogs in the shelter.");
        }
        return dogs.removeFirst();
    }

    public Cat dequeueCat() {
        if (cats.isEmpty()) {
            throw new NoSuchElementException("No cats in the shelter.");
        }
        return cats.removeFirst();
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            throw new NoSuchElementException("No animals in the shelter.");
        } else if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        Dog oldestDog = dogs.peekFirst();
        Cat oldestCat = cats.peekFirst();

        if (oldestDog.isOlderThan(oldestCat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }
}
