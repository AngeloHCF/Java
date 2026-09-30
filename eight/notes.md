How java actually runs
Java Source Code -> Compiler -> Bytecode -> JVM -> Machine

Unlike C++, java normally doesn't compile your source directly into native instructions for one particular CPU. The Java compiler produces bytecode, and the Java Virtual Machine (JVM) executes that bytecode.

Compile once into Java bytecode, then run that bytecode anywhere that has a compatible JVM.

Compiler vs Interpreter
A compiler translates code into another form before execution.

An interpreter executes/translates instructions as the program runs.

Java is fundamentally object-oriented.
Savith introduces objects as things containing both data and behavior.

Car object
DATA
speed
color
fuel

BEHAVIOR
drive()
brake()
refuel()

A class described what those objects should contain.
Class = blueprint
Object = actual instance created from that blueprint

Car
 ↓
 ├── myCar
 ├── yourCar
 └── anotherCar

Encapsulation - bundle data and methods that operate on that data into an object, while controlling access to its interal

Inheritance - create a class based on another class

Polymorphism - different kinds of objects can respond differently to the same operation

animal.makeSound()

Dog → "woof"
Cat → "meow"

Programming isn't about syntax
An algorithm is a finite, precise sequence of steps for solving a problem

Syntax/compile error
→ Your program violates language rules.

Runtime error
→ Program starts but something fails while running.

Logic error
→ Program runs successfully but produces the wrong result.

Assembly - instructions for a real CPU architecture such as x86-64 or RAM
Java bytecode - instructions for the virtual CPU, the JVM

Example of bytecode

int x = 5;

for (int i = 0; i < x; i++) {
    System.out.println(x);
}

=== Bytecode ===

iconst_5
istore_1          // x = 5

iconst_0
istore_2          // i = 0

LOOP:
iload_2           // load i
iload_1           // load x
if_icmpge END     // if i >= x, exit

getstatic System.out
iload_1           // load x
invokevirtual println

iinc 2, 1         // i++

goto LOOP

END: