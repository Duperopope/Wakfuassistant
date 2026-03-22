/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Field;
import org.apache.log4j.Logger;

public final class euM {
    private static final Logger orG = Logger.getLogger(euM.class);

    private euM() {
    }

    public static void a(aio_0 aio_02) {
        for (Field field : aio_02.getClass().getDeclaredFields()) {
            String string;
            String string2;
            euL euL2 = field.getAnnotation(euL.class);
            if (euL2 == null || (string2 = System.getenv(string = euL2.fdo())) == null) continue;
            try {
                field.set(aio_02, string2);
            }
            catch (IllegalAccessException illegalAccessException) {
                field.setAccessible(true);
                try {
                    field.set(aio_02, string2);
                }
                catch (IllegalAccessException illegalAccessException2) {
                    orG.error((Object)("Unable to set option value for option : " + string + ", value : " + string2), (Throwable)illegalAccessException);
                }
            }
        }
    }
}

