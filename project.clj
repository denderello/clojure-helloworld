(defproject clojure-helloworld "0.1.0"
  :description "A helloworld application written in Clojure"
  :url "https://github.com/denderello/clojure-helloworld"
  :license {:name "Apache License Version 2.0"
            :url "http://www.apache.org/licenses/"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]]
  :plugins [[lein-ring "0.9.3"]]
  :main clojure-helloworld.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :ring {:handler clojure-helloworld.core/handler})
