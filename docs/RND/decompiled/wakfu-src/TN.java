/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class TN
implements Comparable<TN> {
    private final int btZ;
    private final short bua;
    private final boolean bub;
    private static final TN buc = new TN(0, -1, false);

    public TN(int n, short s, boolean bl) {
        this.bub = bl;
        this.btZ = n;
        this.bua = s;
    }

    public static TN biB() {
        return buc;
    }

    public int a(@NotNull TN tN) {
        if (this == tN) {
            return 0;
        }
        if (tN == null) {
            return -1;
        }
        int n = Integer.signum(this.bua - tN.bua);
        if (n != 0) {
            return n;
        }
        int n2 = Integer.signum(this.btZ - tN.btZ);
        if (n2 != 0) {
            return n2;
        }
        return (this.bub ? 1 : 0) - (tN.bub ? 1 : 0);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((TN)object);
    }
}

