/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.util.List;

/*
 * Renamed from aDV
 */
public final class adv_1 {
    private adv_1() {
    }

    public static <T> long a(List<T> list, Function<T, Long> function) {
        long l = 0L;
        for (T t : list) {
            Long l2 = (Long)function.apply(t);
            if (l2 == null) continue;
            l += l2.longValue();
        }
        return l;
    }

    public static <T> int b(List<T> list, Function<T, Integer> function) {
        int n = 0;
        for (T t : list) {
            Integer n2 = (Integer)function.apply(t);
            if (n2 == null) continue;
            n += n2.intValue();
        }
        return n;
    }
}

