class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        let stack = new Array();
        const operators = new Set(['+', '-', '*', '/']);

        for (let token of tokens) {
            if (!operators.has(token)) {
                stack.push(Number(token));
                continue;
            }
            let operand = token;
            let right = stack.pop();
            let left = stack.pop();
            let result;
            switch (operand) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "*":
                    result = left * right;
                    break;
                case "/":
                    result = left / right;
                    break;
            }
            stack.push(Math.trunc(result));
        }
        return stack.pop();
    }
}
