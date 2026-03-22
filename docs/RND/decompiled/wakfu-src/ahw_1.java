/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

/*
 * Renamed from aHw
 */
public class ahw_1 {
    private static final Hashtable<String, ahv_1> dQS = new Hashtable();

    public static void a(String string, byte by) {
        for (ahv_1 ahv_12 : dQS.values()) {
            ahv_12.a(new azx_1<Byte, String>(by, string));
        }
    }

    public static void t(Class clazz) {
        dQS.remove(clazz.getName());
    }

    public static ahv_1 a(Class clazz, ahv_1 ahv_12) {
        String string = clazz.getName();
        if (dQS.containsKey(string)) {
            return dQS.get(string);
        }
        return dQS.put(string, ahv_12);
    }
}

