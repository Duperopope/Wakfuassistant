/*
 * Decompiled with CFR 0.152.
 */
public class bRp {
    private static final byte kZU = 2;
    private int o;
    private int bap;
    private int baq;
    private int crE;
    private int ciZ;
    private String eAl;
    private boolean kZV;

    bRp() {
    }

    public bRp(int n, int n2, int n3, String string, int n4) {
        this(n, n2, n3, 0, string, n4, false);
    }

    public bRp(int n, int n2, int n3, int n4, String string, int n5, boolean bl) {
        this.o = n;
        this.bap = n2;
        this.baq = n3;
        this.crE = n4;
        this.ciZ = n5;
        this.eAl = string;
        this.kZV = bl;
    }

    public bRp(int n, int n2, int n3, int n4, String string, int n5) {
        this(n, n2, n3, n4, string, n5, false);
    }

    public int d() {
        return this.o;
    }

    public void lK(int n) {
        this.o = n;
    }

    public int getX() {
        return this.bap;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public int getY() {
        return this.baq;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public int NN() {
        return this.crE;
    }

    public void wV(int n) {
        this.crE = n;
    }

    public String hF() {
        return this.eAl;
    }

    public void jr(String string) {
        this.eAl = string;
    }

    public void CV(int n) {
        this.ciZ = n;
    }

    public int aVt() {
        return this.ciZ;
    }

    public boolean ekJ() {
        return this.kZV;
    }

    public void b(apl_1 apl_12, int n) {
        this.bap = apl_12.aIA();
        this.baq = apl_12.aIA();
        this.eAl = apl_12.aIC();
        if (n > -1) {
            this.ciZ = apl_12.aIA();
        }
    }

    public void a(fs_0 fs_02, int n) {
        fs_02.mz(this.bap);
        fs_02.mz(this.baq);
        fs_02.bo(this.eAl);
        if (n > -1) {
            fs_02.mz(this.ciZ);
        }
    }

    public String toString() {
        return this.eAl;
    }
}

