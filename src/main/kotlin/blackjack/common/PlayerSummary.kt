package blackjack.common

import blackjack.domain.player.Dealer
import blackjack.domain.player.Player

class PlayerSummary(player: Player, excludeHiddenCard: Boolean = false) {
    val playerName: String = player.name

    val playerCards: List<String> = player.cards.getNames()
        .let {
            if (player is Dealer && excludeHiddenCard)
                it.dropLast(1)
            else
                it
        }

    val playerCardsTotal: Int = player.cards.total.value
}