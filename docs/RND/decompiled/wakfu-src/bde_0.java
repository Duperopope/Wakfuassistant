/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDE
 */
public class bde_0
extends ffs_0
implements Sp {
    private final bdh_0 jKN;

    public bde_0(long l, int n, RU rU, short s) {
        super(l, n, rU, s);
        this.a(this);
        this.jKN = new bdh_0(this);
    }

    @Override
    public void b(Sl sl) {
        switch (sl.bfB()) {
            case bog: {
                fse_1.gFu().a((aef_2)this.jKN, "bagInventory", "bagSize", "bagNameSize", "bagSizeMaxSize");
                break;
            }
            case boa: 
            case bnZ: {
                fse_1.gFu().a((aef_2)this.jKN, "bagInventory", "bagSize", "bagNameSize", "bagSizeMaxSize");
                Sn sn = (Sn)sl;
                if (sn.bfD() instanceof ffV) {
                    ffV ffV2 = (ffV)sn.bfD();
                    if (ffV2.apo()) {
                        bde_0.Z(ffV2);
                    }
                    if (ffV2.adO()) {
                        cxx_1.eXf().bS(ffV2);
                    }
                    bej_1.lg(ffV2.LV());
                }
                cAY.eHc().eHt();
                break;
            }
            case boc: 
            case bob: {
                Sn sn = (Sn)sl;
                fse_1.gFu().a((aef_2)this.jKN, "bagInventory", "bagSize", "bagNameSize", "bagSizeMaxSize");
                RT rT = sn.bfD();
                ffV ffV3 = (ffV)fse_1.gFu().aW("itemDetail", "inventoryDialog");
                if (ffV3 != null && ffV3.equals(rT)) {
                    fse_1.gFu().b("itemDetail", (Object)null, "inventoryDialog");
                    fse_1.gFu().b("pet", (Object)null, "inventoryDialog");
                }
                ffS ffS2 = null;
                if (sn.bfD() instanceof ffV) {
                    fhy_0 fhy_02;
                    ffS[] ffSArray;
                    ffV ffV4 = (ffV)rT;
                    if (ffV4.apo()) {
                        bde_0.Z(ffV4);
                        if (ffV4.adO()) {
                            cxx_1.eXf().bS(ffV4);
                        }
                    }
                    if ((ffSArray = (fhy_02 = ffV4.dOg().dGh()).fZq()).length > 0) {
                        ffS2 = ffSArray[0];
                    }
                    bej_1.lg(ffV4.LV());
                }
                cAY.eHc().m(ffS2);
                break;
            }
            case bod: {
                ffV ffV5;
                fse_1.gFu().a((aef_2)this.jKN, "bagInventory");
                Sn sn = (Sn)sl;
                if (!(sn.bfD() instanceof ffV) || !(ffV5 = (ffV)sn.bfD()).apo()) break;
                ffV5.bYg();
                break;
            }
        }
    }

    @Override
    public ffs_0 dRf() {
        return new bde_0(this.bgK, this.brR, this.sfo, this.bfa());
    }

    private static void Z(ffV ffV2) {
        ffV2.bYg();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && bgt_02.dlG() != null) {
            bgt_02.dlG().bb(ffV2);
        }
    }

    public bdh_0 dRg() {
        return this.jKN;
    }
}

