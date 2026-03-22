/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ftG
implements ftF {
    private static final Logger tgl = Logger.getLogger(ftG.class);
    private long tgm;
    private short ejt = 1;
    private final boolean tgn;

    public ftG(boolean bl) {
        this.tgn = bl;
    }

    @Override
    public long dlF() {
        return this.tgm;
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    public void reset() {
        this.tgm = 0L;
        this.ejt = 1;
    }

    @Override
    public mj_1 dnH() {
        return mz_1.aVX;
    }

    @Override
    public float dnI() {
        return this.dnH().a(this.ejt, this.tgm);
    }

    public float gmq() {
        return this.dnH().a(this.ejt, this.tgm);
    }

    private ftO e(short s, long l) {
        long l2 = l - this.dlF();
        short s2 = (short)(s - this.cmL());
        this.ejt = s;
        this.tgm = l;
        return new ftO(l2, s2);
    }

    private ftO uN(long l) {
        short s = this.dnH().cR(l);
        return this.e(s, l);
    }

    @Override
    public ftO jF(long l) {
        if (!this.dnH().cS(l)) {
            tgl.error((Object)("Valeur d'exp\u00e9rience non valide : " + l));
            return ftO.tgA.get();
        }
        if (l > this.gmr()) {
            tgl.error((Object)"On essaye d'ajouter plus d'xp que ce que le cap permet", (Throwable)new Exception());
            l = this.gmr();
        }
        if (this.dlF() == l) {
            return ftO.tgA.get();
        }
        return this.uN(l);
    }

    @Override
    public ftO jG(long l) {
        long l2 = this.uO(l);
        if (l2 <= 0L) {
            return ftO.tgA.get();
        }
        return this.jF(this.dlF() + l2);
    }

    private long uO(long l) {
        return Math.max(0L, Math.min(l, this.gmr() - this.dlF()));
    }

    public long gmr() {
        int n = ewo_0.oBF.i(ewr_0.oCk);
        return this.tgn && n < this.dnH().aVe() ? this.dnH().nG(n) : this.dnH().aVj();
    }

    public short gms() {
        short s = (short)ewo_0.oBF.i(ewr_0.oCk);
        return this.tgn && s < this.dnH().aVe() ? s : mz_1.aVX.aVe();
    }

    @Override
    public ftO bu(short s) {
        if (!this.dnH().M(s)) {
            tgl.error((Object)("Valeur de niveau non valide : " + s));
            return ftO.tgA.get();
        }
        if (s > this.gms()) {
            tgl.error((Object)("Valeur de niveau non valide : sup\u00e9rieure au cap ! : " + s), (Throwable)new Exception());
            s = this.gms();
        }
        if (this.cmL() == s) {
            return ftO.tgA.get();
        }
        long l = this.dnH().nG(s);
        return this.e(s, l);
    }
}

