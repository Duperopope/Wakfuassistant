/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TIntArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from ccK
 */
public class cck_1
implements adi_1 {
    protected static final Logger lPE = Logger.getLogger(cck_1.class);
    private static final cck_1 lPF = new cck_1();

    public static cck_1 etR() {
        return lPF;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13301: {
                ctk ctk2 = (ctk)aam_22;
                List<wa_2> list = ctk2.eBV();
                TByteArrayList tByteArrayList = ctk2.eBW();
                TIntArrayList tIntArrayList = ctk2.eBX();
                bnp_2 bnp_22 = cro_2.eMW().dyX();
                bnp_22.fVz();
                for (int i = 0; i < list.size(); ++i) {
                    bez_1 bez_12 = bnp_22.a(list.get(i));
                    byte by = tByteArrayList.get(i);
                    bez_12.ua(by);
                    int n = tIntArrayList.get(i);
                    Object r = fgD.fXh().Vd(n);
                    bez_12.mG(r != null ? ((fhc_0)r).getName() : "<UNKNOWN>");
                    bez_12.CV(((fhc_0)r).aVt());
                    csf_2.eOo().a(bez_12.Lx(), new azx_1(by, r));
                }
                return false;
            }
            case 12542: {
                ctl ctl2 = (ctl)aam_22;
                wa_2 wa_22 = ctl2.eBY();
                bnp_2 bnp_23 = cro_2.eMW().dyX();
                cro_2.eMW().b(bnp_23.a(wa_22));
                return false;
            }
            case 13802: {
                bnv_2 bnv_22 = cro_2.eMW();
                ctn ctn2 = (ctn)aam_22;
                lPE.info((Object)("[FLEA_LOCK_MESSAGE] merchantInventory=" + ctn2.dPv() + ", lock=" + ctn2.bfb()));
                bnv_22.h(ctn2.dPv(), ctn2.bfb());
                return false;
            }
            case 12364: {
                bnv_2 bnv_23 = cro_2.eMW();
                ctr ctr2 = (ctr)aam_22;
                bez_1 bez_13 = (bez_1)bnv_23.dyX().tj(ctr2.dPv());
                byte by = (byte)(bez_13.bDw() - 1);
                bez_13.ua(by);
                fse_1.gFu().a((aef_2)bnv_23, "fleaList");
                bez_1 bez_14 = bnv_23.dzd();
                if (bez_14 != null) {
                    long l = ctr2.eCd();
                    lPE.info((Object)("[MERCHANT_ITEM_REMOVE_MESSAGE] itemUid=" + l));
                    azx_1 azx_12 = bnv_23.dyX().tl(l);
                    if (azx_12 == null) {
                        lPE.error((Object)"Remove failed...");
                        return false;
                    }
                    if (aue_0.cVJ().c(csf_2.eOo())) {
                        bnv_2 bnv_24 = csf_2.eMW();
                        if (bez_14.aJG() && bez_14.equals(bnv_24.dzd())) {
                            bnv_24.dyJ();
                        }
                        long l2 = bez_13.Lx();
                        azx_1 azx_13 = csf_2.eOo().oj(l2);
                        azx_13 = new azx_1(by, azx_13.aHI());
                        csf_2.eOo().a(l2, azx_13);
                    }
                    bez_14.dSo();
                }
                return false;
            }
            case 13677: {
                bnv_2 bnv_25 = cro_2.eMW();
                cts cts2 = (cts)aam_22;
                lPE.info((Object)("[MERCHANT_ITEM_UPDATE_MESSAGE] itemUid=" + cts2.LV()));
                azx_1 azx_14 = bnv_25.dyX().tk(cts2.LV());
                if (azx_14 != null) {
                    bez_1 bez_15 = (bez_1)azx_14.getFirst();
                    bea_0 bea_02 = (bea_0)azx_14.aHI();
                    fnm fnm2 = cts2.dSx();
                    int n = cts2.eCe();
                    short s = cts2.bfd();
                    if (bea_02.bfd() != s) {
                        bez_15.b(bea_02.LV(), (short)(s - bea_02.bfd()));
                    }
                    if (bea_02.eAU() != (long)n) {
                        bez_15.a((ffh_0)bea_02, n);
                    }
                    if (bea_02.dSx() != fnm2) {
                        bez_15.a((ffh_0)bea_02, fnm2);
                    }
                    bez_15.dSo();
                } else {
                    lPE.error((Object)("L'item (ID=" + cts2.LV() + ") n'existe pas/plus dans la brocante brows\u00e9e."));
                }
                return false;
            }
            case 13736: {
                ctp ctp2 = (ctp)aam_22;
                wa_2 wa_23 = ctp2.eBY();
                byte by = ctp2.eCb();
                int n = ctp2.eCc();
                bnv_2 bnv_26 = cro_2.eMW();
                bez_1 bez_16 = bnv_26.dyX().a(wa_23);
                bez_16.ua(by);
                Object r = fgD.fXh().Vd(n);
                bez_16.mG(r != null ? ((fhc_0)r).getName() : "<UNKNOWN>");
                bez_16.CV(((fhc_0)r).aVt());
                csf_2.eOo().a(bez_16.Lx(), new azx_1(by, r));
                return false;
            }
            case 12638: {
                ctq ctq2 = (ctq)aam_22;
                long l = ctq2.dPv();
                bnv_2 bnv_27 = cro_2.eMW();
                bnv_27.dyX().ti(l);
                csf_2.eOo().oi(l);
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

