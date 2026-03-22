/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uS
 */
public class us_1
implements gs_0 {
    public int acr = 0;
    public byte XQ = 0;
    public final tp_1 aep = new tp_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.acr);
        byteBuffer.put(this.XQ);
        boolean bl = this.aep.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acr = byteBuffer.getInt();
        this.XQ = byteBuffer.get();
        boolean bl = this.aep.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.acr = 0;
        this.XQ = 0;
        this.aep.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            ut_2 ut_22 = new ut_2(this);
            boolean bl = ut_22.b(byteBuffer, n);
            if (bl) {
                ut_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        ++n;
        return n += this.aep.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cv(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cv(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("gfxId=").append(this.acr).append('\n');
        stringBuilder.append(string).append("sex=").append(this.XQ).append('\n');
        stringBuilder.append(string).append("imageCharac=...\n");
        this.aep.br(stringBuilder, string + "  ");
    }
}

