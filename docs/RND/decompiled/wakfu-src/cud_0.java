/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cud
 */
public class cud_0
extends ctY {
    protected static final Logger mjk = Logger.getLogger(cud_0.class);

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eU(byteBuffer);
        return true;
    }

    protected void eU(ByteBuffer byteBuffer) {
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.huJ = byteBuffer.getLong();
        this.ayE = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.ayE);
    }

    @Override
    public int d() {
        return 12264;
    }
}

