def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 10) //Expected output: 10
println myMethod(10, 5) //Expected output: 10

//Uncommon error - the method is not handling null values gracefully.
println myMethod(null, 5) // Unexpected behaviour