public class Product {
    private String name;
    private double price;
    
    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return name+"("+price+")";
    }

    public boolean equals(Product a){
        if (toString().equals(a.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
