import java.io.*;
import java.util.ArrayList;

/**
 * The type Product manager.
 */
public class ProductManager {
    private ArrayList<Product> list;
    public static final String DB_PATH = "/Users/lrandom/Desktop/java/demo-java-core/products.txt";


    /**
     * Instantiates a new Product manager.
     */
    public ProductManager() {
        list = new ArrayList<>();
        readFromFile();
    }


    /**
     * Read from file.
     *
     * @param DB_PATH the db path
     */
    public void readFromFile() {
        try {

            FileReader fileReader = new FileReader(DB_PATH);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0].trim());
                String name = tokens[1].trim();
                float price = Float.parseFloat(tokens[2].trim());
                int quantity = Integer.parseInt(tokens[3].trim());
                Product product = new Product(id, name, price, quantity);
                list.add(product);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println( e.getMessage());

        }
    }

    /**
     * Get list array list.
     *
     * @return the array list
     */
    public ArrayList<Product> getList() {

        return list;
    }

    /**
     * Oder by name product.
     *
     * @param name the name
     * @return the product
     */
    public Product findByName(String name) {
        for (Product product : list
        ) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public Product findById(int id) {
        for (Product product : list
        ) {
            if (product.getId()==id) {
                return product;
            }
        }
        return null;
    }
    public float calculateSum(int id){
        Product product =  findById(id);
        if (product!=null) {
            return product.getTotalPrice();
        }
        return 0;
    }
}






