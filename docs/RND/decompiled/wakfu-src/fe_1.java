/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Fe
 */
public class fe_1
implements fk_0 {
    private short avX;
    private String p;
    private int avZ;
    private int awa;
    private byte awb;
    private boolean awO;
    private int awP = -1;
    private eg_2 ayz;
    private int[] aAA;
    private eb_1 aAB;
    private short[] aAC;
    private short[] aAD;
    private int awT = -1;

    @Override
    public short aIi() {
        return this.avX;
    }

    public void j(short s) {
        this.avX = s;
    }

    @Override
    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    @Override
    public int aIj() {
        return this.avZ;
    }

    public void mp(int n) {
        this.avZ = n;
    }

    @Override
    public int aIk() {
        return this.awa;
    }

    public void mq(int n) {
        this.awa = n;
    }

    @Override
    public byte aIl() {
        return this.awb;
    }

    public void f(byte by) {
        this.awb = by;
    }

    @Override
    public boolean aIm() {
        return this.awO;
    }

    public void at(boolean bl) {
        this.awO = bl;
    }

    @Override
    public int aIn() {
        return this.awP;
    }

    public void ms(int n) {
        this.awP = n;
    }

    @Override
    public eg_2 aIE() {
        return this.ayz;
    }

    @Override
    public void a(eg_2 eg_22) {
        this.ayz = eg_22;
    }

    @Override
    public int aIs() {
        return this.aAA.length / (this.aAD == null ? 2 : 3);
    }

    @Override
    public List<eh_2> mG(int n) {
        return this.a(n, new ArrayList<eh_2>());
    }

    @Override
    public List<eh_2> a(int n, ArrayList<eh_2> arrayList) {
        if (this.aAD == null) {
            return arrayList;
        }
        int n2 = this.aAA[n * 3 + 2];
        short s = this.aAD[n2];
        if (s == 0) {
            return arrayList;
        }
        int n3 = ++n2 + s;
        for (int i = n2; i < n3; ++i) {
            eh_2 eh_22 = this.ayz.aIH()[this.aAD[i]];
            eh_22.mA(n);
            arrayList.add(eh_22);
        }
        return arrayList;
    }

    public int[] aKw() {
        return this.aAA;
    }

    public void e(int[] nArray) {
        this.aAA = nArray;
    }

    @Override
    public eb_1 aKx() {
        return this.aAB;
    }

    public void a(eb_1 eb_12) {
        this.aAB = eb_12;
    }

    public short[] aKy() {
        return this.aAC;
    }

    public void e(short[] sArray) {
        this.aAC = sArray;
    }

    public short[] aKz() {
        return this.aAD;
    }

    public void f(short[] sArray) {
        this.aAD = sArray;
    }

    public int aIr() {
        return this.awT;
    }

    public void mt(int n) {
        this.awT = n;
    }

    @Override
    public fl_0 aKA() {
        return fl_0.aAP;
    }

    @Override
    public int aKB() {
        int n = 0;
        short[] sArray = this.aAC;
        for (int i = 0; i < sArray.length; ++i) {
            n += sArray[i];
            i += sArray[i];
        }
        return n;
    }

    @Override
    public int aKC() {
        return 0;
    }

    @Override
    public short[] mH(int n) {
        int n2 = this.aAA[n * 2 + 1];
        short[] sArray = new short[this.aAC[n2]];
        int n3 = n2 + 1;
        System.arraycopy(this.aAC, n3, sArray, 0, sArray.length);
        return sArray;
    }

    @Override
    public final boolean aKD() {
        return false;
    }

    @Override
    public final short aKE() {
        throw new UnsupportedOperationException("devrait etre du type AnmSpriteDefinitionSingle");
    }

    @Override
    public final void aKF() {
        ++this.awT;
    }

    @Override
    public final int mI(int n) {
        int n2 = n * (this.aAD == null ? 2 : 3);
        this.aAB.setOffset(this.aAA[n2]);
        this.awT = this.aAA[n2 + 1];
        return this.aAC[this.awT];
    }

    @Override
    public short aKG() {
        return this.aAC[this.awT];
    }

    @Override
    public final short d(ef_2 ef_22, ef_2 ef_23) {
        int n = this.aAB.read();
        bw_0.mo(n).a(this.aAB, this.ayz, ef_22, ef_23);
        return this.aAC[this.awT];
    }
}

