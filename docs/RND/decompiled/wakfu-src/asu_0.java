/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSu
 */
public final class asu_0
extends aRY {
    public static final byte eOC = 0;
    public static final byte eOD = 1;
    public static final byte eOE = 2;
    private final byte eOF;
    private short eOG;
    private boolean aJj;

    public asu_0() {
        this.eOF = 0;
    }

    public asu_0(boolean bl) {
        this.eOF = 1;
        this.aJj = bl;
    }

    public asu_0(short s) {
        this.eOF = (byte)2;
        this.eOG = s;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)1);
        ns_02.Q((short)392);
        ns_02.D(this.eOF);
        if (this.eOF == 2) {
            ns_02.R(this.eOG);
        } else if (this.eOF == 1) {
            ns_02.aN(this.aJj);
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ayf_22.d(ns_02);
    }
}

