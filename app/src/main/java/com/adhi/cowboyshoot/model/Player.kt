package com.adhi.cowboyshoot.model

import com.adhi.cowboyshoot.enum.PlayerPosition
import com.adhi.cowboyshoot.enum.PlayerSide
import com.adhi.cowboyshoot.enum.PlayerState

data class Player(
    val playerSide: PlayerSide,
    var playerState: PlayerState,
    var playerPosition: PlayerPosition
)
