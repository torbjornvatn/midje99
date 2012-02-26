(ns midje99.test.list-spec
  (:use clojure.test)
  (:use midje.sweet)
  (:use midje99.lists-solutions))

(future-fact "P01 - Find the last element of a list"
  (lastElem '(1, 1, 2, 3, 5, 8)) => 8)

(future-fact "P02 - Find the last but one element of a list"
  (penultimate '(1, 1, 2, 3, 5, 8)) => 5)

(future-fact "P03 - Find the Kth element of a list. By convention, the first element in the list is element 0"
  (nth-elem 2 '(1, 1, 2, 3, 5, 8)) => 2)

(future-fact "P04 - Find the number of elements of a list"
  (length '(1, 1, 2, 3, 5, 8)) => 6)

(future-fact "P05 - Reverse a list"
  (reverse-list '(1, 1, 2, 3, 5, 8)) => '(8, 5, 3, 2, 1, 1))

(future-fact "P06 - Find out whether a list is a palindrome"
  (is-palindrome '(1, 2, 3, 2, 1)) => true)

(future-fact "P07 - Flatten a nested list structure"
  (flatten-list '('(1, 1), 2, '(3, '(5, 8)))) => '(1, 1, 2, 3, 5, 8))
