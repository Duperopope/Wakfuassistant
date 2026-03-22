/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from eXh
 */
public class exh_1
implements exa_1<exf_2> {
    private static final Logger rFG = Logger.getLogger(exh_1.class);
    private final exd_1 rFH = new exd_1();

    public exh_1() {
        for (exx_2 exx_22 : exx_2.values()) {
            exf_2 exf_22 = new exf_2(exx_22, exx_22.aYX(), exx_22.aYY());
            this.rFH.a(exx_22.aJr(), exf_22);
        }
        this.aYH();
    }

    @Override
    public void aYH() {
        this.rFH.D(new exi_1(this));
    }

    @Override
    public void a(exh_1 exh_12) {
        this.rFH.D(new exj_2(this, exh_12));
    }

    @Override
    public boolean g(pt_0 pt_02) {
        return pt_02 != null && this.rFH.Z(pt_02.aJr());
    }

    public exf_2 e(pt_0 pt_02) {
        return this.rFH.fO(pt_02.aJr());
    }

    @Override
    public int c(pt_0 pt_02) {
        return this.rFH.fO(pt_02.aJr()).aYB();
    }

    @Override
    public int h(pt_0 pt_02) {
        return this.rFH.fO(pt_02.aJr()).aYD();
    }

    public void H(TObjectProcedure<exf_2> tObjectProcedure) {
        this.rFH.D(tObjectProcedure);
    }

    @Override
    public boolean a(tp_1 tp_12) {
        tp_12.clear();
        this.rFH.c(new exk_2(this, tp_12));
        return true;
    }

    @Override
    public boolean a(tp_1 tp_12, pt_0 ... pt_0Array) {
        tp_12.clear();
        for (int i = 0; i < pt_0Array.length; ++i) {
            byte by = pt_0Array[i].aJr();
            exf_2 exf_22 = this.rFH.fO(by);
            tq_2 tq_22 = new tq_2();
            tq_22.Rv = by;
            tq_22.aav = exf_22.brS;
            tq_22.aaw = exf_22.brU;
            tq_22.aax = exf_22.brV;
            tq_22.aay = exf_22.rFz;
            tp_12.aau.add(tq_22);
        }
        return true;
    }

    @Override
    public boolean b(tp_1 tp_12) {
        boolean bl = true;
        for (tq_2 tq_22 : tp_12.aau) {
            exf_2 exf_22 = this.rFH.fO(tq_22.Rv);
            if (exf_22 != null) {
                exf_22.brU = tq_22.aaw;
                exf_22.brV = tq_22.aax;
                exf_22.rFz = tq_22.aay;
                exf_22.op(tq_22.aav);
                continue;
            }
            rFG.error((Object)("Impossible de trouver la caract\u00e9ristique \u00e0 l'index " + tq_22.Rv));
            bl = false;
        }
        return bl;
    }

    public void a(pu_0 pu_02) {
        this.rFH.D(new exl_2(this, pu_02));
    }

    public void b(pu_0 pu_02) {
        this.rFH.D(new exm_2(this, pu_02));
    }

    @Override
    public /* synthetic */ pr_0 b(pt_0 pt_02) {
        return this.e(pt_02);
    }
}

