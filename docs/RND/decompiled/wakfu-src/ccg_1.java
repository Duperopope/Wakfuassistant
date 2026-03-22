/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccG
 */
public class ccg_1
implements adi_1 {
    public static final ccg_1 lPx = new ccg_1();

    private ccg_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13256: {
                ccg_1.a((cpz)aam_22);
                return false;
            }
            case 12721: {
                ccg_1.a((cpA)aam_22);
                return false;
            }
        }
        return true;
    }

    private static void a(cpz cpz2) {
        long l = cpz2.KU();
        bhJ bhJ2 = (bhJ)fcL.rUh.sw(l);
        if (bhJ2 == null) {
            return;
        }
        for (fm_1 fm_12 : cpz2.exr()) {
            ccg_1.a(bhJ2, fm_12);
        }
        ((bdl_0)bhJ2.dod()).dRv();
    }

    private static void a(bhJ bhJ2, fm_1 fm_12) {
        if (fm_12 == fm_1.pv || fm_12 == fm_1.pu) {
            cxx_1.eXf().eXj();
        }
        if (fm_12 == fm_1.pA) {
            fse_1.gFu().a((aef_2)bhJ2, "currentTitle", "currentTitleRarityColor");
        }
    }

    private static void a(cpA cpA2) {
        bjf_1.a(cpA2.duf(), cpA2.exs());
        if (cpA2.duf() == fm_1.pI) {
            if (aue_0.cVJ().c(ctl_1.eQV())) {
                ctl_1.eQV().eQW();
            }
            aPd.f("chat.notify.dimensionalBagViewUnlocked", new Object[0]);
        } else {
            if (ctb_2.eQx()) {
                bmh.dvr().b(cpA2.duf(), cpA2.exs());
            }
            cpA2.exs().forEach(n -> byj_1.epo().a(new byt_2(cpA2.duf(), (int)n)));
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

