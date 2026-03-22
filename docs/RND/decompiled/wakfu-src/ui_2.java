/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uI
 */
public class ui_2
implements gs_0 {
    public long adP = 0L;
    public long acT = 0L;
    public short adQ = 0;
    public short adR = 0;
    public short adS = 0;
    public int adT = 0;
    public static final int adU = 26;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.adP);
        byteBuffer.putLong(this.acT);
        byteBuffer.putShort(this.adQ);
        byteBuffer.putShort(this.adR);
        byteBuffer.putShort(this.adS);
        byteBuffer.putInt(this.adT);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adP = byteBuffer.getLong();
        this.acT = byteBuffer.getLong();
        this.adQ = byteBuffer.getShort();
        this.adR = byteBuffer.getShort();
        this.adS = byteBuffer.getShort();
        this.adT = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.adP = 0L;
        this.acT = 0L;
        this.adQ = 0;
        this.adR = 0;
        this.adS = 0;
        this.adT = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 26;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cl(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cl(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.adP).append('\n');
        stringBuilder.append(string).append("creationDate=").append(this.acT).append('\n');
        stringBuilder.append(string).append("id=").append(this.adQ).append('\n');
        stringBuilder.append(string).append("x=").append(this.adR).append('\n');
        stringBuilder.append(string).append("y=").append(this.adS).append('\n');
        stringBuilder.append(string).append("equippedSkinItemId=").append(this.adT).append('\n');
    }
}

