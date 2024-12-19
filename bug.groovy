```groovy
def myMethod(a, b) {
  if (a == null) {
    return b
  }
  return a + b
}

println myMethod(null, 5) // Output: 5
println myMethod(10, null) // NullPointerException
```