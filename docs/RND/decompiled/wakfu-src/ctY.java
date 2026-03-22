/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class ctY
extends nr_0 {
    protected short huL;
    protected byte[] ayE;
    protected long huJ;
    protected byte mbb;
    protected static final Logger mjd = Logger.getLogger(ctY.class);

    @Override
    public abstract boolean dn(byte[] var1);

    @Override
    public abstract int d();

    public short eCU() {
        return this.huL;
    }

    public long eBj() {
        return this.huJ;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    public byte eBi() {
        return this.mbb;
    }
}

