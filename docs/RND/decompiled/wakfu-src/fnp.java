/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class fnp {
    protected static final Logger sIM = Logger.getLogger(fnp.class);
    public static final byte sIN = 6;
    public static final byte sIO = 6;
    protected byte sIP;
    protected short cox;
    protected short coy;
    protected final List<fnH> sIQ = new ArrayList<fnH>();
    protected fno sIR;

    public final fno gej() {
        return this.sIR;
    }

    public final void a(fno fno2) {
        this.sIR = fno2;
    }

    public final void hc(byte by) {
        this.sIP = by;
    }

    public final byte gek() {
        return this.sIP;
    }

    public boolean ge(int n, int n2) {
        if (n < this.cox || n >= this.cox + 6) {
            return false;
        }
        return n2 >= this.coy && n2 < this.coy + 6;
    }

    public final short gel() {
        return this.cox;
    }

    public final void fp(short s) {
        this.cox = s;
    }

    public final short gem() {
        return this.coy;
    }

    public final void fq(short s) {
        this.coy = s;
    }

    public final boolean a(xz_1 xz_12, boolean bl) {
        xz_12.clear();
        xz_12.aka = this.sIP;
        if (bl) {
            for (fnH fnH2 : this.sIQ) {
                try {
                    xa_2 xa_22 = new xa_2();
                    fnH2.a(xa_22.akd);
                    xz_12.akb.add(xa_22);
                }
                catch (Exception exception) {
                    sIM.error((Object)("Erreur lors de la serialisation d'un room content ie=" + String.valueOf(fnH2)), (Throwable)exception);
                }
            }
        }
        xz_12.akc = this.gep();
        return true;
    }

    public final boolean b(xz_1 xz_12, boolean bl) {
        this.sIP = xz_12.aka;
        if (!bl) {
            this.a(xz_12.akc);
            return true;
        }
        fnn fnn2 = this.sIR.geh();
        for (xa_2 xa_22 : xz_12.akb) {
            try {
                fnH fnH2 = fnn2.gef().a(fnn2, xa_22.akd);
                if (fnH2 == null) continue;
                fnn2.a(fnH2);
            }
            catch (Exception exception) {
                sIM.error((Object)("Erreur durant la r\u00e9cup\u00e9ration du roomContent " + String.valueOf(xa_22) + " d'une pi\u00e8ce du sac " + String.valueOf(xz_12)), (Throwable)exception);
            }
        }
        return true;
    }

    public boolean b(fnH fnH2, int n, int n2) {
        if (n < this.cox) {
            return false;
        }
        if (n >= this.cox + 6) {
            return false;
        }
        if (n2 < this.coy) {
            return false;
        }
        if (n2 >= this.coy + 6) {
            return false;
        }
        return this.gf(n, n2) == null;
    }

    protected final boolean c(fnH fnH2) {
        if (this.b(fnH2, fnH2.bcC(), fnH2.bcD())) {
            this.sIQ.add(fnH2);
            return true;
        }
        return false;
    }

    protected final boolean d(fnH fnH2) {
        return this.sIQ.remove(fnH2);
    }

    public final fnH j(byte by, byte by2) {
        int n = this.cox + by;
        int n2 = this.coy + by2;
        return this.gf(n, n2);
    }

    public List<fnH> gen() {
        return this.sIQ;
    }

    public fnH gf(int n, int n2) {
        int n3 = this.sIQ.size();
        for (int i = 0; i < n3; ++i) {
            fnH fnH2 = this.sIQ.get(i);
            if (fnH2.bcC() != n || fnH2.bcD() != n2) continue;
            return fnH2;
        }
        return null;
    }

    public final ArrayList<fnH> F(int n, int n2, int n3, int n4) {
        ArrayList<fnH> arrayList = new ArrayList<fnH>();
        int n5 = this.cox + n;
        int n6 = this.coy + n2;
        int n7 = n5 + n3;
        int n8 = n6 + n4;
        int n9 = this.sIQ.size();
        for (int i = 0; i < n9; ++i) {
            fnH fnH2 = this.sIQ.get(i);
            int n10 = fnH2.bcC();
            int n11 = fnH2.bcD();
            if (n10 < n5 || n10 >= n7 || n11 < n6 || n11 >= n8) continue;
            arrayList.add(fnH2);
        }
        return arrayList;
    }

    public final ArrayList<fnH> a(fnJ fnJ2) {
        ArrayList<fnH> arrayList = new ArrayList<fnH>();
        int n = this.sIQ.size();
        for (int i = 0; i < n; ++i) {
            fnH fnH2 = this.sIQ.get(i);
            if (fnH2.dOh() != fnJ2) continue;
            arrayList.add(fnH2);
        }
        return arrayList;
    }

    public boolean e(fnH fnH2) {
        return this.sIQ.contains(fnH2);
    }

    public final boolean geo() {
        return this.sIQ.isEmpty();
    }

    public String toString() {
        return "Room : x=" + this.cox + ", y=" + this.coy;
    }

    protected abstract yl_2 gep();

    protected abstract void a(yl_2 var1);
}

