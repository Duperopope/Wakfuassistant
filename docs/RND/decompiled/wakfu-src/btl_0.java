/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from btl
 */
public class btl_0
extends bth_0 {
    private static final Logger jlb = Logger.getLogger(btl_0.class);
    private static final btl_0 jlc = new btl_0();

    public static btl_0 dHL() {
        return jlc;
    }

    private btl_0() {
    }

    @Override
    public int aeV() {
        return -1;
    }

    @Override
    protected String dHG() {
        return null;
    }

    @Override
    protected String dHH() {
        return null;
    }

    @Override
    public void z(bdj_2 bdj_22) {
        if (bdj_22.ddm().ddQ()) {
            return;
        }
        bdj_22.dV("AnimStatique");
        bdj_22.dT(bdj_22.ddu());
    }

    @Override
    public void A(bdj_2 bdj_22) {
    }
}

