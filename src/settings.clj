(ns settings
  (:require [config.core :refer [env]]))

(println "current env-name:", (:env-name env))

(def db-spec {})
