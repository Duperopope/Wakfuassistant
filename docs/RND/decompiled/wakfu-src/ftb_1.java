/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fTb
 */
public class ftb_1 {
    private static final Logger vfp = Logger.getLogger(ftb_1.class);

    public static boolean a(Method method, Object object) {
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != 1) {
            return false;
        }
        Class<?> clazz = classArray[0];
        if (object == null) {
            return !clazz.isPrimitive();
        }
        Class<?> clazz2 = object.getClass();
        return !(clazz.isArray() && !clazz2.isArray() || !clazz.isArray() && clazz2.isArray());
    }

    public static boolean a(Method method, Object ... objectArray) {
        Class<?>[] classArray = method.getParameterTypes();
        if (objectArray.length != classArray.length) {
            return false;
        }
        for (int i = 0; i < classArray.length; ++i) {
            if (!(objectArray[i] == null ? classArray[i].isPrimitive() : !classArray[i].isAssignableFrom(objectArray[i].getClass()))) continue;
            return false;
        }
        return true;
    }

    public static void a(Method method, Object object, Object[] objectArray) {
        Serializable serializable;
        if (method == null || objectArray == null) {
            return;
        }
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != objectArray.length) {
            throw new Exception("nombre de param\u00e8tres attendus : " + classArray.length + ". Trouv\u00e9s : " + objectArray.length);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i = 0; i < classArray.length; ++i) {
            serializable = classArray[i];
            Object object2 = objectArray[i];
            if (object2 == null && !((Class)serializable).isPrimitive() || object2 != null && ((Class)serializable).isAssignableFrom(object2.getClass())) {
                arrayList.add(object2);
                continue;
            }
            if (serializable.equals(String.class)) {
                arrayList.add(Bw.k(object2));
                continue;
            }
            if (serializable.equals(Boolean.TYPE) || serializable.equals(Boolean.class)) {
                arrayList.add(Bw.l(object2));
                continue;
            }
            if (serializable.equals(Integer.TYPE) || serializable.equals(Integer.class)) {
                arrayList.add(Bw.m(object2));
                continue;
            }
            if (serializable.equals(Float.TYPE) || serializable.equals(Float.class)) {
                arrayList.add(Float.valueOf(Bw.o(object2)));
                continue;
            }
            if (serializable.equals(Double.TYPE) || serializable.equals(Double.class)) {
                arrayList.add(Bw.n(object2));
                continue;
            }
            if (serializable.equals(Long.TYPE) || serializable.equals(Long.class)) {
                arrayList.add(Bw.p(object2));
                continue;
            }
            if (object2.getClass().equals(String.class)) {
                arrayList.add(fic_1.gBr().b(serializable, (String)object2));
                continue;
            }
            throw new Exception("Impossible de convertir la valeur donn\u00e9e");
        }
        try {
            method.invoke(object, arrayList.toArray());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("IllegalArgumentException : method=").append(method).append(", parametres=");
            for (int i = 0; i < arrayList.size(); ++i) {
                ((StringBuilder)serializable).append(arrayList.get(i));
                if (i == arrayList.size() - 1) break;
                ((StringBuilder)serializable).append(", ");
            }
            vfp.error((Object)serializable);
        }
    }

    public static void a(String string, fhv_1 fhv_12, fsc_1 fsc_12, int n, String string2, fjj_2 fjj_22) {
        Object object;
        Object object2 = null;
        Object object3 = null;
        if ((object3 == null || fjj_22 != null) && fsc_12 != null) {
            object2 = string2 != null ? fsc_12.eu(string2) : fsc_12.getValue();
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (fjj_22 != null) {
            object3 = fjj_22.getResult(object2);
        }
        Object object4 = object = object3 != null ? object3 : object2;
        if (object instanceof String && 3556653 != n ? fhv_12.setXMLAttribute(n, (String)object, fic_1.gBr()) : fhv_12.setPropertyAttribute(n, object)) {
            return;
        }
        fiw_1<?> fiw_12 = fkc_2.gCQ().D(fhv_12.getClass());
        Method method = object3 != null ? fiw_12.e(string, object3.getClass()) : (object2 != null ? fiw_12.e(string, object2.getClass()) : fiw_12.vy(string));
        if (method == null) {
            return;
        }
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != 1) {
            throw new Exception("La m\u00e9thode prend " + classArray.length + " param\u00e8tres");
        }
        Class<?> clazz = classArray[0];
        if (clazz.isPrimitive()) {
            clazz = fhf_1.v(clazz);
        }
        if (object3 != null && clazz.isAssignableFrom(object3.getClass())) {
            arrayList.add(object3);
        } else if (object2 == null || object2 != null && clazz.isAssignableFrom(object2.getClass())) {
            arrayList.add(object2);
        } else if (clazz.equals(String.class)) {
            arrayList.add(Bw.k(object2));
        } else if (clazz.equals(Boolean.class) || clazz.equals(Boolean.TYPE)) {
            arrayList.add(Bw.l(object2));
        } else if (clazz.equals(Integer.class) || clazz.equals(Integer.TYPE)) {
            arrayList.add(Bw.m(object2));
        } else if (clazz.equals(Float.class) || clazz.equals(Float.TYPE)) {
            arrayList.add(Float.valueOf(Bw.o(object2)));
        } else if (clazz.equals(Double.class) || clazz.equals(Double.TYPE)) {
            arrayList.add(Bw.n(object2));
        } else if (clazz.equals(Long.class) || clazz.equals(Long.TYPE)) {
            arrayList.add(Bw.p(object2));
        } else if (object2.getClass().equals(String.class)) {
            arrayList.add(fic_1.gBr().b(clazz, (String)object2));
        } else {
            throw new Exception("Impossible de convertir la valeur donn\u00e9e (attendu = " + String.valueOf(clazz) + ", eu = " + String.valueOf(object2.getClass()) + ")");
        }
        try {
            method.invoke((Object)fhv_12, arrayList.toArray());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IllegalArgumentException : method=").append(method).append(", parametres=");
            for (int i = 0; i < arrayList.size(); ++i) {
                stringBuilder.append(arrayList.get(i));
                if (i == arrayList.size() - 1) break;
                stringBuilder.append(", ");
            }
            vfp.error((Object)stringBuilder);
        }
    }
}

