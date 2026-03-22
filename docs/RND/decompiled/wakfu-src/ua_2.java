/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uA
 */
public class ua_2
implements gs_0 {
    public short adx = 0;
    public final uy_1 ady = new uy_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adx);
        boolean bl = this.ady.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.ady.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adx = 0;
        this.ady.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            ub_2 ub_22 = new ub_2(this);
            boolean bl = ub_22.b(byteBuffer, n);
            if (bl) {
                ub_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.ady.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ch(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ch(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.adx).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.ady.cy(stringBuilder, string + "  ");
    }
}

