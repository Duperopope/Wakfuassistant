/*
 * Decompiled with CFR 0.152.
 */
final class exR
extends eyj_0 {
    private final oq_2 pgF;
    static final /* synthetic */ boolean pgG;
    final /* synthetic */ exP pgH;

    public exR(exP exP2, oq_2 oq_22) {
        this.pgH = exP2;
        this.pgF = oq_22;
        this.pgF.DM().a(this);
    }

    @Override
    public void zl() {
        if (this.pgH.ltt == eym.phV) {
            exP.pfX.warn((Object)"Serialisation d'une breed NONE ! probablement pas normal");
        }
        this.pgF.RO = this.pgH.ltt.aWP();
    }

    @Override
    public void zm() {
        short s = this.pgF.RO;
        if (this.pgH.ltt == null || s != this.pgH.ltt.aWP()) {
            Object b2 = this.pgH.djD().bD(s);
            if (!pgG && b2 == null) {
                throw new AssertionError((Object)("breed == null. Invalid BreedId : " + s + " ?"));
            }
            this.pgH.c((eyp)b2);
            if (this.pgH.p == null || this.pgH.p.length() == 0) {
                this.pgH.setName("");
            }
            for (eyk_0 eyk_02 : this.pgH.pga) {
                eyk_02.o(this.pgH);
            }
        }
    }

    static {
        pgG = !exP.class.desiredAssertionStatus();
    }
}

