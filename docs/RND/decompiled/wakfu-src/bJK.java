/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class bJK
extends foM<bJq> {
    private String p;
    private vf_0 kmu;
    private short aWL;
    private short aWK;

    public bJK() {
        super(-1, -1L);
        this.p = null;
        this.kmu = null;
        this.a(new bJq(this));
    }

    public bJK(int n, String string, vf_0 vf_02, short s, short s2, long l) {
        super(n, l);
        this.p = string;
        this.kmu = vf_02;
        this.aWL = s;
        this.aWK = s2;
        this.a(new bJq(this));
    }

    public void eO(ByteBuffer byteBuffer) {
        this.lK(byteBuffer.getInt());
        byte[] byArray = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray);
        this.p = BH.dc(byArray);
        this.kmu = new vf_0();
        this.kmu.eS(byteBuffer);
        this.aWL = byteBuffer.getShort();
        this.aWK = byteBuffer.getShort();
    }

    @Override
    public void a(fs_0 fs_02) {
        fs_02.mz(this.d());
        byte[] byArray = BH.aP(this.p);
        fs_02.k((short)byArray.length);
        fs_02.di(byArray);
        this.kmu.c(fs_02);
        fs_02.k(this.aWL);
        fs_02.k(this.aWK);
    }

    public String getName() {
        return this.p;
    }

    public vf_0 eaV() {
        return this.kmu;
    }

    public short aVf() {
        return this.aWL;
    }

    public short aVe() {
        return this.aWK;
    }

    public boolean dP(int n, int n2) {
        int n3 = Wa.qf(n);
        int n4 = Wa.qg(n2);
        return this.kmu.aq(n3, n4);
    }
}

