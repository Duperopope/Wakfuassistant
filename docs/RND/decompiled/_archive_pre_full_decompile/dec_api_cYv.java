/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cYv
implements aDI,
fIg {
    protected static final Logger nYx = Logger.getLogger(cYv.class);
    private static final cYv nYy = new cYv();
    private boolean jnX = false;
    private bgT hVo;
    private alX ikv;

    public static cYv eXZ() {
        return nYy;
    }

    @Override
    public boolean b(aAM aAM2) {
        switch (aAM2.d()) {
            case 16179: {
                dae dae2 = (dae)aAM2;
                long l = dae2.bCp();
                this.au((bgT)fcL.rUh.sw(l));
                return false;
            }
            case 16837: {
                this.eYc();
                return false;
            }
            case 18339: {
                dbL dbL2 = (dbL)aAM2;
                bgT bgT2 = (bgT)fcI.ab(this.hVo.Xi(), dbL2.getDestinationUniqueId());
                ffV ffV3 = dbL2.getItem();
                short s = dbL2.getDestinationPosition();
                if (dbL2.getDestinationUniqueId() == -1L) {
                    fIQ.gCw().d(new fIK().l("question.deleteItem", ffV3.getName()).vG(cCP.mRF.byf()).a(fIL.gCo()).a(fIL.gCn().c(string -> {
                        clA clA2 = new clA();
                        clA2.nl(dbL2.getDestinationUniqueId());
                        clA2.setDestinationPosition(s);
                        clA2.ak(dbL2.bfd());
                        clA2.nk(ffV3.LV());
                        aUE.cVJ().etu().d(clA2);
                    })));
                    return false;
                }
                ffs ffs2 = bgT2.dno().sY(dbL2.getDestinationUniqueId());
                ffV ffV4 = ffs2.eQ(s);
                if (!(ffV4 == null || ffV4.bfe() > 1 && ffV4.n(ffV3) && ffV4.bfd() != ffV4.bfe())) {
                    return false;
                }
                clA clA2 = new clA();
                clA2.nl(dbL2.getDestinationUniqueId());
                clA2.setDestinationPosition(s);
                clA2.ak(dbL2.bfd());
                clA2.nk(ffV3.LV());
                aUE.cVJ().etu().d(clA2);
                return false;
            }
            case 17504: {
                feH feH2 = (feH)this.hVo.a(fez.seq);
                if (feH2 == null) {
                    return false;
                }
                if (feH2.aJG()) {
                    return false;
                }
                bgT bgT3 = cVO.daL();
                if (bgT3 == null) {
                    return false;
                }
                List<ffV> list = fgt.a(bgT3.dno(), feH2.fba());
                List<ffV> list2 = this.hVo.Sn() == bgT3.Sn() ? list : list.stream().filter(ffV2 -> cVU.b(bgT3, ffV2)).toList();
                if (list2.isEmpty()) {
                    String string2 = aUM.cWf().c("market.inventory.is.full", new Object[0]);
                    bYJ.epo().a(bYC.b(bYH.lAA, string2));
                    return false;
                }
                clv clv2 = new clv(this.hVo.Sn(), bgT3.Sn(), list2.stream().map(ffV::LV).toList());
                aUE.cVJ().etu().d(clv2);
                return false;
            }
            case 17400: {
                feH feH3 = (feH)this.hVo.a(fez.seq);
                List<ffV> list = feH3.fba();
                List<ffV> list3 = fgt.a(list, 27083);
                bDU bDU2 = bDR.b(this.hVo, list3);
                Runnable runnable = () -> {
                    boolean bl;
                    boolean bl2 = bl = list3.size() != list.size();
                    if (bl) {
                        String string = aUM.cWf().c("temporary.inventory.recycle.shards", new Object[0]);
                        bYJ.epo().a(bYC.b(bYH.lAB, string));
                    }
                };
                if (bDU2.dRE().isEmpty()) {
                    runnable.run();
                    return false;
                }
                bDR.a(bDU2, () -> {
                    runnable.run();
                    csu csu2 = new csu(this.hVo.Sn(), bDU2.dRE());
                    aUE.cVJ().etu().d(csu2);
                });
                return false;
            }
        }
        return true;
    }

    public bgT daL() {
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
        this.au(aUE.cVJ().cVK());
    }

    @Override
    public fIf onDialogCloseRequest(String string) {
        if (string.equals("temporaryTransferInventoryDialog")) {
            this.eYc();
            return fIf.uAy;
        }
        return fIf.uAv;
    }

    @Override
    public void a(ayE ayE2, boolean bl) {
        if (!bl) {
            fSe.gFu().f("temporaryInventory.currentDragItemId", -1);
            this.ikv = new cYw(this);
            fyw.gqw().a(this.ikv);
            cCG.eJI().a(this);
            fyw.gqw().tp("temporaryTransferInventoryDialog");
            cCJ.g("temporaryTransferInventoryDialog", 32768L);
            bgT bgT2 = aUE.cVJ().cVK();
            this.au(bgT2);
            bgL bgL2 = bwa.jwi.aj(bgT2);
            fSe.gFu().b("characterSheet", bgL2, "temporaryTransferInventoryDialog");
            this.eYb();
            fyw.gqw().d("wakfu.temporaryInventory", cHk.class);
            fIQ.gCw().d(fIK.gBZ().l("temporaryInventory.descr", new Object[0]).abQ(1));
        }
    }

    private void au(bgT bgT2) {
        this.hVo = bgT2;
        fSe.gFu().b("localPlayer", this.hVo, "temporaryTransferInventoryDialog");
        fSe.gFu().b("characterSheet", bwa.jwi.aj((bhJ)fcL.rUh.sw(this.hVo.Sn())), "temporaryTransferInventoryDialog");
    }

    private void eYb() {
        if (this.hVo == null) {
            return;
        }
        ArrayList<bgT> arrayList = new ArrayList<bgT>();
        for (long l : fcL.rUh.sx(this.hVo.Xi())) {
            feH feH2;
            bgT bgT2 = (bgT)fcL.rUh.sw(l);
            if (bgT2 == null || (feH2 = (feH)bgT2.a(fez.seq)).aJG()) continue;
            arrayList.add(bgT2);
        }
        if (arrayList.isEmpty()) {
            aUE.cVJ().b(nYy);
            return;
        }
        if (((feH)this.hVo.a(fez.seq)).aJG()) {
            this.au((bgT)arrayList.get(0));
        }
        fSe.gFu().b("heroesParty", arrayList, "temporaryTransferInventoryDialog");
    }

    @Override
    public void b(ayE ayE2, boolean bl) {
        if (!bl) {
            if (fyw.gqw().to("splitStackDialog")) {
                fyw.gqw().tl("splitStackDialog");
            }
            fSe.gFu().vX("temporaryInventory.currentDragItemId");
            fSe.gFu().b("localPlayer", (Object)null, "temporaryTransferInventoryDialog");
            fyw.gqw().b(this.ikv);
            cCG.eJI().b(this);
            fyw.gqw().tl("temporaryTransferInventoryDialog");
            fyw.gqw().tc("wakfu.temporaryInventory");
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
        fIQ.gCw().d(new fIK().l("temporaryInventory.reallyMove", new Object[0]).vG(cCP.mRE.byf()).abQ(1).a(fIL.gCo()).a(fIL.gCn()).a((n, string) -> {
            if (n == 400) {
                clz clz2 = new clz();
                aUE.cVJ().etu().d(clz2);
                aUE.cVJ().b(cYv.eXZ());
            }
            this.jnX = false;
        }));
        this.jnX = true;
    }
}
