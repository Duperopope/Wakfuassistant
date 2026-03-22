/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bNo
 */
public abstract class bno_0<T extends fan>
implements aeh_2,
Comparable<bno_0> {
    protected static final int kBW = 0;
    protected static final int kBX = 1;
    public static final String kBY = "type";
    public static final String kBZ = "memberName";
    public static final String kCa = "date";
    private static final String[] kCb = new String[0];
    protected final T kCc;

    public bno_0(T t) {
        this.kCc = t;
    }

    @Override
    public String[] bxk() {
        return kCb;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kBZ)) {
            return ((fan)this.kCc).fQX();
        }
        if (string.equals(kCa)) {
            uw_0 uw_02 = uw_0.fn(((fan)this.kCc).aay());
            return aum_0.cWf().v(uw_02);
        }
        if (string.equals(kBY)) {
            return this.aeV();
        }
        return null;
    }

    protected abstract int aeV();

    public int a(@NotNull bno_0 bno_02) {
        return GC.cw(((fan)bno_02.kCc).aay() - ((fan)this.kCc).aay());
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bno_0)object);
    }
}

