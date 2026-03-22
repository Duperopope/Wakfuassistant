/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from cTq
 */
public class ctq_1
extends crw_2 {
    protected static final Logger nIQ = Logger.getLogger(ctq_1.class);
    private static final ctq_1 nIR = new ctq_1();
    private bli_0 nIS;
    private String jdw;
    private alx_2 ikv;

    public static ctq_1 ePB() {
        return nIR;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (!bl) {
            this.ikv = new ctr_2(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.collectMachine", cdt_1.class);
            fey_2 fey_22 = (fey_2)ccj_2.g(this.jdw, 16L);
            if (fey_22 == null) {
                nIQ.error((Object)("Unable to retrieve collect window ! loaded=" + fyw_0.gqw().to(this.jdw)));
            } else {
                this.bB(fey_22);
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (!bl) {
            fyw_0.gqw().tc("wakfu.collectMachine");
            fyw_0.gqw().b(this.ikv);
            if (fyw_0.gqw().to("freeCollectMachineDialog")) {
                fyw_0.gqw().tl("freeCollectMachineDialog");
            }
            if (fyw_0.gqw().to("lockedCollectMachineDialog")) {
                fyw_0.gqw().tl("lockedCollectMachineDialog");
            }
            fse_1.gFu().vX("collectMachine");
        }
    }

    public void a(bld_0 bld_02) {
        if (bld_02 == null) {
            nIQ.error((Object)"on tent d'afficher une provider null");
            return;
        }
        if (bld_02.djh().fTp()) {
            this.nIS = new bll_0(bld_02);
            this.jdw = "lockedCollectMachineDialog";
        } else {
            this.nIS = new blo_1(bld_02);
            this.jdw = "freeCollectMachineDialog";
        }
        fse_1.gFu().f("collectMachine", this.nIS);
        if (!fyw_0.gqw().to(this.jdw)) {
            aue_0.cVJ().a(this);
        }
    }

    public bli_0 ePC() {
        return this.nIS;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19061: {
                daC daC2 = (daC)aam_22;
                long l = daC2.bCo();
                blk_0 blk_02 = daC2.eZV();
                long l2 = blk_02.dtr();
                if (l > l2 || l == -1L) {
                    l = l2;
                }
                blk_02.DC(GC.cw(l));
                fse_1.gFu().a((aef_2)blk_02, "currentPlayerQuantity", "canMax", "valid");
                return false;
            }
            case 18242: {
                daC daC3 = (daC)aam_22;
                blk_0 blk_03 = daC3.eZV();
                TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
                bke_1 bke_12 = (bke_1)aue_0.cVJ().cVK().dps();
                if (bke_12 == null) {
                    return false;
                }
                if (blk_03 instanceof blm_0) {
                    tIntIntHashMap.put(((blm_0)blk_03).acs(), GC.cw(blk_03.dtv()));
                    bke_12.a(tIntIntHashMap, 0L);
                    blk_03.DC(0);
                } else {
                    bke_12.a(tIntIntHashMap, this.nIS.dtp());
                }
                return false;
            }
            case 16784: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                ffV ffV2 = dbl_02.getItem();
                fee fee2 = new fee(dbl_02.bCp(), ffV2 != null ? ffV2.avr() : -1, dbl_02.bCq());
                ctq_1.a(fee2);
                return false;
            }
            case 19660: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                long l = dbl_03.getDestinationUniqueId();
                ffV ffV3 = dbl_03.getItem();
                ctq_1.a(new fem(ffV3.LV(), ffV3.avr(), dbl_03.bfd(), l, (byte)dbl_03.getDestinationPosition()));
                cdt_1.setDraggedItemId(-1L);
                return false;
            }
            case 19409: {
                long l = ((dae_0)aam_22).bCp();
                if (l == 0L) {
                    return false;
                }
                ctq_1.a(new feg(l));
                return false;
            }
            case 17390: {
                int n = ((dae_0)aam_22).bCo();
                if (n == 0) {
                    return false;
                }
                ctq_1.a(new feo(n));
                return false;
            }
        }
        return true;
    }

    private static void a(fec fec2) {
        cmp_0 cmp_02 = new cmp_0(fec2);
        aue_0.cVJ().etu().d(cmp_02);
    }

    @Override
    public long Sn() {
        return 11L;
    }

    @Override
    public void dC(long l) {
    }
}

