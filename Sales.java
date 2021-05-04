public class Sales {
    private int salesId;
    private double price;

    public Sales(){

    }
    public Sales(int id,double price){
        this.setPrice(price);
        this.setSalesId(id);

    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
