/**
 * The Sudoku logic.
 */
class SudokuGame {

    // This property holds a 2D array of integers with the Sudoku game solution.
    val solution = createSolution()

    // This property holds a 2D array of booleans. It is used to show or hide a value from our Sudoku board.
    val visibleElements = initVisibleElements()

    // ## STEP_1 ##
    // Make this function return a 2D array of integers with the Sudoku game solution. Use these values:
    //    3 5 9 6 1 8 4 2 7
    //    7 4 2 5 3 9 8 6 1
    //    1 6 8 4 7 2 9 5 3
    //    4 2 3 8 9 5 7 1 6
    //    5 8 7 1 6 4 3 9 2
    //    6 9 1 7 2 3 5 8 4
    //    2 7 5 9 4 6 1 3 8
    //    8 3 4 2 5 1 6 7 9
    //    9 1 6 3 8 7 2 4 5
    private fun createSolution(): Array<IntArray> {
        TODO("STEP1 - You need to initialise the 2D array containing the solution. See the comment in code marked with ## STEP_1 ##")
    }

    // ## STEP_2 ##
    // Make this function return a 2D array with booleans used to show or hide a value from our sudoku board.
    // E.g If you have the value `true` for the element positioned at row 0 and column 0, then the value at the same position
    // in the sudoku board will be visible. It is `false`, the user doesn't see the number!
    // Let's have 2 values of `false` so that our user will have to enter in 2 numbers in order to solve the sudoku game.
    // Something like this - elements at positions (0,0) and (1,8) are `false`:
    //    false  true true true true true true true true
    //    true  true true true true true true true false
    //    true  true true true true true true true true
    //    true  true true true true true true true true
    //    true  true true true true true true true true
    //    true  true true true true true true true true
    //    true  true true true true true true true true
    //    true  true true true true true true true true
    //    true  true true true true true true true true
    private fun initVisibleElements(): Array<BooleanArray> {
        TODO("STEP2 - You need to initialise the 2D array containing boolean elements that mark visible items. See the comment in code marked with ## STEP_2 ##")
    }

    // ## STEP_3 ##
    // This function checks if the number entered by the user is valid in the context of the solution.
    // It takes 3 parameters:
    // userInput - number entered by the user
    // row - the row where the number is placed in the board
    // column - the column where the number is placed in the board
    // E.g isInputValid(8, 1, 7) means we're asking if the number 8 entered by the user at position (1,7) is correct.
    // Correct means the number entered by the user is the same as the value found in our `solution` 2D array.
    // If it's the same, return `true`. Otherwise just return `false`, don't change anything else.
    fun isUserInputCorrect(userInput: Int, row: Int, col: Int): Boolean {
        TODO("STEP3 - You need to check whether the number entered by the user at position (row, col) is correct. See the comment in code marked with ## STEP_3 ##")
    }

    // ## STEP_4 ##
    // This function checks if the sudoku is solved.
    // Previously we checked every time the user entered a number if that was correct.
    // After the user entered all numbers and they were correct it means all values in our `visibleElements` property  are true.
    // In this method we'll just traverse the `visibleElements` 2D array. If all values are `true` it means sudoku is solved and we return `true`.
    // If we find at least one value that is `false` then we stop. It means not all numbers were filled in by the user. We return `false`.
    fun isSolved(): Boolean {
        TODO("STEP4 - You need to traverse our `visibleElements` 2D array and search for elements that are `false`. See the comment in code marked with ## STEP_4 ##")
    }
}