public class CampaignManager implements ICampaignManager{
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya eklenmisdir");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silinmisdir");

    }
}
