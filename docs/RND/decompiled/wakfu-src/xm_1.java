/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xm
 */
public class xm_1
implements gs_0 {
    public short adx = 0;
    public byte Us = 0;
    public int ajA = 0;
    public long ajB = 0L;
    public long ajC = -1L;
    public final vy_2 ajD = new vy_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adx);
        byteBuffer.put(this.Us);
        byteBuffer.putInt(this.ajA);
        byteBuffer.putLong(this.ajB);
        byteBuffer.putLong(this.ajC);
        boolean bl = this.ajD.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        this.Us = byteBuffer.get();
        this.ajA = byteBuffer.getInt();
        this.ajB = byteBuffer.getLong();
        this.ajC = byteBuffer.getLong();
        boolean bl = this.ajD.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adx = 0;
        this.Us = 0;
        this.ajA = 0;
        this.ajB = 0L;
        this.ajC = -1L;
        this.ajD.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            xn_1 xn_12 = new xn_1(this);
            boolean bl = xn_12.b(byteBuffer, n);
            if (bl) {
                xn_12.avW();
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
        ++n;
        n += 4;
        n += 8;
        n += 8;
        return n += this.ajD.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dU(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dU(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.adx).append('\n');
        stringBuilder.append(string).append("type=").append(this.Us).append('\n');
        stringBuilder.append(string).append("featureReferenceId=").append(this.ajA).append('\n');
        stringBuilder.append(string).append("duration=").append(this.ajB).append('\n');
        stringBuilder.append(string).append("startDate=").append(this.ajC).append('\n');
        stringBuilder.append(string).append("merchantItem=...\n");
        this.ajD.db(stringBuilder, string + "  ");
    }
}

