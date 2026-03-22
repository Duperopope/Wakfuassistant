/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wS
 */
public class ws_2
implements gs_0 {
    public final uh_1 aiH = new uh_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aiH.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aiH.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aiH.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aiH.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dF(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dF(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("target=...\n");
        this.aiH.bT(stringBuilder, string + "  ");
    }
}

