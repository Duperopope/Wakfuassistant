/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vz
 */
public class vz_1
implements gs_0 {
    public final ue_1 afH = new ue_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afH.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afH.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afH.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            va_2 va_22 = new va_2(this);
            boolean bl = va_22.b(byteBuffer, n);
            if (bl) {
                va_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afH.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cN(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cN(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("doubledata=...\n");
        this.afH.bR(stringBuilder, string + "  ");
    }
}

