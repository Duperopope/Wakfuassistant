/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRa
 */
public class cra_2
extends cqf_1 {
    private rw_0 nlO;
    private fdJ nlP;

    public void f(rw_0 rw_02) {
        this.nlO = rw_02;
    }

    public void a(fdJ fdJ2) {
        this.nlP = fdJ2;
    }

    @Override
    protected rw_0 eLF() {
        return this.nlO != null ? this.nlO : super.eLF();
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njT;
    }

    @Override
    public String ely() {
        return "desc.mru.openRanch." + this.nlP.fTU().cZa();
    }

    @Override
    public String eLA() {
        String string = this.ely();
        if (aum_0.cWf().cO(string)) {
            return aum_0.cWf().c(string, new Object[0]);
        }
        String string2 = aum_0.cWf().a(77, (long)this.nlP.fTU().glN(), new Object[0]);
        return aum_0.cWf().c(this.ely(), string2);
    }

    @Override
    protected int eLB() {
        return crc_2.nmJ.nnW;
    }

    @Override
    public cpm_1 eLD() {
        return new cra_2();
    }
}

