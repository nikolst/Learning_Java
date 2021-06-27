class InstanceUtils {

    public static Person createPerson(String name, int age) {
        try {
            Class personClass = Person.class;
            Constructor constructor = personClass.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true); 
            return (Person) constructor.newInstance(name, age);
        } catch (NoSuchMethodException | InstantiationException 
            | IllegalAccessException | InvocationTargetException e) {
            return null;
        } 
    }
}
