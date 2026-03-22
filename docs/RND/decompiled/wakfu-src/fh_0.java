/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Fh
 */
public class fh_0
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
        return Lists.newArrayList();
    }

    @Override
    public eb_1 aKx() {
        return this.aAB;
    }

    public void a(eb_1 eb_12) {
        this.aAB = eb_12;
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
        return fl_0.aAN;
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
        assert (n == 0);
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

