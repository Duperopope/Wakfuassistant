/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNz
 */
public class enz_0
extends aox_1 {
    public enz_0(aow_1 ... aow_1Array) {
        super(aow_1Array);
    }

    @Override
    public final boolean oQ(int n) {
        if (n > 0) {
            return n % 2 == 0 && this.tn(n / 2);
        }
        return this.tn(n);
    }
}

