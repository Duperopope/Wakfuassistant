/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zm
 */
public class zm_0
extends YX {
    public zm_0(int n) {
        super(n, new zb_0[]{new zd_0("r"), new zd_0("g"), new zd_0("b")});
    }

    @Override
    public za_0 boL() {
        return new zn_0(this);
    }

    @Override
    public void a(Yh[] yhArray) {
        for (int i = 0; i < yhArray.length; ++i) {
            yhArray[i].bL(1.0f);
        }
    }
}

