/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public final class c
extends Enum<c>
implements d<c> {
    public static final /* enum */ c l = new c(0, new e[0]);
    public static final /* enum */ c m = new c(1, e.values());
    public static final /* enum */ c n = new c(2, new b(m).b(new d[]{e.u, e.w}));
    private final int o;
    @SerializedName(value="name")
    private final String p;
    private final e[] q;
    private static final /* synthetic */ c[] r;

    public static c[] values() {
        return (c[])r.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(int n2, e ... eArray) {
        this.o = n2;
        this.p = this.name();
        this.q = eArray;
    }

    private c(int n2, b b2) {
        this.o = n2;
        this.p = this.name();
        Object[] objectArray = b2.c().toArray();
        this.q = (e[])Arrays.copyOf(objectArray, objectArray.length, e[].class);
    }

    public int d() {
        return this.o;
    }

    public e[] e() {
        return this.q;
    }

    @Override
    public b a(b b2, c c2) {
        b2.a(c2.q);
        return b2;
    }

    @Override
    public b b(b b2, c c2) {
        b2.b(c2.q);
        return b2;
    }

    @Override
    public /* synthetic */ b a(b b2, d d2) {
        return this.b(b2, (c)d2);
    }

    @Override
    public /* synthetic */ b b(b b2, d d2) {
        return this.a(b2, (c)d2);
    }

    private static /* synthetic */ c[] f() {
        return new c[]{l, m, n};
    }

    static {
        r = c.f();
    }
}

