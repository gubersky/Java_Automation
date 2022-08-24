package booking.testbase;

import booking.test.FirstTest;
import booking.test.SecondTest;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;


public class Reflection {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        getMethodsAnnotated(fileWriter, FirstTest.class);
        getMethodsAnnotated(fileWriter,SecondTest.class);
        fileWriter.close();
    }


    public static void getMethodsAnnotated(FileWriter fileWriter, final Class<?> type) throws IOException {
        for (final Method method : type.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                fileWriter.write(method + ",\n");
            }
        }
    }
}
