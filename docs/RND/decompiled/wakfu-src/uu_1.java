/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uU
 */
public class uu_1
implements gs_0 {
    public long aes = 0L;
    public int acO = 0;
    public int acP = 0;
    public short acQ = 0;
    public byte WR = 0;
    public boolean aet = false;
    public final uy_1 aeu = new uy_1();
    public ox_1 aev = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aes);
        byteBuffer.putInt(this.acO);
        byteBuffer.putInt(this.acP);
        byteBuffer.putShort(this.acQ);
        byteBuffer.put(this.WR);
        byteBuffer.put(this.aet ? (byte)1 : 0);
        boolean bl = this.aeu.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        if (this.aev == null) {
            return false;
        }
        byteBuffer.put(this.aev.avV());
        boolean bl2 = this.aev.aF(byteBuffer);
        return bl2;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        this.aet = byteBuffer.get() == 1;
        boolean bl = this.aeu.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.cw(byteBuffer);
        return this.aev != null;
    }

    @Override
    public void clear() {
        this.aes = 0L;
        this.acO = 0;
        this.acP = 0;
        this.acQ = 0;
        this.WR = 0;
        this.aet = false;
        this.aeu.clear();
        this.aev = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            uv_1 uv_12 = new uv_1(this);
            boolean bl = uv_12.b(byteBuffer, n);
            if (bl) {
                uv_12.avW();
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
        n += 4;
        n += 2;
        ++n;
        ++n;
        n += this.aeu.DN();
        ++n;
        return n += this.aev.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cw(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cw(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("templateId=").append(this.aes).append('\n');
        stringBuilder.append(string).append("positionX=").append(this.acO).append('\n');
        stringBuilder.append(string).append("positionY=").append(this.acP).append('\n');
        stringBuilder.append(string).append("positionZ=").append(this.acQ).append('\n');
        stringBuilder.append(string).append("direction=").append(this.WR).append('\n');
        stringBuilder.append(string).append("virtual=").append(this.aet).append('\n');
        stringBuilder.append(string).append("itemForm=...\n");
        this.aeu.cy(stringBuilder, string + "  ");
        stringBuilder.append(string).append("specificData=<");
        if (this.aev == null) {
            stringBuilder.append(">\n");
        } else {
            stringBuilder.append(this.aev.getClass().getSimpleName()).append(">...\n");
            this.aev.a(stringBuilder, string + "  ");
        }
    }
}

