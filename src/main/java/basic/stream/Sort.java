package basic.stream;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Cherie on 2020/12/30
 **/
public class Sort {

    public static void main(String[] args) {

        List<Book> list = Lists.newArrayList(new Book(1, 1, "java"), new Book(2, 1, "php"));

        Stream<Book> list1 = list.stream().sorted(Comparator.comparing(Book::getCode));

        Stream<Book> list2 = list.stream().sorted(Comparator.comparing(Book::getCode).reversed());
        Stream<Book> list3 = list.stream().sorted(Comparator.comparing(Book::getCode, Comparator.reverseOrder()));

        Stream<Book> list4 = list.stream().sorted(Comparator.comparing(Book::getCode).thenComparing(Book::getType));

        Stream<Book> list5 = list.stream().sorted(Comparator.comparing(Book::getCode).reversed().thenComparing(Book::getType));
        Stream<Book> list6 = list.stream().sorted(Comparator.comparing(Book::getCode, Comparator.reverseOrder()).thenComparing(Book::getType));

        Stream<Book> list7 = list.stream().sorted(Comparator.comparing(Book::getCode).reversed().thenComparing(Book::getType, Comparator.reverseOrder()));
        Stream<Book> list8 = list.stream().sorted(Comparator.comparing(Book::getCode, Comparator.reverseOrder()).thenComparing(Book::getType, Comparator.reverseOrder()));

        Stream<Book> list9 = list.stream().sorted(Comparator.comparing(Book::getCode).reversed().thenComparing(Book::getType).reversed());
        Stream<Book> list10 = list.stream().sorted(Comparator.comparing(Book::getCode).thenComparing(Book::getType, Comparator.reverseOrder()));

        System.out.println(list10);
    }

    @Data
    static class Book {
        private int code;
        private int type;
        private String name;

        Book(int code, int type, String name) {
            this.code = code;
            this.type = type;
            this.name = name;
        }
    }
}

