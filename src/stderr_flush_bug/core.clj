(ns stderr-flush-bug.core
  (:require [clojure.stacktrace :as stacktrace])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (stacktrace/print-stack-trace (RuntimeException. "face"))
  (println "Hello, World!"))
