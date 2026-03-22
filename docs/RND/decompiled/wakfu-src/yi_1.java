/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yI
 */
final class yi_1 {
    private final tg_2 amj = new tg_2();
    final /* synthetic */ yh_1 amk;

    yi_1(yh_1 yh_12) {
        this.amk = yh_12;
    }

    public void avW() {
        this.amk.ami.Rv = this.amj.Rv;
        this.amk.ami.ZZ = this.amj.ZZ;
        this.amk.ami.aaa = this.amj.aaa;
        this.amk.ami.Vk = this.amj.Vk;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.amj.b(byteBuffer, 1);
        return bl;
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

