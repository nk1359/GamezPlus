package com.DAO;

import java.util.List;

import com.entity.GameDtls;

/**
 * Interface for accessing game data in the database.
 */
public interface GamesDAO {

    /**
     * Adds game details to the database.
     * 
     * @param g The GameDtls object containing game details.
     * @return true if the game details are successfully added, false otherwise.
     */
    public boolean addGames(GameDtls g);

    public List<GameDtls> getAllGames();

}
