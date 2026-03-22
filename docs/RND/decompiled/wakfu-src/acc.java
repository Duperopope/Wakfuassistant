/*
 * Decompiled with CFR 0.152.
 */
public class acc
extends acb {
    private static final float cfF = 0.0f;
    private int cfG;

    public acc(int n, int n2, int n3, int n4) {
        super(n2, n3, n4);
        this.cfG = n;
    }

    @Override
    public boolean rl(int n) {
        if (this.cfG > 0) {
            this.cfG -= n;
            return true;
        }
        return super.rl(n);
    }

    @Override
    public float bnY() {
        if (this.cfG > 0) {
            return 0.0f;
        }
        return super.bnY();
    }

    @Override
    public String toString() {
        return "WaitTimedStrength{m_wait=" + this.cfG + "}";
    }
}

