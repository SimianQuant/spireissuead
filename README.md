Spire Issues - Algorithmic Differentiation
===

[Spire](https://github.com/typelevel/spire) supports forward more algorithmic differentiation by providing an implementation of dual numbers in the `spire.math.Jet` class and associated typeclasses. The implementation has several design and performance issues. This project illustrates some of the design issues of the library, specifically:

1. Jets are not immutable. This breaks referential transparency and makes maps/sets unstable. 
2. Floors are implemented incorrectly. The derivative of the floor of a function is either zero of not defined, and not the floor of the derivatives of the composed function