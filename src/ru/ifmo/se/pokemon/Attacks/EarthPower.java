package ru.ifmo.se.pokemon.Attacks;

import ru.ifmo.se.pokemon.*;

import java.security.PublicKey;

public class EarthPower extends SpecialMove {
    public EarthPower() {
        super(Type.GROUND, 90, 100);
    }

    @Override
    protected String describe() {
        return super.describe() + " [ Power: " + this.power + ", " + "Accuracy: " +
                this.accuracy + ", " + "Type: " + this.type + " ] ";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() * 100 < 10) {
            pokemon.setMod(Stat.DEFENSE, -1);
        }
    }
}
