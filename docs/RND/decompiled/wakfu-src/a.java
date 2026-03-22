/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.util.HashMap;

public final class a
extends Enum<a> {
    public static final /* enum */ a a = new a(46524821076L, (MessageLite)zT.aAX());
    public static final /* enum */ a b = new a(46536437334L, (MessageLite)Aj.aCp());
    public static final /* enum */ a c = new a(46536437504L, (MessageLite)An.aCE());
    public static final /* enum */ a d = new a(46524822865L, (MessageLite)Ax.aDx());
    public static final /* enum */ a e = new a(46536440133L, (MessageLite)ab_0.aDP());
    public static final /* enum */ a f = new a(47061870155L, (MessageLite)ar_0.aCZ());
    public static final /* enum */ a g = new a(47073487423L, (MessageLite)Af.aCd());
    private final long h;
    private final MessageLite i;
    private static final /* synthetic */ a[] j;

    public static a[] values() {
        return (a[])j.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(long l, MessageLite messageLite) {
        this.h = l;
        this.i = messageLite;
    }

    public static HashMap<Long, MessageLite> a() {
        a[] aArray;
        HashMap<Long, MessageLite> hashMap = new HashMap<Long, MessageLite>();
        for (a a2 : aArray = a.values()) {
            hashMap.put(a2.h, a2.i);
        }
        return hashMap;
    }

    private static /* synthetic */ a[] b() {
        return new a[]{a, b, c, d, e, f, g};
    }

    static {
        j = a.b();
    }
}

