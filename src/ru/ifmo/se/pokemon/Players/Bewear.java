package ru.ifmo.se.pokemon.Players;

import ru.ifmo.se.pokemon.Attacks.Bulldoze;
import ru.ifmo.se.pokemon.Attacks.DragonClaw;
import ru.ifmo.se.pokemon.Attacks.HammerArm;
import ru.ifmo.se.pokemon.Attacks.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bewear extends Pokemon {
    public Bewear(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FIGHTING);
        setStats(120, 125, 80, 55, 60, 60);
        setMove(new Tackle(), new HammerArm(), new Bulldoze(), new DragonClaw());
    }
}
