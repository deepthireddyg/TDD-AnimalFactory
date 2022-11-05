package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    //tests for `void setBirthDate(String name)
    @Test
    public void setBirthDateTest() {

        Date givenBirthDate = new Date();
        Date yesterdayDate = new Date(givenBirthDate.getTime() - (1000 * 60 * 60 * 24));
        Integer givenId = 0;

        Cat cat = new Cat("Tom", yesterdayDate, givenId);
        cat.setBirthDate(givenBirthDate);
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());
    }
    //tests for `speak`
    @Test
    public void speakTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog("Tom", givenBirthDate, givenId);
        String sound = "bark!";

        Assert.assertEquals(sound, dog.speak());
    }
    //tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog("Tom", givenBirthDate, givenId);
        Food dogfood = new Food();
        dog.eat(dogfood);
        dog.eat(dogfood);
        int expected = 2;
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void animalInheritanceTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog("Tillu", new Date(), 1);
        boolean actual = false;
        if ( dog instanceof Animal) {
            actual = true;
        }
        Assert.assertTrue(actual);
    }
    @Test
    public void mammalInheritanceTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog=new Dog("Tina",new Date(),1);
        boolean actual=false;
        if(dog instanceof Mammal){
            actual = true;
        }
        Assert.assertTrue(actual);
    }
}
