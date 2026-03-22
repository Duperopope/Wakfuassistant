/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uo
 */
public class uo_1
implements gs_0 {
    public long aba = 0L;
    public long acM = 0L;
    public String acN = null;
    public long TL = 0L;
    public int acO = 0;
    public int acP = 0;
    public short acQ = 0;
    public long acR = 0L;
    public final tl_1 acS = new tl_1();
    public long acT = 0L;
    public String TD = null;
    public long TE = 0L;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aba);
        byteBuffer.putLong(this.acM);
        if (this.acN != null) {
            byte[] byArray = this.acN.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putLong(this.TL);
        byteBuffer.putInt(this.acO);
        byteBuffer.putInt(this.acP);
        byteBuffer.putShort(this.acQ);
        byteBuffer.putLong(this.acR);
        boolean bl = this.acS.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.putLong(this.acT);
        if (this.TD != null) {
            byte[] byArray = this.TD.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putLong(this.TE);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acS.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.aba = 0L;
        this.acM = 0L;
        this.acN = null;
        this.TL = 0L;
        this.acO = 0;
        this.acP = 0;
        this.acQ = 0;
        this.acR = 0L;
        this.acS.clear();
        this.acT = 0L;
        this.TD = null;
        this.TE = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x99F9F8) {
            up_2 up_22 = new up_2(this);
            boolean bl = up_22.b(byteBuffer, n);
            if (bl) {
                up_22.avW();
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
        n += this.acN != null ? this.acN.getBytes(Charsets.UTF_8).length : 0;
        n += 8;
        n += 4;
        n += 4;
        n += 2;
        n += 8;
        n += this.acS.DN();
        n += 8;
        ++n;
        n += this.TD != null ? this.TD.getBytes(Charsets.UTF_8).length : 0;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bZ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bZ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("clientId=").append(this.aba).append('\n');
        stringBuilder.append(string).append("characterId=").append(this.acM).append('\n');
        stringBuilder.append(string).append("characterName=").append(this.acN).append('\n');
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
        stringBuilder.append(string).append("positionX=").append(this.acO).append('\n');
        stringBuilder.append(string).append("positionY=").append(this.acP).append('\n');
        stringBuilder.append(string).append("positionZ=").append(this.acQ).append('\n');
        stringBuilder.append(string).append("positionWorldId=").append(this.acR).append('\n');
        stringBuilder.append(string).append("content=...\n");
        this.acS.bE(stringBuilder, string + "  ");
        stringBuilder.append(string).append("creationDate=").append(this.acT).append('\n');
        stringBuilder.append(string).append("gameServer=").append(this.TD).append('\n');
        stringBuilder.append(string).append("lastLog=").append(this.TE).append('\n');
    }
}

