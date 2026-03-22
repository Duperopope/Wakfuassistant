/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cYv
 */
public class cyv_2
implements adi_1,
fig_2 {
    protected static final Logger nYx = Logger.getLogger(cyv_2.class);
    private static final cyv_2 nYy = new cyv_2();
    private boolean jnX = false;
    private bgt_0 hVo;
    private alx_2 ikv;

    public static cyv_2 eXZ() {
        return nYy;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16179: {
                dae_0 dae_02 = (dae_0)aam_22;
                long l = dae_02.bCp();
                this.au((bgt_0)fcL.rUh.sw(l));
                return false;
            }
            case 16837: {
                this.eYc();
                return false;
            }
            case 18339: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                bgt_0 bgt_02 = (bgt_0)fcI.ab(this.hVo.Xi(), dbl_02.getDestinationUniqueId());
                ffV ffV3 = dbl_02.getItem();
                short s = dbl_02.getDestinationPosition();
                if (dbl_02.getDestinationUniqueId() == -1L) {
                    fiq_2.gCw().d(new fik_2().l("question.deleteItem", ffV3.getName()).vG(ccp_2.mRF.byf()).a(fil_2.gCo()).a(fil_2.gCn().c(string -> {
                        cla_0 cla_02 = new cla_0();
                        cla_02.nl(dbl_02.getDestinationUniqueId());
                        cla_02.setDestinationPosition(s);
                        cla_02.ak(dbl_02.bfd());
                        cla_02.nk(ffV3.LV());
                        aue_0.cVJ().etu().d(cla_02);
                    })));
                    return false;
                }
                ffs_0 ffs_02 = bgt_02.dno().sY(dbl_02.getDestinationUniqueId());
                ffV ffV4 = ffs_02.eQ(s);
                if (!(ffV4 == null || ffV4.bfe() > 1 && ffV4.n(ffV3) && ffV4.bfd() != ffV4.bfe())) {
                    return false;
                }
                cla_0 cla_02 = new cla_0();
                cla_02.nl(dbl_02.getDestinationUniqueId());
                cla_02.setDestinationPosition(s);
                cla_02.ak(dbl_02.bfd());
                cla_02.nk(ffV3.LV());
                aue_0.cVJ().etu().d(cla_02);
                return false;
            }
            case 17504: {
                feh_0 feh_02 = (feh_0)this.hVo.a(fez_0.seq);
                if (feh_02 == null) {
                    return false;
                }
                if (feh_02.aJG()) {
                    return false;
                }
                bgt_0 bgt_03 = cvo_2.daL();
                if (bgt_03 == null) {
                    return false;
                }
                List<ffV> list = fgt.a(bgt_03.dno(), feh_02.fba());
                List<ffV> list2 = this.hVo.Sn() == bgt_03.Sn() ? list : list.stream().filter(ffV2 -> cvu_1.b(bgt_03, ffV2)).toList();
                if (list2.isEmpty()) {
                    String string2 = aum_0.cWf().c("market.inventory.is.full", new Object[0]);
                    byj_1.epo().a(byc_1.b(byh_1.lAA, string2));
                    return false;
                }
                clv_0 clv_02 = new clv_0(this.hVo.Sn(), bgt_03.Sn(), list2.stream().map(ffV::LV).toList());
                aue_0.cVJ().etu().d(clv_02);
                return false;
            }
            case 17400: {
                feh_0 feh_03 = (feh_0)this.hVo.a(fez_0.seq);
                List<ffV> list = feh_03.fba();
                List<ffV> list3 = fgt.a(list, 27083);
                bdu_0 bdu_02 = bdr_0.b(this.hVo, list3);
                Runnable runnable = () -> {
                    boolean bl;
                    boolean bl2 = bl = list3.size() != list.size();
                    if (bl) {
                        String string = aum_0.cWf().c("temporary.inventory.recycle.shards", new Object[0]);
                        byj_1.epo().a(byc_1.b(byh_1.lAB, string));
                    }
                };
                if (bdu_02.dRE().isEmpty()) {
                    runnable.run();
                    return false;
                }
                bdr_0.a(bdu_02, () -> {
                    runnable.run();
                    csu csu2 = new csu(this.hVo.Sn(), bdu_02.dRE());
                    aue_0.cVJ().etu().d(csu2);
                });
                return false;
            }
        }
        return true;
    }

    public bgt_0 daL() {
        return this.hVo;
    }

    public void eYa() {
        if (this.hVo == null || this.hVo.Sn() <= 0L) {
            return;
        }
        this.eYb();
    }

    public void oB(long l) {
        if (this.hVo == null || this.hVo.Sn() <= 0L) {
            return;
        }
        this.eYb();
        if (this.hVo.Sn() != l) {
            return;
        }
        this.au(aue_0.cVJ().cVK());
    }

    @Override
    public fif_2 onDialogCloseRequest(String string) {
        if (string.equals("temporaryTransferInventoryDialog")) {
            this.eYc();
            return fif_2.uAy;
        }
        return fif_2.uAv;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().f("temporaryInventory.currentDragItemId", -1);
            this.ikv = new cyw_1(this);
            fyw_0.gqw().a(this.ikv);
            ccg_2.eJI().a(this);
            fyw_0.gqw().tp("temporaryTransferInventoryDialog");
            ccj_2.g("temporaryTransferInventoryDialog", 32768L);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            this.au(bgt_02);
            bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
            fse_1.gFu().b("characterSheet", bgl_02, "temporaryTransferInventoryDialog");
            this.eYb();
            fyw_0.gqw().d("wakfu.temporaryInventory", chk_1.class);
            fiq_2.gCw().d(fik_2.gBZ().l("temporaryInventory.descr", new Object[0]).abQ(1));
        }
    }

    private void au(bgt_0 bgt_02) {
        this.hVo = bgt_02;
        fse_1.gFu().b("localPlayer", this.hVo, "temporaryTransferInventoryDialog");
        fse_1.gFu().b("characterSheet", bwa_0.jwi.aj((bhJ)fcL.rUh.sw(this.hVo.Sn())), "temporaryTransferInventoryDialog");
    }

    private void eYb() {
        if (this.hVo == null) {
            return;
        }
        ArrayList<bgt_0> arrayList = new ArrayList<bgt_0>();
        for (long l : fcL.rUh.sx(this.hVo.Xi())) {
            feh_0 feh_02;
            bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
            if (bgt_02 == null || (feh_02 = (feh_0)bgt_02.a(fez_0.seq)).aJG()) continue;
            arrayList.add(bgt_02);
        }
        if (arrayList.isEmpty()) {
            aue_0.cVJ().b(nYy);
            return;
        }
        if (((feh_0)this.hVo.a(fez_0.seq)).aJG()) {
            this.au((bgt_0)arrayList.get(0));
        }
        fse_1.gFu().b("heroesParty", arrayList, "temporaryTransferInventoryDialog");
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (fyw_0.gqw().to("splitStackDialog")) {
                fyw_0.gqw().tl("splitStackDialog");
            }
            fse_1.gFu().vX("temporaryInventory.currentDragItemId");
            fse_1.gFu().b("localPlayer", (Object)null, "temporaryTransferInventoryDialog");
            fyw_0.gqw().b(this.ikv);
            ccg_2.eJI().b(this);
            fyw_0.gqw().tl("temporaryTransferInventoryDialog");
            fyw_0.gqw().tc("wakfu.temporaryInventory");
            this.jnX = false;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void eYc() {
        if (this.jnX) {
            return;
        }
        fiq_2.gCw().d(new fik_2().l("temporaryInventory.reallyMove", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1).a(fil_2.gCo()).a(fil_2.gCn()).a((n, string) -> {
            if (n == 400) {
                clz_0 clz_02 = new clz_0();
                aue_0.cVJ().etu().d(clz_02);
                aue_0.cVJ().b(cyv_2.eXZ());
            }
            this.jnX = false;
        }));
        this.jnX = true;
    }
}

