/*
 * Decompiled with CFR 0.152.
 */
public class dgm
extends dgv {
    private final String okp;
    private final int okq;
    private final String okr;

    public dgm(dgx dgx2, String string, int n, String string2, int n2) {
        super(dgx2, null, 0, n2);
        this.okp = string;
        this.okq = n;
        this.okr = string2;
    }

    public String fcQ() {
        return this.okp;
    }

    public int fcR() {
        return this.okq;
    }

    public String getAnimName() {
        return this.okr;
    }
}

