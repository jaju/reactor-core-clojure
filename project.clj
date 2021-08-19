;
; Copyright 2018 the original author or authors.
;
; Licensed under the Apache License, Version 2.0 (the "License")
; you may not use this file except in compliance with the License.
; You may obtain a copy of the License at
;
;      http://www.apache.org/licenses/LICENSE-2.0
;
; Unless required by applicable law or agreed to in writing, software
; distributed under the License is distributed on an "AS IS" BASIS,
; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
; See the License for the specific language governing permissions and
; limitations under the License.
;

(defproject io.tsachev.reactor/reactor-core-clojure "0.1.0-SNAPSHOT"
  :description "A Clojure(Script) for for Reactor Flux and Mono"
  :url "https://github.com/tsachev/reactor-core-clojure"
  :license {:name         "The Apache Software License, Version 2.0"
            :url          "https://www.apache.org/licenses/LICENSE-2.0.txt"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.10.3" :scope "provided"]
                 [io.projectreactor/reactor-core "3.4.9"]]
  :target-path "target/%s"
  :profiles {:cljs {:managed-dependencies [[com.google.javascript/closure-compiler-unshaded "v20210808"]]
                    :dependencies         [[org.clojure/clojurescript "1.10.879" :scope "provided"]]
                    :plugins              [[lein-cljsbuild "1.1.8" :exclusions [[org.clojure/clojure]]]]
                    :cljsbuild            {:test-commands {"run" ["node" "target/test-runner.js"]}
                                           :builds        [{:source-paths   ["src" "test"]
                                                            :notify-command ["node" "target/test-runner.js"]
                                                            :compiler       {:install-deps  true
                                                                             :output-to     "target/test-runner.js"
                                                                             :optimizations :none
                                                                             :target        :nodejs
                                                                             :main          reactor-core.test-runner}}]}}
             :dev  {:dependencies [[com.fzakaria/slf4j-timbre "0.3.21"]]
                    :plugins      [[lein-cloverage "1.2.2"]]}})
