(defproject puppetlabs/ezbake "0.1.0-SNAPSHOT"
  :description "A system for building packages for trapperkeeper-based applications"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [me.raynes/fs "1.4.5"]
                 [leiningen-core "2.3.4"]]

  :repositories [["releases" "http://nexus.delivery.puppetlabs.net/content/repositories/releases/"]
                 ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]]

  :profiles {:dev {:dependencies [[io.aviso/pretty "0.1.10"]]}}

  :aliases {"stage" ["run" "-m" "puppetlabs.ezbake.stage"]}
  )
