/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXy
 */
public class exy_2
implements exa_1<exf_2> {
    private final TObjectProcedure<exf_2> rIl = new exz_2(this);
    exd_1 rFH;
    private final exd_2 rIm;
    private final int rIn;

    public exy_2(exd_2 exd_22, int n) {
        this.rIm = exd_22;
        this.rIn = n;
    }

    @Override
    public void aYH() {
        this.rFH = null;
    }

    @Override
    public void a(exh_1 exh_12) {
        exh_12.H(this.rIl);
    }

    @Override
    public boolean g(pt_0 pt_02) {
        return pt_02 != null && (this.rFH != null && this.rFH.Z(pt_02.aJr()) || this.rIm.g(pt_02));
    }

    @Nullable
    public exf_2 e(pt_0 pt_02) {
        this.fOQ();
        exf_2 exf_22 = this.rFH.fO(pt_02.aJr());
        if (exf_22 != null) {
            return exf_22;
        }
        if (this.rIm.g(pt_02)) {
            return this.m((exx_2)pt_02);
        }
        return null;
    }

    private exf_2 m(exx_2 exx_22) {
        exf_2 exf_22 = this.n(exx_22);
        return this.j(exf_22);
    }

    private exf_2 j(exf_2 exf_22) {
        exx_2 exx_22 = exf_22.dqy();
        exf_22.ou(exx_22.aYZ());
        if (exx_22.isExpandable()) {
            exf_22.ot(this.rIm.b(exx_22, this.rIn));
            exf_22.aYO();
        } else {
            exf_22.ot(exx_22.aZa());
            exf_22.op(this.rIm.b(exx_22, this.rIn));
        }
        return exf_22;
    }

    private exf_2 n(exx_2 exx_22) {
        exf_2 exf_22 = new exf_2(exx_22, exx_22.aYX(), exx_22.aYY());
        this.rFH.a(exx_22.aJr(), exf_22);
        return exf_22;
    }

    @Override
    public int c(pt_0 pt_02) {
        exf_2 exf_22;
        if (this.rFH != null && (exf_22 = this.rFH.fO(pt_02.aJr())) != null) {
            return exf_22.aYB();
        }
        if (this.rIm.g(pt_02)) {
            return this.rIm.b((exx_2)pt_02, this.rIn);
        }
        return -1;
    }

    @Override
    public int h(pt_0 pt_02) {
        exf_2 exf_22;
        if (this.rFH != null && (exf_22 = this.rFH.fO(pt_02.aJr())) != null) {
            return exf_22.aYD();
        }
        if (this.rIm.g(pt_02)) {
            if (pt_02.isExpandable()) {
                return this.rIm.b((exx_2)pt_02, this.rIn);
            }
            return pt_02.aZa();
        }
        return -1;
    }

    @Override
    public boolean a(tp_1 tp_12) {
        tp_12.clear();
        if (this.rFH != null) {
            this.rFH.c(new exa_2(this, tp_12));
        }
        return true;
    }

    @Override
    public boolean a(tp_1 tp_12, pt_0 ... pt_0Array) {
        tp_12.clear();
        if (this.rFH != null) {
            for (int i = 0; i < pt_0Array.length; ++i) {
                byte by = pt_0Array[i].aJr();
                exf_2 exf_22 = this.rFH.fO(by);
                if (exf_22 == null) continue;
                tq_2 tq_22 = new tq_2();
                tq_22.Rv = by;
                tq_22.aav = exf_22.brS;
                tq_22.aaw = exf_22.brU;
                tq_22.aax = exf_22.brV;
                tq_22.aay = exf_22.rFz;
                tp_12.aau.add(tq_22);
            }
        }
        return true;
    }

    @Override
    public boolean b(tp_1 tp_12) {
        if (!tp_12.aau.isEmpty()) {
            this.fOQ();
        }
        for (tq_2 tq_22 : tp_12.aau) {
            exx_2 exx_22 = exx_2.c(tq_22.Rv);
            exf_2 exf_22 = this.rFH.fO(exx_22.aJr());
            if (exf_22 == null) {
                exf_22 = new exf_2(exx_22, exx_22.aYX(), exx_22.aYY());
                this.rFH.a(exx_22.aJr(), exf_22);
            }
            exf_22.brS = tq_22.aav;
            exf_22.brU = tq_22.aaw;
            exf_22.brV = tq_22.aax;
            exf_22.rFz = tq_22.aay;
        }
        return true;
    }

    private void fOQ() {
        if (this.rFH == null) {
            this.rFH = new exd_1();
        }
    }

    public exd_2 fOR() {
        return this.rIm;
    }

    private void fOS() {
        this.fOQ();
        for (exx_2 exx_22 : exx_2.values()) {
            if (this.rFH.Z(exx_22.aJr())) continue;
            this.m(exx_22);
        }
    }

    public void a(pu_0 pu_02) {
        this.fOS();
        this.rFH.D(new exb_2(this, pu_02));
    }

    public void b(pu_0 pu_02) {
        if (this.rFH == null) {
            return;
        }
        this.rFH.D(new exc_2(this, pu_02));
    }

    @Override
    @Nullable
    public /* synthetic */ pr_0 b(pt_0 pt_02) {
        return this.e(pt_02);
    }
}

