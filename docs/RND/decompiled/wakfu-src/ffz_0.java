/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ffz
 */
public abstract class ffz_0<SourceInventoryType extends RS<ffV>, TargetInventoryType extends RS<ffV>>
implements RV<ffV, SourceInventoryType, TargetInventoryType> {
    protected static final boolean sfB = false;
    public static final int sfC = -1;
    public static final int sfD = 0;
    public static final int sfE = 1;
    protected static final Logger sfF = Logger.getLogger(ffz_0.class);

    protected boolean a(ffV ffV2, fgd_0 fgd_02, short s) {
        boolean bl;
        try {
            bl = fgd_02.a(ffV2, s);
            if (ffV2.dOg().dGh().fZs() != null) {
                for (ffS ffS2 : ffV2.dOg().dGh().fZs()) {
                    ffV ffV3 = ffV2.fVR();
                    bl &= fgd_02.a(ffV3, ffS2.aJr());
                }
            }
        }
        catch (SD sD) {
            fgd_02.c(ffV2);
            for (ffS ffS3 : ffV2.dOg().dGh().fZs()) {
                ffV ffV4 = (ffV)fgd_02.af(ffS3.aJr());
                if (ffV4 == null) continue;
                ffV4.aZp();
            }
            return false;
        }
        return bl;
    }

    protected boolean a(ffV ffV2, fgd_0 fgd_02) {
        boolean bl = fgd_02.c(ffV2);
        if (ffV2.dOg().dGh().fZs() != null) {
            for (ffS ffS2 : ffV2.dOg().dGh().fZs()) {
                ffV ffV3 = (ffV)fgd_02.af(ffS2.aJr());
                if (ffV3 == null) continue;
                ffV3.aZp();
            }
        }
        return bl;
    }
}

