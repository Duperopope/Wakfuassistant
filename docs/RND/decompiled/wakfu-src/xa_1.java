/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xa
 */
public class xa_1
implements gs_0 {
    public final uh_1 ajg = new uh_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ajg.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ajg.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ajg.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ajg.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dK(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dK(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("target=...\n");
        this.ajg.bT(stringBuilder, string + "  ");
    }
}

