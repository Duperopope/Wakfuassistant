/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vY
 */
public class vy_2
implements gs_0 {
    public final uy_1 agz = new uy_1();
    public short agA = 1;
    public int agB = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.agz.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.putShort(this.agA);
        byteBuffer.putInt(this.agB);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.agz.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        this.agA = byteBuffer.getShort();
        this.agB = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.agz.clear();
        this.agA = 1;
        this.agB = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vz_2 vz_22 = new vz_2(this);
            boolean bl = vz_22.b(byteBuffer, n);
            if (bl) {
                vz_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += this.agz.DN();
        n += 2;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.db(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void db(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("item=...\n");
        this.agz.cy(stringBuilder, string + "  ");
        stringBuilder.append(string).append("packSize=").append(this.agA).append('\n');
        stringBuilder.append(string).append("price=").append(this.agB).append('\n');
    }
}

