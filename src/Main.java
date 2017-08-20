import java.util.ArrayList;

/**
 * Created by user on 20.08.17.
 */
public class Main {

    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();

        System.out.println(store.sell(5, 3,4));
        System.out.println(store.sellSequence(1, 2,3));

        System.out.println(store.wallet);

        System.out.println(FlowersLoader.
                load("/home/user/Code/homework5-3/src/Flowers").toString());

        ArrayList<Flower> list = FlowersLoader.load("/home/user/Code/homework5-3/src/Flowers");
        list.set(0, new Tulip());
        FlowersSaver.save("/home/user/Code/homework5-3/src/Flowers", list);

    }
}
