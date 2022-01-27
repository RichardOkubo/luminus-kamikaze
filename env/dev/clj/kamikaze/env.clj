(ns kamikaze.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [kamikaze.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[kamikaze started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[kamikaze has shut down successfully]=-"))
   :middleware wrap-dev})
