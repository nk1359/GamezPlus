package com.entity;

/**
 * Entity class representing game details.
 */
public class GameDtls {

    private int gameId;
    private String gameName;
    private String publisher;
    private String price;
    private String gameCategory;
    private String status;
    private String photoName;
    private String email;

    /**
     * Default Constructor
     */
    public GameDtls() {
        super();
    }

    /**
     * Constructor to initialize game details.
     * 
     * @param gameName     The name of the game.
     * @param publisher    The publisher of the game.
     * @param price        The price of the game.
     * @param gameCategory The category of the game.
     * @param status       The status of the game.
     * @param photoName    The filename of the game's photo.
     * @param email        The email of the game's owner.
     */
    public GameDtls(String gameName, String publisher, String price, String gameCategory, String status,
            String photoName,
            String email) {
        this.gameName = gameName;
        this.publisher = publisher;
        this.price = price;
        this.gameCategory = gameCategory;
        this.status = status;
        this.photoName = photoName;
        this.email = email;
    }

    // Getters and setters
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method
    @Override
    public String toString() {
        return "GameDtls [gameId=" + gameId + ", gameName=" + gameName + ", publisher=" + publisher + ", price=" + price
                + ", gameCategory=" + gameCategory + ", status=" + status + ", photoName=" + photoName + ", email="
                + email + "]";
    }

}
