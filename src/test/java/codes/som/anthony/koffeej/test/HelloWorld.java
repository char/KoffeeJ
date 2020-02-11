package codes.som.anthony.koffeej.test;

import codes.som.anthony.koffeej.BytecodeAssembly;
import codes.som.anthony.koffeej.InstructionAssembly;

public class HelloWorld {
    public static void main(String[] args) {
        BytecodeAssembly.assembleBlock(insns -> new InstructionAssembly(insns) {
            @Override
            public void asm() {
                aconst_null();
            }
        });
    }
}
