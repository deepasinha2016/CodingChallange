import com.singtel.factory.ObjFactory;
import com.singtel.model.ClownFish;
import com.singtel.model.Fish;
import org.junit.Assert;
import org.junit.Test;

public class FishTest {
    ObjFactory objFactory = new ObjFactory();
    private final String greyColor = "Grey";
    private final String orangeColor = "Orange";
    private final String largeSize ="Large";
    private final String smallSize ="Small";

    @Test
    public void getColorSharkTest(){
        Fish fish = objFactory.getInstanceForFish("Shark");
        String actual = fish.getColor();
        Assert.assertEquals(greyColor,actual);
    }

    @Test
    public void getSizeSharkTest(){
        Fish fish = objFactory.getInstanceForFish("Shark");
        String actual = fish.getSize();
        Assert.assertEquals(largeSize,actual);
    }

    @Test
    public void getColorClownFishTest(){
        Fish fish = objFactory.getInstanceForFish("ClownFish");
        String actual = fish.getColor();
        Assert.assertEquals(orangeColor,actual);
    }

    @Test
    public void getSizeClownFishTest(){
        Fish fish = objFactory.getInstanceForFish("ClownFish");
        String actual = fish.getSize();
        Assert.assertEquals(smallSize,actual);
    }

    @Test
    public  void jokeTest(){
        ClownFish fish = new ClownFish();
        Assert.assertTrue(fish.joke());
    }
}
