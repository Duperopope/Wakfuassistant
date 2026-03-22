/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.AuthTicket
 */
import com.ankamagames.steam.common.AuthTicket;

/*
 * Renamed from cih
 */
public class cih_0
extends nv_0 {
    private long lUy;
    private AuthTicket lUA;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lUy);
        azg_12.dH(this.lUA.serialize());
        return this.a((byte)8, azg_12.bTe());
    }

    @Override
    public int d() {
        return 484;
    }

    public void mX(long l) {
        this.lUy = l;
    }

    public void a(AuthTicket authTicket) {
        this.lUA = authTicket;
    }
}

