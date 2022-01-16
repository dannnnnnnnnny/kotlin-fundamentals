### Numbers

| type  |size(bits)|Min value| Max Value |
|-------|---|----|-----------|
| Byte  |8|-128| 127       |
| Short |16|-32768| 32767     |
| Int   |32|-2^31| 2^31-1    |
| Long  |64|-2^63|2^63-1|

```kotlin
val one = 1
val threeBillion = 30000000000
val oneLong = 1L
val oneByte: Byte = 1 // Byte 명시
```

### Floating-point types
| type   | size(bits) | Significant bits | Exponent bits | Decimal digits |
|--------|------------|------------------|---------------|----------------|
| Float  | 32         | 24               | 8             | 6-7            |
| Double | 64         | 53               | 11            | 15-16          |

```kotlin
val pi = 3.14 // Double
val oneDouble = 1.0 // Double

val eFloat = 2.7182818284f // Float

```

```text
- toByte()
- toShort()
- toInt()
- toLong()
- toFloat()
- toChar()
```

```kotlin
val l = 1L + 3 // Long + Int = Long
```

### Arrays
```kotlin
class Array<T> private constructor() {
    val size: Int
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T): Unit
    
    operator fun iterator(): Iterator<T>
    
    // ...
}
```
