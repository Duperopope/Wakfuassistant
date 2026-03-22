/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tN
 */
public class tn_1
implements gs_0 {
    public final xz_1 abD = new xz_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.abD.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.abD.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.abD.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            to_2 to_22 = new to_2(this);
            boolean bl = to_22.b(byteBuffer, n);
            if (bl) {
                to_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.abD.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bF(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bF(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("room=...\n");
        this.abD.ed(stringBuilder, string + "  ");
    }
}

