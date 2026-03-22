/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWN
 */
public class cwn_2
implements apq_0 {
    private final String nTO;
    private final long nTP;
    private final String nTQ;

    protected cwn_2(String string, long l, String string2) {
        this.nTP = l;
        this.nTO = string;
        this.nTQ = string2;
    }

    @Override
    public void a(apr_0 apr_02) {
        int n = aPt.cAg().cAB();
        ux_0 ux_02 = Uq.buK.bjc();
        String string = "[" + ux_02.bjE() + ":" + ux_02.bjF() + "] ";
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC();
        ahv_22.e(aPl.exs.getColor());
        ahv_22.c(string);
        ahv_22.ceu().ceA();
        ahv_22.ij("characterName_" + this.nTP);
        ahv_22.c(this.nTQ);
        ahv_22.ceB().cev();
        ahv_22.c(aum_0.cWf().c("colon", new Object[0])).c(this.nTO);
        ahv_22.ceD();
        api_0 api_02 = new api_0(ahv_22.ceL());
        api_02.m(aPl.exs);
        api_02.yW(n);
        aPh.czg().d(api_02);
    }
}

