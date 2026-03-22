/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from btq
 */
public class btq_1
extends bth_0 {
    private static final Logger jll = Logger.getLogger(btq_1.class);
    private static final int jlm = 100;
    public static final int jln = 237;
    private final int jlo;
    private final boolean jlp;
    private final String[] jlq;
    private boolean bTz;

    public btq_1(fhy_0 fhy_02, int n) {
        assert (fhy_02 != null);
        assert (fhy_02.fZq() != null) : "pas d'arme => utiliser plut\u00f4t BareHandAttack.getInstance()";
        assert (fhy_02.fZq()[0] == ffS.sgQ) : "pas utilisation d'une arme";
        this.jkZ = n;
        this.jlo = btq_1.d(fhy_02);
        this.jlp = false;
        assert (this.jlo != 237);
        assert (!this.jlp || fhy_02.fZs()[0] == ffS.sgR);
        String string = this.aXO();
        this.jlq = new String[]{"AnimStatique03-Fun" + string};
    }

    @Override
    public int aeV() {
        return 1;
    }

    @Override
    public void u(bdj_2 bdj_22) {
        super.u(bdj_22);
        this.bTz = false;
        bdj_22.dT(this.dHG());
        bdj_22.dX("AnimHit");
    }

    @Override
    public void z(bdj_2 bdj_22) {
        if (this.bTz) {
            return;
        }
        this.bTz = true;
        String string = this.aXO();
        bdj_22.dT(this.dHH());
        bdj_22.dV("AnimStatique03-Boucle" + string);
        if (this.jlo == 219) {
            bdj_22.dX("AnimHit");
        } else {
            bdj_22.dX("AnimHit" + string);
        }
        this.A(bdj_22);
    }

    @Override
    public void A(bdj_2 bdj_22) {
        aed_0 aed_02;
        String string = this.aXO();
        if (this.jlo == 219) {
            aed_02 = aef_0.bwm();
        } else {
            bdj_22.dX("AnimHit" + string);
            aed_02 = new ajn_0((short)this.jlo);
        }
        bdj_22.a(new aew_0(aeB.bww(), aed_02, aef_0.bwm()));
    }

    private String aXO() {
        return "-" + this.jlo + (this.jlp ? "-2" : "");
    }

    @Override
    public boolean c(bth_0 bth_02) {
        if (!super.c(bth_02)) {
            return false;
        }
        btq_1 btq_12 = (btq_1)bth_02;
        return this.jlo == btq_12.jlo && this.jlp == btq_12.jlp;
    }

    public static int d(fhy_0 fhy_02) {
        fhy_0 fhy_03 = fhy_02;
        while (!fhy_03.fZr()) {
            if ((fhy_03 = fhy_03.fZm()) != null) continue;
            jll.error((Object)("Arme pas dans la bonne cat\u00e9gorie " + fhy_02.aIi()));
            return 0;
        }
        return fhy_03.aIi();
    }

    @Override
    protected String dHG() {
        return "AnimStatique03-Fin" + this.aXO();
    }

    @Override
    protected String dHH() {
        return "AnimStatique03-Debut" + this.aXO();
    }

    @Override
    public String dHI() {
        return "AnimHit" + this.aXO();
    }

    @Override
    public String[] dHJ() {
        return this.jlq;
    }
}

