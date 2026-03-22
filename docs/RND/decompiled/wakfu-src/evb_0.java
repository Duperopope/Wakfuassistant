/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVB
 */
public abstract class evb_0 {
    public static final evb_0 rAq = new eVR();

    public abstract boolean a(exP var1, eVw var2);

    protected abstract String name();

    public String toString() {
        return this.name();
    }

    public static evb_0 fJ(byte by) {
        return new evc_0(by);
    }

    public static evb_0 fNm() {
        return new evn_0();
    }

    public static evb_0 fNn() {
        return new eVS();
    }

    public static evb_0 fNo() {
        return new evt_0();
    }

    public static evb_0 fNp() {
        return new eVU();
    }

    public static evb_0 fNq() {
        return new eVV();
    }

    public static evb_0 rb(long l) {
        return new evw_0(l);
    }

    public static evb_0 fK(byte by) {
        return new eVX(by);
    }

    public static evb_0 fL(byte by) {
        return new eVY(by);
    }

    public static evb_0 l(pv_0 pv_02) {
        return new evd_0(pv_02);
    }

    public static evb_0 fNr() {
        return new eve_0();
    }

    public static evb_0 fNs() {
        return new evf_0();
    }

    public static evb_0 fNt() {
        return new evg_0();
    }

    public static evb_0 fNu() {
        return new evh_0();
    }

    public static evb_0 bF(exP exP2) {
        if (exP2 == null) {
            return rAq;
        }
        return new evi_0(exP2);
    }

    public static evb_0 rc(long l) {
        return new evj_0(l);
    }

    public static evb_0 fM(byte by) {
        return new evk_0(by);
    }

    public static evb_0 bG(exP exP2) {
        if (exP2 == null) {
            return rAq;
        }
        return new evl_0(exP2);
    }

    public static evb_0 c(evb_0 ... evb_0Array) {
        return new evm_0(evb_0Array);
    }

    public static evb_0 d(evb_0 ... evb_0Array) {
        return new evo_0(evb_0Array);
    }

    public static evb_0 a(evb_0 evb_02) {
        return new evp_0(evb_02);
    }

    public static evb_0 fNv() {
        return new evq_0();
    }
}

