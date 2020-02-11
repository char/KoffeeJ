package codes.som.anthony.koffeej;

import codes.som.anthony.koffeej.impl.ArithmeticInstructions;
import codes.som.anthony.koffeej.impl.SimpleInstructions;
import org.objectweb.asm.tree.InsnList;

public abstract class InstructionAssembly implements SimpleInstructions, ArithmeticInstructions {
    private final InsnList insns;
    @Override public InsnList l() { return insns; }

    public InstructionAssembly(InsnList insns) {
        this.insns = insns;
    }

    public abstract void asm();
}
