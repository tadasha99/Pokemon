package ru.ifmo.se.pokemon.Players;

import ru.ifmo.se.pokemon.Attacks.Confide;
import ru.ifmo.se.pokemon.Attacks.FurySwipes;
import ru.ifmo.se.pokemon.Attacks.Scratch;
import ru.ifmo.se.pokemon.Attacks.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slaking extends Pokemon {
    public Slaking(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(150, 160, 100, 95, 65, 100);
        setMove(new WorkUp(), new Confide(), new FurySwipes(), new Scratch());
    }
}
