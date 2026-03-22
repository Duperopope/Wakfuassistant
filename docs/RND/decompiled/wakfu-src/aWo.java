/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class aWo
extends agb_1 {
    private static final Logger huE = Logger.getLogger(aWo.class);
    private final bgy huF;
    private final long huG;

    public aWo(int n, int n2, int n3, bgy bgy2, long l) {
        super(n, n2, n3);
        this.huF = bgy2;
        this.huG = l;
    }

    @Override
    protected long cbk() {
        cyx_2.eYd().cm(this.huF);
        cyx_2.eYd().oL(this.huG > 0L ? this.huG : 30000L);
        aue_0.cVJ().a(cyx_2.eYd());
        return 500L;
    }

    @Override
    protected void caV() {
    }
}

