package com.toddnewman.alexa.softballskill.data

import com.toddnewman.alexa.softballskill.data.Schema.Team

object TeamData {
  val teams: Seq[Team] = Seq[Team](
    new Team(1, "Revenge of the Smurfs", "Light Blue", 1),
    new Team(2, "GoldSchluggers", "Yellow", 2),
    new Team(3, "Mean Green Peace Machine", "Green", 3),
    new Team(4, "Natty Ice", "Maroon", 4),
    new Team(5, "Chu Fast, Chu Furious", "Light Blue", 5),
    new Team(6, "Shock Tops", "Orange", 6),
    new Team(7, "Back to Black", "Black", 7),
    new Team(8, "A Blue Hope", "Medium Blue", 8),
    new Team(9, "Return of the Mackies", "Light Green", 9),
    new Team(10, "Silver Streakers", "Silver", 10),
    new Team(11, "The Ash Catch-ems", "Medium Blue", 11),
    new Team(12, "(Au) Snap", "Gold", 12),
    new Team(13, "Royal Pain", "Cerulean", 13),
    new Team(14, "pREDators", "Red", 14),
    new Team(15, "Purple Rain", "Purple", 15),
    new Team(16, "Bad News Teddy Bears", "Grey", 16)
  )
}
