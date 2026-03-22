/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cua
 */
public class cua_0
extends ctY {
    protected static final Logger mji = Logger.getLogger(cua_0.class);
    private int ejc;
    private long cwe;
    private int ehO;
    private int hKf;
    private int hKg;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.huJ = byteBuffer.getLong();
        this.ejc = byteBuffer.getInt();
        this.cwe = byteBuffer.getInt();
        this.ehO = byteBuffer.getInt();
        this.hKf = byteBuffer.getInt();
        this.hKg = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13897;
    }

    public int cms() {
        return this.ejc;
    }

    public long Tz() {
        return this.cwe;
    }

    public int ewI() {
        return this.hKf;
    }

    public int ewJ() {
        return this.hKg;
    }

    public int clf() {
        return this.ehO;
    }
}

