package edu.albertoromeropino.viewController.enums;

public enum Scenes {
    LOGIN("viewController/Login.fxml"),
    REGISTER("viewController/Register.fxml"),

    //Games
    MYGAME("viewController/MyGame.fxml"),
    ALLGAMES("viewController/AllGame.fxml"),
    ADDGAME("viewController/AddGame.fxml"),

    COMPANY("viewController/Company.fxml"),
    ADDCOMPANY("viewController/AddCompany.fxml"),

    ARCHIEVEMENT("viewController/Archievement.fxml"),
    ADDARCHIEVEMENT("viewController/AddArchievement.fxml"),


    MENUBAR("viewController/MenuBar.fxml");


    private String url;

    Scenes(String url) {
        this.url = url;
    }

    public String getURL() {
        return url;
    }
}
