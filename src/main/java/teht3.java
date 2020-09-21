public class teht3 {

    //*Olkoon A kuviota K kuvaava em. m x n -taulukko.
    // Olkoon B toinen o x p-taulukko, joka kuvaa säiliötä,
    // johon kuvio A on tarkoitus sijoittaa sijaintiin (x,y) (kappaleen vasen yläkulma).
    // Laadi rutiinimäärittely rutiinille, joka kertoo,
    // voidaanko kappale A lisätä B:hen paikkaan (x,y) vai onko lisäys mahdoton.
    // Määrittelyn tulisi huomioida eri tavat, joilla lisäys voi epäonnistua.

    /**
     * Paluttaa true tai false sen perusteella voidaanko kappale A lisätä B:hen.
     * @.pre B != A, A != null
     * @.post B.onTyhjä() => B.add(A)
     * & !(B.onTyhjä()) -> raise exception
     */
    boolean taulukko(int [][] A) throws notEmptyException
}
