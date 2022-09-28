package alex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    Pet pet;

    @Autowired
    public Person(Pet pet) {
        System.out.println("PersonBean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello pretty");
        pet.say();
    }
}
