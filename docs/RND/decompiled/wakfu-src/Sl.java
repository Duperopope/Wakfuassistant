/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class Sl
implements sg_0 {
    protected static final Logger bnW = Logger.getLogger(Sl.class);
    protected final Sj bnX;
    protected final Sm bnY;

    public Sl(Sj sj, Sm sm) {
        this.bnX = sj;
        this.bnY = sm;
    }

    public Sj bfc() {
        return this.bnX;
    }

    public Sm bfB() {
        return this.bnY;
    }

    public String toString() {
        return "InventoryEvent{m_action=" + String.valueOf((Object)this.bnY) + ", m_eventInventoryType=" + String.valueOf((Object)this.bnX) + "}";
    }
}

