/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fjI
 */
public class fji_0
extends fjz_0 {
    public static final byte szz = 1;
    public static final byte szA = 2;
    public static final byte szB = 3;
    public static final byte szC = 4;
    public static final byte szD = 5;
    private static final Logger szE = Logger.getLogger(fji_0.class);
    public static final fja_0 szF = new fjj_0();
    private long aDh;
    private long mln;
    private byte bIj;
    private int lbw;
    private float szs;
    private dR mmE;

    public fji_0() {
        super(fjb_0.szh);
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void Jm(int n) {
        this.lbw = n;
    }

    public long emG() {
        return this.mln;
    }

    public void nJ(long l) {
        this.mln = l;
    }

    public void fd(float f2) {
        this.szs = f2;
    }

    public long KU() {
        return this.aDh;
    }

    public int elc() {
        return this.lbw;
    }

    public byte bks() {
        return this.bIj;
    }

    public void aj(byte by) {
        this.bIj = by;
    }

    public float gca() {
        return this.szs;
    }

    public dR fwD() {
        return this.mmE;
    }

    public void d(dR dR2) {
        this.mmE = dR2;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szE.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.a(this);
    }

    @Override
    public boolean h(fjm fjm2) {
        int n = fjm2.ffF().Xt();
        if (n != this.epQ) {
            return false;
        }
        return fjm2.Sn() == this.aDh;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aDh);
        byteBuffer.putLong(this.mln);
        byteBuffer.put(this.bIj);
        byteBuffer.putInt(this.lbw);
        byteBuffer.putFloat(this.szs);
        if (this.mmE != null) {
            byteBuffer.put((byte)1);
            byteBuffer.put(this.mmE.toByteArray());
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aDh = byteBuffer.getLong();
        this.mln = byteBuffer.getLong();
        this.bIj = byteBuffer.get();
        this.lbw = byteBuffer.getInt();
        this.szs = byteBuffer.getFloat();
        if (byteBuffer.get() == 1) {
            try {
                this.mmE = dR.ad(byteBuffer);
            }
            catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                szE.error((Object)"Error when unserializing appearance", (Throwable)invalidProtocolBufferException);
            }
        }
        return true;
    }

    @Override
    public int DN() {
        return 26 + (this.mmE != null ? this.mmE.getSerializedSize() : 0);
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.aDh = -1L;
        this.bIj = (byte)-1;
        this.lbw = 0;
        this.szs = 0.0f;
    }
}

