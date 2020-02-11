package codes.som.anthony.koffeej;

import org.objectweb.asm.tree.InsnList;

import java.util.function.Function;

public class BytecodeAssembly {
    public static InsnList assembleBlock(Function<InsnList, InstructionAssembly> assemblyRoutine) {
        InsnList instructions = new InsnList();
        InstructionAssembly asm = assemblyRoutine.apply(instructions);
        asm.asm();

        return instructions;
    }
}
