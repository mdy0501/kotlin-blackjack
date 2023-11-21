package blackjack.model.state.playState.gameState

import blackjack.model.card.CardDeck
import blackjack.model.state.playState.Finished

class Stay(override val cardDeck: CardDeck) : Finished(cardDeck) {

    init {
        require(cardDeck.isStay()) { NOT_STAY_MESSAGE }
    }

    override fun cards(): CardDeck {
        return cardDeck
    }

    companion object {
        private const val NOT_STAY_MESSAGE = "스테이가 아닙니다."
    }
}