import java.util.ArrayList;

/**
 * Created by user on 20.08.17.
 */
public class FlowerStore {

    double wallet = 0;

    public ArrayList<Flower> sell(int rosesAmount, int chamomileAmount, int tulipAmount){

        wallet = rosesAmount * Rose.PRICE + chamomileAmount * Chamomile.PRICE +
                tulipAmount * Tulip.PRICE;

        ArrayList<Flower> bouquet = new ArrayList<>();

        for (int i = 0; i < rosesAmount; i++){
            bouquet.add(new Rose());
        }
        for (int i = 0; i < chamomileAmount; i++){
            bouquet.add(new Chamomile());
        }
        for (int i = 0; i < tulipAmount; i++){
            bouquet.add(new Tulip());
        }

        return bouquet;
    }


    public ArrayList<Flower> sellSequence(int rosesAmount, int chamomileAmount, int tulipAmount){
        ArrayList<Flower> bouquet = new ArrayList<>();

        wallet = rosesAmount * Rose.PRICE + chamomileAmount * Chamomile.PRICE +
                tulipAmount * Tulip.PRICE;

        for (int i = 0; i < Math.max(rosesAmount, Math.max(chamomileAmount, tulipAmount)) + 2; i++)
        {
            if (rosesAmount != 0){
                bouquet.add(new Rose());
                rosesAmount--;
            }
            if (chamomileAmount != 0){
                bouquet.add(new Chamomile());
                chamomileAmount--;
            }
            if (tulipAmount != 0){
                bouquet.add(new Tulip());
                tulipAmount--;
            }
        }

        return bouquet;
    }

}
