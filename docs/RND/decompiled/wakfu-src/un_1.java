/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uN
 */
public class un_1
implements gs_0 {
    public final uj_1 adZ = new uj_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.adZ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.adZ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adZ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.adZ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cq(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cq(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("building=...\n");
        this.adZ.cm(stringBuilder, string + "  ");
    }
}

