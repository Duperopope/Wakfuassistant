/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yD
 */
public class yd_1
implements gs_0 {
    public short adx = 0;
    public final uy_1 amb = new uy_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adx);
        boolean bl = this.amb.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.amb.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adx = 0;
        this.amb.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            ye_1 ye_12 = new ye_1(this);
            boolean bl = ye_12.b(byteBuffer, n);
            if (bl) {
                ye_12.avW();
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
        return n += this.amb.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eK(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eK(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.adx).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.amb.cy(stringBuilder, string + "  ");
    }
}

