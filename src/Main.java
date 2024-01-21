public class Main {

    public static void main ( String[] args ) {
        Book warAndPeace = new Book ("Война и мир", "Лев Николаевич Толстой", 30   );
        System.out.println ( "warAndPeace.name = " + warAndPeace.getName () );
        System.out.println ( "warAndPeace.author = " + warAndPeace.getAuthor () );
        System.out.println ( "warAndPeace.year = " + warAndPeace.getClass () );

        Book fathersAndSons = new Book ("Отцы и дети", "Иван Сергеевич Тургенев", 1861);
        System.out.println ( "fathersAndSons.name = " + fathersAndSons.getName () );
        System.out.println ( "fathersAndSons.author = " + fathersAndSons.getAuthor () );
        System.out.println ( "fathersAndSons.year = " + fathersAndSons.getYear () );
        fathersAndSons.setYear ( 1860 );
        System.out.println ( "fathersAndSons.year = " + fathersAndSons.getYear () );

        Author pushkin = new Author ("Александр", "Пушкин");
        System.out.println ( "pushkin.name = " + pushkin.getName ( ) );
        System.out.println ( "pushkin.surname = " + pushkin.getSurname ( ) );
        Author robert = new Author ( "Robert", "Martin" );
        System.out.println ( "robert.name = " + robert.getName ( ) );
        System.out.println ( "robert.surname = " + robert.getSurname ( ) );



    }
}