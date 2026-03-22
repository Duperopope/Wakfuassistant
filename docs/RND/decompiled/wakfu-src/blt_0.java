/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blt
 */
public class blt_0
extends bli_1 {
    private final long iuB;

    public blt_0(eJS eJS2) {
        super(eJS2.getName(), eJS2.aWP());
        this.iuB = eJS2.Sn();
    }

    @Override
    public long Sn() {
        return -this.iuB;
    }

    @Override
    public bli_1 dtG() {
        eJS eJS2 = eJN.qAF.pR(this.iuB);
        blt_0 blt_02 = new blt_0(eJS2);
        return blt_02;
    }
}

