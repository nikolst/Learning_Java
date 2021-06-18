class ReflectionUtils {

    public static int countPublicMethods(Class targetClass) {
        int counter = 0;
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                counter++;
            }
        }
        return counter;
    }
}
