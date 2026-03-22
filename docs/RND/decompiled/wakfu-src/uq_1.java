/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uq
 */
public class uq_1
extends yl_2
implements gs_0 {
    public boolean acW = false;
    public int acX = 0;
    public long acY = 0L;
    public int acZ = 0;
    public long ada = 0L;
    public static final byte adb = 0;
    public static final int adc = 25;

    @Override
    public byte avV() {
        return 0;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.acW ? (byte)1 : 0);
        byteBuffer.putInt(this.acX);
        byteBuffer.putLong(this.acY);
        byteBuffer.putInt(this.acZ);
        byteBuffer.putLong(this.ada);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acW = byteBuffer.get() == 1;
        this.acX = byteBuffer.getInt();
        this.acY = byteBuffer.getLong();
        this.acZ = byteBuffer.getInt();
        this.ada = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.acW = false;
        this.acX = 0;
        this.acY = 0L;
        this.acZ = 0;
        this.ada = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 25;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("primaryGemLocked=").append(this.acW).append('\n');
        stringBuilder.append(string).append("primaryGemitemRefId=").append(this.acX).append('\n');
        stringBuilder.append(string).append("primaryGemUniqueId=").append(this.acY).append('\n');
        stringBuilder.append(string).append("secondaryGemitemRefId=").append(this.acZ).append('\n');
        stringBuilder.append(string).append("secondaryGemUniqueId=").append(this.ada).append('\n');
    }
}

