public class Game {
    private int gameId;
    private String gameName;
    private String gameContent;


    public Game(){

    }
    public Game(int id,String name,String content){
        this.gameId=id;
        this.gameName=name;
        this.gameContent=content;

    }


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

    public String getGameContent() {
        return gameContent;
    }

    public void setGameContent(String gameContent) {
        this.gameContent = gameContent;
    }


}
