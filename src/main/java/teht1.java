public class teht1 {

    //* 1. Kaikki kokonaislukutaulukon "kiva" alkiot ovat positiivisia.

    /**
     * Palauttaa true tai false
     * @.pre FORALL(i : 0 <= i < kiva.length ; kiva[i] > 0 )
     * @.post true
     */
    boolean taulukko(int[] kiva)

    //* 2. Merkkijonossa "syöte" esiintyy merkki 'k'.

    /**
     * Palauttaa true tai false
     * @.pre EXISTS(k : syöte ; syöte.contains("k"))
     * @.post true
     */
    boolean merkkijono(String syöte)

    //* 3. Kokonaislukutaulukon lottorivi minimialkiolla ei ole duplikaatteja (so. se esiintyy taulukossa vain kerran).

    /**
     * Palauttaa true tai false (eli ei duplikaatteja vai on duplikaatteja)
     * @.pre FORALL(i : 0 <= i < lottorivi.length ; lottorivi[i] > 0)
     *      & EXISTS(pienin : lottorivi ; pienin < lottorivi[i])
     * @.post pienin.eiSamojaLukuja()
     *      & lottorivi[i] < 0  -> raise exception
     */
    boolean lotto(int[] lottorivi) throws NegValueException
}
