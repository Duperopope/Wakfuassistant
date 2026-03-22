/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ctX
 */
public class ctx_0
extends nr_0 {
    private static final Logger mjc = Logger.getLogger(ctx_0.class);
    private int epK;
    private int epQ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        this.epQ = byteBuffer.getInt();
        return true;
    }

    public int ctn() {
        return this.epK;
    }

    public int Xt() {
        return this.epQ;
    }

    @Override
    public int d() {
        return 14720;
    }
}

