/*
 * Decompiled with CFR 0.152.
 */
public class bRl
extends bRo {
    public bRl(byte by) {
        super(by);
    }

    @Override
    public boolean f(fsn_1 fsn_12) {
        if (!(fsn_12.getValue() instanceof adq)) {
            return super.f(fsn_12);
        }
        adq adq2 = (adq)fsn_12.getValue();
        if (adq2.aXy == 47) {
            return true;
        }
        return super.f(fsn_12);
    }
}

