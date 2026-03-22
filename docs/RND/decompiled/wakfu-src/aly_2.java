/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from alY
 */
public abstract class aly_2 {
    public static final int cGo = 200;
    private long cGp = 200L;
    private long cGq;
    private alz_2 cGr;

    public alz_2 bCi() {
        return this.e(false, false);
    }

    public alz_2 cB(boolean bl) {
        return this.e(bl, false);
    }

    public alz_2 e(boolean bl, boolean bl2) {
        return this.a(bl, bl2, false);
    }

    public alz_2 a(boolean bl, boolean bl2, boolean bl3) {
        if (this.cGr == null) {
            this.cGr = this.bCk();
        }
        if (bl || this.cGq != 0L && System.currentTimeMillis() - this.cGq > this.cGp) {
            this.a(this.cGr, bl2, bl3);
        }
        if (this.cGq == 0L) {
            this.cGq = System.currentTimeMillis();
        }
        return this.cGr;
    }

    public void bCj() {
        this.cGq = 0L;
        if (this.cGr != null) {
            this.cGr.bCj();
            this.cGr.eY("");
            this.cGr.eZ("");
            this.a(this.cGr);
        }
    }

    public void gi(long l) {
        this.cGp = l;
    }

    protected abstract alz_2 bCk();

    protected abstract void a(alz_2 var1, boolean var2, boolean var3);

    protected abstract void a(alz_2 var1);

    public long bCl() {
        return this.cGq;
    }
}

