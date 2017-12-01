(ns stock-screener.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [stock-screener.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[stock-screener started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[stock-screener has shut down successfully]=-"))
   :middleware wrap-dev})
