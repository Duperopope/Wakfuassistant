/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wb
 */
public class wb_1
implements gs_0 {
    public short adx = 0;
    public final vy_2 agK = new vy_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adx);
        boolean bl = this.agK.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agK.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adx = 0;
        this.agK.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wc_1 wc_12 = new wc_1(this);
            boolean bl = wc_12.b(byteBuffer, n);
            if (bl) {
                wc_12.avW();
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
        return n += this.agK.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dd(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dd(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.adx).append('\n');
        stringBuilder.append(string).append("merchantItem=...\n");
        this.agK.db(stringBuilder, string + "  ");
    }
}

