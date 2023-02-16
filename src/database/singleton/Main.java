package database.singleton;
/*
3 istanze <--- implementano una classe MapDatabse che effettua operazioni CRUD (Create, Read, Update, Delete) su una mappa.
La mappa rappresenta il nostro database.
Quando si inserisce un valore nella mappa, la chiave di inserimento è un numero intero incrementale

pssql
postgresql
mysql    -----> Map<Int, String>
MapDatabase.insert(String value);

 */
public class Main {
    public static void main(String[] args) {

        MapDatabase pssql = new MapDatabase(Counter.getInstance());
        MapDatabase postgresql = new MapDatabase(Counter.getInstance());
        MapDatabase mysql = new MapDatabase(Counter.getInstance());

        System.out.println(pssql.create("ciao"));
        System.out.println(postgresql.create("due"));
        System.out.println(pssql.create("Hello"));
        System.out.println(mysql.create("Prova"));

     /*   pssql.insert("ciao"); /// (1,ciao)
        postgresql.inser("due"); ///(2,due)
        pssql.insert("Hello"); /// (3,hello)
        mysql.insert("Prova"); /// (4,prova)
        */
    }
}
