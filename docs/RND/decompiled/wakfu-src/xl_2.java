/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xL
 */
public class xl_2
implements gs_0 {
    public int aai = 0;
    public final sr_1 akv = new sr_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aai);
        boolean bl = this.akv.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aai = byteBuffer.getInt();
        boolean bl = this.akv.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aai = 0;
        this.akv.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xm_2 xm_22 = new xm_2(this);
            boolean bl = xm_22.b(byteBuffer, n);
            if (bl) {
                xm_22.avW();
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
        return n += this.akv.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ek(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ek(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("actionGroupId=").append(this.aai).append('\n');
        stringBuilder.append(string).append("actionGroup=...\n");
        this.akv.ba(stringBuilder, string + "  ");
    }
}

