class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for(int col = 0; col < 9; col++){
                char num = board[row][col];
                if(num == '.') continue;
                if(seen.contains(num)) return false;
                seen.add(num);
            }
        }

        for(int col = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            for(int row = 0; row < 9; row++){
                char num = board[row][col];
                if(num == '.') continue;
                if(seen.contains(num)) return false;
                seen.add(num);
            }
        }

        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    char num = board[row][col];
                    if(num == '.') continue;
                    if(seen.contains(num)) return false;
                    seen.add(num);
                }
            }
        }
    return true;
    }
}
