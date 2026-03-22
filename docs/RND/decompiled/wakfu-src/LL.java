/*
 * Decompiled with CFR 0.152.
 */
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Field;

public final class LL {
    private LL() {
    }

    public static void a(LO lO, Object object) {
        Field[] fieldArray;
        for (Field field : fieldArray = object.getClass().getDeclaredFields()) {
            String string;
            if (!field.isAnnotationPresent(LN.class) || !lO.cC(string = field.getAnnotation(LN.class).aTd())) continue;
            field.setAccessible(true);
            try {
                Object object2 = lO.cB(string);
                if (object2 == null) continue;
                field.set(object, LL.a(field.getType(), object2));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new LM("Bad field type " + string, illegalArgumentException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new LM("Cannot access field " + string, illegalAccessException);
            }
            catch (Exception exception) {
                throw new LM("Unable to set property " + string, exception);
            }
        }
    }

    private static Object a(Class<?> clazz, Object object) {
        PropertyEditor propertyEditor;
        PropertyEditor propertyEditor2 = propertyEditor = clazz.isEnum() ? new LK(clazz) : PropertyEditorManager.findEditor(clazz);
        if (propertyEditor == null) {
            return object;
        }
        Class<?> clazz2 = object.getClass();
        if (clazz2.equals(String.class)) {
            propertyEditor.setAsText((String)object);
        } else {
            propertyEditor.setValue(object);
        }
        return propertyEditor.getValue();
    }
}

