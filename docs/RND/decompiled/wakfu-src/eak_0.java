/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eAK
 */
public abstract class eak_0
extends amu_1 {
    protected static final Logger pwx = Logger.getLogger(eak_0.class);
    private boolean cJh;

    @Override
    public boolean bDp() {
        return false;
    }

    @Override
    public void bDx() {
        this.cJh = !this.cJh;
    }

    public long fny() {
        return this.cJh ? -1L : 1L;
    }
}

