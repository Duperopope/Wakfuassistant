/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fkH
extends fkF
implements fjy_0 {
    private static final Logger sCc = Logger.getLogger(fkH.class);
    private final int sCd;
    private final fkL sCe;
    private final fkQ sCf;

    public fkH(fkL fkL2, int n, long l, String string, short s, byte by, long l2, String string2, int n2, float f2, dR dR2, fkQ fkQ2) {
        super(l, string, s, by, l2, string2, n2, f2, dR2);
        this.sCe = fkL2;
        this.sCd = n;
        this.sCf = fkQ2;
    }

    public fkH(fkw fkw2, fkL fkL2, int n, fkQ fkQ2) {
        this(fkL2, n, fkw2.Sn(), fkw2.getName(), fkw2.aWP(), fkw2.aWO(), fkw2.Ya(), fkw2.HR(), fkw2.elc(), fkw2.gca(), fkw2.fwD(), fkQ2);
    }

    public fkH(fkH fkH2, fkL fkL2, fkQ fkQ2) {
        super(fkH2.aXv, fkH2.p, fkH2.aZk, fkH2.aZm, fkH2.aDL, fkH2.aFF, fkH2.lbw, fkH2.szs, fkH2.mmE);
        this.sCd = fkH2.sCd;
        this.sCe = fkL2;
        this.sCf = fkQ2;
    }

    public void Jm(int n) {
        this.lbw = n;
    }

    public void fd(float f2) {
        this.szs = f2;
    }

    public fkL emF() {
        return this.sCe;
    }

    @Override
    public int Xt() {
        return this.sCd;
    }

    public fkQ gcu() {
        return this.sCf;
    }

    public String toString() {
        return "{Government " + this.aXv + " " + this.p + "}";
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.sCe.Sn());
        byteBuffer.putInt(this.sCd);
        byteBuffer.putLong(this.aXv);
        byte[] byArray = BH.aP(this.p);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putShort(this.aZk);
        byteBuffer.put(this.aZm);
        byteBuffer.putLong(this.aDL);
        byte[] byArray2 = BH.aP(this.HR());
        byteBuffer.putShort((short)byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putInt(this.lbw);
        byteBuffer.putFloat(this.szs);
        byte[] byArray3 = this.mmE.toByteArray();
        byteBuffer.putShort((short)byArray3.length);
        byteBuffer.put(byArray3);
        wm_1 wm_12 = new wm_1();
        this.sCf.a(wm_12);
        wm_12.aF(byteBuffer);
    }

    public static fkH gm(ByteBuffer byteBuffer) {
        fkL fkL2 = fkL.ue(byteBuffer.getLong());
        int n = byteBuffer.getInt();
        long l = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        short s = byteBuffer.getShort();
        byte by = byteBuffer.get();
        long l2 = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        int n2 = byteBuffer.getInt();
        float f2 = byteBuffer.getFloat();
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        dR dR2 = fkH.eA(byArray3);
        wm_1 wm_12 = new wm_1();
        wm_12.aG(byteBuffer);
        fkQ fkQ2 = fkQ.n(fkL2);
        fkQ2.b(wm_12);
        return new fkH(fkL2, n, l, BH.dc(byArray), s, by, l2, BH.dc(byArray2), n2, f2, dR2, fkQ2);
    }

    public int DN() {
        byte[] byArray = BH.aP(this.getName());
        byte[] byArray2 = BH.aP(this.HR());
        wm_1 wm_12 = new wm_1();
        this.sCf.a(wm_12);
        return 22 + byArray.length + 2 + 1 + 8 + 2 + byArray2.length + 4 + 4 + 2 + this.mmE.getSerializedSize() + wm_12.DN();
    }
}

