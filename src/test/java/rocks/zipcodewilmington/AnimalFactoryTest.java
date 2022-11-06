package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void animalFactoryDogTest() {
        String name = "Leon";
        Date birthDate = new Date();
        Integer id = 1;

         AnimalFactory obj = new AnimalFactory();
         Dog d1 = obj.createDog(name,birthDate);

        // String actual = d1.getName();

         Assert.assertEquals(name,d1.getName());
         Assert.assertEquals(birthDate,d1.getBirthDate());

        //Assert.assertEquals(name,actual);

    }
    @Test
    public void animalFactoryCatTest() {
        String name = "Leon";
        Date birthDate = new Date();
        Integer id = 1;
        AnimalFactory af = new AnimalFactory();
        Cat c1 = af.createCat(name,birthDate);
        Assert.assertEquals(name,c1.getName());
        Assert.assertEquals(birthDate,c1.getBirthDate());



    }
}

