/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uR
 */
public class ur_1
implements gs_0 {
    public final up_1 aeo = new up_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeo.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeo.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeo.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeo.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cu(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cu(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("partition=...\n");
        this.aeo.cs(stringBuilder, string + "  ");
    }
}

