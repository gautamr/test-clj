(defproject lab/test-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[jonase/eastwood "0.2.9"]
            [lein-cloverage "1.0.10"]]
  :main ^:skip-aot lab.test-clj
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
