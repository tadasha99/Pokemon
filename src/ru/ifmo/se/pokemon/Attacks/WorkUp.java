package ru.ifmo.se.pokemon.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WorkUp extends StatusMove {
    public WorkUp() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return super.describe() + " [ Power: " + this.power + ", " + "Accuracy: " +
                this.accuracy + ", " + "Type: " + this.type + " ] ";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.setMod(Stat.ATTACK, +1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
    }
}
