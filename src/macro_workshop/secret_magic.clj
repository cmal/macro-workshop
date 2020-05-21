(ns macro-workshop.secret-magic)

(defmacro local-env []
  (into {}
        (for [k (keys &env)]
          [`(symbol ~(name k)) k])))
