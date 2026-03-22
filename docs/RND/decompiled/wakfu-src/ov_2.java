/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oV
 */
public class ov_2
implements gs_0 {
    public final yg_2 RW = new yg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.RW.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.RW.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.RW.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            ow_2 ow_22 = new ow_2(this);
            boolean bl = ow_22.b(byteBuffer, n);
            if (bl) {
                ow_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.RW.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.l(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void l(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("symbiot=...\n");
        this.RW.eL(stringBuilder, string + "  ");
    }
}

