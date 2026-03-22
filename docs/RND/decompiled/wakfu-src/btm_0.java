/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from btm
 */
public class btm_0
extends bth_0 {
    private static final Logger jld = Logger.getLogger(btm_0.class);
    private final bgy jle;
    private boolean bTz = false;

    public btm_0(bgy bgy2) {
        this.jle = bgy2;
    }

    @Override
    public int aeV() {
        return 2;
    }

    @Override
    public void u(bdj_2 bdj_22) {
        super.u(bdj_22);
        this.bTz = false;
        bdj_22.dT(this.dHG());
    }

    private static String a(bdj_2 bdj_22, String string, String string2) {
        if (bdj_22.dZ(string)) {
            return string;
        }
        return string2;
    }

    @Override
    public void z(bdj_2 bdj_22) {
        if (this.bTz) {
            return;
        }
        this.bTz = true;
        assert (bdj_22 != null);
        this.A(bdj_22);
        bdj_22.dV(btm_0.a(bdj_22, "AnimStatique02", "AnimStatique"));
        bdj_22.dX(btm_0.a(bdj_22, "AnimHit02", "AnimHit"));
        bdj_22.dT(this.dHH());
    }

    @Override
    public void A(bdj_2 bdj_22) {
        boolean bl = bdj_22.dZ("AnimMarche02");
        boolean bl2 = bdj_22.dZ("AnimCourse02");
        if (bl || bl2) {
            aem_0 aem_02 = bl ? ajm_0.chu() : aem_0.bwq();
            aef_0 aef_02 = bl2 ? ajl_0.cht() : aef_0.bwm();
            bdj_22.a(new aew_0(aeB.bww(), aem_02, aef_02));
        } else {
            bdj_22.a(aeB.bww());
        }
    }

    @Override
    public boolean c(bth_0 bth_02) {
        if (!super.c(bth_02)) {
            return false;
        }
        return this.jle.aWP() == ((btm_0)bth_02).jle.aWP();
    }

    @Override
    protected String dHG() {
        return btm_0.a(this.jle.ddI(), "AnimStatique02-Fin", "AnimStatique");
    }

    @Override
    protected String dHH() {
        bdj_2 bdj_22 = this.jle.ddI();
        return btm_0.a(bdj_22, "AnimStatique02-Debut", bdj_22.bpT());
    }
}

