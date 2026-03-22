/*
 * Decompiled with CFR 0.152.
 */
public class buJ {
    private long jqA;
    private short jqB = 1;
    private short jqC = 1;
    private axb_2 jqD;
    private axb_2 jqE;

    public buJ(short s, short s2, axb_2 axb_22, axb_2 axb_23) {
        this.jqB = s;
        this.jqC = s2;
        this.jqE = axb_22;
        this.jqD = axb_23;
        this.jqA = this.dhO();
    }

    public buJ(ezb ezb2) {
        this(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
    }

    public short dJp() {
        return this.jqB;
    }

    public void bM(short s) {
        this.jqB = s;
        this.jqA = this.dhO();
    }

    public short dJq() {
        return this.jqC;
    }

    public void bN(short s) {
        this.jqC = s;
        this.jqA = this.dhO();
    }

    public axb_2 dJr() {
        return this.jqE;
    }

    public void k(axb_2 axb_22) {
        if (this.jqE == axb_22) {
            return;
        }
        this.jqE = axb_22;
        this.jqA = this.dhO();
    }

    public axb_2 dJs() {
        return this.jqD;
    }

    public void l(axb_2 axb_22) {
        if (this.jqD == axb_22) {
            return;
        }
        this.jqD = axb_22;
        this.jqA = this.dhO();
    }

    public void bmX() {
    }

    public String dJt() {
        return "generatedGuildBanner-" + this.jqB + "-" + this.jqC + "-" + this.jqE.aTn() + "-" + this.jqD.aTn();
    }

    private long dhO() {
        return arn_2.fX(this.dJt());
    }

    public long dJu() {
        return this.jqA;
    }

    public ezb dJv() {
        short s = buH.dJn().j(this.jqD);
        short s2 = buH.dJn().j(this.jqE);
        return new ezb(this.jqB, s, this.jqC, s2);
    }
}

