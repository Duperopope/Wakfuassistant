/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sq
 */
public class sq_2
extends go_0
implements gs_0 {
    public final ArrayList<ss_1> Yy = new ArrayList(0);
    private final fi_1 Yz = new sr_2(this);

    @Override
    public fi_1 DM() {
        return this.Yz;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Yy.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Yy.size());
        for (int i = 0; i < this.Yy.size(); ++i) {
            ss_1 ss_12 = this.Yy.get(i);
            boolean bl = ss_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Yy.clear();
        this.Yy.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ss_1 ss_12 = new ss_1();
            boolean bl = ss_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Yy.add(ss_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Yy.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.Yy.size(); ++i) {
            ss_1 ss_12 = this.Yy.get(i);
            n += ss_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aL(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aL(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("availableTitles=");
        if (this.Yy.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Yy.size()).append(" elements)...\n");
            for (int i = 0; i < this.Yy.size(); ++i) {
                ss_1 ss_12 = this.Yy.get(i);
                ss_12.aM(stringBuilder, string + i + "/ ");
            }
        }
    }
}

