/*
 * Decompiled with CFR 0.152.
 */
public class aVf
extends agb_1
implements ayz_2 {
    private bsS efA;
    private static final ayv_2 hsB = new ayv_2(new aVg());

    public static aVf a(int n, int n2, int n3, bsS bsS2) {
        try {
            aVf aVf2 = (aVf)hsB.borrowObject();
            aVf2.xO(n);
            aVf2.xP(n2);
            aVf2.xQ(n3);
            aVf2.l(bsS2);
            return aVf2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un EndPlacementAction : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsB.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.efA = null;
    }

    aVf() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        for (bgy bgy2 : this.efA.dGs()) {
            bdj_2 bdj_22;
            if (!(bgy2 instanceof bhJ) || (bdj_22 = bgy2.ddI()).dcX() != btl_0.dHL()) continue;
            bgy2.dkL();
        }
        if (aue_0.cVJ().cVK().dmV() != this.efA) {
            return 0L;
        }
        dgw.fcT().a(new dgv(dgx.okL, aum_0.cWf().c("fight.start", new Object[0]), 3000));
        try {
            ((bsj_0)this.efA).dGS();
        }
        catch (Exception exception) {
            dJP.error((Object)"Erreur lors du placement : ", (Throwable)exception);
        }
        fse_1.gFu().f("isInFightCreationOrPlacement", false);
        bsj_0 bsj_02 = (bsj_0)this.efA;
        bsj_02.dGV().clear();
        bsj_02.dGW().clear();
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public bsS cja() {
        return this.efA;
    }

    public void l(bsS bsS2) {
        this.efA = bsS2;
    }
}

