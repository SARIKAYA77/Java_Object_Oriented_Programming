package gamer;

import java.util.Date;

import gamer.adapter.MernisServiceAdapter;
import gamer.business.CampaignManager;
import gamer.business.GameManager;
import gamer.business.GamerManager;
import gamer.entities.Campaign;
import gamer.entities.Game;
import gamer.entities.Gamer;

public class Main {

    public static void main(String[] args) {

        Game game1 = new Game(1,"PES 2021",150);
        Game game2 = new Game(2,"GTA 5",85);

        Gamer gamer1 = new Gamer(1,"jacop","nilson",new Date(2021,01,01),"11111111111","murat@gmail.com","12345");


        Campaign campaign1 = new Campaign(1, "BLACK FRIDAY" ,30 , true , new Date(2021,15,05));

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();



        gamerManager.addGamer(gamer1);


        gameManager.addGame(game1);


        campaignManager.addCampaign(campaign1);

        gameManager.sellGame(game1, gamer1, campaign1);



    }

}
