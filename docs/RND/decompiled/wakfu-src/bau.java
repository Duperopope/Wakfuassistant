/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bau
implements afl {
    private static final Logger hyU = Logger.getLogger(bau.class);
    private static final bau hyV = new bau();

    public void a(WL wL) {
        bau.cZo();
        bau.cZn();
        bau.cZm();
        bau.cZl();
        bau.cZk();
        bau.cZj();
        bau.cZi();
        wL.b(this);
    }

    private static void cZi() {
        aqb_1.bGD().a(new aLy(), new bav());
    }

    private static void cZj() {
        aqb_1.bGD().a(new alu_0(), new baw());
    }

    private static void cZk() {
        aqb_1.bGD().a(new alt_0(), new bax());
    }

    private static void cZl() {
        aqb_1.bGD().a(new alz_0(), new bay());
    }

    static frl_0 a(aop_0 aop_02) {
        if (aop_02 == null) {
            return null;
        }
        return new frl_0(aop_02.cyk(), aop_02.cyl(), aop_02.cym(), aop_02.cyn());
    }

    private static void cZm() {
        aqb_1.bGD().a(new aox_0(), new baz());
        frb_0.sYO.gkk();
    }

    private static void cZn() {
        aqb_1.bGD().a(new aOV(), new baA());
    }

    private static void cZo() {
        aqb_1.bGD().a(new aow_0(), new bab_0());
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.zaap", new Object[0]);
    }

    public static bau cZp() {
        return hyV;
    }
}

