/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public class eRB
extends ero_0 {
    private static final aox_1 rim = new enz_0(new eny_0("Jette la cible ", new enx_0[0]), new eny_0("Ignore les obstacles", new enx_0("Ignore les obstacles (1 = oui, 0 = non [d\u00e9faut])", eNA.qYD)));
    private boolean pCd;
    private acd_1 rdG = null;

    @Override
    public aox_1 bEt() {
        return rim;
    }

    @Override
    public void bby() {
        super.bby();
    }

    public eRB fGR() {
        eRB eRB2 = new eRB();
        return eRB2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        boolean bl2;
        if (!(this.bgE instanceof ezz)) {
            this.fHg();
            return;
        }
        ezz ezz2 = (ezz)((Object)this.bgE);
        if (!ezz2.fha()) {
            this.fHg();
            return;
        }
        eza_0 eza_02 = ezz2.fgY();
        int n = eza_02.bcC();
        int n2 = eza_02.bcD();
        short s = eza_02.bcE();
        if (!this.bbt()) {
            bl2 = ezz2.Q(this.rdG);
            if (eza_02 instanceof qu_0 && this.bgJ.bai() != null) {
                this.bgJ.bai().a(n, n2, s, eza_02.bcC(), eza_02.bcD(), eza_02.bcE(), (qu_0)((Object)eza_02));
            }
        } else {
            rh_0 rh_02 = this.bgJ.bag();
            if (rh_02 == null) {
                bgA.warn((Object)("pas de fightmap sur le context " + String.valueOf(this.bgJ)));
                this.fHg();
                return;
            }
            bl2 = !eza_02.bcS() || !rh_02.g(this.bgG.getX(), this.bgG.getY(), this.bgG.bdi()) || this.pCd ? this.a(qD, bl, ezz2, eza_02) : this.a(qD, bl, ezz2, eza_02, rh_02);
        }
        if (!bl2) {
            this.mk(true);
        }
    }

    private boolean a(QD qD, boolean bl, ezz ezz2, eza_0 eza_02) {
        int n = eza_02.bcC();
        int n2 = eza_02.bcD();
        short s = eza_02.bcE();
        if (!ezz2.Q(this.bgG)) {
            return false;
        }
        this.rdG = this.bgG;
        this.d(qD, bl);
        if (eza_02 instanceof qu_0 && this.bgJ.bai() != null) {
            ((qu_0)((Object)eza_02)).b(new acd_1(n, n2, s).y(this.rdG));
            this.bgJ.bai().a(n, n2, s, eza_02.bcC(), eza_02.bcD(), eza_02.bcE(), (qu_0)((Object)eza_02));
            ((qu_0)((Object)eza_02)).b((abi_1)null);
        }
        return true;
    }

    private boolean a(QD qD, boolean bl, ezz ezz2, eza_0 eza_02, rh_0 rh_02) {
        int n = eza_02.bcC();
        int n2 = eza_02.bcD();
        short s = eza_02.bcE();
        if (this.bgC == null) {
            return false;
        }
        aoh_1 aoh_12 = ((enk_0)this.bgC).aZS();
        if (aoh_12 == null) {
            return false;
        }
        Iterable<int[]> iterable = aoh_12.b(this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.bgE.bcB());
        if (iterable == null) {
            return false;
        }
        Iterator<int[]> iterator = iterable.iterator();
        acd_1 acd_12 = null;
        while (iterator.hasNext()) {
            short s2;
            int[] nArray = iterator.next();
            if (!rh_02.aK(nArray[0], nArray[1]) || (s2 = rh_02.Z(nArray[0], nArray[1])) == Short.MIN_VALUE || rh_02.g(nArray[0], nArray[1], s2)) continue;
            acd_12 = new acd_1(nArray[0], nArray[1], s2);
            break;
        }
        if (acd_12 == null) {
            return false;
        }
        if (!ezz2.Q(acd_12)) {
            return false;
        }
        this.rdG = acd_12;
        this.d(qD, bl);
        if (eza_02 instanceof qu_0 && this.bgJ.bai() != null) {
            this.bgJ.bai().a(n, n2, s, eza_02.bcC(), eza_02.bcD(), eza_02.bcE(), (qu_0)((Object)eza_02));
        }
        return true;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() <= 0) {
            return;
        }
        this.pCd = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().a(ii_2.Qc().eH(this.bgG.getX()).eI(this.bgG.getY()).eJ(this.bgG.bdi())).r(this.pCd));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            ii_2 ii_22 = ii_12.LX();
            this.rdG = new acd_1(ii_22.getX(), ii_22.getY(), GC.cu(ii_22.NN()));
            this.pCd = ii_12.Mc();
        }
    }

    public acd_1 fEt() {
        return this.rdG;
    }

    @Override
    public void aVH() {
        this.rdG = null;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGR();
    }
}

