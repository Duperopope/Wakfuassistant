/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vh
 */
public class vh_2
implements gs_0 {
    public final we_1 aeY = new we_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeY.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeY.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeY.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10037001) {
            vi_2 vi_22 = new vi_2(this);
            boolean bl = vi_22.b(byteBuffer, n);
            if (bl) {
                vi_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeY.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cD(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cD(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawMergedItems=...\n");
        this.aeY.de(stringBuilder, string + "  ");
    }
}

