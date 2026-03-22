/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cjk
 */
public class cjk_0
extends nv_0 {
    protected static final Logger lVZ = Logger.getLogger(cjk_0.class);
    protected static final boolean lWa = false;
    private final long lWb;
    private final String lWc;

    public cjk_0(long l, String string) {
        this.lWb = l;
        this.lWc = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lWb);
        if (this.lWc != null) {
            byte[] byArray = BH.aP(this.lWc);
            azg_12.aG((short)byArray.length);
            azg_12.dH(byArray);
        } else {
            azg_12.aG((short)0);
        }
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 22409;
    }
}

