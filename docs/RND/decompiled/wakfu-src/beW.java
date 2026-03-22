/*
 * Decompiled with CFR 0.152.
 */
public class beW
implements aeh_2 {
    public static final String hPn = "backgroundImage";
    public static final String hPo = "backgroundSize";
    public static final String hPp = "leftPage";
    public static final String hPq = "rightPage";
    public static final String hPr = "previousExisting";
    public static final String hPs = "nextExisting";
    public static final String hPt = "hasPages";
    public static final String[] hPu = new String[]{"backgroundImage", "backgroundSize", "leftPage", "rightPage", "previousExisting", "nextExisting", "hasPages"};
    private int hPv = -1;
    private final beZ[] hPw;
    private final beV hPx;
    private final fsm_1 hPy;

    public beW(beV beV2, beZ[] beZArray) {
        this.hPx = beV2;
        this.hPw = beZArray;
        this.hPv = 0;
        this.hPy = this.hPx.dfh() ? new fsm_1(1000, 612) : new fsm_1(450, 612);
    }

    @Override
    public String[] bxk() {
        return hPu;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hPn)) {
            return this.hPx == beV.hOY ? null : auc_0.cVq().zQ(this.hPx.d());
        }
        if (string.equals(hPo)) {
            return this.hPy;
        }
        if (string.equals(hPp)) {
            return this.hPw[this.hPv];
        }
        if (string.equals(hPq)) {
            int n = this.hPv + 1;
            return n < this.hPw.length ? this.hPw[n] : null;
        }
        if (string.equals(hPr)) {
            return this.dfn();
        }
        if (string.equals(hPs)) {
            return this.dfo();
        }
        if (string.equals(hPt)) {
            return this.hPw.length > 2;
        }
        return null;
    }

    private boolean dfn() {
        return this.hPv - 2 >= 0;
    }

    private boolean dfo() {
        return this.hPv + 2 < this.hPw.length;
    }

    public void dfp() {
        if (!this.dfn()) {
            return;
        }
        this.hPv -= 2;
        fse_1.gFu().a((aef_2)this, hPu);
    }

    public void dfq() {
        if (!this.dfo()) {
            return;
        }
        this.hPv += 2;
        fse_1.gFu().a((aef_2)this, hPu);
    }

    public beV dff() {
        return this.hPx;
    }
}

