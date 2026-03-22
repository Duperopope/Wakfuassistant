/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vE
 */
public class ve_1
implements gs_0 {
    public byte Us = 0;
    public boolean afO = false;
    public static final int afP = 2;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Us);
        byteBuffer.put(this.afO ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.afO = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Us = 0;
        this.afO = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10045010) {
            vf_1 vf_12 = new vf_1(this);
            boolean bl = vf_12.b(byteBuffer, n);
            if (bl) {
                vf_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cP(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cP(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.Us).append('\n');
        stringBuilder.append(string).append("applied=").append(this.afO).append('\n');
    }
}

