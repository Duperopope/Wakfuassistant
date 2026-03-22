/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zz
 */
public class zz_1
extends YZ<yi_0> {
    public static final int bUF = 10;

    private static zb_0[] bpe() {
        zb_0[] zb_0Array = new zb_0[11];
        zb_0Array[0] = new zd_0("Time");
        for (int i = 0; i < 10; ++i) {
            zb_0Array[i + 1] = new zd_0("i" + i);
        }
        return zb_0Array;
    }

    public zz_1(int n) {
        super(n, zz_1.bpe());
    }

    public final yi_0 bpf() {
        return new yi_0(this);
    }

    public final int dO(String string) {
        return Integer.parseInt(string);
    }

    @Override
    public /* synthetic */ Yb boA() {
        return this.bpf();
    }
}

