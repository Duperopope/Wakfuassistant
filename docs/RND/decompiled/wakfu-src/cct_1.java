/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ccT
 */
public class cct_1
implements adi_1 {
    private static final boolean lPX = false;
    private static final Logger lPY = Logger.getLogger(cct_1.class);
    private static final cct_1 lPZ = new cct_1();

    public static cct_1 etY() {
        return lPZ;
    }

    private cct_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 1065: {
                OD oD = (OD)aam_22;
                bgt_0 bgt_02 = fcI.fSM() ? bvz_0.dLl() : aue_0.cVJ().cVK();
                if (bgt_02 == null) {
                    return false;
                }
                bvi_0 bvi_02 = bgt_02.dnQ();
                Vf vf = Vf.fu(oD.aXa());
                switch (vf) {
                    case bxK: {
                        Object object;
                        boolean bl = bvi_02.dfG();
                        TLongArrayList tLongArrayList = null;
                        if (bl) {
                            tLongArrayList = new TLongArrayList(bvi_02.dKL().fPF());
                            TLongObjectIterator tLongObjectIterator = bvi_02.dKL().fPG().iterator();
                            while (tLongObjectIterator.hasNext()) {
                                tLongObjectIterator.advance();
                                tLongArrayList.add(((exz_1)tLongObjectIterator.value()).KU());
                            }
                        }
                        boolean bl2 = false;
                        if (!bl || bvi_02.dnR() != oD.aXa()) {
                            object = new eyp_1(oD.aXa());
                            ((eyp_1)object).a(new bvh_0());
                            if (aue_0.cVJ().c(ctu_2.nJd)) {
                                ((eyp_1)object).a(ctu_2.nJd);
                            }
                            ((eyp_1)object).a(bey_0.dTc());
                            bvi_02.c((eyp_1)object);
                            bl2 = true;
                            bqm_0.jbp.b(new brx());
                        }
                        if ((object = (Object)oD.aXg()) != null) {
                            eyv_1 eyv_12 = new eyv_1(bvi_02.dKL());
                            eyv_12.eK((byte[])object);
                            bl2 = true;
                        }
                        for (azx_1 azx_12 : oD.aXh()) {
                            long l = (Long)azx_12.getFirst();
                            byte[] byArray = (byte[])azx_12.aHI();
                            exz_1 exz_12 = bvi_02.dKL().rw(l);
                            if (exz_12 == null) {
                                exz_12 = l < 0L ? new bvr_0() : new eya_1();
                                exz_12.a(new bvu_0());
                                var16_51 = new eym_1(exz_12);
                                var16_51.fPB().a(new bvt_0(exz_12));
                                var16_51.eJ(byArray);
                                bvi_02.dKL().e(exz_12);
                                aPd.f("group.party.invitationAccepted", exz_12.getName());
                            } else {
                                var16_51 = new eym_1(exz_12);
                                var16_51.fPB().a(new bvt_0(exz_12));
                                var16_51.eJ(byArray);
                            }
                            bl2 = true;
                        }
                        boolean bl3 = aue_0.cVJ().c(cxs_1.eXb());
                        if (!bl3 && bl2 && bvi_02.dfG()) {
                            aue_0.cVJ().a(cxs_1.eXb());
                        } else if (bl3 && bl2) {
                            cxs_1.eXb().dRJ();
                        }
                        bvp_0.g(bvi_02.dKL());
                        if (!bl2) break;
                        bvp_0.f(bvi_02.dKL());
                        break;
                    }
                }
                return false;
            }
            case 1163: {
                OE oE = (OE)aam_22;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                eyp_1 eyp_12 = bgt_03.dnQ().dKL();
                if (eyp_12 != null) {
                    eyp_12.rw(oE.aXi()).mM(true);
                    eyp_12.rw(oE.aXj()).mM(false);
                    bvk_0 bvk_02 = cxs_1.eXb().eXc();
                    bvk_02.a(bgt_03.dnQ());
                    fse_1.gFu().a((aef_2)bvk_02, "members");
                    bvp_0.f(eyp_12);
                }
                return false;
            }
            case 1159: {
                OG oG = (OG)aam_22;
                bgt_0 bgt_04 = aue_0.cVJ().cVK();
                dbr dbr2 = new dbr();
                String string = oG.aXl();
                if (bgt_04.a(ezj_0.ptk) || apd_0.cAO().cAR().ii(oG.aXm()) != null) {
                    ot_0 ot_02 = new ot_0();
                    ot_02.aP(false);
                    ot_02.cY(oG.aXl());
                    ot_02.dc(oG.aXm());
                    ot_02.F(oG.aWY());
                    aue_0.cVJ().etu().d(ot_02);
                    return false;
                }
                dbr2.c(Vf.ah(oG.aWY()));
                dbr2.dc(oG.aXm());
                dbr2.cY(string);
                aaw_1.bUq().h(dbr2);
                return false;
            }
            case 1039: {
                OI oI = (OI)aam_22;
                bNG.egl();
                bNG.a(oI.aXo(), new Object[0]);
                bly_0.ivl.setNetEnabled(true);
                return false;
            }
            case 1175: {
                OH oH = (OH)aam_22;
                bgt_0 bgt_05 = aue_0.cVJ().cVK();
                bvi_0 bvi_03 = bgt_05.dnQ();
                long l = oH.aXa();
                Vf vf = Vf.fu(l);
                TLongArrayList tLongArrayList = oH.aXn();
                if (vf != Vf.bxK) {
                    return false;
                }
                if (tLongArrayList.contains(bgt_05.Sn())) {
                    this.T(bgt_05);
                    return false;
                }
                for (int i = 0; i < tLongArrayList.size(); ++i) {
                    long l2;
                    if (bvi_03.dfG()) {
                        l2 = tLongArrayList.getQuick(i);
                        this.a(bvi_03, l2);
                    } else {
                        lPY.error((Object)"Removing a character from our group, but we don't have one!");
                    }
                    l2 = tLongArrayList.getQuick(i);
                    if (fcL.rUh.sw(l2) != null) {
                        fcL.rUh.av(bgt_05.Xi(), l2);
                    }
                    if (!aue_0.cVJ().c(cxs_1.eXb())) continue;
                    cxs_1.eXb().dRJ();
                }
                return false;
            }
            case 1037: {
                OA oA = (OA)aam_22;
                return false;
            }
            case 1003: {
                OC oC = (OC)aam_22;
                long l = oC.aXa();
                Vf vf = Vf.fu(l);
                cxs_1.eXb().eXc();
                bvk_0.dKN();
                return false;
            }
            case 14309: {
                cxy_0 cxy_02 = (cxy_0)aam_22;
                if (cxy_02.bku() == 0) {
                    if (aue_0.cVJ().c(cva_1.eTu())) {
                        aue_0.cVJ().b(cva_1.eTu());
                    }
                    return false;
                }
                fiq_2.gCw().d(fik_2.gBZ().vE(bNG.b(cxy_02.bku(), new Object[0])).vG(ccp_2.mRF.byf()).abQ(3));
                return false;
            }
            case 1091: {
                ok_0 ok_02 = (ok_0)aam_22;
                String string = aum_0.cWf().c("notification.guildCreateText", ok_02.HR());
                cwy_2.nUc.y(string, 4);
                aue_0.cVJ().b(cva_1.eTu());
                cva_1.eTu().eTx();
                return false;
            }
            case 1084: {
                String string = aum_0.cWf().c("notification.guildBlazonChangedText", new Object[0]);
                cwy_2.nUc.y(string, 4);
                aue_0.cVJ().b(cva_1.eTu());
                cva_1.eTu().eTx();
                return false;
            }
            case 1073: {
                ol_0 ol_02 = (ol_0)aam_22;
                String string = aum_0.cWf().c("notification.guildNameChangedText", ol_02.HR());
                cwy_2.nUc.y(string, 4);
                aue_0.cVJ().b(cva_1.eTu());
                cva_1.eTu().eTx();
                return false;
            }
            case 1144: {
                on_0 on_02 = (on_0)aam_22;
                Object t = fcL.rUh.sw(on_02.KU());
                if (t == null) {
                    return false;
                }
                String string = aum_0.cWf().c("notification.guildSelfQuitText", on_02.HR(), ((exP)t).getName());
                cwy_2.nUc.y(string, 4);
                return false;
            }
            case 1184: {
                Oz oz = (Oz)aam_22;
                Object t = fcL.rUh.sw(oz.KU());
                if (t == null) {
                    return false;
                }
                String string = aum_0.cWf().c("notification.guildDisbandText", oz.HR());
                cwy_2.nUc.y(string, 4);
                return false;
            }
        }
        return true;
    }

    private void T(bgt_0 bgt_02) {
        if (aue_0.cVJ().c(cxs_1.eXb())) {
            aue_0.cVJ().b(cxs_1.eXb());
        }
        for (long l : fcL.rUh.sx(bgt_02.Xi())) {
            bgt_0 bgt_03;
            if (l == bgt_02.Sn() || (bgt_03 = (bgt_0)fcL.rUh.sw(l)) == null) continue;
            fcL.rUh.av(bgt_02.Xi(), l);
        }
        bgt_02.dnQ().dKL().fPE();
        bgt_02.dnQ().c(null);
        bvk_0.dKN();
        bly_0.ivl.gu(true);
        aPd.f("group.party.leave", new Object[0]);
    }

    private void a(bvi_0 bvi_02, long l) {
        eyp_1 eyp_12 = bvi_02.dKL();
        exz_1 exz_12 = eyp_12.rw(l);
        if (exz_12 == null) {
            return;
        }
        boolean bl = exz_12.aXd();
        eyp_12.ru(l);
        bgl_0 bgl_02 = ctu_2.nJd.om(bl ? (long)(-exz_12.aWP()) : l);
        if (bgl_02 != null) {
            bly_0.ivl.j(bgl_02);
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

