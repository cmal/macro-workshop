(ns macro-workshop.code-generation)

;; remember: you can use normal clojure sequence functions to generate code!

(defn generate-addition [a b]
  (list '+ a b))

(defn generate-multiplication [a b]
  (list '* a b))

(defn generate-squarer []
  '#(* % %))

(defn generate-hello-world-definition []
  '#(println "Hello World!"))



