/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cub
 */
public class cub_0
extends ctY {
    protected static final Logger mjj = Logger.getLogger(cub_0.class);
    private long cwe;
    private int ehO;
    private int bap;
    private int baq;
    private short ban;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.huJ = byteBuffer.getLong();
        this.cwe = byteBuffer.getInt();
        this.ehO = byteBuffer.getInt();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.ban = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 12698;
    }

    public long Tz() {
        return this.cwe;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bdi() {
        return this.ban;
    }

    public int clf() {
        return this.ehO;
    }
}

