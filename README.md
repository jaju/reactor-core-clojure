# Reactor Core Clojure

A Clojure(Script) library for reactor-core.

## Usage

```clojure
{:deps
 {io.github.jaju/reactor-core-clojure {:git/sha "74c793e1e7fcbdcddeb6bf2c38437a830a91bcc0"}}}
```

```clojure
(refer-clojure :exclude [concat empty filter map range reduce take])
(use 'reactor-core)
```

## Run tests
Clojure cli, and shadow-cljs installations assumed. Run `npm install` before running shadow-cljs

### Clojure
```bash
clojure -M:test
```

### Clojurescript
```bash
shadow-cljs compile test
```


## License

Reactor Core Clojure is [Apache 2.0 licensed](https://www.apache.org/licenses/LICENSE-2.0.html).