/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ro
 */
public class ro_1
implements gs_0 {
    public int WB = 0;
    public int WC = 0;
    public int WD = 0;
    public int WE = 0;
    public int WF = 0;
    public int WG = 0;
    public static final int WH = 24;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WB);
        byteBuffer.putInt(this.WC);
        byteBuffer.putInt(this.WD);
        byteBuffer.putInt(this.WE);
        byteBuffer.putInt(this.WF);
        byteBuffer.putInt(this.WG);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        this.WC = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WE = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.WG = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.WB = 0;
        this.WC = 0;
        this.WD = 0;
        this.WE = 0;
        this.WF = 0;
        this.WG = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.am(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void am(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.WB).append('\n');
        stringBuilder.append(string).append("colorRefItemId=").append(this.WC).append('\n');
        stringBuilder.append(string).append("equippedRefItemId=").append(this.WD).append('\n');
        stringBuilder.append(string).append("sleepRefItemId=").append(this.WE).append('\n');
        stringBuilder.append(string).append("health=").append(this.WF).append('\n');
        stringBuilder.append(string).append("reskinRefItemId=").append(this.WG).append('\n');
    }
}

