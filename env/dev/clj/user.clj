(ns user
  (:require [clojure.tools.namespace.repl :as tnr]
            ;[proto-repl-charts :as prc]
            [proto-repl.saved-values]
            [figwheel-sidecar.repl-api :as ra]
            [clojure.repl :refer [doc source]]))

(defn start
  []
  ; (println "I'm starting now")
  (println "Start completed"))

(defn reset []
  (tnr/refresh :after 'user/start))

(defn start-fig [] (ra/start-figwheel!))

(defn stop-fig [] (ra/stop-figwheel!))

(defn cljs [] (ra/cljs-repl "dev"))

(println "reagent-tutorial/env/dev/user.clj loaded.")
