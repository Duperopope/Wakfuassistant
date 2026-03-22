/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sO
 */
public class so_1
implements gs_0 {
    public sq_1 Zs = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Zs != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.Zs.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Zs = new sq_1();
            boolean bl3 = this.Zs.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.Zs = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Zs = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            sp_2 sp_22 = new sp_2(this);
            boolean bl = sp_22.b(byteBuffer, n);
            if (bl) {
                sp_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        if (this.Zs != null) {
            n += this.Zs.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aY(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aY(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("spawnedCharacter=");
        if (this.Zs == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Zs.aZ(stringBuilder, string + "  ");
        }
    }
}

