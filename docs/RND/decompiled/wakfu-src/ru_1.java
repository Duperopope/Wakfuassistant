/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rU
 */
final class ru_1 {
    private final yu_1 XE = new yu_1();
    final /* synthetic */ rt_1 XF;

    ru_1(rt_1 rt_12) {
        this.XF = rt_12;
    }

    public void avW() {
        this.XF.XD.alN.clear();
        this.XF.XD.alN.ensureCapacity(this.XE.alN.size());
        this.XF.XD.alN.addAll(this.XE.alN);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.XE.b(byteBuffer, 1);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

