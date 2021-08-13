import com.singtel.factory.ObjFactory;
import com.singtel.model.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    ObjFactory objFactory = new ObjFactory();

    @Test
    public  void canWalkButterflyTest(){
        Animal animal = objFactory.getInstanceForAnimal("Butterfly");
        Assert.assertFalse(animal.isCanWalk());
        System.out.println("Butterfly does not walk");
    }

    @Test
    public  void canFlyButterflyTest(){
        Animal animal = objFactory.getInstanceForAnimal("Butterfly");
        Assert.assertTrue(animal.isCanFly());

    }
    @Test
    public  void canFlyCaterpillarTest(){
        Animal animal = objFactory.getInstanceForAnimal("Caterpillar");
        Assert.assertFalse(animal.isCanFly());

    }

    @Test
    public  void canWalkCaterpillarTest(){
        Animal animal = objFactory.getInstanceForAnimal("Caterpillar");
        Assert.assertTrue(animal.isCanWalk());
        animal.walk();
    }
}
