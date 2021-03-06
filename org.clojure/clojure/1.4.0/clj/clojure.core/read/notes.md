## Arities

    [] -> Any

## Docs

Reads a form from clj::clojure.core/*in* returning the read form. Uses
clj::clojure.core/*data-readers* to read tagged literals.

## Notes

You *SHOULD NOT* use clj::clojure.core/read or
clj::clojure.core/read-string to read data from untrusted sources.
They were designed only for reading Clojure code and data from trusted
sources (e.g.  files that you know you wrote yourself, and no one else
has permission to modify them). Forms prefixed with `#=` will be
evaluated by the reader (or not) depending on the value of
clj::clojure.core/*read-eval* see that article for more on this. As of
Clojure 1.5.0 this has been officially considered an
[undocumented feature](https://groups.google.com/forum/#!msg/clojure-dev/zG90eRnbbJQ/o7ZrWZtobHgJ).

Instead, either:

1. Use another data serialization format such as JSON, XML, etc.  and
   a library for reading them that you trust not to have
   vulnerabilities, or

2. If you want a serialization format that can be read safely and
   looks like Clojure data structures, use
   [edn](https://github.com/edn-format/edn). For Clojure 1.3 and
   later, the [tools.reader](http://github.com/clojure/tools.reader)
   contrib library provides an edn reader.  There is also
   clj::clojure.edn/read and clj::clojure.edn/read-string provided in
   Clojure 1.5.
