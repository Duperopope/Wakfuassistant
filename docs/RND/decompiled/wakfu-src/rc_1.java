/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rC
 */
public class rc_1
implements gs_0 {
    public final wi_1 Xf = new wi_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.Xf.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.Xf.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.Xf.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.Xf.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.at(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void at(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("properties=...\n");
        this.Xf.dw(stringBuilder, string + "  ");
    }
}

