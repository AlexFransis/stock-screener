(ns user
  (:require 
            [mount.core :as mount]
            stock-screener.core))

(defn start []
  (mount/start-without #'stock-screener.core/repl-server))

(defn stop []
  (mount/stop-except #'stock-screener.core/repl-server))

(defn restart []
  (stop)
  (start))


