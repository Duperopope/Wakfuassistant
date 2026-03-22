/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qM
 */
public class qm_1
implements gs_0 {
    public int Vx = -1;
    public int Vy = -1;
    public long Vz = -1L;
    public static final int VA = 16;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Vx);
        byteBuffer.putInt(this.Vy);
        byteBuffer.putLong(this.Vz);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Vx = byteBuffer.getInt();
        this.Vy = byteBuffer.getInt();
        this.Vz = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Vx = -1;
        this.Vy = -1;
        this.Vz = -1L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10053002) {
            qn_1 qn_12 = new qn_1(this);
            boolean bl = qn_12.b(byteBuffer, n);
            if (bl) {
                qn_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 16;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ab(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ab(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("offendedNationId=").append(this.Vx).append('\n');
        stringBuilder.append(string).append("lawPoints=").append(this.Vy).append('\n');
        stringBuilder.append(string).append("date=").append(this.Vz).append('\n');
    }
}

