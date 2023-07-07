package L3;
/*
[
[сказки, колобок, курочка ряба, золотой петушок]
[фантастика, гарри поттер, ночной дозор]
[роман, война и мир, ромео и джульета]
]
 */

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    static List<List<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {
        addBook("сказки", "колобок");
        addBook("фантастика", "гарри поттер");
        addBook("сказки", "курочка ряба");
        addBook("роман", "ромео и джульета");
        addBook("сказки", "золотой петушок");
        addBook("фантастика", "ночной дозор");
        addBook("роман", "война и мир");

        System.out.println(shopBook);
    }

    static void addBook(String genreBook, String nameBook) {
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)) {
                if (!genreList.contains(nameBook)){
                    genreList.add(nameBook);
                }
                return;
            }

        }
        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        shopBook.add(list);
    }

}
