/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vv
 */
public class vv_2
implements gs_0 {
    public short adx = 0;
    public final uy_1 afu = new uy_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adx);
        boolean bl = this.afu.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.afu.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adx = 0;
        this.afu.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vw_1 vw_12 = new vw_1(this);
            boolean bl = vw_12.b(byteBuffer, n);
            if (bl) {
                vw_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.afu.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cL(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cL(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.adx).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.afu.cy(stringBuilder, string + "  ");
    }
}

