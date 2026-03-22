/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZI
 */
public class czi_1
implements aaq_2 {
    public boolean a(aam_2 aam_22) {
        bvi bvi2 = (bvi)fse_1.gFu().vY("selectedGuildRank");
        if (bvi2 == null) {
            return false;
        }
        String string = bvi2.getName();
        if (!string.equals(bvk.dJZ().kI(bvi2.Sn()).getName()) && !VV.bkY().dB(string)) {
            fiq_2.gCw().d(fik_2.gBZ().l("error.guild.rank.invalidName", new Object[0]).vG(ccp_2.mRF.byf()));
            return false;
        }
        bvk.dJZ().a(bvi2);
        fse_1.gFu().f("rankModificationDirty", false);
        return false;
    }

    @Override
    public int bkq() {
        return 17969;
    }
}

