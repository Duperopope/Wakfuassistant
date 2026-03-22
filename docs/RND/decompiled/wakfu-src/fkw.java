/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fkw
extends fkF {
    private final String sBS;
    private short sBT = 0;
    private boolean sBU = false;

    public fkw(long l, String string, String string2, short s, short s2, byte by, boolean bl, long l2, String string3, int n, float f2, dR dR2) {
        super(l, string, s2, by, l2, string3, n, f2, dR2);
        this.sBS = string2;
        this.sBT = s;
        this.sBU = bl;
    }

    public String gbZ() {
        return this.sBS;
    }

    public short gco() {
        return this.sBT;
    }

    public void fn(short s) {
        this.sBT = s;
    }

    public void nC(boolean bl) {
        this.sBU = bl;
    }

    public boolean gcp() {
        return this.sBU;
    }

    public String toString() {
        return "{Candidate " + this.aXv + " " + this.p + "}";
    }

    public void gk(ByteBuffer byteBuffer) {
        this.b(byteBuffer, false);
    }

    public void as(ByteBuffer byteBuffer) {
        this.b(byteBuffer, true);
    }

    public void b(ByteBuffer byteBuffer, boolean bl) {
        byteBuffer.putLong(this.aXv);
        byte[] byArray = BH.aP(this.p);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        byte[] byArray2 = BH.aP(this.sBS);
        byteBuffer.putShort((short)byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putShort(bl ? this.sBT : (short)0);
        byteBuffer.putShort(this.aZk);
        byteBuffer.put(this.aZm);
        byteBuffer.put((byte)(this.sBU ? 1 : 0));
        byteBuffer.putLong(this.aDL);
        byte[] byArray3 = BH.aP(this.HR());
        byteBuffer.putShort((short)byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(this.lbw);
        byteBuffer.putFloat(this.szs);
        byte[] byArray4 = this.mmE.toByteArray();
        byteBuffer.putShort((short)byArray4.length);
        byteBuffer.put(byArray4);
    }

    public static fkw gl(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        byte[] byArray2 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray2);
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte by = byteBuffer.get();
        boolean bl = byteBuffer.get() == 1;
        long l2 = byteBuffer.getLong();
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        int n = byteBuffer.getInt();
        float f2 = byteBuffer.getFloat();
        byte[] byArray4 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray4);
        dR dR2 = fkw.eA(byArray4);
        return new fkw(l, BH.dc(byArray), BH.dc(byArray2), s, s2, by, bl, l2, BH.dc(byArray3), n, f2, dR2);
    }

    public int DN() {
        byte[] byArray = BH.aP(this.gbZ());
        byte[] byArray2 = BH.aP(this.getName());
        byte[] byArray3 = BH.aP(this.HR());
        return 10 + byArray2.length + 2 + byArray.length + 2 + byArray3.length + 8 + 2 + 2 + 1 + 1 + 4 + 4 + 2 + this.mmE.getSerializedSize();
    }
}

