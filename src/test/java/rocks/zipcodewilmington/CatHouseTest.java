package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

@Test
    public void addCatTest(){
    String name = "Leon";
    Date birthDate = new Date();
    Integer id = 1;

    CatHouse ch = new CatHouse();
    Cat c1 = new Cat(name,birthDate,id);

     ch.add(c1);
    Assert.assertEquals(name,c1.getName());
    Assert.assertEquals(birthDate,c1.getBirthDate());
    Assert.assertEquals(id,c1.getId());
    //System.out.println(ch.getCatById(id));

    Assert.assertEquals(c1, ch.getCatById(id));
}
@Test
   public void removeCatTest(){
    String name = "Leon";
    Date birthDate = new Date();
    Integer id = 1;
    CatHouse ch = new CatHouse();
    Cat c1 = new Cat(name,birthDate,id);
    ch.add(c1);
    ch.remove(c1);

    Assert.assertNotEquals(c1, ch.getCatById(id));

   }
   @Test
   public void removeTest(){
       String name = "Leon";
       Date birthDate = new Date();
       Integer id = 1;
       CatHouse ch = new CatHouse();

       Cat c1 = new Cat(name,birthDate,id);
       ch.add(c1);

       ch.remove(id);


       Assert.assertNotEquals(c1,ch.getCatById(id));
   }

   @Test
    public void getcatByIdTest(){
       String name = "Leon";
       Date birthDate = new Date();
       Integer id = 1;

       CatHouse ch = new CatHouse();
       Cat c1 = new Cat(name,birthDate,id);

       ch.add(c1);
       Assert.assertEquals(name,c1.getName());
       Assert.assertEquals(birthDate,c1.getBirthDate());
       Assert.assertEquals(id,c1.getId());
       //System.out.println(ch.getCatById(id));

       Assert.assertEquals(c1, ch.getCatById(id));

   }
   @Test
    public void getNumberOfCatsTest() {
       String name = "Zula";
       Date birthDate = new Date();
       Integer id = 0;
       CatHouse ch = new CatHouse();
       Cat c1 = new Cat(name,birthDate,id);
       ch.add(c1);

       Cat c2 = new Cat("Tina",birthDate,2);
       Cat c3 = new Cat("Milo",birthDate,3);
       Cat c4 = new Cat("Tillu",birthDate,4);
       ch.add(c2);
       ch.add(c3);
       ch.add(c4);

       Integer i1 = ch.getNumberOfCats();
       //System.out.println(i1);
       Integer expected = 4;

       Assert.assertEquals(expected, i1);

   }

}
