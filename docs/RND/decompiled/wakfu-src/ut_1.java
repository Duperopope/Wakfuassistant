/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ut
 */
public class ut_1
implements gs_0 {
    public final ur_2 adh = new ur_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.adh.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.adh.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adh.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.adh.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cc(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cc(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("giftItem=...\n");
        this.adh.ca(stringBuilder, string + "  ");
    }
}

