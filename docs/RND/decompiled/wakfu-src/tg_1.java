/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tG
 */
public class tg_1
implements gs_0 {
    public long aba = 0L;
    public long Ut = 0L;
    public String abb = null;
    public long TL = 0L;
    public short abc = 0;
    public long abd = 0L;
    public final ArrayList<ti_2> abe = new ArrayList(0);
    public int abf = 0;
    public tk_2 abg = null;
    public final tw_1 abh = new tw_1();
    public boolean abi = false;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.putLong(this.aba);
        byteBuffer.putLong(this.Ut);
        if (this.abb != null) {
            byte[] byArray = this.abb.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putLong(this.TL);
        byteBuffer.putShort(this.abc);
        byteBuffer.putLong(this.abd);
        if (this.abe.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.abe.size());
        for (n = 0; n < this.abe.size(); ++n) {
            ti_2 ti_22 = this.abe.get(n);
            boolean bl = ti_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.abf);
        if (this.abg != null) {
            byteBuffer.put((byte)1);
            n = this.abg.aF(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        n = this.abh.aF(byteBuffer) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        byteBuffer.put(this.abi ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abe.clear();
        this.abe.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.aG(byteBuffer);
            if (!bl2) {
                return false;
            }
            this.abe.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abh.aG(byteBuffer))) {
            return false;
        }
        this.abi = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.aba = 0L;
        this.Ut = 0L;
        this.abb = null;
        this.TL = 0L;
        this.abc = 0;
        this.abd = 0L;
        this.abe.clear();
        this.abf = 0;
        this.abg = null;
        this.abh.clear();
        this.abi = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            th_2 th_22 = new th_2(this);
            boolean bl = th_22.b(byteBuffer, n);
            if (bl) {
                th_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 8;
        n += 2;
        n += this.abb != null ? this.abb.getBytes(Charsets.UTF_8).length : 0;
        n += 8;
        n += 2;
        n += 8;
        ++n;
        for (int i = 0; i < this.abe.size(); ++i) {
            ti_2 ti_22 = this.abe.get(i);
            n += ti_22.DN();
        }
        n += 4;
        ++n;
        if (this.abg != null) {
            n += this.abg.DN();
        }
        n += this.abh.DN();
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bB(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("clientId=").append(this.aba).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.Ut).append('\n');
        stringBuilder.append(string).append("ownerName=").append(this.abb).append('\n');
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
        stringBuilder.append(string).append("playListId=").append(this.abc).append('\n');
        stringBuilder.append(string).append("musicId=").append(this.abd).append('\n');
        stringBuilder.append(string).append("rooms=");
        if (this.abe.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.abe.size()).append(" elements)...\n");
            for (int i = 0; i < this.abe.size(); ++i) {
                ti_2 ti_22 = this.abe.get(i);
                ti_22.bC(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("customViewModelId=").append(this.abf).append('\n');
        stringBuilder.append(string).append("wallet=");
        if (this.abg == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.abg.bD(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("permissions=...\n");
        this.abh.bL(stringBuilder, string + "  ");
        stringBuilder.append(string).append("leaveFleaAtDisconnection=").append(this.abi).append('\n');
    }
}

