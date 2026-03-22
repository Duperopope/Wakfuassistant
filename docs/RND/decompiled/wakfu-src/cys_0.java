/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cyS
 */
public class cys_0
extends nr_0 {
    private byte mmN;

    @Override
    public boolean dn(byte[] byArray) {
        this.mmN = byArray[0];
        return true;
    }

    @Override
    public int d() {
        return 22147;
    }

    public boolean eFK() {
        return this.mmN == 0;
    }

    public byte eFL() {
        return this.mmN;
    }
}

