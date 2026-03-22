/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aKG
 */
public class akg_0
extends ake_0
implements aKs {
    private static final Logger efk = Logger.getLogger(akg_0.class);
    private static final String efl = "SpellZoneEffect";
    private static final String efm = "SpellZoneAdditionalEffect";
    private static final String efn = "SpellRange";
    private static final String efo = "SpellRangeWithConstraint";
    private static final String efp = "SpellRangeWithoutLOS";
    private static final String efq = "SpellEmptyCellsNeeded";
    private static final eue_0 efr = new eue_0().mE(false).mF(false);
    private bmx_0 efs;
    private static final String eft = "forbidden.tga";
    private static final String efu = "notinLOS.tga";
    private static final akg_0 efv = new akg_0();

    public static akg_0 ciW() {
        return efv;
    }

    private akg_0() {
        super(efn, aid_0.dUX, efl, aid_0.dUU, efm, aid_0.dUV, efo, aid_0.dUY, efp, aid_0.dUZ, efq, aid_0.dUW);
    }

    public void a(bmx_0 bmx_02, bgy bgy2) {
        this.efs = bmx_02;
        this.k(bgy2);
        this.efs = null;
    }

    @Override
    public void b(List<eNl> list, bgy bgy2, acd_1 acd_12) {
        eNl eNl2 = list.get(list.size() - 1);
        if (eNl2 instanceof bmx_0 && ((bmt_0)((bmx_0)eNl2).giP()).cvM()) {
            this.L(acd_12);
            return;
        }
        super.b(list, bgy2, acd_12);
    }

    @Override
    protected akf_0 a(acd_1 acd_12, bgy bgy2) {
        switch (bgy2.dkZ().a((exP)bgy2, this.efs, acd_12, true, efr)) {
            case sUS: 
            case sUT: {
                return akf_0.efe;
            }
            case sUV: {
                return akf_0.efg;
            }
            case sVk: {
                if (this.efs.giP() != null && ((bmt_0)this.efs.giP()).g(fqS.sWn)) {
                    return akf_0.efi;
                }
                return akf_0.efh;
            }
        }
        return akf_0.efi;
    }

    @Override
    public void aPc() {
        try {
            String string = auc_0.cVq().bS("highLightGfxPath") + eft;
            if (this.efa != null) {
                this.efa.a(string, agb_0.cum);
            }
            string = auc_0.cVq().bS("highLightGfxPath") + efu;
            if (this.eeZ != null) {
                this.eeZ.a(string, agb_0.cum);
            }
        }
        catch (Exception exception) {
            efk.error((Object)exception);
        }
    }
}

