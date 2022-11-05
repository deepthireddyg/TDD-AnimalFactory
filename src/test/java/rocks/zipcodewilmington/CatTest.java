package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    //tests for `void setName(String name)
    @Test
    public void setNameTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat("Tom", givenBirthDate, givenId);
        cat.setName(givenName);
        Assert.assertEquals(givenName, cat.getName());
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

        Cat cat = new Cat("Tom", givenBirthDate, givenId);
        String sound = "meow!";

        Assert.assertEquals(sound, cat.speak());
    }
    //tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat("Tom", givenBirthDate, givenId);
        Food chowfood = new Food();
        cat.eat(chowfood);
        cat.eat(chowfood);
        int expected = 2;
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void animalInheritanceTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat Cat = new Cat("Tillu", new Date(), 1);
        boolean actual = false;
        if (Cat instanceof Animal) {
            actual = true;
        }
        Assert.assertTrue(actual);
    }
    @Test
    public void mammalInheritanceTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat Cat=new Cat("Tina",new Date(),1);
        boolean actual=false;
        if(Cat instanceof Mammal){
            actual=true;
        }
        Assert.assertTrue(actual);
    }
}




