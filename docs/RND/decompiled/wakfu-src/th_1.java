/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from th
 */
final class th_1 {
    private byte Rv = 0;
    private short ZZ = 0;
    private short aaa = 0;
    private String Vk = null;
    final /* synthetic */ tg_2 aab;

    th_1(tg_2 tg_22) {
        this.aab = tg_22;
    }

    public void avW() {
        this.aab.Rv = this.Rv;
        this.aab.ZZ = this.ZZ;
        this.aab.aaa = this.aaa;
        this.aab.Vk = this.Vk;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Rv = byteBuffer.get();
        this.ZZ = byteBuffer.getShort();
        this.aaa = byteBuffer.getShort();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10013) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

