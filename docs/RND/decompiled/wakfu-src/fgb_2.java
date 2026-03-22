/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGB
 */
public abstract class fgb_2
extends fgu_1 {
    private fgc_2 uue = fgc_2.uug;
    protected fgk_2 uuf;
    private int lGl = 0;
    private int qNQ = 0;
    protected fzY utm = null;

    public abstract int aPs();

    public fgc_2 gyV() {
        return this.uue;
    }

    protected void a(fgc_2 fgc_22) {
        this.uue = fgc_22;
    }

    public fgk_2 gyW() {
        return this.uuf;
    }

    public void a(fgk_2 fgk_22) {
        this.uuf = fgk_22;
    }

    public int In() {
        return this.lGl;
    }

    public void Lq(int n) {
        this.lGl = n;
    }

    public int fAI() {
        return this.qNQ;
    }

    public void abr(int n) {
        this.qNQ = n;
    }

    public fzY getAlignment() {
        if (this.utm == null && this.uuf != null) {
            return this.uuf.getAlignment();
        }
        return this.utm;
    }

    public void setAlignment(fzY fzY2) {
        this.utm = fzY2;
    }

    public abstract int a(awx_1 var1, int var2);

    public abstract int b(awx_1 var1, int var2);

    public abstract int c(awx_1 var1, int var2);
}

