/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sf
 */
public class sf_2
implements gs_0 {
    public final yj_2 XX = new yj_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.XX.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.XX.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.XX.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.XX.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aG(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aG(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("inventory=...\n");
        this.XX.ez(stringBuilder, string + "  ");
    }
}

