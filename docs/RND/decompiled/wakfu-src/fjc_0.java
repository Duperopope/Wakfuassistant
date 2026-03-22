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
 * Renamed from fjC
 */
public class fjc_0
extends fjz_0 {
    private static final Logger szp = Logger.getLogger(fjc_0.class);
    public static final fja_0 szq = new fjd_0();
    private long aDh;
    private byte[] szr;
    private int lbw;
    private float szs;
    private dR mmE;

    public fjc_0() {
        super(fjb_0.szf);
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void sO(String string) {
        this.szr = BH.aP(string);
    }

    public void Jm(int n) {
        this.lbw = n;
    }

    public void fd(float f2) {
        this.szs = f2;
    }

    public long KU() {
        return this.aDh;
    }

    public String gbZ() {
        return BH.dc(this.szr);
    }

    public int elc() {
        return this.lbw;
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
            szp.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
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
        if (fjm2.dnG() < 1) {
            return false;
        }
        int n2 = fjm2.ffF().WA(n);
        return fkf_0.gcc().WJ(n2).b(fkj_0.sAI);
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aDh);
        byteBuffer.putShort((short)this.szr.length);
        byteBuffer.put(this.szr);
        byteBuffer.putInt(this.lbw);
        byteBuffer.putFloat(this.szs);
        if (this.mmE != null) {
            byte[] byArray = this.mmE.toByteArray();
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aDh = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        this.szr = new byte[s];
        byteBuffer.get(this.szr);
        this.lbw = byteBuffer.getInt();
        this.szs = byteBuffer.getFloat();
        short s2 = byteBuffer.getShort();
        if (s2 > 0) {
            byte[] byArray = new byte[s2];
            byteBuffer.get(byArray);
            this.mmE = fjc_0.eA(byArray);
        }
        return true;
    }

    protected static dR eA(byte[] byArray) {
        try {
            return dR.ad(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new RuntimeException("Error when unserializing appearance", invalidProtocolBufferException);
        }
    }

    @Override
    public int DN() {
        return 10 + this.szr.length + 4 + 4 + 2 + (this.mmE != null ? this.mmE.getSerializedSize() : 0);
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.aDh = -1L;
        this.szr = null;
        this.lbw = 0;
        this.szs = 0.0f;
        this.mmE = null;
    }
}

