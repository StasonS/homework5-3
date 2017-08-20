import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by user on 20.08.17.
 */
public abstract class FlowersSaver {

    public static void save(String filePath, ArrayList<Flower> flowerArrayList){

        try {
            FileWriter writer = new FileWriter(filePath);
            for (Flower f : flowerArrayList){
                if (f instanceof Rose)
                    writer.write("rose\n");
                else if (f instanceof Chamomile)
                    writer.write("chamomile\n");
                else if (f instanceof Tulip)
                    writer.write("tulip\n");
            }
            writer.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
