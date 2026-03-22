/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcM
 */
public class dcm_0
extends dae_0 {
    private int ofJ;
    private int bYe;
    private int bYf;
    private int ofK;

    public dcm_0(int n, int n2, int n3, int n4, int n5) {
        this.bYe = n2;
        this.bYf = n3;
        this.ofJ = n4;
        this.ofK = n5;
        this.lK(n);
    }

    public dcm_0() {
    }

    public static void ai(int n, int n2, int n3) {
        dcm_0.a((short)19373, n, n2, n3, 0);
    }

    public static void aj(int n, int n2, int n3) {
        dcm_0.a((short)16902, n, n2, n3, 0);
    }

    public static void D(int n, int n2, int n3, int n4) {
        dcm_0.a((short)16902, n, n2, n3, n4);
    }

    public static void eW(int n, int n2) {
        dcm_0.a((short)16346, n, n2, 0, 0);
    }

    public static void eX(int n, int n2) {
        dcm_0.a((short)16990, n, n2, 0, 0);
    }

    private static void a(short s, int n, int n2, int n3, int n4) {
        dcm_0 dcm_02 = new dcm_0(s, n, n2, n3, n4);
        assert (dcm_02.d() == s);
        aaw_1.bUq().h(dcm_02);
    }

    public dcm_0 fcg() {
        dcm_0 dcm_02 = new dcm_0();
        dcm_02.lK(this.d());
        dcm_02.bYe = this.bYe;
        dcm_02.bYf = this.bYf;
        dcm_02.ofJ = this.ofJ;
        dcm_02.ofK = this.ofK;
        return dcm_02;
    }

    public boolean fch() {
        return this.ofJ == 1;
    }

    public boolean fci() {
        return this.ofJ == 2;
    }

    public boolean fcj() {
        return this.ofJ == 3;
    }

    public int bqM() {
        return this.bYe;
    }

    public int bqN() {
        return this.bYf;
    }

    private static boolean yA(int n) {
        return ((aIs)aie_0.cfn().bmC()).yA(n);
    }

    public static boolean fck() {
        return dcm_0.yA(1);
    }

    public static boolean fcl() {
        return dcm_0.yA(3);
    }

    public static boolean fcm() {
        return dcm_0.yA(2);
    }

    public int fcn() {
        return this.ofK;
    }
}

