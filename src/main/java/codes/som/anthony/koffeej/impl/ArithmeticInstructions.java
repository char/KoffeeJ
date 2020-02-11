package codes.som.anthony.koffeej.impl;

import org.objectweb.asm.tree.InsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface ArithmeticInstructions extends InstructionListContainer {
    default void iadd() {
        l().add(new InsnNode(IADD));
    }

    default void ladd() {
        l().add(new InsnNode(LADD));
    }

    default void fadd() {
        l().add(new InsnNode(FADD));
    }

    default void dadd() {
        l().add(new InsnNode(DADD));
    }

    default void isub() {
        l().add(new InsnNode(ISUB));
    }

    default void lsub() {
        l().add(new InsnNode(LSUB));
    }

    default void fsub() {
        l().add(new InsnNode(FSUB));
    }

    default void dsub() {
        l().add(new InsnNode(DSUB));
    }

    default void imul() {
        l().add(new InsnNode(IMUL));
    }

    default void lmul() {
        l().add(new InsnNode(LMUL));
    }

    default void fmul() {
        l().add(new InsnNode(FMUL));
    }

    default void dmul() {
        l().add(new InsnNode(DMUL));
    }

    default void idiv() {
        l().add(new InsnNode(IDIV));
    }

    default void ldiv() {
        l().add(new InsnNode(LDIV));
    }

    default void fdiv() {
        l().add(new InsnNode(FDIV));
    }

    default void ddiv() {
        l().add(new InsnNode(DDIV));
    }

    default void irem() {
        l().add(new InsnNode(IREM));
    }

    default void lrem() {
        l().add(new InsnNode(LREM));
    }

    default void frem() {
        l().add(new InsnNode(FREM));
    }

    default void drem() {
        l().add(new InsnNode(DREM));
    }

    default void ineg() {
        l().add(new InsnNode(INEG));
    }

    default void lneg() {
        l().add(new InsnNode(LNEG));
    }

    default void fneg() {
        l().add(new InsnNode(FNEG));
    }

    default void dneg() {
        l().add(new InsnNode(DNEG));
    }

    default void ishl() {
        l().add(new InsnNode(ISHL));
    }

    default void lshl() {
        l().add(new InsnNode(LSHL));
    }

    default void ishr() {
        l().add(new InsnNode(ISHR));
    }

    default void lshr() {
        l().add(new InsnNode(LSHR));
    }

    default void iushr() {
        l().add(new InsnNode(IUSHR));
    }

    default void lushr() {
        l().add(new InsnNode(LUSHR));
    }

    default void iand() {
        l().add(new InsnNode(IAND));
    }

    default void land() {
        l().add(new InsnNode(LAND));
    }

    default void ior() {
        l().add(new InsnNode(IOR));
    }

    default void lor() {
        l().add(new InsnNode(LOR));
    }

    default void ixor() {
        l().add(new InsnNode(IXOR));
    }

    default void lxor() {
        l().add(new InsnNode(LXOR));
    }

    default void iinc() {
        l().add(new InsnNode(IINC));
    }

    default void i2l() {
        l().add(new InsnNode(I2L));
    }

    default void i2f() {
        l().add(new InsnNode(I2F));
    }

    default void i2d() {
        l().add(new InsnNode(I2D));
    }

    default void l2i() {
        l().add(new InsnNode(L2I));
    }

    default void l2f() {
        l().add(new InsnNode(L2F));
    }

    default void l2d() {
        l().add(new InsnNode(L2D));
    }

    default void f2i() {
        l().add(new InsnNode(F2I));
    }

    default void f2l() {
        l().add(new InsnNode(F2L));
    }

    default void f2d() {
        l().add(new InsnNode(F2D));
    }

    default void d2i() {
        l().add(new InsnNode(D2I));
    }

    default void d2l() {
        l().add(new InsnNode(D2L));
    }

    default void d2f() {
        l().add(new InsnNode(D2F));
    }

    default void i2b() {
        l().add(new InsnNode(I2B));
    }

    default void i2c() {
        l().add(new InsnNode(I2C));
    }

    default void i2s() {
        l().add(new InsnNode(I2S));
    }
}
