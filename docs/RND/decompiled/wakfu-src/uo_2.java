/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uO
 */
public class uo_2
implements gs_0 {
    public long adP = 0L;
    public int aea = 0;
    public short adR = 0;
    public short adS = 0;
    public short WQ = 0;
    public long acT = 0L;
    public long Ut = 0L;
    public long adv = 0L;
    public byte[] SY = null;
    public int aeb = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.adP);
        byteBuffer.putInt(this.aea);
        byteBuffer.putShort(this.adR);
        byteBuffer.putShort(this.adS);
        byteBuffer.putShort(this.WQ);
        byteBuffer.putLong(this.acT);
        byteBuffer.putLong(this.Ut);
        byteBuffer.putLong(this.adv);
        if (this.SY != null) {
            if (this.SY.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.SY.length);
            byteBuffer.put(this.SY);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.aeb);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adP = byteBuffer.getLong();
        this.aea = byteBuffer.getInt();
        this.adR = byteBuffer.getShort();
        this.adS = byteBuffer.getShort();
        this.WQ = byteBuffer.getShort();
        this.acT = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        this.adv = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.SY = new byte[n];
            byteBuffer.get(this.SY);
        } else {
            this.SY = null;
        }
        this.aeb = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.adP = 0L;
        this.aea = 0;
        this.adR = 0;
        this.adS = 0;
        this.WQ = 0;
        this.acT = 0L;
        this.Ut = 0L;
        this.adv = 0L;
        this.SY = null;
        this.aeb = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 4;
        n += 2;
        n += 2;
        n += 2;
        n += 8;
        n += 8;
        n += 8;
        n += 2;
        n += this.SY != null ? this.SY.length : 0;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cr(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cr(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.adP).append('\n');
        stringBuilder.append(string).append("modelId=").append(this.aea).append('\n');
        stringBuilder.append(string).append("x=").append(this.adR).append('\n');
        stringBuilder.append(string).append("y=").append(this.adS).append('\n');
        stringBuilder.append(string).append("z=").append(this.WQ).append('\n');
        stringBuilder.append(string).append("creationDate=").append(this.acT).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.Ut).append('\n');
        stringBuilder.append(string).append("buildingUid=").append(this.adv).append('\n');
        stringBuilder.append(string).append("data=(").append(this.SY != null ? this.SY.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("version=").append(this.aeb).append('\n');
    }
}

