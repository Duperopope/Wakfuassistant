/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from foi
 */
class foi_0
implements fnt_0 {
    private int epe;

    foi_0() {
    }

    foi_0(int n) {
        this.epe = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.epe);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.epe = byteBuffer.getInt();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        fnm_02.Xt(this.epe);
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKN;
    }

    public String toString() {
        return "PetHealthChangeEvent{m_health=" + this.epe + "}";
    }
}

