/*
 * Decompiled with CFR 0.152.
 */
public class ffT
extends ffV
implements Comparable<ffT> {
    public static final String shg = "isEnutrofPurseLoot";
    public static final String shh = "isPvpLoot";
    private short bol;
    private long kYd;
    private final fhc_0 shi;
    private final boolean shj;
    private final boolean shk;

    public ffT(fhc_0 fhc_02) {
        super(0L);
        this.l(fhc_02);
        this.shi = fhc_02;
        this.shj = false;
        this.shk = false;
    }

    public ffT(fhy fhy2) {
        super(fhy2.Lx());
        this.shi = fgD.fXh().Vd(fhy2.avr());
        this.l(this.shi);
        this.bol = fhy2.fQY();
        this.kYd = fhy2.Lx();
        this.shj = fhy2.fVP();
        this.shk = fhy2.fVQ();
    }

    public ffT(iv_2 iv_22) {
        super(0L);
        this.shi = fgD.fXh().Vd(iv_22.AK());
        this.l(this.shi);
        this.bol = (short)iv_22.oP();
        this.kYd = 0L;
        this.shj = iv_22.RV();
        this.shk = iv_22.RX();
    }

    @Override
    public Object eu(String string) {
        if (shg.equals(string)) {
            return this.fVP();
        }
        if (shh.equals(string)) {
            return this.fVQ();
        }
        return super.eu(string);
    }

    @Override
    public short bfd() {
        return this.bol;
    }

    @Override
    public long LV() {
        return this.kYd;
    }

    public boolean fVP() {
        return this.shj;
    }

    public boolean fVQ() {
        return this.shk;
    }

    @Override
    public void tn(long l) {
        this.kYd = l;
    }

    @Override
    public void ak(short s) {
        this.bol = s;
        fgi_0 fgi_02 = shn.fWH();
        if (fgi_02 != null) {
            fgi_02.bb(this);
        }
    }

    public void cD(ffV ffV2) {
        this.shs = ffV2.shs;
    }

    @Override
    public ffV fVR() {
        return this.to(0L);
    }

    @Override
    public ffV to(long l) {
        ffu_0 ffu_02 = new ffu_0(l, this.shi, this);
        ffu_02.UX(this.fUX());
        ffu_02.Na = false;
        ffu_02.bol = 0;
        return ffu_02;
    }

    public int e(ffT ffT2) {
        if (ffT2 == null) {
            return -1;
        }
        int n = fgj.fWS().compare(this.dwg(), ffT2.dwg());
        if (n != 0) {
            return n;
        }
        return Integer.signum(ffT2.cmL() - this.cmL());
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.e((ffT)object);
    }
}

