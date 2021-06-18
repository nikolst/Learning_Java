import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;

/**
 Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        // Add implementation here
        Class itemClass = object.getClass();
        Field[] fields = itemClass.getDeclaredFields();
        List<String> privateField = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateField.add(field.getName());
            }
        }
        Collections.sort(privateField);
        return privateField;
    }
}
