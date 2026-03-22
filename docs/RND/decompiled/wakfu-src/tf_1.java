/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tF
 */
public class tf_1
implements gs_0 {
    public final uc_1 aaZ = new uc_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aaZ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aaZ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aaZ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aaZ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bA(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bA(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("resource=...\n");
        this.aaZ.bP(stringBuilder, string + "  ");
    }
}

