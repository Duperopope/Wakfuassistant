/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.nio.ByteBuffer;

/*
 * Renamed from Wh
 */
public final class wh_0 {
    final wk_0 bMM;
    private ub_0 bMN;
    private uw_0 bMO;
    private static final int bMP = 5;
    private final byte[] bMQ = new byte[68];

    public wh_0(wk_0 wk_02) {
        this.bMM = wk_02;
    }

    void a(ub_0 ub_02) {
        if (this.bMN != null && this.bMN == ub_02) {
            return;
        }
        this.bMN = ub_02;
    }

    void r(ux_0 ux_02) {
        if (this.bMO != null && ux_02.k(this.bMO) == 0) {
            return;
        }
        this.bMO = new uw_0(ux_02);
    }

    public byte[] blK() {
        return this.bMQ;
    }

    void blL() {
        ux_0 ux_02 = new uw_0(this.bMO);
        THashSet tHashSet = new THashSet(4);
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.bMQ);
        byteBuffer.put((byte)5);
        for (int i = 0; i < 5; ++i) {
            wf_0 wf_02 = this.bMM.s(ux_02);
            ub_0 ub_02 = ub_0.n(ux_02);
            tHashSet.add((Object)ub_02);
            byte by = (byte)wf_02.bll();
            byte by2 = (byte)wf_02.blm();
            byte by3 = (byte)wf_02.blI();
            short s = (short)Math.floor(wf_02.blD() * 65535.0f);
            short s2 = (short)Math.floor(wf_02.blH() * 32767.0f);
            byteBuffer.put((byte)ub_02.ordinal());
            byteBuffer.put(by);
            byteBuffer.put(by2);
            byteBuffer.putShort(s);
            byteBuffer.putInt(wf_02.blE().d());
            byteBuffer.put(by3);
            byteBuffer.putShort(s2);
            ux_02 = ux_02.bjO();
        }
        byteBuffer.put((byte)tHashSet.size());
        tHashSet.forEach((TObjectProcedure)new wi_0(this, byteBuffer));
    }
}

