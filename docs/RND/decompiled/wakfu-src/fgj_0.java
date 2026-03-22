/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fgJ
 */
public class fgj_0 {
    protected static final Logger skg = Logger.getLogger(fgj_0.class);
    private long meu;
    private fgK skh;

    public void a(fgK fgK2) {
        this.skh = fgK2;
        if (this.skh != null) {
            this.skh.a(this, 0L);
        }
    }

    public long exS() {
        return this.meu;
    }

    private void tq(long l) {
        if (this.skh != null) {
            this.skh.a(this, l);
        }
    }

    public boolean tr(long l) {
        long l2 = this.meu + l;
        return l2 >= 0L;
    }

    public boolean ts(long l) {
        if (l < 0L) {
            return false;
        }
        long l2 = l - this.meu;
        this.meu = l;
        this.tq(l2);
        return true;
    }

    public boolean pK(long l) {
        if (l <= 0L) {
            return false;
        }
        return this.ts(this.meu + l);
    }

    public boolean tt(long l) {
        if (l < 0L) {
            return false;
        }
        return this.ts(Math.max(0L, this.meu - l));
    }
}

