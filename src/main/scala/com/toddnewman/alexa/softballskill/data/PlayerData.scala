package com.toddnewman.alexa.softballskill.data

import com.toddnewman.alexa.softballskill.data.Schema.{Player, Position}

object PlayerData {

  val players: Seq[Player] = Seq[Player](
    new Player(1,1, "Brian", "Steffy", Position.Infield, 1),
    new Player(2,2, "Casey", "Turk", Position.Infield, 1),
    new Player(3,3, "Jared", "Peace", Position.Infield, 1),
    new Player(4,4, "Nathalie", "Becker", Position.Infield, 1),
    new Player(5,5, "Nikki", "Chu", Position.Infield, 1),
    new Player(6,6, "Ryan", "Roth", Position.Infield, 1),
    new Player(7,7, "Tyler", "Aragon", Position.Infield, 1),
    new Player(8,8, "William", "Withers", Position.Infield, 1),
    new Player(9,9, "Alex", "McKelvey", Position.Infield, 1),
    new Player(10,10, "Andy", "Fang", Position.Infield, 1),
    new Player(11,11, "Ashley", "Ginbey", Position.Infield, 1),
    new Player(12,12, "Chris", "Wilson", Position.Infield, 1),
    new Player(13,13, "Joe", "Storms", Position.Infield, 1),
    new Player(14,14, "Margaret", "Porter", Position.Infield, 1),
    new Player(15,15, "Stephen", "Madden", Position.Infield, 1),
    new Player(16,16, "Ted", "Nguyen", Position.Infield, 1),
    new Player(17,1, "Amanda", "Guzman", Position.Infield, 2),
    new Player(18,1, "Cecilia", "Vuong", Position.Outfield, 3),
    new Player(19,1, "Chris", "Little", Position.Infield, 4),
    new Player(20,1, "Danny", "Grannick", Position.Outfield, 5),
    new Player(21,1, "Gio", "Perez", Position.Infield, 6),
    new Player(22,1, "Hyun-Jae", "Lee", Position.Outfield, 7),
    new Player(23,1, "Ivan", "Godinez", Position.Infield, 8),
    new Player(24,1, "Kento", "Lewis", Position.Outfield, 9),
    new Player(25,1, "Kimmy", "Dimalanta", Position.Catcher, 10),
    new Player(26,1, "Mark", "Hansen", Position.Infield, 11),
    new Player(27,1, "Michael", "Swit", Position.Outfield, 12),
    new Player(28,1, "Nick", "Gencev", Position.Infield, 13),
    new Player(29,1, "Nora", "Low", Position.Outfield, 14),
    new Player(30,1, "Sasha", "Rassoli", Position.Infield, 15),
    new Player(31,1, "Zac", "Ostrow", Position.Outfield, 16),
    new Player(32,2, "Abraham", "Chen", Position.Infield, 2),
    new Player(33,2, "Amit", "Pitre", Position.Outfield, 3),
    new Player(34,2, "Carey", "Davis", Position.Infield, 4),
    new Player(35,2, "Christine", "Pinnkathok", Position.Outfield, 5),
    new Player(36,2, "Dakota", "Watson", Position.Infield, 6),
    new Player(37,2, "Joshua", "Bender", Position.Outfield, 7),
    new Player(38,2, "Kyle", "Cutler", Position.Infield, 8),
    new Player(39,2, "Lisa", "Watson", Position.Outfield, 9),
    new Player(40,2, "Lynn", "Chyi", Position.Catcher, 10),
    new Player(41,2, "Michelle", "Alvarez", Position.Infield, 11),
    new Player(42,2, "Prithwish", "Pal", Position.Outfield, 12),
    new Player(43,2, "Sireesha", "Reddy", Position.Infield, 13),
    new Player(44,2, "Stephen", "Khuu", Position.Outfield, 14),
    new Player(45,2, "Steve", "Norberg", Position.Infield, 15),
    new Player(46,2, "Travis", "Jobe", Position.Outfield, 16),
    new Player(47,3, "Christopher", "Benner", Position.Infield, 2),
    new Player(48,3, "Corin", "Nisly", Position.Outfield, 3),
    new Player(49,3, "Derek", "Campbell", Position.Infield, 4),
    new Player(50,3, "Jay", "Clark", Position.Outfield, 5),
    new Player(51,3, "Jonathan", "Soohoo", Position.Infield, 6),
    new Player(52,3, "Kaitlin", "O'Brien", Position.Outfield, 7),
    new Player(53,3, "Kumar", "Duraiswamy", Position.Infield, 8),
    new Player(54,3, "Maria", "Lilly", Position.Outfield, 9),
    new Player(55,3, "Matthew", "Edwards", Position.Catcher, 10),
    new Player(56,3, "Pritika", "Sekhar", Position.Infield, 11),
    new Player(57,3, "Scott", "Schulte", Position.Outfield, 12),
    new Player(58,3, "Stacy", "James", Position.Infield, 13),
    new Player(59,3, "Stephanie", "Mendez", Position.Outfield, 14),
    new Player(60,3, "Todd", "Newman", Position.Infield, 15),
    new Player(61,3, "Zainub", "Qazi", Position.Outfield, 16),
    new Player(62,4, "Alex", "Allen", Position.Infield, 2),
    new Player(63,4, "Chris", "Bonowski", Position.Outfield, 3),
    new Player(64,4, "Daryl", "Gionnette", Position.Infield, 4),
    new Player(65,4, "Dwight", "Nakamitsu", Position.Outfield, 5),
    new Player(66,4, "Gince", "Francis", Position.Infield, 6),
    new Player(67,4, "Guy", "Elbaz", Position.Outfield, 7),
    new Player(68,4, "James", "Short", Position.Infield, 8),
    new Player(69,4, "Jay", "Patel", Position.Outfield, 9),
    new Player(70,4, "John", "Dimalanta", Position.Catcher, 10),
    new Player(71,4, "Karen", "Marmolejo", Position.Infield, 11),
    new Player(72,4, "Madeline", "Nestor", Position.Outfield, 12),
    new Player(73,4, "Marc", "Kreisler", Position.Infield, 13),
    new Player(74,4, "Ryan", "Lown", Position.Outfield, 14),
    new Player(75,4, "Stephanie", "Waslo", Position.Infield, 15),
    new Player(76,4, "Todd", "Friedman", Position.Outfield, 16),
    new Player(77,5, "Aaron", "Wise", Position.Infield, 2),
    new Player(78,5, "Alec", "Catacutan", Position.Outfield, 3),
    new Player(79,5, "Aline", "Wakamoto", Position.Infield, 4),
    new Player(80,5, "Andy", "Fornadel", Position.Outfield, 5),
    new Player(81,5, "Chris", "McGrath", Position.Infield, 6),
    new Player(82,5, "Crystal", "Moran-Gutierrez", Position.Outfield, 7),
    new Player(83,5, "Griffin", "Bracke", Position.Infield, 8),
    new Player(84,5, "Jeff", "Tsai", Position.Outfield, 9),
    new Player(85,5, "Josh", "Kim", Position.Catcher, 10),
    new Player(86,5, "Klevin", "D'Cunha", Position.Infield, 11),
    new Player(87,5, "Marty", "Flores", Position.Outfield, 12),
    new Player(88,5, "Michael", "Obillo", Position.Infield, 13),
    new Player(89,5, "Phillip", "Le", Position.Outfield, 14),
    new Player(90,5, "Ryan", "Slaughter", Position.Infield, 15),
    new Player(91,5, "Sriya", "Malladi", Position.Outfield, 16),
    new Player(92,6, "Angela", "Thompson", Position.Infield, 2),
    new Player(93,6, "C.J", "Vanzant", Position.Outfield, 3),
    new Player(94,6, "Christopher", "Edlund", Position.Infield, 4),
    new Player(95,6, "Curt", "Henry", Position.Outfield, 5),
    new Player(96,6, "Gwenn", "Berry", Position.Infield, 6),
    new Player(97,6, "Jane", "Dingee", Position.Outfield, 7),
    new Player(98,6, "Jordan", "Sison", Position.Infield, 8),
    new Player(99,6, "Lawrence", "Hui", Position.Outfield, 9),
    new Player(100,6, "Marshall", "Hinojosa", Position.Catcher, 10),
    new Player(101,6, "Obi", "Onyeacholem", Position.Infield, 11),
    new Player(102,6, "Rooz", "Golshani", Position.Outfield, 12),
    new Player(103,6, "Sarah", "Baird", Position.Infield, 13),
    new Player(104,6, "Shawn", "Cox", Position.Outfield, 14),
    new Player(105,6, "Taylor", "Wohlwend", Position.Infield, 15),
    new Player(106,6, "Will", "Thornbury", Position.Outfield, 16),
    new Player(107,7, "Bryson", "Ignacio", Position.Infield, 2),
    new Player(108,7, "Emily", "Parng", Position.Outfield, 3),
    new Player(109,7, "Ernest", "Rebugio", Position.Infield, 4),
    new Player(110,7, "Eugene", "Jhun", Position.Outfield, 5),
    new Player(111,7, "Gillian", "Halter", Position.Infield, 6),
    new Player(112,7, "Jerry", "Rodriguez", Position.Outfield, 7),
    new Player(113,7, "Joey", "Mancera", Position.Infield, 8),
    new Player(114,7, "Kira", "Knight", Position.Outfield, 9),
    new Player(115,7, "Kyle", "Buchholz", Position.Catcher, 10),
    new Player(116,7, "Kyle", "McNamara", Position.Infield, 11),
    new Player(117,7, "Launtz", "Miller", Position.Outfield, 12),
    new Player(118,7, "Peter", "Korzen", Position.Infield, 13),
    new Player(119,7, "Rajesh", "Madiraju", Position.Outfield, 14),
    new Player(120,7, "Tais", "Sung-Kane", Position.Infield, 15),
    new Player(121,7, "Thaomi", "Phuong", Position.Outfield, 16),
    new Player(122,8, "Ashish", "Mistry", Position.Infield, 2),
    new Player(123,8, "Beth", "Rasala", Position.Outfield, 3),
    new Player(124,8, "Daniel", "Tellez", Position.Infield, 4),
    new Player(125,8, "David", "Le", Position.Outfield, 5),
    new Player(126,8, "Deepak", "Kamaraj", Position.Infield, 6),
    new Player(127,8, "Eric", "Beckrest", Position.Outfield, 7),
    new Player(128,8, "Fabian", "Buenrostro", Position.Infield, 8),
    new Player(129,8, "Jon", "Carlson", Position.Outfield, 9),
    new Player(130,8, "Kathleen", "Murphy", Position.Catcher, 10),
    new Player(131,8, "Kristina", "Munoz", Position.Infield, 11),
    new Player(132,8, "Lisa", "Robison", Position.Outfield, 12),
    new Player(133,8, "Mackenzie", "Thorpe", Position.Infield, 13),
    new Player(134,8, "Matthew", "Norton", Position.Outfield, 14),
    new Player(135,8, "Ryan", "Newman", Position.Infield, 15),
    new Player(136,8, "Zeke", "Shepherd-Lykken", Position.Outfield, 16),
    new Player(137,9, "Agustin", "Servin", Position.Infield, 2),
    new Player(138,9, "Amit", "Patel", Position.Outfield, 3),
    new Player(139,9, "Daniel", "Anderson", Position.Infield, 4),
    new Player(140,9, "Daniel", "Coronado", Position.Outfield, 5),
    new Player(141,9, "Edwin", "Li", Position.Infield, 6),
    new Player(142,9, "Erin", "Fitzmartin", Position.Outfield, 7),
    new Player(143,9, "Fernando", "Apalategui", Position.Infield, 8),
    new Player(144,9, "Garrett", "Granger", Position.Outfield, 9),
    new Player(145,9, "Irina", "Grishina", Position.Catcher, 10),
    new Player(146,9, "Jenn", "Huang", Position.Infield, 11),
    new Player(147,9, "Kayla", "Gregory", Position.Outfield, 12),
    new Player(148,9, "Mackenzie", "Bishop", Position.Infield, 13),
    new Player(149,9, "Patrick", "Satkunananthan", Position.Outfield, 14),
    new Player(150,9, "Vivek", "Jaiswal", Position.Infield, 15),
    new Player(151,9, "William", "Zabel", Position.Outfield, 16),
    new Player(152,10, "Bethany", "Tinker", Position.Infield, 2),
    new Player(153,10, "Britt", "Ploessel", Position.Outfield, 3),
    new Player(154,10, "Daniela", "Saldana", Position.Infield, 4),
    new Player(155,10, "Dwight", "Baker", Position.Outfield, 5),
    new Player(156,10, "Erin", "Robertshaw", Position.Infield, 6),
    new Player(157,10, "Greg", "Apker", Position.Outfield, 7),
    new Player(158,10, "Henry", "Vuong", Position.Infield, 8),
    new Player(159,10, "Hoang", "Mai", Position.Outfield, 9),
    new Player(160,10, "Jeffery", "Dunn", Position.Catcher, 10),
    new Player(161,10, "Kevin", "Rhodes", Position.Infield, 11),
    new Player(162,10, "Mark", "Wasylkiw", Position.Outfield, 12),
    new Player(163,10, "Michael", "Salmans", Position.Infield, 13),
    new Player(164,10, "Russell", "Chan", Position.Outfield, 14),
    new Player(165,10, "Sudeep", "Sen", Position.Infield, 15),
    new Player(166,10, "Thais", "Takei", Position.Outfield, 16),
    new Player(167,11, "Ali", "Hadayat", Position.Infield, 2),
    new Player(168,11, "Alice", "Blackshear", Position.Outfield, 3),
    new Player(169,11, "Andrew", "Warren", Position.Infield, 4),
    new Player(170,11, "Delia", "Victorino", Position.Outfield, 5),
    new Player(171,11, "Erin", "Greiner", Position.Infield, 6),
    new Player(172,11, "Ezra", "Miksic", Position.Outfield, 7),
    new Player(173,11, "Laura", "Parker", Position.Infield, 8),
    new Player(174,11, "Matthew", "Hage", Position.Outfield, 9),
    new Player(175,11, "Nageswara", "Alla", Position.Catcher, 10),
    new Player(176,11, "Oscar", "Urzua", Position.Infield, 11),
    new Player(177,11, "Reid", "Siglin", Position.Outfield, 12),
    new Player(178,11, "Robert", "Haigis", Position.Infield, 13),
    new Player(179,11, "Ryder", "Paredes", Position.Outfield, 14),
    new Player(180,11, "Sebastian", "Shaner", Position.Infield, 15),
    new Player(181,11, "Tom", "Lo", Position.Outfield, 16),
    new Player(182,12, "Audel", "Talamantes", Position.Infield, 2),
    new Player(183,12, "Charlie", "Hubert", Position.Outfield, 3),
    new Player(184,12, "Claire", "Ray", Position.Infield, 4),
    new Player(185,12, "Cleo", "Eng", Position.Outfield, 5),
    new Player(186,12, "Daniel", "Perez", Position.Infield, 6),
    new Player(187,12, "Eric", "Smith", Position.Outfield, 7),
    new Player(188,12, "Justin", "Emory", Position.Infield, 8),
    new Player(189,12, "Lena", "Christiansen", Position.Outfield, 9),
    new Player(190,12, "Michael", "Gaitan", Position.Catcher, 10),
    new Player(191,12, "Nikki", "Alayari", Position.Infield, 11),
    new Player(192,12, "Raju", "Patel", Position.Outfield, 12),
    new Player(193,12, "Sucheth", "Koppa", Position.Infield, 13),
    new Player(194,12, "Tiffany", "Malek", Position.Outfield, 14),
    new Player(195,12, "Tyler", "Burch", Position.Infield, 15),
    new Player(196,12, "Wilfred", "Li", Position.Outfield, 16),
    new Player(197,13, "Andres", "Villalobos", Position.Infield, 2),
    new Player(198,13, "Arjun", "Devarapalli", Position.Outfield, 3),
    new Player(199,13, "Bryce", "Prodanovich", Position.Infield, 4),
    new Player(200,13, "Chris", "Kunard", Position.Outfield, 5),
    new Player(201,13, "Chris", "Wu", Position.Infield, 6),
    new Player(202,13, "Iris", "Kao", Position.Outfield, 7),
    new Player(203,13, "Kjirsten", "Youngren", Position.Infield, 8),
    new Player(204,13, "LeAnne", "Lovato", Position.Outfield, 9),
    new Player(205,13, "Mikey", "Pham", Position.Catcher, 10),
    new Player(206,13, "Nam", "Tran", Position.Infield, 11),
    new Player(207,13, "Ross", "Lenta", Position.Outfield, 12),
    new Player(208,13, "Shannon", "Smith", Position.Infield, 13),
    new Player(209,13, "Stacey", "Chyi", Position.Outfield, 14),
    new Player(210,13, "Stephen", "Hong", Position.Infield, 15),
    new Player(211,13, "Steve", "Weiss", Position.Outfield, 16),
    new Player(212,14, "Alex", "Westman", Position.Infield, 2),
    new Player(213,14, "Andrzej", "Roman", Position.Outfield, 3),
    new Player(214,14, "Angelica", "Barr", Position.Infield, 4),
    new Player(215,14, "Brian", "Baugh", Position.Outfield, 5),
    new Player(216,14, "Doug", "Whitney", Position.Infield, 6),
    new Player(217,14, "Ed", "Yragui", Position.Outfield, 7),
    new Player(218,14, "Ellen", "Sutjiarto", Position.Infield, 8),
    new Player(219,14, "James", "de Bree", Position.Outfield, 9),
    new Player(220,14, "Jonathan", "San", Position.Catcher, 10),
    new Player(221,14, "Jude", "Gallegos", Position.Infield, 11),
    new Player(222,14, "Lisa", "Lorek", Position.Outfield, 12),
    new Player(223,14, "Oliver", "Manaois", Position.Infield, 13),
    new Player(224,14, "Paki", "Zaker", Position.Outfield, 14),
    new Player(225,14, "Raish", "Shrestha", Position.Infield, 15),
    new Player(226,14, "Ron", "McGrath", Position.Outfield, 16),
    new Player(227,15, "Allison", "Hahn", Position.Infield, 2),
    new Player(228,15, "Armida", "Diaz", Position.Outfield, 3),
    new Player(229,15, "Ben", "Freedman", Position.Infield, 4),
    new Player(230,15, "Cameron", "McKenzie", Position.Outfield, 5),
    new Player(231,15, "Cory", "Weast", Position.Infield, 6),
    new Player(232,15, "Doug", "Dunphy", Position.Outfield, 7),
    new Player(233,15, "Jenny", "Lonergan", Position.Infield, 8),
    new Player(234,15, "June", "Hope", Position.Outfield, 9),
    new Player(235,15, "Justin", "Fullerton", Position.Catcher, 10),
    new Player(236,15, "Mark", "Souther", Position.Infield, 11),
    new Player(237,15, "Mark", "Van Oene", Position.Outfield, 12),
    new Player(238,15, "Reilly", "Porter", Position.Infield, 13),
    new Player(239,15, "Rita", "Pitts", Position.Outfield, 14),
    new Player(240,15, "Sean", "Bennington", Position.Infield, 15),
    new Player(241,15, "Ujjwal", "Jain", Position.Outfield, 16),
    new Player(242,16, "Aaron", "Aslanian", Position.Infield, 2),
    new Player(243,16, "Ana", "Sanchez", Position.Outfield, 3),
    new Player(244,16, "Beth", "Ascherfeld", Position.Infield, 4),
    new Player(245,16, "Bryan", "Bartlett", Position.Outfield, 5),
    new Player(246,16, "Christopher A.", "Lee", Position.Infield, 6),
    new Player(247,16, "Cicely", "Washington", Position.Outfield, 7),
    new Player(248,16, "Deiter", "Hofstetter", Position.Infield, 8),
    new Player(249,16, "Gino", "Alivia", Position.Outfield, 9),
    new Player(250,16, "Jennifer", "Hammond", Position.Catcher, 10),
    new Player(251,16, "Judd", "Lather", Position.Infield, 11),
    new Player(252,16, "Kyle", "Kokjohn", Position.Outfield, 12),
    new Player(253,16, "Maricela", "Carreon", Position.Infield, 13),
    new Player(254,16, "Matthew", "Rotz", Position.Outfield, 14),
    new Player(255,16, "Samuel", "Leung", Position.Infield, 15),
    new Player(256,16, "Scott", "Barnes", Position.Outfield, 16)
  )

}
