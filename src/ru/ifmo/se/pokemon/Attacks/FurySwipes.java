package ru.ifmo.se.pokemon.Attacks;

import ru.ifmo.se.pokemon.*;


public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 80);
    }

    @Override
    protected String describe() {
        return super.describe() + " [ Power: " + this.power + ", " + "Accuracy: " +
                this.accuracy + ", " + "Type: " + this.type + " ] ";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect e2 = new Effect();
        e2.chance(3/8).turns(2);
        e2.chance(3/8).turns(3);
        e2.chance(1/8).turns(4);
        e2.chance(1/8).turns(5);
    }
}
