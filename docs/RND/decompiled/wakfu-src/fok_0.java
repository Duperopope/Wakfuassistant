/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fok
 */
class fok_0
implements fnt_0 {
    private long sLc;

    fok_0() {
    }

    fok_0(ux_0 ux_02) {
        this.sLc = ux_02.bjB();
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.sLc);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.sLc = byteBuffer.getLong();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        fnm_02.ac(uw_0.fn(this.sLc));
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKP;
    }

    public String toString() {
        return "PetLastMealDateChange{m_lastMealDate=" + this.sLc + "}";
    }
}

