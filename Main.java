public class Main {

    public static void main(String[] args) {
        Customer customer =new Customer(1,"Izzet","Ramazanli","AA1234422","28.05.2002");
        Game game=new Game(1,"FIFA 21","Futbol oyunu");
        Campaign campaign =new Campaign(1,"Yeni yil kampanyasi",23.33);
        Sales sales=new Sales(1,198.99);


        CustomerManager customerManager =new CustomerManager();
        customerManager.add(customer);

        GameManager gameManager=new GameManager();
        gameManager.add(game);

        CampaignManager campaignManager =new CampaignManager();
        campaignManager.add(campaign);

        SalesManager salesManager=new SalesManager();
        salesManager.sale(customer,game,campaign,sales);


    }
}
