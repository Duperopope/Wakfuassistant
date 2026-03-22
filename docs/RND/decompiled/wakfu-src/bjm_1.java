/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bjm
 */
public class bjm_1 {
    private static final Logger iob = Logger.getLogger(bjm_1.class);
    private final bjn_1 ioc;

    public bjm_1(bjn_1 bjn_12) {
        this.ioc = bjn_12;
    }

    public void q(bdj_2 bdj_22) {
        if (this.ioc.Ya() == 0L) {
            bdj_22.chD();
            return;
        }
        bdj_22.a(this.ioc);
    }
}

