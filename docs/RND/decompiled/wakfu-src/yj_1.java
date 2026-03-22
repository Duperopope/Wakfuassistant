/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yJ
 */
final class yj_1 {
    private final ArrayList<yh_1> aml = new ArrayList(0);
    private byte amh = 0;
    final /* synthetic */ yg_2 amm;

    yj_1(yg_2 yg_22) {
        this.amm = yg_22;
    }

    public void avW() {
        this.amm.amg.clear();
        this.amm.amg.ensureCapacity(this.aml.size());
        this.amm.amg.addAll(this.aml);
        this.amm.amh = this.amh;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.aml.clear();
        this.aml.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yh_1 yh_12 = new yh_1();
            boolean bl = yh_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.aml.add(yh_12);
        }
        this.amh = byteBuffer.get();
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

