/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ctW
 */
public class ctw_0
extends nr_0 {
    private static final Logger miZ = Logger.getLogger(ctw_0.class);
    private uz_0 mja;
    private uw_0 mjb;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mjb = uw_0.fn(byteBuffer.getLong());
        this.mja = uz_0.fo(byteBuffer.getLong());
        return true;
    }

    public ua_0 eCS() {
        return this.mja;
    }

    public uw_0 eCT() {
        return this.mjb;
    }

    @Override
    public int d() {
        return 14282;
    }
}

