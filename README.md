Spire Issues - Algorithmic Differentiation
===

This is the companion library for this [blogpost](https://simianquant.com/blog/spirealgorithmicdifferentiation/).

[Spire](https://github.com/typelevel/spire) supports forward more algorithmic differentiation by providing an implementation of dual numbers in the `spire.math.Jet` class and associated typeclasses. The implementation has several design and performance issues. This project illustrates some of the design issues of the library, specifically:

1. Jets are not immutable. This breaks referential transparency and makes maps/sets unstable. 
2. Floor are implemented incorrectly. The derivative of the floor of a function is either zero or not defined, and not the floor of the derivatives of the composed function
3. Division is implemented as multiplication by the multiplicative inverse