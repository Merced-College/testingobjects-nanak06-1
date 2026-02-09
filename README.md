# Lab: Testing Objects

## Checkpoints

**Checkpoint 1**  
Before overriding `toString`, printing an object outputs something like `Dog@1b6d3586`. This happens because Java uses the default `Object.toString()` method, which prints the class name followed by `@` and a hashed memory address.

**Checkpoint 2**  
The three fields printed the following default values before assignment:  
- `String name` → `null` (reference type)  
- `int age` → `0` (primitive type)  
- `String breed` → `null` (reference type)

**Checkpoint 3**  
Constructors change initialization by allowing the programmer to define starting values for fields. Once a constructor is written, Java no longer provides a default constructor automatically, so the programmer is responsible for initializing all fields.

**Checkpoint 4**  
After overriding `toString`, printing an object outputs readable information about its fields instead of a memory address. Using `@Override` ensures the method correctly replaces the inherited `toString` method and helps prevent errors.

**Checkpoint 5**  
Private fields with getters and setters are preferred because they protect data and allow validation. For example, a setter can prevent a dog’s age from being set to a negative number.

---

## Reflection

**Reflection 1**  
Before overriding `toString`, Java printed the object’s class name and hash code because it automatically calls the inherited `Object.toString()` method.

**Reflection 2**  
The three fields in my class were a `String`, an `int`, and another `String`. Before assignment, the `String` values were `null`, and the `int` value was `0`.

**Reflection 3**  
Constructors allow objects to start with meaningful values instead of default values. They give the programmer full control over how objects are created and initialized.
