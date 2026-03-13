// Animal Class
public class Animal {
    private String animalName;
    private String ownerName;
    private int age;

    // Constructor
    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        setAge(age); // Using setter to ensure valid age
    }

    // Getter and Setter for age with exception handling
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // Getter and Setter for animalName
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    // Getter and Setter for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Animal Name: " + animalName + ", Owner: " + ownerName + ", Age: " + age;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age &&
               animalName.equals(animal.animalName) &&
               ownerName.equals(animal.ownerName);
    }
}

// Dog Class (SubClass of Animal)
public class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age); // Calls the constructor of Animal class
        this.breed = breed;
    }

    // Getter and Setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override toString method for Dog class
    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed + " (Dog)";
    }

    // Override equals method for Dog class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        Dog dog = (Dog) obj;
        return breed.equals(dog.breed);
    }
}

