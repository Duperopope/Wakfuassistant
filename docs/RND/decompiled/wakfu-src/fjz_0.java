/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fjz
 */
public abstract class fjz_0
implements gr_0 {
    protected static final Logger syX = Logger.getLogger(fjz_0.class);
    private final fjb_0 syY;
    protected int epQ;

    protected fjz_0(fjb_0 fjb_02) {
        this.syY = fjb_02;
    }

    public fjb_0 gbV() {
        return this.syY;
    }

    public void Le(int n) {
        this.epQ = n;
    }

    public int Xt() {
        return this.epQ;
    }

    protected final fjo_0 gbW() {
        return fjt.syH.WG(this.epQ);
    }

    public abstract void bGy();

    public abstract boolean h(fjm var1);
}

