/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from foj
 */
class foj_0
implements fnt_0 {
    private long sLb;

    foj_0() {
    }

    foj_0(ux_0 ux_02) {
        this.sLb = ux_02.bjB();
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.sLb);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.sLb = byteBuffer.getLong();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        fnm_02.ad(uw_0.fn(this.sLb));
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKQ;
    }

    public String toString() {
        return "PetLastHungryDateChange{m_lastHungryDate=" + this.sLb + "}";
    }
}

