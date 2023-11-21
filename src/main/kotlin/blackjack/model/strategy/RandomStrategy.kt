package blackjack.model.strategy

import blackjack.model.card.Card
import blackjack.model.card.CardNumber
import blackjack.model.card.CardSuit

class RandomStrategy : ShuffleStrategy {
    override fun shuffle(): MutableList<Card> {
        return CardNumber.values().flatMap { number ->
            CardSuit.values().map { suit ->
                Card(number, suit)
            }
        }.shuffled().toMutableList()
    }
}