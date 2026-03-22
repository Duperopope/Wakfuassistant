/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 */
import com.google.common.base.Preconditions;
import java.io.EOFException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Renamed from Dv
 */
public final class dv_1 {
    private static final String axX = "#optimized";

    private dv_1() {
    }

    public static void a(en_1 en_12, byte n, do_0 do_02) {
        Serializable serializable;
        Object object;
        if (n == 0) {
            return;
        }
        String[] stringArray = new String[n];
        try {
            String string = do_02.aIC();
            if (string.equals(axX)) {
                int n2 = (n - 1) / 2;
                String[] stringArray2 = new String[n2];
                for (int i = 0; i < n2; ++i) {
                    stringArray2[i] = do_02.aIC();
                }
                en_12.g(stringArray2);
                en_12.df(do_02.mv(n2));
                return;
            }
            stringArray[0] = string;
            for (int i = 1; i < n; ++i) {
                stringArray[i] = do_02.aIC();
            }
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + String.valueOf((Object)en_12.aJd()), eOFException);
        }
        int n3 = 0;
        AtomicLong atomicLong = new AtomicLong();
        AtomicLong atomicLong2 = new AtomicLong();
        HashMap<Object, Serializable> hashMap = new HashMap<Object, Serializable>();
        while (n3 < stringArray.length) {
            object = stringArray[n3++];
            if (n3 >= stringArray.length) {
                hashMap.put(object, null);
                atomicLong2.incrementAndGet();
                continue;
            }
            try {
                serializable = Byte.valueOf(Byte.parseByte(stringArray[n3].trim()));
                hashMap.put(object, serializable);
                atomicLong.addAndGet(((Byte)serializable).byteValue());
                ++n3;
            }
            catch (NumberFormatException numberFormatException) {
                hashMap.put(object, null);
                atomicLong2.incrementAndGet();
            }
        }
        object = new ArrayList();
        serializable = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            String string = (String)entry.getKey();
            Byte by = (Byte)entry.getValue();
            ((ArrayList)object).add(string);
            if (by != null) {
                ((ArrayList)serializable).add(by);
                continue;
            }
            byte by2 = (byte)Math.round((100.0f - atomicLong.floatValue()) / (float)atomicLong2.getAndDecrement());
            atomicLong.addAndGet(by2);
            ((ArrayList)serializable).add(by2);
        }
        Preconditions.checkState((atomicLong.get() <= 100L ? 1 : 0) != 0, (Object)"GoToRandomAnimation : Total percentage is greater than 100");
        en_12.g(((ArrayList)object).toArray(new String[((ArrayList)object).size()]));
        en_12.df(Bn.a(((ArrayList)serializable).toArray(new Byte[((ArrayList)serializable).size()])));
    }
}

