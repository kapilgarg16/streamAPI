import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> ls1 = List.of(1,2,3,4, 0);

        System.out.println(ls1.stream().filter(i->i%2==0).collect(Collectors.toList()));

        System.out.println("Hello world!");

        //create a stream object

        Stream<Object> emptyStream = Stream.empty();

        String []name = {"kapil", "saf", "fsdf"};

        Stream<String> st1 = Stream.of(name);

        st1.forEach(e->{System.out.println(e);});

        IntStream st = Arrays.stream(new int[]{1,2,3});
        st.forEach(e->System.out.println(e));
//        System.out.println(st1);

        System.out.println(ls1.stream().map(i->i*i).collect(Collectors.toList()));

        ls1.stream().sorted().forEach(System.out::println);
    }
}