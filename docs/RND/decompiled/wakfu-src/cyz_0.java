/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyZ
 */
public class cyz_0
extends nr_0 {
    private boolean asG;
    private long mmI;
    private long mmJ;
    private short mmR;
    private short mmS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asG = byteBuffer.get() == 1;
        this.mmI = byteBuffer.getLong();
        this.mmR = byteBuffer.getShort();
        this.mmJ = byteBuffer.getLong();
        this.mmS = byteBuffer.getShort();
        return true;
    }

    public boolean aGv() {
        return this.asG;
    }

    public long eFQ() {
        return this.mmI;
    }

    public long eFR() {
        return this.mmJ;
    }

    public short eFS() {
        return this.mmR;
    }

    public short eFT() {
        return this.mmS;
    }

    @Override
    public int d() {
        return 23974;
    }
}

