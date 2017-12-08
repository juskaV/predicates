(ns predicates)

(defn sum-f [f g x]
  :-)

(defn less-than [n]
  :-)

(defn equal-to [n]
  :-)

(defn set->predicate [a-set]
  :-)

(defn pred-and [pred1 pred2]
  :-)

(defn pred-or [pred1 pred2]
  :-)

(defn whitespace? [character]
  (Character/isWhitespace character))

(defn blank? [string]
  :-)

(defn has-award? [book award]
  (boolean (award (:awards book))))

(defn HAS-ALL-THE-AWARDS? [book awards]
  (every? (:awards book) awards))

(defn my-some [pred a-seq]
   (first (filter boolean (map pred a-seq))))

(defn my-every? [pred a-seq]
  (empty? (filter boolean (map (complement pred) a-seq))))

(defn prime? [n]
  (let [pred (fn [x] (= (mod n x) 0))]
    (not (some pred (range 2 n)))))
;^^
