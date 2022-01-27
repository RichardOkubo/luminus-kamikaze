(ns kamikaze.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[kamikaze started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[kamikaze has shut down successfully]=-"))
   :middleware identity})
