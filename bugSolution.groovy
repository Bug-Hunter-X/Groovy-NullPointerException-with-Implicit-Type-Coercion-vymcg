```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle nulls appropriately
  }
  return a + b
}

println myMethod(null, 5) // Output: 0
println myMethod(10, null) // Output: 0

//Alternative using the Elvis operator
def myMethod2(a,b){
  return (a ?: 0) + (b ?: 0)
}
println myMethod2(null,5) //Output 5
println myMethod2(10,null) //Output 10

//Alternative using safe navigation operator
def myMethod3(a,b){
  return a?.plus(b ?: 0) ?: 0
}
println myMethod3(null,5) //Output 0
println myMethod3(10,null) //Output 10
```