/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccQ
 */
public class ccq_1
implements adi_1 {
    protected static final Logger lPS = Logger.getLogger(ccq_1.class);
    private static final ccq_1 lPT = new ccq_1();

    public static ccq_1 etX() {
        return lPT;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bnv_2 bnv_22 = cro_2.eMW();
        switch (aam_22.d()) {
            case 13356: {
                ctm ctm2 = (ctm)aam_22;
                lPS.info((Object)("[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId=" + ctm2.eBZ()));
                bnv_22.dyX().ey(ctm2.dyC());
                bnv_22.dyX().ex(ctm2.dyB());
                bnv_22.b(bnv_22.dyX().a(ctm2.eBY()));
                return false;
            }
            case 13802: {
                ctn ctn2 = (ctn)aam_22;
                lPS.info((Object)("[FLEA_LOCK_MESSAGE] merchantInventory=" + ctn2.dPv() + ", lock=" + ctn2.bfb()));
                bnv_22.h(ctn2.dPv(), ctn2.bfb());
                return false;
            }
            case 12364: {
                ctr ctr2 = (ctr)aam_22;
                lPS.info((Object)("[MERCHANT_ITEM_REMOVE_MESSAGE] itemUid=" + ctr2.eCd()));
                azx_1 azx_12 = bnv_22.dyX().tl(ctr2.eCd());
                if (azx_12 == null) {
                    lPS.error((Object)"Remove failed...");
                }
                bnv_22.dzd().dSo();
                return false;
            }
            case 13677: {
                cts cts2 = (cts)aam_22;
                lPS.info((Object)("[MERCHANT_ITEM_UPDATE_MESSAGE] itemUid=" + cts2.LV()));
                azx_1 azx_13 = bnv_22.dyX().tk(cts2.LV());
                if (azx_13 != null) {
                    bez_1 bez_12 = (bez_1)azx_13.getFirst();
                    bea_0 bea_02 = (bea_0)azx_13.aHI();
                    fnm fnm2 = cts2.dSx();
                    int n = cts2.eCe();
                    short s = cts2.bfd();
                    if (bea_02.bfd() != s) {
                        bez_12.b(bea_02.LV(), (short)(s - bea_02.bfd()));
                    }
                    if (bea_02.eAU() != (long)n) {
                        bez_12.a((ffh_0)bea_02, n);
                    }
                    if (bea_02.dSx() != fnm2) {
                        bez_12.a((ffh_0)bea_02, fnm2);
                    }
                    bez_12.dSo();
                } else {
                    lPS.error((Object)("L'item (ID=" + cts2.LV() + ") n'existe pas/plus dans la brocante brows\u00e9e."));
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

