/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public final class e
extends Enum<e>
implements d<e> {
    public static final /* enum */ e s = new e(1);
    public static final /* enum */ e t = new e(2);
    public static final /* enum */ e u = new e(3);
    public static final /* enum */ e v = new e(4);
    public static final /* enum */ e w = new e(5);
    private final int x;
    @SerializedName(value="name")
    private final String y;
    private static final /* synthetic */ e[] z;

    public static e[] values() {
        return (e[])z.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private e(int n2) {
        this.x = n2;
        this.y = this.name();
    }

    public int d() {
        return this.x;
    }

    @Override
    public b a(b b2, e e2) {
        b2.a(e2);
        return b2;
    }

    @Override
    public b b(b b2, e e2) {
        b2.b(e2);
        return b2;
    }

    @Override
    public /* synthetic */ b a(b b2, d d2) {
        return this.b(b2, (e)d2);
    }

    @Override
    public /* synthetic */ b b(b b2, d d2) {
        return this.a(b2, (e)d2);
    }

    private static /* synthetic */ e[] g() {
        return new e[]{s, t, u, v, w};
    }

    static {
        z = e.g();
    }
}

