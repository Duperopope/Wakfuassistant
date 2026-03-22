/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ama
 */
public abstract class ama_1
extends aam_2 {
    private int o;
    private boolean cGs;
    private byte cGt;
    private short cGu;
    private int cGv;
    private long cGw;
    private double cGx;
    private float cGy;
    private String cGz;
    private Object cGA;

    public ama_1(aao_2 aao_22) {
        this.a(aao_22);
    }

    @Override
    public void lK(int n) {
        this.o = n;
    }

    @Override
    public int d() {
        return this.o;
    }

    public byte bCn() {
        return this.cGt;
    }

    public void ay(byte by) {
        this.cGt = by;
    }

    public int bCo() {
        return this.cGv;
    }

    public void sY(int n) {
        this.cGv = n;
    }

    public long bCp() {
        return this.cGw;
    }

    public void gj(long l) {
        this.cGw = l;
    }

    public short bCq() {
        return this.cGu;
    }

    public void az(short s) {
        this.cGu = s;
    }

    public double bCr() {
        return this.cGx;
    }

    public void B(double d2) {
        this.cGx = d2;
    }

    public float bCs() {
        return this.cGy;
    }

    public void cL(float f2) {
        this.cGy = f2;
    }

    public String bCt() {
        return this.cGz;
    }

    public void fa(String string) {
        this.cGz = string;
    }

    public boolean bCu() {
        return this.cGs;
    }

    public void cC(boolean bl) {
        this.cGs = bl;
    }

    public void D(Object object) {
        this.cGA = object;
    }

    public <T> T bCv() {
        return (T)this.cGA;
    }
}

