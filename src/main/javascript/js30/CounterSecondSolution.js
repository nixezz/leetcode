/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    currentCount = init || 0

    return {
        increment(){
            return ++currentCount
        },
        reset(){
            currentCount = init
            return currentCount
        },
        decrement(){
            return --currentCount
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */