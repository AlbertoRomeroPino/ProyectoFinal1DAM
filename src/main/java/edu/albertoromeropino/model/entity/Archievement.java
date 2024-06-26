package edu.albertoromeropino.model.entity;

public class Archievement {

    private int idArchievement;
    private String archievementName;
    private String descriptionArchievement;
    private String helpArchievement;
    private Game game;

    public Archievement() {
    }

    public Archievement(int idArchievement, String archievementName,
                        String descriptionArchievement, String helpArchievement, Game game) {
        setIdArchievement(idArchievement);
        setArchievementName(archievementName);
        setDescriptionArchievement(descriptionArchievement);
        setHelpArchievement(helpArchievement);
        setGame(game);
    }

    public String getHelpArchievement() {
        return helpArchievement;
    }

    public String getDescriptionArchievement() {
        return descriptionArchievement;
    }

    public String getArchievementName() {
        return archievementName;
    }

    public int getIdArchievement() {
        return idArchievement;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setIdArchievement(int idArchievement) {
        this.idArchievement = idArchievement;
    }

    public boolean setArchievementName(String archievementName) {
        boolean archievementNameSet = false;
        if (archievementName.length() < 40) {
            this.archievementName = archievementName;
            archievementNameSet = true;
        }
        return archievementNameSet;
    }

    public boolean setDescriptionArchievement(String descriptionArchievement) {
        boolean descriptionSet = false;

        if (descriptionArchievement.length() < 100) {
            this.descriptionArchievement = descriptionArchievement;
            descriptionSet = true;
        }
        return descriptionSet;
    }

    public boolean setHelpArchievement(String helpArchievement) {
        boolean helpSet = false;
        if (helpArchievement.length() < 200) {
            this.helpArchievement = helpArchievement;
            helpSet = true;
        }
        return helpSet;
    }

    @Override
    public String toString() {
        return "Archievement{" +
                "idArchievement=" + idArchievement +
                ", archievementName='" + archievementName + '\'' +
                ", descriptionArchievement='" + descriptionArchievement + '\'' +
                ", helpArchievement='" + helpArchievement + '\'' +
                ", game=" + game.getName() +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) result = true;
        if (o == null || getClass() != o.getClass()) result = false;
        Archievement that = (Archievement) o;
        result = idArchievement == that.idArchievement;
        return result;
    }

}
