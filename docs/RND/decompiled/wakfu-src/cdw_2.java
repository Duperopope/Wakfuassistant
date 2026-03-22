/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cDw
 */
@fyf_0
public class cdw_2
extends cex_2 {
    private static final Logger mTn = Logger.getLogger(cdw_2.class);
    public static final String PACKAGE = "wakfu.buildingPanel";

    public static void evolveBuilding(fiq_1 fiq_12) {
        cdw_2.evolveBuilding(fiq_12, (bQW)fse_1.gFu().vY("selectedBuilding"));
    }

    public static void deleteBuilding(fiq_1 fiq_12) {
        cdw_2.createDeleteMessageBox((n, string) -> {
            if (n == 400) {
                fas_0 fas_02 = csh_2.eOr().eMN();
                cdw_2.deleteBuilding(fas_02.Lx());
                aue_0.cVJ().b(csh_2.eOr());
            }
        });
    }

    public static void createDeleteMessageBox(fio_2 fio_22) {
        fik_2 fik_22 = fik_2.gBY().l("question.havenWorldDeleteBuilding", new Object[0]).a(fio_22);
        fiq_2.gCw().d(fik_22);
    }

    public static void deleteBuilding(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        faV faV2 = new faV(l);
        ckz_0 ckz_02 = new ckz_0(bgt_02.Sn());
        ckz_02.a(faV2);
        aue_0.cVJ().etu().d(ckz_02);
    }

    public static void dropFrontManual(fla_2 fla_22) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        csh_2.eOr().eOs();
        ffV ffV2 = (ffV)fla_22.getValue();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.lK(18750);
        aaw_1.bUq().h(dbl_02);
    }

    public static void removeFrontManual(flu_1 flu_12) {
        dae_0.cV((short)19665);
    }
}

