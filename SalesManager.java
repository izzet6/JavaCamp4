public class SalesManager {
    public void sale(Customer customer,Game game,Campaign campaign,Sales sales){
        System.out.println("Oyun:"+game.getGameName());
        System.out.println("Kampanya:"+campaign.getCampaignName());
        System.out.println("Fiyat:"+(sales.getPrice()-campaign.getPrice()));
    }
}
