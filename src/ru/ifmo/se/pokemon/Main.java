package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.Players.*;

public class Main {

    public static void main(String[] args) {
        Battle field = new Battle();
        field.addAlly(new Arceus("Phineas_Flynn", 1));
        field.addAlly(new Stufful("Heinz_Doofenshmirtz", 1));
        field.addAlly(new Bewear("Isabella_Garcia", 1));
        field.addFoe(new Slakoth("Ferb_Fletcher", 2));
        field.addFoe(new Vigoroth("Vanessa_Doofenshmirtz", 2));
        field.addFoe(new Slaking("Candace_Flynn", 2));
        field.go();
    }
}
