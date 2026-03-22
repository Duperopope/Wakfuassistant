/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Ff
 */
public class ff_0
implements fk_0 {
    private short avX;
    private String p;
    private int avZ;
    private int awa;
    private byte awb;
    private boolean awO;
    private int awP = -1;
    private eg_2 ayz;
    private eb_1 aAB;
    private short[] aAD;
    private short aAE;

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
        return 1;
    }

    @Override
    public List<eh_2> mG(int n) {
        short[] sArray;
        ArrayList<eh_2> arrayList = new ArrayList<eh_2>();
        for (short s : sArray = this.aAD) {
            eh_2 eh_22 = this.ayz.aIH()[s];
            eh_22.mA(n);
            arrayList.add(eh_22);
        }
        return arrayList;
    }

    @Override
    public eb_1 aKx() {
        return this.aAB;
    }

    public void a(eb_1 eb_12) {
        this.aAB = eb_12;
    }

    public short[] aKz() {
        return this.aAD;
    }

    public void f(short[] sArray) {
        this.aAD = sArray;
    }

    @Override
    public short aKG() {
        return this.aAE;
    }

    public void u(short s) {
        this.aAE = s;
    }

    @Override
    public fl_0 aKA() {
        return fl_0.aAM;
    }

    @Override
    public final int aKB() {
        return 1;
    }

    @Override
    public final int aKC() {
        return 1;
    }

    @Override
    public final List<eh_2> a(int n, ArrayList<eh_2> arrayList) {
        short[] sArray = this.aKz();
        if (sArray == null) {
            return arrayList;
        }
        assert (n == 0);
        eh_2[] eh_2Array = this.ayz.aIH();
        for (int i = 0; i < sArray.length; ++i) {
            eh_2 eh_22 = eh_2Array[sArray[i]];
            eh_22.mA(n);
            arrayList.add(eh_22);
        }
        return arrayList;
    }

    @Override
    public final short[] mH(int n) {
        return new short[]{this.aAE};
    }

    @Override
    public final boolean aKD() {
        return true;
    }

    @Override
    public final short aKE() {
        return this.aAE;
    }

    @Override
    public final void aKF() {
    }

    @Override
    public final int mI(int n) {
        this.aAB.setOffset(0);
        return 1;
    }

    @Override
    public final short d(ef_2 ef_22, ef_2 ef_23) {
        int n = this.aAB.read();
        bw_0.mo(n).a(this.aAB, this.ayz, ef_22, ef_23);
        return this.aAE;
    }
}

