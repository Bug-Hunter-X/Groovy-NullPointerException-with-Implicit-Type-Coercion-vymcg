# Groovy NullPointerException with Implicit Type Coercion

This repository demonstrates a common Groovy error involving implicit type coercion and null values that can lead to unexpected `NullPointerExceptions`.  The issue stems from how Groovy handles null values passed to methods, especially those that might expect numeric parameters.  If a null value is encountered, it may attempt implicit conversion which fails at runtime, rather than handling it gracefully as one might expect.

## Steps to Reproduce

1.  Clone this repository.
2.  Run the `bug.groovy` script.
3.  Observe the `NullPointerException` when passing `null` as the second argument.

## Solution

The `bugSolution.groovy` script demonstrates how to mitigate this issue by explicitly checking for null values before performing arithmetic operations or using the `?.` operator for safe navigation.
