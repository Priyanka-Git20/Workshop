import java.util.List;
import  java .util.ArrayList;

public class BirdRepository {
    List birdList = new ArrayList();

    public void add(Parrot parrot){
        birdList.add(parrot);

    }

    public void add(Duck duck){
        birdList.add(duck);

    }

    public void add(Penguin penguin){
        birdList.add(penguin);

    }

}
