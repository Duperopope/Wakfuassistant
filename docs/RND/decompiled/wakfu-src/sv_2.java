/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sV
 */
public class sv_2
implements gs_0 {
    public long ZC = 0L;
    public int Th = 0;
    public byte Tg = 0;
    public short ZD = 0;
    public byte ZE = 0;
    public final vu_1 ZF = new vu_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ZC);
        byteBuffer.putInt(this.Th);
        byteBuffer.put(this.Tg);
        byteBuffer.putShort(this.ZD);
        byteBuffer.put(this.ZE);
        boolean bl = this.ZF.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        this.ZE = byteBuffer.get();
        boolean bl = this.ZF.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ZC = 0L;
        this.Th = 0;
        this.Tg = 0;
        this.ZD = 0;
        this.ZE = 0;
        this.ZF.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090003) {
            sw_1 sw_12 = new sw_1(this);
            boolean bl = sw_12.b(byteBuffer, n);
            if (bl) {
                sw_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 4;
        ++n;
        n += 2;
        ++n;
        return n += this.ZF.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bc(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bc(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uniqueId=").append(this.ZC).append('\n');
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
        stringBuilder.append(string).append("position=").append(this.Tg).append('\n');
        stringBuilder.append(string).append("maximumSize=").append(this.ZD).append('\n');
        stringBuilder.append(string).append("bindType=").append(this.ZE).append('\n');
        stringBuilder.append(string).append("inventory=...\n");
        this.ZF.cK(stringBuilder, string + "  ");
    }
}

