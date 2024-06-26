package edu.albertoromeropino.model.entity;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Game {
    private int idGame;
    private String name;
    private String Category;
    private Person person;
    private Company company;
    private ArrayList<Archievement> archievements;

    public Game(int idGame, String name, String Category, Person person, Company company) {
        setIdGame(idGame);
        setName(name);
        setCategory(Category);
        setPerson(person);
        setCompany(company);
    }

    public Game() {
    }

    public int getIdGame() {
        return idGame;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return Category;
    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<Archievement> getArchievements() {
        return archievements;
    }

    public Company getCompany() {
        return company;
    }

    public boolean setIdGame(int idGame) {
        boolean idSet = false;
        if (idGame < 99999 && idGame >= 0) {
            this.idGame = idGame;
            idSet = true;
        }
        return idSet;
    }

    public boolean setName(String name) {
        boolean nameSet = false;
        if (name.length() <= 50) {
            this.name = name;
            nameSet = true;
        }
        return nameSet;
    }

    public boolean setCategory(String category) {
        boolean categorySet = false;
        if (category.length() < 30) {
            this.Category = category;
            categorySet = true;
        }
        return categorySet;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setArchievements(ArrayList<Archievement> archievements) {
        this.archievements = archievements;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Game{" +
                "idGame=" + idGame +
                ", name='" + name + '\'' +
                ", gameType=" + Category +
                ", person=" + person.getNickName() +
                ", company= " + company.getNameCompany() +
                ", archievements=" + archievements +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) result = true;
        if (o == null || getClass() != o.getClass()) result = false;
        Game game = (Game) o;
        result = idGame == game.idGame;
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idGame);
    }
}
