/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cir
 */
public class cir_0
extends nv_0 {
    private int duh;
    @Nullable
    private Long lUH;

    public void zS(int n) {
        this.duh = n;
    }

    public void G(@Nullable Long l) {
        this.lUH = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(13);
        azg_12.vC(this.duh);
        if (this.lUH != null) {
            azg_12.dz(true);
            azg_12.gK(this.lUH);
        } else {
            azg_12.dz(false);
        }
        return this.a((byte)8, azg_12.bTe());
    }

    @Override
    public int d() {
        return 573;
    }

    @Override
    public String toString() {
        return "WakfuAuthenticationTokenRequestMessage{m_serverId=" + this.duh + ", m_forcedAccountId=" + this.lUH + "}";
    }
}

