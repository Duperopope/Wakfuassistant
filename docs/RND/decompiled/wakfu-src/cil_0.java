/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.AuthTicket
 */
import com.ankamagames.steam.common.AuthTicket;

/*
 * Renamed from cil
 */
public class cil_0
extends nv_0 {
    private byte[] lUB;
    private long lUy = -1L;
    private AuthTicket lUA;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lUB.length);
        azg_12.dH(this.lUB);
        azg_12.gK(this.lUy);
        azg_12.dH(this.lUA.serialize());
        return this.a((byte)8, azg_12.bTe());
    }

    @Override
    public int d() {
        return 584;
    }

    public void ei(byte[] byArray) {
        this.lUB = (byte[])byArray.clone();
    }

    public void mX(long l) {
        this.lUy = l;
    }

    public void a(AuthTicket authTicket) {
        this.lUA = authTicket;
    }
}

