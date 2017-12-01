(ns stock-screener.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[stock-screener started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[stock-screener has shut down successfully]=-"))
   :middleware identity})
