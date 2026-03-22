/*
 * Decompiled with CFR 0.152.
 */
public class fib
extends sh_0<ffV> {
    private final fid srp = new fid();
    private final exP srq;

    public fib(exP exP2) {
        this.srq = exP2;
    }

    protected void b(ffV ffV2, Sn sn) {
        super.a(ffV2, sn);
        ffs_0 ffs_02 = fcI.aq(this.srq.Xi(), ffV2.LV());
        if (ffs_02 == null) {
            bnJ.error((Object)("[Items] Could not find bag of item that was added, item may be lost! Player = " + String.valueOf(this.srq) + ", item=" + ffV2.fWz() + ", event=" + String.valueOf(sn) + ", bags=" + String.valueOf(this.srq.dod())), new Throwable());
            return;
        }
        try {
            this.srp.a(ffV2, ffs_02.Lx(), ffs_02.dK(ffV2.LV()));
        }
        catch (fic fic2) {
            bnJ.error((Object)("Probl\u00e8me d'inventaire \u00e0 l'ajout de l'item " + String.valueOf(ffV2)), (Throwable)fic2);
        }
    }

    protected void dc(ffV ffV2) {
        super.q(ffV2);
        this.srp.tF(ffV2.LV());
    }

    protected void k(ffV ffV2, short s) {
        super.e(ffV2, s);
        try {
            this.srp.v(ffV2.LV(), ffV2.bfd());
        }
        catch (fic fic2) {
            bnJ.error((Object)("Probl\u00e8me d'inventaire \u00e0 la mise a jour de l'item " + String.valueOf(ffV2)), (Throwable)fic2);
        }
    }

    public fid fZu() {
        return this.srp;
    }

    public void clear() {
        this.srp.clean();
    }

    public String toString() {
        return "BagOperationVisitor{calculator=" + String.valueOf(this.srp) + ", m_owner=" + String.valueOf(this.srq) + "}";
    }

    @Override
    protected /* synthetic */ void e(RT rT, short s) {
        this.k((ffV)rT, s);
    }

    @Override
    protected /* synthetic */ void q(RT rT) {
        this.dc((ffV)rT);
    }

    @Override
    protected /* synthetic */ void a(RT rT, Sn sn) {
        this.b((ffV)rT, sn);
    }
}

