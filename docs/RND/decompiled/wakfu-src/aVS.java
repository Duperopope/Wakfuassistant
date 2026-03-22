/*
 * Decompiled with CFR 0.152.
 */
public class aVS
extends aUV {
    private final int htF;
    private final boolean htG;

    public aVS(int n, int n2, int n3, int n4, int n5, boolean bl) {
        super(n, n2, n3, n4);
        this.htF = n5;
        this.htG = bl;
    }

    @Override
    protected long cbk() {
        if (this.cja() == null) {
            dJP.error((Object)"[SPEAK] On d\u00e9clenche une action de combat alors qu'il n'y a plus de combat");
            return 0L;
        }
        long l = this.caQ();
        bgy bgy2 = this.cja().kq(l);
        String string = bgy2.getName();
        String string2 = aum_0.cWf().a(47, (long)this.htF, new Object[0]);
        api_0 api_02 = new api_0(string, l, string2);
        api_02.m(aPl.exq);
        aPh.czg().d(api_02);
        return this.htG ? 750L : 0L;
    }
}

