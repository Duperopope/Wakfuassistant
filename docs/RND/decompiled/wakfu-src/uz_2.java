/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uZ
 */
public class uz_2
implements gs_0 {
    public final ve_1 aeN = new ve_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeN.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeN.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeN.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10045010) {
            va_1 va_12 = new va_1(this);
            boolean bl = va_12.b(byteBuffer, n);
            if (bl) {
                va_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeN.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cz(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cz(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawItemBind=...\n");
        this.aeN.cP(stringBuilder, string + "  ");
    }
}

