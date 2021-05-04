public class Campaign {
    private int campaignId;
    private String campaignName;
    private double price;

    public Campaign(){

    }
    public Campaign(int id,String name,double price){
        this.setCampaignId(id);
        this.setCampaignName(name);
        this.setPrice(price);
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
        if (campaignName ==null){
            System.out.println("Oyunda kampanya mevcud deyil");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
