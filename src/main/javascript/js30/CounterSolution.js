/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    memory_n = n - 1;
    return function() {
        memory_n += 1;
        return memory_n;
    };
};

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */