/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uQ
 */
public class uq_2
implements gs_0 {
    public int aej = 0;
    public int aek = 0;
    public int ael = 0;
    public int aem = 0;
    public final ArrayList<ur_1> aen = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aej);
        byteBuffer.putInt(this.aek);
        byteBuffer.putInt(this.ael);
        byteBuffer.putInt(this.aem);
        if (this.aen.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aen.size());
        for (int i = 0; i < this.aen.size(); ++i) {
            ur_1 ur_12 = this.aen.get(i);
            boolean bl = ur_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aej = byteBuffer.getInt();
        this.aek = byteBuffer.getInt();
        this.ael = byteBuffer.getInt();
        this.aem = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aen.clear();
        this.aen.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ur_1 ur_12 = new ur_1();
            boolean bl = ur_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aen.add(ur_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aej = 0;
        this.aek = 0;
        this.ael = 0;
        this.aem = 0;
        this.aen.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 4;
        n += 4;
        n += 4;
        n += 2;
        for (int i = 0; i < this.aen.size(); ++i) {
            ur_1 ur_12 = this.aen.get(i);
            n += ur_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ct(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ct(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("originX=").append(this.aej).append('\n');
        stringBuilder.append(string).append("originY=").append(this.aek).append('\n');
        stringBuilder.append(string).append("width=").append(this.ael).append('\n');
        stringBuilder.append(string).append("height=").append(this.aem).append('\n');
        stringBuilder.append(string).append("partitions=");
        if (this.aen.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aen.size()).append(" elements)...\n");
            for (int i = 0; i < this.aen.size(); ++i) {
                ur_1 ur_12 = this.aen.get(i);
                ur_12.cu(stringBuilder, string + i + "/ ");
            }
        }
    }
}

