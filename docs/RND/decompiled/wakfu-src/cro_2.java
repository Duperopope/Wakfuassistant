/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRO
 */
public abstract class cro_2 {
    private static bnv_2 nDJ;
    protected static afm_0 nDK;
    protected static long nDL;

    public static bnv_2 eMW() {
        return nDJ;
    }

    public static void d(bnv_2 bnv_22) {
        nDJ = bnv_22;
    }

    public void bkZ() {
        if (nDJ == null) {
            return;
        }
        nDJ.dyX().fVz();
        fse_1.gFu().f("flea", nDJ);
        fse_1.gFu().f("fleaSelectedGood", (Object)null);
        fse_1.gFu().f("fleaTitle", aum_0.cWf().c("flea.of", nDJ.dyT()));
        fyw_0.gqw().d("wakfu.flea", cei_1.class);
    }

    public void clean() {
        if (nDJ == null) {
            return;
        }
        nDJ.b((bez_1)null);
        fse_1.gFu().vX("flea");
        fse_1.gFu().vX("fleaSelectedGood");
        fse_1.gFu().vX("currentItemQuantity");
        fse_1.gFu().vX("currentItemTotalPrice");
        fse_1.gFu().vX("currentItemFormatedTotalPrice");
        fse_1.gFu().vX("fleaTitle");
        fyw_0.gqw().tc("wakfu.flea");
        afh_0.bxU().fS(nDL);
    }
}

