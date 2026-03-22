/*
 * Decompiled with CFR 0.152.
 */
public class aTB
extends aRY {
    private final byte eSb;
    private final long eSc;

    public aTB(byte by) {
        this(by, -1L);
    }

    public aTB(byte by, long l) {
        this.eSb = by;
        this.eSc = l;
    }

    @Override
    public boolean isValid() {
        return this.eSb == 2 || (this.eSb == 0 || this.eSb == 1) && this.eSc > 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("You must be connected to use this command");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.cX(this.eSc);
        ns_02.D(this.eSb);
        ns_02.Q((short)349);
        ns_02.C((byte)2);
        ayf_22.d(ns_02);
    }
}

