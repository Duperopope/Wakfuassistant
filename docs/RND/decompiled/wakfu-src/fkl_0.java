/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fkl
 */
public abstract class fkl_0 {
    public static final fkl_0 sAW = new fkm_0();
    private final aab_2<fko_0> sAX = new aab_2<fko_0>(new fkn_0());

    public final boolean a(fko_0 fko_02) {
        return !this.sAX.contains(fko_02) && this.sAX.aa(fko_02);
    }

    public final void b(fko_0 fko_02) {
        this.sAX.ab(fko_02);
    }

    public void gcg() {
        this.sAX.bUe();
    }

    public abstract void g(ByteBuffer var1, int var2);

    public abstract void as(ByteBuffer var1);

    public abstract int DN();
}

