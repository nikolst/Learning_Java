import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodsDemo {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        // write your code here
        SomeClass someClass = new SomeClass();
        Class sClass = someClass.getClass();
        Method[] methods = sClass.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method.invoke(someClass));
        }
    }
}
