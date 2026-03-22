/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vS
 */
public class vs_2
implements gs_0 {
    public int acO = 0;
    public int acP = 0;
    public short acQ = 0;
    public byte WR = 0;
    public long Ut = 0L;
    public boolean aet = false;
    public static final int agn = 20;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.acO);
        byteBuffer.putInt(this.acP);
        byteBuffer.putShort(this.acQ);
        byteBuffer.put(this.WR);
        byteBuffer.putLong(this.Ut);
        byteBuffer.put(this.aet ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        this.Ut = byteBuffer.getLong();
        this.aet = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.acO = 0;
        this.acP = 0;
        this.acQ = 0;
        this.WR = 0;
        this.Ut = 0L;
        this.aet = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 20;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cX(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cX(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("positionX=").append(this.acO).append('\n');
        stringBuilder.append(string).append("positionY=").append(this.acP).append('\n');
        stringBuilder.append(string).append("positionZ=").append(this.acQ).append('\n');
        stringBuilder.append(string).append("direction=").append(this.WR).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.Ut).append('\n');
        stringBuilder.append(string).append("virtual=").append(this.aet).append('\n');
    }
}

