/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aKA
 */
public class aka_0
extends ake_0
implements aKs {
    private static final Logger eeF = Logger.getLogger(aka_0.class);
    private static final String eeG = "ItemZoneEffect";
    private static final String eeH = "ItemZoneAdditionalEffect";
    private static final String eeI = "ItemRange";
    private static final String eeJ = "ItemRangeWithConstraint";
    private static final String eeK = "ItemRangeWithoutLOS";
    private static final String eeL = "ItemEmptyCellsNeeded";
    private ffV eeM;
    private static final String eeN = "forbidden.tga";
    private static final String eeO = "notinLOS.tga";
    private static final aka_0 eeP = new aka_0();

    public static aka_0 ciQ() {
        return eeP;
    }

    private aka_0() {
        super(eeI, aid_0.dUX, eeG, aid_0.dUU, eeH, aid_0.dUV, eeJ, aid_0.dUY, eeK, aid_0.dUZ, eeL, aid_0.dUW);
    }

    public void a(ffV ffV2, bgy bgy2) {
        this.eeM = ffV2;
        this.k(bgy2);
        this.eeM = null;
    }

    @Override
    protected akf_0 a(acd_1 acd_12, bgy bgy2) {
        switch (bgy2.dkZ().a((exP)bgy2, this.eeM, acd_12, true)) {
            case sUS: {
                return akf_0.efe;
            }
            case sUT: {
                return akf_0.eff;
            }
            case sUV: {
                return akf_0.efg;
            }
            case sVk: {
                return akf_0.efh;
            }
        }
        return akf_0.efi;
    }

    @Override
    public void aPc() {
        try {
            String string = auc_0.cVq().bS("highLightGfxPath") + eeN;
            this.efa.a(string, agb_0.cul);
            string = auc_0.cVq().bS("highLightGfxPath") + eeO;
            this.eeZ.a(string, agb_0.cum);
        }
        catch (Exception exception) {
            eeF.error((Object)exception);
        }
    }
}

