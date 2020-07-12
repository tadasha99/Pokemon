package ru.ifmo.se.pokemon.Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import static java.lang.Double.POSITIVE_INFINITY;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return super.describe() + " [ Power: " + this.power + ", " + "Accuracy: " +
                this.accuracy + ", " + "Type: " + this.type + " ] ";
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return super.checkAccuracy(pokemon, pokemon1);
    }
}
