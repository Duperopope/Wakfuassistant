/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from aAu
 */
public class aau_2 {
    private static final Logger dwz = Logger.getLogger(aau_2.class);
    private static boolean aBi = false;
    private static final HashMap<Class, HashMap<Object, StackTraceElement[]>> dwA = new HashMap();

    public static void bX(boolean bl) {
        aBi = bl;
        if (bl) {
            dwA.clear();
        }
    }

    public static void M(Object object) {
        if (!aBi) {
            return;
        }
        HashMap<Object, Object> hashMap = dwA.get(object.getClass());
        if (hashMap == null) {
            hashMap = new HashMap();
            dwA.put(object.getClass(), hashMap);
        }
        hashMap.put(object, new Exception().getStackTrace());
    }

    public static void Z(Object object) {
        if (dwA.isEmpty()) {
            return;
        }
        HashMap<Object, StackTraceElement[]> hashMap = dwA.get(object.getClass());
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        hashMap.remove(object);
    }

    public static HashMap<Class, HashMap<Object, StackTraceElement[]>> bTX() {
        HashMap<Class, HashMap<Object, StackTraceElement[]>> hashMap = new HashMap<Class, HashMap<Object, StackTraceElement[]>>();
        for (Map.Entry<Class, HashMap<Object, StackTraceElement[]>> entry : dwA.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}

