/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tB
 */
final class tb_2 {
    private final ArrayList<tz_2> aaU = new ArrayList(0);
    private int aaP = 0;
    final /* synthetic */ ty_2 aaV;

    tb_2(ty_2 ty_22) {
        this.aaV = ty_22;
    }

    public void avW() {
        this.aaV.aaO.clear();
        this.aaV.aaO.ensureCapacity(this.aaU.size());
        this.aaV.aaO.addAll(this.aaU);
        this.aaV.aaP = this.aaP;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aaU.clear();
        this.aaU.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tz_2 tz_22 = new tz_2();
            boolean bl = tz_22.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.aaU.add(tz_22);
        }
        return true;
    }

    private boolean dy(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aaU.clear();
        this.aaU.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tz_2 tz_22 = new tz_2();
            boolean bl = tz_22.b(byteBuffer, 10045002);
            if (!bl) {
                return false;
            }
            this.aaU.add(tz_22);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10045002) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10048001) {
            boolean bl = this.dy(byteBuffer);
            return bl;
        }
        return false;
    }
}

