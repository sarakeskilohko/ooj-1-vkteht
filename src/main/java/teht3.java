public class teht3 {

    //*Olkoon A kuviota K kuvaava em. m x n -taulukko.
    // Olkoon B toinen o x p-taulukko, joka kuvaa säiliötä,
    // johon kuvio A on tarkoitus sijoittaa sijaintiin (x,y) (kappaleen vasen yläkulma).
    // Laadi rutiinimäärittely rutiinille, joka kertoo,
    // voidaanko kappale A lisätä B:hen paikkaan (x,y) vai onko lisäys mahdoton.
    // Määrittelyn tulisi huomioida eri tavat, joilla lisäys voi epäonnistua.

    /**
     * Paluttaa true tai false sen perusteella voidaanko kappale A lisätä B:hen.
     * Alkuehto: taulukot eivät voi olla tyhjiä.
     * @.pre B != A, A != null
     * Loppuehto: Tarkistetaan, voidaanko lisäys tehdä ruutuun (onko ruutu tyhjä; tapahtuuko lisäys taulukon reunojen sisällä)
     * @.post B.onTyhjä() => B.add(A)
     * & !(B.onTyhjä()) -> raise exception
     */
    boolean taulukko(int [][] A) throws notEmptyException

        public static boolean onTyhjä(int [][] X) {
            for (int i = 0 ; i < X.length ; i++) {
                for (int j = 0 ; j < X[i].length ; j++)  {
                    if ([i][j] == 0) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
}
