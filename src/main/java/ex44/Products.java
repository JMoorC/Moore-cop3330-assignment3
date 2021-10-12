package ex44;

public class Products {
    String name;
    double price;
    int quantity;

    public Products (String str, double price, int quantity){
        name = str;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setName(String str){
        name = str;
    }
    public void setPrice(double val){
        price = val;
    }
    public void setQuantity(int val){
        quantity = val;
    }

    public String printItem(){
        String output = String.format("Name: %s\nPrice: %4.2f\nQuantity: %d", name, price, quantity);
        return output;
    }

}
