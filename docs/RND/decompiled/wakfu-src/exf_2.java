/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eXf
 */
public class exf_2
extends pr_0 {
    protected static final Logger rFu = Logger.getLogger(exf_2.class);
    private final exx_2 rFv;
    private List<exn_1> rFw;
    private boolean rFx;
    public static final byte rFy = 12;
    protected int brS;
    protected int brV;
    protected int brU;
    protected int rmJ;
    protected int rmK;
    protected int rFz;

    public exf_2(exx_2 exx_22, int n, int n2) {
        this.rFv = exx_22;
        this.fF(n, n2);
    }

    public exx_2 dqy() {
        return this.rFv;
    }

    public void a(exn_1 exn_12) {
        if (exn_12 == null) {
            return;
        }
        if (this.rFw == null) {
            this.rFw = new ArrayList<exn_1>();
            this.rFw.add(exn_12);
        } else if (!this.rFw.contains(exn_12)) {
            this.rFw.add(exn_12);
        }
    }

    public boolean b(exn_1 exn_12) {
        if (this.rFw == null) {
            return false;
        }
        return this.rFw.remove(exn_12);
    }

    public boolean c(exn_1 exn_12) {
        if (this.rFw == null) {
            return false;
        }
        return this.rFw.contains(exn_12);
    }

    private void a(exg_1 exg_12, int n) {
        if (this.rFw != null && !this.rFw.isEmpty()) {
            for (exn_1 exn_12 : this.rFw) {
                try {
                    exn_12.b(exg_12, n);
                }
                catch (Exception exception) {
                    rFu.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public int aYC() {
        return this.brS;
    }

    @Override
    public int aYB() {
        if (this.brS > this.aYD()) {
            return this.aYD();
        }
        if (this.brS < this.aYF()) {
            return this.aYF();
        }
        return this.brS;
    }

    public int fOy() {
        return this.brV;
    }

    public int fOz() {
        return this.brU;
    }

    @Override
    public int aYD() {
        int n = this.brV + this.brV * this.rFz / 100;
        return GC.a(n, this.rmK, this.rmJ);
    }

    @Override
    public int aYE() {
        return this.brV;
    }

    @Override
    public int aYF() {
        return GC.a(this.brU, this.rmK, this.rmJ);
    }

    @Override
    public int oo(int n) {
        int n2 = this.rFz;
        this.rFz += n;
        this.aYT();
        return this.rFz - n2;
    }

    public void Tf(int n) {
        this.rFz = n;
    }

    @Override
    public int aYG() {
        return this.rFz;
    }

    public int aYX() {
        return this.rmK;
    }

    public int aYY() {
        return this.rmJ;
    }

    @Override
    public void op(int n) {
        this.j(n, true);
    }

    private void j(int n, boolean bl) {
        if (this.rFx) {
            return;
        }
        int n2 = this.aYB();
        this.brS = this.rFv != null && this.rFv.fON() ? GC.a(n, this.aYF(), this.rmJ) : GC.a(n, this.aYF(), this.aYD());
        if (n2 != this.aYB()) {
            if (bl) {
                this.aYT();
            }
            if (this.aYB() > n2) {
                this.a(exg_1.rFA, this.aYB() - n2);
            } else {
                this.a(exg_1.rFB, n2 - this.aYB());
            }
        }
    }

    public void f(exf_2 exf_22) {
        if (exf_22.rFv != this.rFv) {
            rFu.error((Object)("Trying to assign a " + String.valueOf(exf_22.rFv) + " charac to a " + String.valueOf(this.rFv) + " one."));
            return;
        }
        this.Th(exf_22.aYX());
        this.Tg(exf_22.aYY());
        this.ot(exf_22.brV);
        this.rFz = exf_22.rFz;
        this.ou(exf_22.aYF());
        this.op(exf_22.aYB());
    }

    @Override
    public int nt(int n) {
        if (this.rFx) {
            return 0;
        }
        int n2 = this.brS;
        long l = (long)this.aYD() - (long)this.aYB();
        int n3 = this.brS + n;
        if ((long)n > l) {
            this.op(this.aYD());
        } else {
            this.op(n3);
        }
        return this.brS - n2;
    }

    @Override
    public int oq(int n) {
        if (this.rFx) {
            return 0;
        }
        int n2 = this.brS;
        long l = (long)this.aYB() - (long)this.aYF();
        if ((long)n > l) {
            this.op(this.aYF());
        } else {
            this.op(this.brS - n);
        }
        return n2 - this.brS;
    }

    @Override
    public void ot(int n) {
        this.ab(n, true);
    }

    private void ab(int n, boolean bl) {
        this.brV = n;
        int n2 = this.brV = this.brV > this.brU ? this.brV : this.brU;
        if (!(this.rFx || this.brS <= this.aYD() || this.rFv != null && this.rFv.fON())) {
            this.brS = this.aYD();
        }
        this.a(exg_1.rFC, this.aYD());
        if (bl) {
            this.aYT();
        }
    }

    @Override
    public void ou(int n) {
        this.ac(n, true);
    }

    private void ac(int n, boolean bl) {
        this.brU = n;
        int n2 = this.brU = this.brV < this.brU ? this.brV : this.brU;
        if (!this.rFx && this.brS < this.aYF()) {
            this.brS = this.aYF();
        }
        if (bl) {
            this.aYT();
        }
        this.a(exg_1.rFD, this.aYF());
    }

    @Override
    public int or(int n) {
        if (this.brV == Integer.MAX_VALUE) {
            return this.brV;
        }
        this.ot(this.brV + n);
        return this.brV;
    }

    @Override
    public int os(int n) {
        if (this.brU == Integer.MIN_VALUE) {
            return this.brU;
        }
        this.ou(this.brU + n);
        return this.brU;
    }

    private void fF(int n, int n2) {
        this.rmK = n < n2 ? n : n2;
        this.rmJ = n > n2 ? n : n2;
    }

    public void Tg(int n) {
        this.rmJ = Math.max(n, this.rmK);
    }

    public void Th(int n) {
        this.rmK = Math.min(n, this.rmJ);
    }

    @Override
    public void aYH() {
        this.ac(this.rFv.aYZ(), false);
        this.ab(this.rFv.aZa(), false);
        this.brS = 0;
        this.rFz = 0;
        this.j(this.rFv.aZb(), false);
        if (this.rFw != null) {
            this.rFw.clear();
        }
        this.aYT();
    }

    public void g(exf_2 exf_22) {
        this.ot(exf_22.brV);
        this.ou(exf_22.brU);
        this.op(exf_22.brS);
    }

    public void h(exf_2 exf_22) {
        this.ot(exf_22.brV);
        this.ou(exf_22.brU);
        this.op(exf_22.brS);
        this.rFz = exf_22.rFz;
    }

    public void a(exf_2 exf_22, int n) {
        this.ot(exf_22.brV * n / 100);
        this.ou(exf_22.brU * n / 100);
        this.op(exf_22.brS * n / 100);
        this.rFz = exf_22.rFz * n / 100;
    }

    public void fOA() {
        this.rFx = true;
    }

    public void fOB() {
        this.rFx = false;
    }

    @Override
    public /* synthetic */ pt_0 aYQ() {
        return this.dqy();
    }
}

