/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwl
 */
public class cwl_0
extends nr_0 {
    protected static final Logger mkS = Logger.getLogger(cwl_0.class);
    private long bhR;
    private long mkT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bhR = byteBuffer.getLong();
        this.mkT = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13559;
    }

    public long Qy() {
        return this.bhR;
    }

    public long eEK() {
        return this.mkT;
    }
}

