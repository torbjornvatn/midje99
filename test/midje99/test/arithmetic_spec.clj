(ns midje99.test.arithmetic-spec
  (:use midje.sweet)
  (:use midje99.arithmetic-solutions))

(future-fact "P31 - Determine whether a given integer number is prime"
  (is-prime 7) => true)

(future-fact "P32 - Determine the greatest common divisor of two positive integer numbers. Use Euclid's algorithm"
  (gcd 36 63) => 9)

(future-fact "P33 - Determine whether two positive integer numbers are coprime.
Two numbers are coprime if their greatest common divisor equals 1"
  (is-coprime-to 35 64) => true)

(future-fact "P34 - Calculate Euler's totient function phi(m).
Euler's so-called totient function phi(m) is defined as
the number of positive integers r (1 <= r <= m) that are coprime to m"
  (totient 10) => 4)

(future-fact "P35 - Determine the prime factors of a given positive integer.
Construct a flat list containing the prime factors in ascending order"
  (primefactors 315) => '(3, 3, 5, 7))

(future-fact "P36 - Determine the prime factors of a given positive integer (2).
Construct a list containing the prime factors and their multiplicity. Alternately, use a Map for the result"
  (prime-factor-multiplicity 315) => '('(3,2), '(5,1), '(7,1))
  (prime-factor-multiplicity-map 315) => {3 2, 5 1, 7 1})