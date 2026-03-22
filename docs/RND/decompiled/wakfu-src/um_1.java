/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from um
 */
public class um_1
implements gs_0 {
    public final ArrayList<un_2> acJ = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.acJ.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.acJ.size());
        for (int i = 0; i < this.acJ.size(); ++i) {
            un_2 un_22 = this.acJ.get(i);
            boolean bl = un_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.acJ.clear();
        this.acJ.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            un_2 un_22 = new un_2();
            boolean bl = un_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.acJ.add(un_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.acJ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.acJ.size(); ++i) {
            un_2 un_22 = this.acJ.get(i);
            n += un_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bX(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bX(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("registrations=");
        if (this.acJ.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.acJ.size()).append(" elements)...\n");
            for (int i = 0; i < this.acJ.size(); ++i) {
                un_2 un_22 = this.acJ.get(i);
                un_22.bY(stringBuilder, string + i + "/ ");
            }
        }
    }
}

