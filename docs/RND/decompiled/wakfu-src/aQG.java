/*
 * Decompiled with CFR 0.152.
 */
public class aQG
extends aRY {
    private final byte eGt;
    private final long eGu;

    public aQG(byte by, long l) {
        this.eGt = by;
        this.eGu = l;
    }

    @Override
    public boolean isValid() {
        return switch (this.eGt) {
            case 1, 2 -> {
                if (this.eGu > 0L) {
                    yield true;
                }
                yield false;
            }
            case 3 -> true;
            default -> false;
        };
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)1);
        ns_02.Q((short)470);
        ns_02.D(this.eGt);
        ns_02.cX(this.eGu);
        ayf_22.d(ns_02);
    }
}

