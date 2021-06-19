import java.lang.reflect.*;
/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        Class cl = object.getClass();
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (Modifier.isPublic(field.getModifiers()) && field.getName() == fieldName) {
                return field.get(object);
            }
        }
        return null;
    }
}
