/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class fnn {
    protected static final Logger sIF = Logger.getLogger(fnn.class);
    protected long bxw;
    protected long aDh;
    protected String sIG;
    protected long aDL;
    protected short cke;
    protected long dNY;
    protected final fnq sIH;
    protected final fnI sII;
    protected final fno sIJ;
    protected boolean jDn;

    protected fnn(long l, long l2, String string, long l3, fnq fnq2, fnI fnI2, fno fno2) {
        this.bxw = l;
        this.aDh = l2;
        this.sIG = string;
        this.aDL = l3;
        this.sIH = fnq2;
        this.sII = fnI2;
        this.sIJ = fno2;
        this.jDn = true;
    }

    public boolean eAw() {
        return this.jDn;
    }

    public void nD(boolean bl) {
        this.jDn = bl;
    }

    public long aZj() {
        return this.bxw;
    }

    public void fr(long l) {
        this.bxw = l;
    }

    public long KU() {
        return this.aDh;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public String dyT() {
        return this.sIG;
    }

    public void sQ(String string) {
        this.sIG = string;
    }

    public long Ya() {
        return this.aDL;
    }

    public void jQ(long l) {
        this.aDL = l;
    }

    public fnq gee() {
        return this.sIH;
    }

    public fnI gef() {
        return this.sII;
    }

    public fno dyU() {
        return this.sIJ;
    }

    public byte geg() {
        return 0;
    }

    public short buM() {
        return this.cke;
    }

    public void au(short s) {
        this.cke = s;
    }

    public long ccf() {
        return this.dNY;
    }

    public void ur(long l) {
        this.dNY = l;
    }

    public fnp a(fnH fnH2) {
        fnp fnp2 = this.sIJ.gd(fnH2.bcC(), fnH2.bcD());
        if (fnp2 != null && fnp2.c(fnH2)) {
            this.a(fnH2, fnp2);
            return fnp2;
        }
        return null;
    }

    public boolean a(fnH fnH2, int n, int n2) {
        fnp fnp2 = this.sIJ.gd(n, n2);
        return fnp2 != null && fnp2.b(fnH2, n, n2);
    }

    public boolean b(fnH fnH2) {
        fnp fnp2 = this.sIJ.gd(fnH2.bcC(), fnH2.bcD());
        if (fnp2 != null && fnp2.d(fnH2)) {
            this.b(fnH2, fnp2);
            return true;
        }
        return false;
    }

    public boolean c(tl_1 tl_12) {
        tl_12.abc = this.cke;
        tl_12.abd = this.dNY;
        for (fnp fnp2 : this.sIJ) {
            tn_1 tn_12 = new tn_1();
            fnp2.a(tn_12.abD, true);
            tl_12.abs.add(tn_12);
        }
        return true;
    }

    public boolean a(tg_1 tg_12, boolean bl) {
        tg_12.clear();
        tg_12.aba = this.bxw;
        tg_12.Ut = this.aDh;
        tg_12.abb = this.sIG;
        tg_12.TL = this.aDL;
        tg_12.abc = this.cke;
        tg_12.abd = this.dNY;
        for (fnp fnp2 : this.sIJ) {
            ti_2 ti_22 = new ti_2();
            if (!fnp2.a(ti_22.abn, false)) {
                sIF.error((Object)("Erreur durant la s\u00e9rialisation de la salle " + fnp2.gek() + " du sac " + String.valueOf(this)));
                return false;
            }
            tg_12.abe.add(ti_22);
        }
        return true;
    }

    public boolean d(tl_1 tl_12) {
        fnp fnp2;
        this.cke = tl_12.abc;
        this.dNY = tl_12.abd;
        this.sIJ.clear();
        if (tl_12.abs.isEmpty()) {
            sIF.error((Object)("Pas de pi\u00e8ce ... probl\u00e8me de d\u00e9-serialisation du sac " + String.valueOf(this)));
        }
        for (tn_1 tn_12 : tl_12.abs) {
            try {
                fnp2 = this.sIH.dzx();
                this.sIJ.a(tn_12.abD.aka, fnp2);
                if (fnp2.b(tn_12.abD, false)) continue;
                sIF.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(this)));
            }
            catch (Exception exception) {
                sIF.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(tn_12)), (Throwable)exception);
            }
        }
        try {
            this.sIJ.a(this.sIH);
        }
        catch (Exception exception) {
            sIF.error((Object)("Erreur durant l'update des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(this)), (Throwable)exception);
        }
        for (tn_1 tn_12 : tl_12.abs) {
            try {
                fnp2 = this.sIJ.gZ(tn_12.abD.aka);
                if (fnp2.b(tn_12.abD, true)) continue;
                sIF.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(this)));
            }
            catch (Exception exception) {
                sIF.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(tn_12)), (Throwable)exception);
            }
        }
        return true;
    }

    public boolean b(tg_1 tg_12) {
        fnp fnp2;
        this.bxw = tg_12.aba;
        this.aDh = tg_12.Ut;
        this.sIG = tg_12.abb;
        this.aDL = tg_12.TL;
        this.cke = tg_12.abc;
        this.dNY = tg_12.abd;
        this.sIJ.clear();
        for (ti_2 ti_22 : tg_12.abe) {
            fnp2 = this.sIH.dzx();
            this.sIJ.a(ti_22.abn.aka, fnp2);
            if (fnp2.b(ti_22.abn, false)) continue;
            sIF.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(this)));
            return false;
        }
        this.sIJ.a(this.sIH);
        for (ti_2 ti_22 : tg_12.abe) {
            fnp2 = this.sIJ.gZ(ti_22.abn.aka);
            if (fnp2.b(ti_22.abn, true)) continue;
            sIF.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + String.valueOf(this)));
            return false;
        }
        return true;
    }

    protected void a(fnH fnH2, fnp fnp2) {
    }

    protected void b(fnH fnH2, fnp fnp2) {
    }

    public abstract void b(wy_0 var1);
}

