(ns midje99.test.list-spec
  (:use midje.sweet)
  (:use midje99.lists-solutions))

(future-fact "P01 - Find the last element of a list"
  (lastElem '(1 1 2 3 5 8)) => 8)

(future-fact "P02 - Find the last but one element of a list"
  (penultimate '(1 1 2 3 5 8)) => 5)

(future-fact "P03 - Find the Kth element of a list. By convention the first element in the list is element 0"
  (nth-elem 2 '(1 1 2 3 5 8)) => 2)

(future-fact "P04 - Find the number of elements of a list"
  (length '(1 1 2 3 5 8)) => 6)

(future-fact "P05 - Reverse a list"
  (reverse-list '(1 1 2 3 5 8)) => '(8 5 3 2 1 1))

(future-fact "P06 - Find out whether a list is a palindrome"
  (is-palindrome '(1 2 3 2 1)) => true)

(future-fact "P07 - Flatten a nested list structure"
  (flatten-list '('(1 1) 2 '(3 '(5 8)))) => '(1 1 2 3 5 8))

(future-fact "P08 - Eliminate consecutive duplicates of list elements. 
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed"
  (compress '(:a :a :a :a :b :c :c :a :a :d :e :e :e :e)) => '(:a :b :c :a :d :e))

(future-fact "P09 - Pack consecutive duplicates of list elements into sublists. 
If a list contains repeated elements they should be placed in separate sublists"
  (pack '(:a :a :a :a :b :c :c :a :a :d :e :e :e :e)) =>
  '('(:a :a :a :a) '(:b) '(:c :c) '(:a :a) '(:d) '(:e :e :e :e)))

(future-fact "P10 - Run-length encoding of a list. Use the result of problem P09 to implement the so-called run-length encoding
data compression method. Consecutive duplicates of elements are encoded as tuples (N E) where N is the number
of duplicates of the element E"
  (encode '(:a :a :a :a :b :c :c :a :a :d :e :e :e :e)) =>
  '([4 :a] [1 :b] [2 :c] [2 :a] [1 :d] [4 :e]))

(future-fact "P11 - Modified run-length encoding. Modify the result of problem P10 in such a way that if an element has
no duplicates it is simply copied into the result list. Only elements with duplicates are transferred  
as (N E) terms"
  (encode-modified '(:a :a :a :a :b :c :c :a :a :d :e :e :e :e)) =>
  '([4 :a] :b [2 :c] [2 :a] :d [4 :e]))