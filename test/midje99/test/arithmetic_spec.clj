(ns midje99.test.arithmetic-spec
  (:use midje.sweet)
  (:use midje99.arithmetic-solutions))

(future-fact "P31 - Determine whether a given integer number is prime"
  (is-prime 7) => true)

(future-fact "P32 - Determine the greatest common divisor of two positive integer numbers. Use Euclid's algorithm"
  (gcd '(36, 63) => 9))