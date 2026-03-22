/*
 * Decompiled with CFR 0.152.
 */
public class acb
extends aca {
    public static final float cfA = 0.0f;
    public static final float cfB = 1.0f;
    private final int cfC;
    private final int cfD;
    private final int cfE;
    private int bUi;

    public acb(int n, int n2, int n3) {
        super(1.0f);
        this.cfC = n;
        this.cfD = n2;
        this.cfE = n3;
    }

    @Override
    public boolean rl(int n) {
        this.bUi += n;
        int n2 = this.cfC + this.cfD + this.cfE;
        if (this.bUi > n2) {
            return false;
        }
        return super.rl(n);
    }

    @Override
    public float bnY() {
        float f2 = GC.b(this.btp(), 0.0f, 1.0f);
        return super.bnY() * f2;
    }

    private float btp() {
        float f2 = this.bUi;
        if (f2 < (float)this.cfC) {
            return f2 / (float)this.cfC;
        }
        if ((f2 -= (float)this.cfC) < (float)this.cfD) {
            return 1.0f;
        }
        if ((f2 -= (float)this.cfD) < (float)this.cfE) {
            return 1.0f - f2 / (float)this.cfE;
        }
        return 0.0f;
    }

    @Override
    public String toString() {
        return "TimedStrength{m_startDuration=" + this.cfC + ", m_middleDuration=" + this.cfD + ", m_endDuration=" + this.cfE + ", m_elapsedTime=" + this.bUi + "}";
    }
}

