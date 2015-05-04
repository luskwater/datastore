(require '[clojure.repl :refer [doc]])

(doc map)
;; Prints
;; > -------------------------
;; > clojure.core/map
;; > ([f coll] [f c1 c2] [f c1 c2 c3] [f c1 c2 c3 & colls])
;; >  Returns a lazy sequence consisting of the result of applying f to the
;; >  set of first items of each coll, followed by applying f to the set
;; >  of second items in each coll, until any one of the colls is
;; >  exhausted.  Any remaining items in other colls are ignored. Function
;; >  f should accept number-of-colls arguments.
;;
;; => nil
