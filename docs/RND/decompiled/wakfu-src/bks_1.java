/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkS
 */
public class bks_1
extends eyj_0 {
    private static final Logger isf = Logger.getLogger(bks_1.class);
    private final bhJ isg;
    private final pb_2 ish;

    public bks_1(bhJ bhJ2, pb_2 pb_22) {
        this.isg = bhJ2;
        this.ish = pb_22;
        this.ish.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Unauthorized on client");
    }

    @Override
    public void zm() {
        if (this.ish.SY != null) {
            this.isg.a(eMX.eD(this.ish.SY));
        }
        if (this.isg.dpV() == null) {
            this.isg.a(new eMS());
            isf.info((Object)"No DungeonProgression info, we set a new structure");
        }
    }
}

