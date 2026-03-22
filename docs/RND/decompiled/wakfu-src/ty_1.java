/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tY
 */
public class ty_1
implements gs_0 {
    public final tv_2 acb = new tv_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.acb.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.acb.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.acb.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.acb.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bN(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bN(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("entry=...\n");
        this.acb.bK(stringBuilder, string + "  ");
    }
}

