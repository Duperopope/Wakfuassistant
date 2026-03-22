/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tq
 */
public class tq_2
implements gs_0 {
    public byte Rv = 0;
    public int aav = 0;
    public int aaw = 0;
    public int aax = 0;
    public int aay = 0;
    public static final int aaz = 17;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Rv);
        byteBuffer.putInt(this.aav);
        byteBuffer.putInt(this.aaw);
        byteBuffer.putInt(this.aax);
        byteBuffer.putInt(this.aay);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Rv = byteBuffer.get();
        this.aav = byteBuffer.getInt();
        this.aaw = byteBuffer.getInt();
        this.aax = byteBuffer.getInt();
        this.aay = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Rv = 0;
        this.aav = 0;
        this.aaw = 0;
        this.aax = 0;
        this.aay = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            tr_2 tr_22 = new tr_2(this);
            boolean bl = tr_22.b(byteBuffer, n);
            if (bl) {
                tr_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 17;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bs(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bs(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("index=").append(this.Rv).append('\n');
        stringBuilder.append(string).append("current=").append(this.aav).append('\n');
        stringBuilder.append(string).append("min=").append(this.aaw).append('\n');
        stringBuilder.append(string).append("max=").append(this.aax).append('\n');
        stringBuilder.append(string).append("maxPercentModifier=").append(this.aay).append('\n');
    }
}

