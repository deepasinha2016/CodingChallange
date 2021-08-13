import com.singtel.model.*;
import org.junit.Assert;
import org.junit.Test;

public class CountTest {

    private static final Animal[] animals = new Animal[]{

            new Dog(),
            new Butterfly(),
            new Cat()
    };
    private static final Bird[] birds = new Bird[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot()
    };
    private static final Fish[] fishes = new Fish[]{
            new Fish(),
            new Shark(),
            new ClownFish()
    };

    private final int _flyCount =3;
    private final int _swimCount =4;
    private final int _singCount =5;
    private final int _walkCount =2;


    @Test
    public void walkCountTest(){
        int walkCount =0;
        for (Animal anm:
                animals) {
            if(anm.isCanWalk()) walkCount++;
        }

        Assert.assertEquals(walkCount,_walkCount);
    }

    @Test
    public void flyCountTest(){

        int flyCount =0;
        for (Animal anm:
                animals) {
            if(anm.isCanFly()) flyCount++;
        }
        for (Bird b:
                birds) {
            if (b.isCanFly()) flyCount++;
        }

        Assert.assertEquals(flyCount,_flyCount);
    }

    @Test
    public void singCountTest(){
        int singCount =0;
        for (Bird b:
                birds) {
            if (b.isCanSing()) singCount++;
        }

        Assert.assertEquals(singCount,_singCount);
    }

    @Test
    public void swimCountTest(){
        int swimCount =fishes.length;
        for (Bird b:
                birds) {
            if (b.isCanSwim()) swimCount++;
        }

        Assert.assertEquals(swimCount,_swimCount);
    }
}
