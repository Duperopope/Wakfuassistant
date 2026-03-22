/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdI
 */
public class bdi_2
extends beg_2<bdj_1> {
    private static final Logger hMk = Logger.getLogger(bdi_2.class);
    private String hMl;

    @Override
    protected void a(bdj_2 bdj_22, bdj_1 bdj_12) {
        if (this.dem()) {
            assert (this.hMl == null);
            this.hMl = bdj_22.bpE();
        }
    }

    @Override
    public void a(bdj_1 bdj_12, bdj_1 bdj_13, bdj_2 bdj_22) {
        if (this.dem()) {
            bdj_22.dU(this.hMl);
            this.hMl = null;
        } else {
            bdj_1 bdj_14 = (bdj_1)this.den();
            if (!bdj_14.equals(bdj_12)) {
                bdj_14.p(bdj_22);
            }
        }
    }
}

