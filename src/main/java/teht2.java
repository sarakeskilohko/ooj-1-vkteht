public class teht2 {
    //*Halutaan selvittää nälkää näkevän ihmispopulaation alipainoiset yksilöt
    // eli yksilöt joiden BMI on alle 18,5. Suunnittele järkevät rutiinimäärittelyt
    // yksittäisen henkilön painoindeksin laskemiseksi. Perustele myös sanallisesti
    // toteutuksen tietotyyppien ja arvoalueiden valinta ja anna syy kunkin syötteen tarpeellisuudelle.
    // Painoindeksi (BMI) lasketaan kaavalla BMI = paino / pituus / pituus,
    // jossa painon yksikkö on kg ja pituuden metri.
    // Esimerkiksi henkilö A (66kg, 190cm) on kaavan mukaan alipainon rajan alapuolella
    // ja henkilö B (67kg, 190cm) yläpuolella. Kaava antaa siis karkean viitteellisen arvion BMI:stä.

    /**
     * Palauttaa BMI:n
     * @.pre 500.0 > double paino > 0, 3.0 > double pituus > 0
     * Voiddan olettaa ihmisten painavan jotain 0kg ja 500kg väliltä.
     * Sama oletus pituudesta välillä 0m-3m.
     * Tiedot tarvitaan BMI:n laskukaavaan.
     * Tietotyyppi double, jotta pituus voidaan suoraan kysyä metreinä.
     * @.post RESULT = (paino / pituus^2)
     * & RESULT > 0
     * & RESULT < 18.5 -> raise exception
     */
    double BMI(double paino, double pituus) throws AlipainoPoikkeus
}
