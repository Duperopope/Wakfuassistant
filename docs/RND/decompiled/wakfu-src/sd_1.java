/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sd
 */
public class sd_1
extends go_0
implements gs_0 {
    public final ArrayList<sf_2> XU = new ArrayList(0);
    private final fi_1 XV = new se_2(this);

    @Override
    public fi_1 DM() {
        return this.XV;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.XU.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.XU.size());
        for (int i = 0; i < this.XU.size(); ++i) {
            sf_2 sf_22 = this.XU.get(i);
            boolean bl = sf_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.XU.clear();
        this.XU.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            sf_2 sf_22 = new sf_2();
            boolean bl = sf_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.XU.add(sf_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.XU.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.XU.size(); ++i) {
            sf_2 sf_22 = this.XU.get(i);
            n += sf_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aF(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aF(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("shortcutInventories=");
        if (this.XU.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.XU.size()).append(" elements)...\n");
            for (int i = 0; i < this.XU.size(); ++i) {
                sf_2 sf_22 = this.XU.get(i);
                sf_22.aG(stringBuilder, string + i + "/ ");
            }
        }
    }
}

