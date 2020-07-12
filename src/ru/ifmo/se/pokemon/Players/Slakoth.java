package ru.ifmo.se.pokemon.Players;

import ru.ifmo.se.pokemon.Attacks.Confide;
import ru.ifmo.se.pokemon.Attacks.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 60, 60, 35, 35, 30);
        setMove(new WorkUp(), new Confide());
    }
}
