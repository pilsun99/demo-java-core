import java.io.*;
import java.util.ArrayList;

/**
 * The type Product manager.
 */
public class ProductManager {
    private ArrayList<Product> list;
    public static final String DB_PATH = "C:\\Users\\ASUS\\Desktop\\product.txt";


    /**
     * Instantiates a new Product manager.
     */
    public ProductManager() {

        list = new ArrayList<>();
    }


    /**
     * Read from file.
     *
     * @param DB_PATH the db path
     */
    public void readFromFile(String DB_PATH){
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
            e.getMessage();
        }
    }

    /**
     * Get list array list.
     *
     * @return the array list
     */
    public ArrayList<Product> getList(){

        return  list;
    }

    /**
     * Oder by name product.
     *
     * @param name the name
     * @return the product
     */
    public Product oderByName(String name){
        for (Product product : list
             ) {if (product.getName() == name){
             return product;
             }
        }
        return null;
        }
    }
    /*public Product calculaterSum(){
        ArrayList<Product> sum = new ArrayList<Product>();
        for (Product product : list
             ) {if(product.getId() == id){
                 product.sumPrice();
                 return product;
        }
        }
        return null;
    }*/





