class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        const rows = Array.from({ length: 9 }, () => new Set());
        const cols = Array.from({ length: 9 }, () => new Set());
        const boxes = Array.from({ length: 9 }, () => new Set());

        for (var i = 0; i < 9; i++) {
            for (var j = 0; j < 9; j++) {
                const cell = board[i][j];
                if (cell === ".") continue;
                if (rows[i].has(cell)) return false;
                rows[i].add(cell);
                if (cols[j].has(cell)) return false;
                cols[j].add(cell);
                const boxIdx = Math.floor(i / 3) * 3 + Math.floor(j / 3);
                if (boxes[boxIdx].has(cell)) return false;
                boxes[boxIdx].add(cell);
            }
        }

        return true;
    }
}
