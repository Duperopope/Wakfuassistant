/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ftC {
    protected static final Logger tgi = Logger.getLogger(ftC.class);
    private short ejt;
    private long aZl;
    private final mj_1 tgj;

    public ftC(mj_1 mj_12) {
        this.tgj = mj_12;
    }

    public mj_1 dnH() {
        return this.tgj;
    }

    public long pf() {
        return this.aZl;
    }

    public short cmL() {
        return this.ejt;
    }

    public String gmp() {
        return String.valueOf(this.dnH().cT(this.aZl)) + "/" + this.dnH().N(this.ejt);
    }

    public float dnI() {
        return this.dnH().a(this.ejt, this.aZl);
    }

    public ftO d(short s, long l) {
        if (!this.dnH().M(s) || !this.dnH().cS(l)) {
            return ftO.tgA.get();
        }
        return this.e(s, l);
    }

    public ftO c(short s, boolean bl) {
        if (!this.dnH().M(s)) {
            throw new IllegalArgumentException("Valeur de niveau non valide : " + s);
        }
        if (this.ejt == s) {
            return ftO.tgA.get();
        }
        return this.e(s, bl ? this.dnH().nG(s) : this.aZl);
    }

    public ftO x(long l, boolean bl) {
        if (!this.dnH().cS(l)) {
            throw new IllegalArgumentException("Valeur d'exp\u00e9rience non valide : " + l);
        }
        if (this.aZl == l) {
            return ftO.tgA.get();
        }
        return this.e(bl ? this.dnH().cR(l) : this.ejt, l);
    }

    public ftO jG(long l) {
        if (l < 0L) {
            tgi.error((Object)("Impossible d'ajouter une exp\u00e9rience n\u00e9gative (" + l + "). Il faut plut\u00f4t utiliser Levelable.removeXp"));
            return ftO.tgA.get();
        }
        if (l == 0L) {
            return ftO.tgA.get();
        }
        long l2 = Math.min(this.aZl + l, this.dnH().aVj());
        if (l2 == this.aZl) {
            return ftO.tgA.get();
        }
        short s = this.dnH().cR(l2);
        return this.e(s, l2);
    }

    private ftO e(short s, long l) {
        short s2 = (short)(s - this.ejt);
        long l2 = l - this.aZl;
        this.ejt = s;
        this.aZl = l;
        return new ftO(l2, s2);
    }

    public void clear() {
        this.aZl = 0L;
        this.ejt = 0;
    }
}

