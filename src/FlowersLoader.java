import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by user on 20.08.17.
 */
public abstract class FlowersLoader {

    public static ArrayList<Flower> load(String filePath){
        ArrayList<Flower> flowers = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                if (line.equalsIgnoreCase("rose"))
                    flowers.add(new Rose());
                else if (line.equalsIgnoreCase("tulip"))
                    flowers.add(new Tulip());
                else if (line.equalsIgnoreCase("chamomile"))
                    flowers.add(new Chamomile());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return flowers;
    }
}
