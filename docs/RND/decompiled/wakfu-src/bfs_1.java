/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFS
 */
public class bfs_1
extends bfc_1 {
    private static final Logger jUd = Logger.getLogger(bfs_1.class);
    private short elG;

    public bfs_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.elG = Short.parseShort(stringArray[0]);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            jUd.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        bEq bEq2 = bEr.dSi().bW(this.elG);
        if (bEq2 == null) {
            jUd.warn((Object)("[ItemAction] SplitItemSetItemAction : la panoplie est inexistante id=" + this.elG));
            return false;
        }
        fgo_0 fgo_02 = fgn_0.a((exP)bgt_02, (ffa_0<? extends fhc_0>)bEq2, ffV2);
        switch (fgo_02) {
            case sjl: {
                this.jU(ffV2.LV());
                break;
            }
            case sjn: {
                aPd.e("error.impossibleDuringExchange", new Object[0]);
                return false;
            }
            case sjm: {
                aPd.e("error.itemSetSplit.notEnoughSpaceInInventory", new Object[0]);
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
    }

    public short cpe() {
        return this.elG;
    }

    @Override
    public fgM dTl() {
        return fgM.skF;
    }
}

