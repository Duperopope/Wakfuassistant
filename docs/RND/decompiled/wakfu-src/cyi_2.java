/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYi
 */
public class cyi_2
implements adi_1 {
    private static final cyi_2 nXV = new cyi_2();

    public static cyi_2 eXN() {
        return nXV;
    }

    private cyi_2() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 16902: 
            case 16990: {
                bkb_0 bkb_02 = bgt_02.dps();
                if (bkb_02 == null || bkb_02.dsm() != 16) {
                    aue_0.cVJ().b(this);
                    return false;
                }
                bkg_2 bkg_22 = (bkg_2)bkb_02;
                if (bkg_22.aa(bgt_02)) {
                    return false;
                }
                if (cyi_2.j((dcm_0)aam_22)) {
                    dae_0 dae_02 = cyi_2.l(aam_22);
                    bkg_22.d(new cyj_1(this, dae_02));
                }
                return false;
            }
        }
        return true;
    }

    private static boolean j(dcm_0 dcm_02) {
        switch (dcm_02.d()) {
            case 16902: {
                return dcm_02.fch();
            }
            case 16990: {
                return dcm_0.fck();
            }
        }
        return false;
    }

    private static dae_0 l(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16902: {
                return cyi_2.k((dcm_0)aam_22);
            }
            case 16990: {
                return cyi_2.k((dcm_0)aam_22);
            }
        }
        return null;
    }

    private static dae_0 k(dcm_0 dcm_02) {
        return dcm_02.fcg();
    }

    public void clear() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null && bkb_02.dsm() == 16) {
            ((bkg_2)bkb_02).a(bgt_02.ddI(), null);
            bgt_02.a((eid_0)null);
        }
        aue_0.cVJ().b(this);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

