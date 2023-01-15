public class Order {
    private Product product;
    private int table;
    private boolean complete=false;

    public Order(int table,Product product){
        this.table=table;
        this.product=product;
    }
    
    public int getTable() {
        return table;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    public String toString(){
        String status="";
        if (isComplete()==true){
            status="[/]";
        }else{
            status="[ ]";
        }

        return "Table "+table+": "+product.getName()+" "+status;

    }
    
    
}
