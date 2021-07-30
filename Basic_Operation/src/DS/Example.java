package DS;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

	public static void main(String[] args) throws Exception {
		 Constructor<Foo> constructor = Foo.class.getDeclaredConstructor();
	        constructor.setAccessible(true);
	        Foo foo = constructor.newInstance();
	        System.out.println(foo);

	}

}
class Foo {
    private Foo() {
        // private!
    }

    @Override
    public String toString() {
        return "I'm a Foo and I'm alright!";
    }
}