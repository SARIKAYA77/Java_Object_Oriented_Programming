package gamer.business;

import gamer.entities.Campaign;
import gamer.entities.Game;
import gamer.entities.Gamer;
import gamer.service.GameService;

public class GameManager implements GameService {

    @Override
    public void addGame(Game game) {
        System.out.println(game.getGameName()+ " isimli oyun olusturuldu\n");

    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName() + " isimli oyun bilgileri guncellendi\n");

    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getGameName() + " isimli oyun silindi\n");

    }

    @Override
    public void sellGame(Game game, Gamer gamer) {
        System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " isimli kullaniciya satilan oyun : "+
                game.getGameName() +"Fiyat: "+game.getPrice());

    }

    @Override
    public void sellGame(Game game, Gamer gamer, Campaign campaign) {

        //Calculate new price after discount rate
        double newFiyat = game.getPrice() - ( game.getPrice() * campaign.getDiscountRate() ) / 100 ;
        game.setPrice(newFiyat);

        System.out.println(gamer.getFirstName() +" "+gamer.getLastName() + " isimli kullaniciya : "+
                game.getGameName() + " oyunu " + "% "+campaign.getDiscountRate()+" indirimle "+game.getPrice() +" TL fiyata satildi.\n");

    }

}