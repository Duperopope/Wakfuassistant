/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from OU
 */
public abstract class ou_1
extends ff_1 {
    protected final int bap;
    protected final int baq;
    protected final short bar;
    protected final short bas;
    protected final short bat;
    protected final boolean bau;
    protected final boolean bav;
    protected final boolean baw;
    protected final boolean bax;
    protected final byte bay;
    protected final short baz;
    protected final ArrayList<acd_1> baA = new ArrayList();
    protected final String baB;
    protected final int baC;
    protected final int[] baD;
    private final fi_1 baE = this.aXr();
    private final fi_1 baF = new ov_1(this);
    private final fi_1 baG = fi_1.oX;
    private final fi_1 baH = fi_1.oX;
    private final fi_1[] baI = new fi_1[]{this.baE, this.baF, this.baG, this.baH};

    protected abstract fi_1 aXr();

    @Override
    public fi_1[] zj() {
        return this.baI;
    }

    public byte[] apI() {
        return this.a(this.baE, this.baF);
    }

    public ou_1(short s, int n, int n2, short s2, short s3, boolean bl, boolean bl2, boolean bl3, boolean bl4, byte by, short s4, ArrayList<acd_1> arrayList, String string, int[] nArray, int n3) {
        this.bas = s;
        this.bap = n;
        this.baq = n2;
        this.bar = s2;
        this.bat = s3;
        this.bau = bl;
        this.bav = bl2;
        this.baw = bl3;
        this.bax = bl4;
        this.bay = by;
        this.baz = s4;
        this.baA.addAll(arrayList);
        this.baB = string;
        this.baD = nArray;
        this.baC = n3;
    }
}

