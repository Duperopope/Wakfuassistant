/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIW
 */
public class biw_1 {
    private final String kiZ;
    private int kja = 10000;
    private int kjb = 200;
    private int kjc = 11000;
    private int kjd = 7;
    private boolean kje = false;
    private Runnable kjf;
    private boolean kjg = false;
    private Runnable kjh;
    private String kji = "desc.accept";
    private String kjj = "desc.refuse";
    private Runnable kjk;

    private biw_1(String string) {
        this.kiZ = string;
    }

    public static biw_1 mT(String string) {
        return new biw_1(string);
    }

    public static biw_1 mU(String string) {
        return new biw_1(string).Hf(5000).Hh(5500);
    }

    public biy_1 dZy() {
        return new biy_1(this);
    }

    public biy_1 dZz() {
        biy_1 biy_12 = this.dZy();
        cwy_2.nUc.b(biy_12);
        return biy_12;
    }

    public String dZA() {
        return this.kiZ;
    }

    public biw_1 Hf(int n) {
        this.kja = n;
        return this;
    }

    public int dZB() {
        return this.kja;
    }

    public biw_1 Hg(int n) {
        this.kjb = n;
        return this;
    }

    public int dZC() {
        return this.kjb;
    }

    public biw_1 Hh(int n) {
        this.kjc = n;
        return this;
    }

    public int dZD() {
        return this.kjc;
    }

    public biw_1 Hi(int n) {
        this.kjd = n;
        return this;
    }

    public int dZE() {
        return this.kjd;
    }

    public biw_1 hR(boolean bl) {
        this.kje = bl;
        return this;
    }

    public biw_1 r(Runnable runnable) {
        this.kjf = runnable;
        return this;
    }

    public Runnable dZF() {
        return this.kjf;
    }

    public biw_1 hS(boolean bl) {
        this.kjg = bl;
        return this;
    }

    public biw_1 s(Runnable runnable) {
        this.kjh = runnable;
        return this;
    }

    public Runnable dZG() {
        return this.kjh;
    }

    public biw_1 mV(String string) {
        this.kji = string;
        return this;
    }

    public String dZH() {
        if (!this.kje) {
            return null;
        }
        return this.kji;
    }

    public biw_1 mW(String string) {
        this.kjj = string;
        return this;
    }

    public String dZI() {
        if (!this.kjg) {
            return null;
        }
        return this.kjj;
    }

    public biw_1 t(Runnable runnable) {
        this.kjk = runnable;
        return this;
    }

    public Runnable dZJ() {
        return this.kjk;
    }
}

