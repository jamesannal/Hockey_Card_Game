package example.codeclan.com.sports_cards;

/**
 * Created by user on 20/01/2017.
 */
public enum Player {
    CROSBY(99),
    OVECHKIN(94),
    WEBER(92),
    STAMKOS(90),
    BENN(89),
    SEDIN(88),
    KANE(87),
    DOUGHTY(84),
    KOPITAR(87),
    TARASENKO(85),
    KEITH(83),
    HORVAT(82),
    TAVARES(81),
    MALKIN(79),
    SUTER(77),
    KARLSSON(76),
    BURNS(75),
    HEDMAN(74),
    SEGUIN(73),
    MCDAVID(72),
    PAVELSKI(71),
    GETZLAF(70),
    BACKSTROM(69),
    VLASIC(68),
    SUBBAN(67),
    PERRY(66),
    GIROUX(65),
    BYFUGLIEN(64),
    HALL(63),
    GAUDREAU(62),
    BERGERON(61),
    GIORDANO(60),
    SHATTENKIRK(59),
    TOEWS(58),
    JOSI(57),
    THORNTON(56),
    LETANG(55),
    PIETRANGELO(54),
    SEABROOK(53),
    MCDONAGH(52),
    VORACEK(51),
    PACIORETTY(50),
    KUZNETSOV(49),
    DRAISAITL(45),
    MATTHEWS(40),
    ZETTERBERG(35),
    DOAN(30),
    DAVISON(20),
    LUCIC(10),
    GLASS(1);

    public int value;

    private Player(int value) {
        this.value = value;
    }



}
