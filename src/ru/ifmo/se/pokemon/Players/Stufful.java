package ru.ifmo.se.pokemon.Players;

import ru.ifmo.se.pokemon.Attacks.Bulldoze;
import ru.ifmo.se.pokemon.Attacks.HammerArm;
import ru.ifmo.se.pokemon.Attacks.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stufful extends Pokemon {
    public Stufful (String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FIGHTING);
        setStats(70, 75, 50, 45, 50, 50);
        setMove(new Tackle(), new HammerArm(), new Bulldoze());
    }
}
