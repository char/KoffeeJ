# KoffeeJ

KoffeJ is a Java bytecode assembly DSL in pure Java inspired by [Koffee](https://github.com/half-cambodian-hacker-man/Koffee).

## Limitations

- Since we don't have as much syntactic flexibility as Kotlin,
we have to resort to some weird-looking assembly syntax
(but, as an upside, there is less 'magic' behind the assembler.)

- Since so many Java bytecode instruction mnemonics are reserved keywords in Java, we have to prefix these with an underscore. (`_`)

- To start assembling some bytecode, there is some ceremony involved since we're working
with Java:

```java
import java.io.PrintStream;

public class MyAssemblyGenerator {
    public static InsnList createHelloWorld() {
        return BytecodeAssembly.assembleBlock(insns -> new InstructionAssembly() {
            @Override public InsnList l() { return insns; }

            @Override
            public void asm() {
                getstatic(System.class, "out", PrintStream.class);
                ldc("Hello, world!");
                invokevirtual(PrintStream.class, "println", void.class, PrintStream.class);
                _return();
            }
        });
    }
}
```
