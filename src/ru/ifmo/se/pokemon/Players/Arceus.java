package ru.ifmo.se.pokemon.Players;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Attacks.*;

public class Arceus extends Pokemon {
    public Arceus(String name, int level) {
        super(name, level);
        setStats(120, 120, 120, 120, 120, 120);
        setType(Type.NORMAL);
        setMove(new Thunder(), new FireBlast(), new AerialAce(), new EarthPower());
    }
}
