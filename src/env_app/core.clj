(ns env-app.core
  (:gen-class)
  (:require [config.core :refer [env]]))

(defn -main [& args]
  (let [{name :name
         db :db
         redis :redis} (:runtime env {})]
    (println name "runtime variables for MySQL:", db)
    (println name "runtime variables for Redis:", redis))
  (println "App start!!"))
