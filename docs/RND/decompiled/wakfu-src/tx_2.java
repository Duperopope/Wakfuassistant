/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tX
 */
public class tx_2
implements gs_0 {
    public final tu_1 aca = new tu_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aca.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aca.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aca.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aca.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bM(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bM(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("entry=...\n");
        this.aca.bJ(stringBuilder, string + "  ");
    }
}

