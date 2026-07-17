class MinStack {
    stack = new Array();
    constructor() {}

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
        const currentMin = this.stack.length > 0 
        ? this.stack[this.stack.length - 1].minSoFar : Infinity;
        let stored = { 
            value: val, 
            minSoFar: Math.min(val,currentMin) 
            }
        this.stack.push(stored);
    }

    /**
     * @return {void}
     */
    pop() {
        return this.stack.pop().value;
    }

    /**
     * @return {number}
     */
    top() {
        return this.stack[this.stack.length - 1].value;
    }

    /**
     * @return {number}
     */
    getMin() {
        return this.stack[this.stack.length - 1].minSoFar;
    }
}
