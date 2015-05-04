(use 'clojure.java.javadoc)

(add-remote-javadoc "org.apache.commons.csv." "http://commons.apache.org/proper/commons-csv/apidocs/index.html")

;; => {"java."                     "http://java.sun.com/javase/6/docs/api/",
;;     "javax."                    "http://java.sun.com/javase/6/docs/api/",
;;     "org.apache.commons.codec." "http://commons.apache.org/codec/api-release/",
;;     "org.apache.commons.csv."   "http://commons.apache.org/proper/commons-csv/apidocs/index.html",
;;     "org.apache.commons.io."    "http://commons.apache.org/io/api-release/",
;;     "org.apache.commons.lang."  "http://commons.apache.org/lang/api-release/",
;;     "org.ietf.jgss."            "http://java.sun.com/javase/6/docs/api/",
;;     "org.omg."                  "http://java.sun.com/javase/6/docs/api/",
;;     "org.w3c.dom."              "http://java.sun.com/javase/6/docs/api/",
;;     "org.xml.sax.  "            "http://java.sun.com/javase/6/docs/api/"}
