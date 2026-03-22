/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from foo
 */
class foo_0
implements fnt_0 {
    private int asC;

    foo_0() {
    }

    foo_0(int n) {
        this.asC = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.asC);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.asC = byteBuffer.getInt();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        fnm_02.Xr(this.asC);
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKO;
    }

    public String toString() {
        return "PetXpChange{m_xp=" + this.asC + "}";
    }
}

