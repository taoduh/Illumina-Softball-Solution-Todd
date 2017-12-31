package com.toddnewman.alexa.softballskill.data

import com.toddnewman.alexa.softballskill.data.Schema.Game
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object GameData {
  val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")

  val games = Seq[Game](
    new Game(1,14,12,LocalDateTime.parse("05/31/2017 18:00:00", formatter),14,9,6),
    new Game(2,10,6,LocalDateTime.parse("05/31/2017 19:00:00", formatter),18,6,6),
    new Game(3,13,9,LocalDateTime.parse("05/31/2017 20:00:00", formatter),11,15,5),
    new Game(4,5,2,LocalDateTime.parse("05/31/2017 21:00:00", formatter),5,13,5),
    new Game(5,11,16,LocalDateTime.parse("05/31/2017 18:00:00", formatter),7,14,6),
    new Game(6,7,3,LocalDateTime.parse("05/31/2017 19:00:00", formatter),18,14,4),
    new Game(7,8,15,LocalDateTime.parse("06/01/2017 18:00:00", formatter),15,14,6),
    new Game(8,4,1,LocalDateTime.parse("06/01/2017 19:00:00", formatter),6,6,4),
    new Game(9,14,5,LocalDateTime.parse("06/07/2017 18:00:00", formatter),13,16,6),
    new Game(10,1,13,LocalDateTime.parse("06/07/2017 19:00:00", formatter),15,14,6),
    new Game(11,7,16,LocalDateTime.parse("06/07/2017 20:00:00", formatter),11,12,5),
    new Game(12,2,9,LocalDateTime.parse("06/07/2017 18:00:00", formatter),14,13,5),
    new Game(13,11,6,LocalDateTime.parse("06/07/2017 19:00:00", formatter),13,5,6),
    new Game(14,4,10,LocalDateTime.parse("06/08/2017 18:00:00", formatter),3,9,4),
    new Game(15,12,3,LocalDateTime.parse("06/08/2017 19:00:00", formatter),10,12,6),
    new Game(16,16,8,LocalDateTime.parse("06/14/2017 18:00:00", formatter),12,17,4),
    new Game(17,13,4,LocalDateTime.parse("06/14/2017 19:00:00", formatter),9,14,6),
    new Game(18,3,11,LocalDateTime.parse("06/14/2017 20:00:00", formatter),8,5,6),
    new Game(19,1,9,LocalDateTime.parse("06/14/2017 18:00:00", formatter),14,5,5),
    new Game(20,5,15,LocalDateTime.parse("06/14/2017 19:00:00", formatter),13,9,5),
    new Game(21,12,7,LocalDateTime.parse("06/15/2017 18:00:00", formatter),12,21,6),
    new Game(22,14,2,LocalDateTime.parse("06/15/2017 19:00:00", formatter),8,18,4),
    new Game(23,6,7,LocalDateTime.parse("06/21/2017 18:00:00", formatter),9,34,6),
    new Game(24,5,1,LocalDateTime.parse("06/21/2017 19:00:00", formatter),22,10,4),
    new Game(25,12,10,LocalDateTime.parse("06/21/2017 20:00:00", formatter),10,20,6),
    new Game(26,4,8,LocalDateTime.parse("06/21/2017 18:00:00", formatter),15,11,6),
    new Game(27,2,3,LocalDateTime.parse("06/21/2017 19:00:00", formatter),13,4,5),
    new Game(28,15,11,LocalDateTime.parse("06/22/2017 18:00:00", formatter),4,7,5),
    new Game(29,16,14,LocalDateTime.parse("06/22/2017 19:00:00", formatter),17,10,6)
  )

}
