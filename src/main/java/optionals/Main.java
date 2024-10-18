package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object value1 = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(value1);

        Supplier<IllegalStateException> exception
                = () -> new IllegalStateException("exception");
        Object value2 = Optional.ofNullable("hello")
                .orElseThrow(exception); // Extract this as a variable - hover and it will give a prompt for that.

        System.out.println(value2);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () ->{
                            System.out.println("cannot send and email");
                        }
                );


    }
}
