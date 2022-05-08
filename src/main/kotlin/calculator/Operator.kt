package calculator

// TODO interface vs 람다식 중에 어떤게 더 좋을까? https://kotlinlang.org/docs/enum-classes.html#implementing-interfaces-in-enum-classes
enum class Operator(val symbol: String, val expression: (Double, Double) -> Double) {
    PLUS("+", { left, right -> left + right }),
    MINUS("-", { left, right -> left - right }),
    TIMES("*", { left, right -> left * right }),
    DIVIDE("/", { left, right ->
        require(right != 0.0) { calculator.Const.ErrorMsg.CANNOT_DIVIDE_TO_ZERO_ERROR_MSG}
        left / right
    });

    companion object {
        fun checkValidation(operatorStr: String?) {
            require(values().any { it.symbol == operatorStr }) { Const.ErrorMsg.OPERATOR_IS_NOT_VALID_ERROR_MSG }
        }
    }
}