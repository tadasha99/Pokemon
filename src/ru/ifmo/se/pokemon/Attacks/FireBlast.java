package ru.ifmo.se.pokemon.Attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove{
    public FireBlast() {
        super(Type.FIRE, 110, 85);
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
            Effect.burn(pokemon);
        }
    }
}
