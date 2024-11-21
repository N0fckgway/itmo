package Code.Moves.PhysicalMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

import java.lang.Math;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.3) {
            Effect.poison(def);
        }
    }

    @Override
    protected String describe() {
        return "нахимичил ядком";
    }
}
