package codes.som.anthony.koffeej.impl;

import org.objectweb.asm.tree.InsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface SimpleInstructions extends InstructionListContainer {
    default void nop() {
        l().add(new InsnNode(NOP));
    }

    default void aconst_null() {
        l().add(new InsnNode(ACONST_NULL));
    }

    default void iconst_m1() {
        l().add(new InsnNode(ICONST_M1));
    }

    default void iconst_0() {
        l().add(new InsnNode(ICONST_0));
    }

    default void iconst_1() {
        l().add(new InsnNode(ICONST_1));
    }

    default void iconst_2() {
        l().add(new InsnNode(ICONST_2));
    }

    default void iconst_3() {
        l().add(new InsnNode(ICONST_3));
    }

    default void iconst_4() {
        l().add(new InsnNode(ICONST_4));
    }

    default void iconst_5() {
        l().add(new InsnNode(ICONST_5));
    }

    default void lconst_0() {
        l().add(new InsnNode(LCONST_0));
    }

    default void lconst_1() {
        l().add(new InsnNode(LCONST_1));
    }

    default void fconst_0() {
        l().add(new InsnNode(FCONST_0));
    }

    default void fconst_1() {
        l().add(new InsnNode(FCONST_1));
    }

    default void fconst_2() {
        l().add(new InsnNode(FCONST_2));
    }

    default void dconst_0() {
        l().add(new InsnNode(DCONST_0));
    }

    default void dconst_1() {
        l().add(new InsnNode(DCONST_1));
    }
}
