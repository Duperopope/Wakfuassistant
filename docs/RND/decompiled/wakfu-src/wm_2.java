/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wM
 */
public class wm_2
implements gs_0 {
    public int aiw = 0;
    public int aix = 0;
    public int aiy = 0;
    public static final int aiz = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aiw);
        byteBuffer.putInt(this.aix);
        byteBuffer.putInt(this.aiy);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aiw = byteBuffer.getInt();
        this.aix = byteBuffer.getInt();
        this.aiy = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.aiw = 0;
        this.aix = 0;
        this.aiy = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 313) {
            wn_1 wn_12 = new wn_1(this);
            boolean bl = wn_12.b(byteBuffer, n);
            if (bl) {
                wn_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dA(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dA(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("dropTableId=").append(this.aiw).append('\n');
        stringBuilder.append(string).append("dropTableIdToBuy=").append(this.aix).append('\n');
        stringBuilder.append(string).append("dropTableIdChaos=").append(this.aiy).append('\n');
    }
}

