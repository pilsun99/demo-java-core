import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> list;
    public static final String DB_PATH = "C:\\Users\\ASUS\\Desktop\\product.txt";


    public ProductManager() {

        list = new ArrayList<>();
    }


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

    public ArrayList<Product> getList(){

        return  list;
    }
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





