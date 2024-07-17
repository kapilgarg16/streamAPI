import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Introduced in Java 8, Stream API is used to process collections of objects.
//        A stream in Java is a sequence of objects that supports
////        various methods which can be pipelined to produce the desired result.
//
//        List<Integer> ls1 = List.of(1,2,3,4, 0);
//        List<Integer> ls2 = Arrays.asList(1,2,3,4);
//
//        System.out.println(ls1.stream().filter(i->i%2==0).collect(Collectors.toList()));
//
//        System.out.println("Hello world!");
//
//        //create a stream object
//
//        Stream<Object> emptyStream = Stream.empty();
//
//        String []name = {"kapil", "saf", "fsdf"};
//
//        Stream<String> st1 = Stream.of(name);
//
//        st1.forEach(e->{System.out.println(e);});
//
//        IntStream st = Arrays.stream(new int[]{1,2,3});
//        st.forEach(e->System.out.println(e));
////        System.out.println(st1);
//
//        System.out.println(ls1.stream().map(i->i*i).collect(Collectors.toList()));
//
//        ls1.stream().sorted().forEach(System.out::println);
//
//        List<Integer> salaryList = new ArrayList<>();
//        salaryList.add(2);
//        salaryList.add(3);
//        salaryList.add(4);
//        salaryList.add(5);
//
//        long x = salaryList.stream().filter((Integer e) -> e > 0).count();
//
//        //Differnt ways to create a stream
////        1)
//
//        List<Integer> lst = Arrays.asList(1,2,3);
//        Stream<Integer>stm = lst.stream();

//        Integer[] xyz = new Integer[]{1,2,3};
//        Stream<Integer>stmr = Arrays.stream(xyz);
//        stmr.forEach(e-> System.out.println(e));
////        System.out.println(stmr.collect(Collectors.toCollection()));
//
//        //from status of method
//        Stream<Integer>stmr1 = Stream.of(1,2,3);
//
//        Stream.Builder<Integer>streamb = Stream.builder();
//        streamb.add(1).add(2).add(3);
//
////        Another way of creating an infinite stream is by using the iterate() method:
//        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
//
//
//        List<String> names = Arrays.asList(
//                "Reflection", "Collection", "Stream");
//
//        // demonstration of filter method
//        List<String> result
//                = names.stream()
//                .filter(s -> s.startsWith("S"))
//                .collect(Collectors.toList());
//
//        System.out.println(result);
//
//
//        List<Integer> number = Arrays.asList(2, 3, 4, 5);
//
//        // demonstration of map method
//        List<Integer> square
//                = number.stream()
//                .map(x -> x * x)
//                .collect(Collectors.toList());


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        // Using Stream flatMap(Function mapper)
       Stream<String>strm =  listOfLists.stream().flatMap(list -> list.stream());
       strm.forEach(e -> System.out.println(e));

        // Creating a list of Integers
        List<Integer> list
                = Arrays.asList(0, 2, 4, 6, 8, 10);

        // Using peek without any terminal
        // operation does nothing
        list.stream().peek(System.out::println);  //used to see the intermedeate result of the result which is getting
                                                    //processed
        //Stream flatMap(Function mapper) returns a stream consisting of the results of replacing
        // each element of this stream with the contents of a mapped stream produced by
        // applying the provided mapping function to each element. Stream flatMap(Function mapper) is an
        // intermediate operation.


//        The skip(n) method is an intermediate operation that discards the first n elements of a stream.
//        The n parameter can’t be negative, and if it’s higher than the size of the stream, skip() returns an empty stream.
//
//        Let’s see an example:

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(i -> System.out.print(i + " "));

//
//        The limit(n) method is another intermediate operation that returns a stream not longer than
//        the requested size. As before, the n parameter can’t be negative.
//
//                Let’s use it in an example:
//
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .filter(i -> i % 2 == 0)
//                .limit(2)
//                .forEach(i -> System.out.print(i + " "));

//        Map to LinkedTransferQueue

//        IntStream intStream = IntStream.range(1, 3); 3 is not included
//        LongStream longStream = LongStream.rangeClosed(1, 3); 3 is included



//        Stream mapToInt(ToIntFunction mapper) returns an IntStream consisting of the results of applying
//        the given function to the elements of this stream.
//
//                Stream mapToInt(ToIntFunction mapper) is an intermediate operation.
//                These operations are always lazy. Intermediate operations are invoked on a
//                Stream instance and after they finish their processing, they give a Stream instance as output.


        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        list.stream().mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

//        Intermediate Operations (Lazy): These operations are lazy and do not process the elements of the stream immediately. Examples include filter, map, flatMap, distinct, sorted, etc. Intermediate operations return a new stream,
//                and their execution is postponed until a terminal operation is invoked


    }
}