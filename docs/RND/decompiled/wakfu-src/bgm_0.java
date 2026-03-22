/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgM
 */
public class bgm_0
extends bgu {
    private final exf_2 idu;

    public bgm_0(double d2, exf_2 exf_22) {
        super(d2);
        this.idu = exf_22;
    }

    @Override
    protected int getValue() {
        return this.idu.aYB();
    }

    @Override
    protected void CD(int n) {
        super.CD(n);
        this.idu.nt(n);
    }

    @Override
    protected void CC(int n) {
        super.CD(n - this.idu.aYB());
        this.idu.op(n);
    }
}

