package gamer.service;

import gamer.entities.Campaign;
import gamer.entities.Game;
import gamer.entities.Gamer;

public interface GameService {

    public void addGame(Game game);
    public void updateGame(Game game);
    public void deleteGame(Game game);
    public void sellGame(Game game, Gamer gamer);
    public void sellGame(Game game, Gamer gamer,Campaign campaign);

}