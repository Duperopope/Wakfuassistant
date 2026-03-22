/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eHf
 */
public abstract class ehf_0
extends anf_2 {
    protected static final Logger pFi = Logger.getLogger(eak_0.class);
    private boolean pFj;

    @Override
    public boolean bDp() {
        return false;
    }

    @Override
    public void bDx() {
        this.pFj = !this.pFj;
    }

    public long r(Object object, Object object2, Object object3, Object object4) {
        if (this.pFj) {
            return -1L;
        }
        return 1L;
    }
}

