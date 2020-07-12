package ru.ifmo.se.pokemon.Players;

import ru.ifmo.se.pokemon.Attacks.Confide;
import ru.ifmo.se.pokemon.Attacks.FurySwipes;
import ru.ifmo.se.pokemon.Attacks.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vigoroth extends Pokemon {
    public Vigoroth(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(80, 80, 80, 55, 55, 90);
        setMove(new WorkUp(), new Confide(), new FurySwipes());
    }
}
