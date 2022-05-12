package raicing

import raicing.processor.RaceProcessor
import raicing.view.InputView

fun main() {
    val carCnt = InputView.readStrAndConvertToInt(Const.OutputMsg.CAR_COUNT_MSG)
    val raceCnt = InputView.readStrAndConvertToInt(Const.OutputMsg.RACE_COUNT_MGS)

    val raceProcessor = RaceProcessor()
    val result = raceProcessor.raceStart(carCnt, raceCnt)
}
