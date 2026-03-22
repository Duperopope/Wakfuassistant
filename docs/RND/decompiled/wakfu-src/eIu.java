/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class eIu
implements rx_0 {
    private static final Logger qwv = Logger.getLogger(eIu.class);
    public static final short qww = -1;
    public static final short qwx = 0;
    public static final eIu qwy = new eIv();
    private boolean qwz = false;
    protected final eIy qwA;

    protected eIu(@Nullable eIy eIy2) {
        this.qwA = eIy2;
    }

    public abstract int djk();

    public abstract byte[] djl();

    public abstract void dT(byte[] var1);

    @Override
    public boolean a(rw_0 rw_02, RG rG) {
        boolean bl = this.b(rw_02, rG);
        if (!bl) {
            qwv.warn((Object)("L'action " + rw_02.toString() + " n'a pas \u00e9t\u00e9 trait\u00e9e. (user = " + rG.toString() + ")"));
        }
        return bl;
    }

    public eIx fwz() {
        return this.qwA.dNx().fwB();
    }

    public void bt(short s) {
        if (this.qwA != null) {
            this.qwA.ac(s);
            this.qwA.bev();
        }
        this.qwz = s == -1;
    }

    public boolean fwA() {
        return this.qwz;
    }
}

