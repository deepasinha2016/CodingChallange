import com.singtel.factory.ObjFactory;
import com.singtel.model.Bird;
import com.singtel.model.Parrot;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    ObjFactory objFactory = new ObjFactory();
    private final String expectedDuckVoice = "Quack , quack";
    private final String expectedChickenVoice =  "Cluck, cluck";
    private final String expectedRoosterVoice =  "Cock-a-doodle-doo";
    private final String expectedParrotNearDogVoice = "Woof, woof";
    private final String expectedParrotNearCatVoice = "Me ow";
    private final String expectedParrotNearRoosterVoice = "Cock-a-doodle-doo";
    public void singDuckTest(){
       Bird bird = objFactory.getInstanceForBird("Duck");
       String actual = bird.sing();
       Assert.assertSame(expectedDuckVoice,actual);
       System.out.println("Duck says: "+ actual);
    }

    @Test
    public void singChickenTest(){
        Bird bird = objFactory.getInstanceForBird("Chicken");
        String actual = bird.sing();
        Assert.assertSame(expectedChickenVoice,actual);
        System.out.println("Chicken says: "+ actual);
    }

    @Test
    public void singRoosterTest(){
        Bird bird = objFactory.getInstanceForBird("Rooster");
        String actual = bird.sing();
        Assert.assertSame(expectedRoosterVoice,actual);
        System.out.println("Rooster says: "+ actual);
    }

    @Test
    public void singParrotNearDogTest(){

        Parrot parrot = new Parrot("HouseWithDogs");
        String actual = parrot.sing();
        Assert.assertSame(expectedParrotNearDogVoice,actual);
        System.out.println("Parrot near house of dogs says: "+ actual);
    }

    @Test
    public void singParrotNearCatTest(){

        Parrot parrot = new Parrot("HouseWithCats");
        String actual = parrot.sing();
        Assert.assertSame(expectedParrotNearCatVoice,actual);
        System.out.println("Parrot near house of cats says: "+ actual);
    }

    @Test
    public void singParrotNearRoosterTest(){

        Parrot parrot = new Parrot("FarmNearRooster");
        String actual = parrot.sing();
        Assert.assertSame(expectedParrotNearRoosterVoice,actual);
        System.out.println("Parrot near rooster in a farm says: "+ actual);
    }
}
