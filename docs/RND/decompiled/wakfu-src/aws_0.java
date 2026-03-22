/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from aWS
 */
public class aws_0
extends aga_2
implements aWw {
    private final ero_0 hvS;
    private final boolean hvT;

    public aws_0(int n, int n2, int n3, ero_0 ero_02, boolean bl) {
        super(n, n2, n3);
        this.hvS = ero_02;
        this.hvT = bl;
        this.f(new bxp_2(this));
        this.xV(this.Ad(this.hvS.d()));
    }

    @Override
    public long Qw() {
        return this.caQ();
    }

    @Override
    public int bha() {
        return -1;
    }

    @Override
    public Optional<Byte> cXp() {
        eNd eNd2 = this.hvS.dTh();
        return Optional.ofNullable(eNd2 != null ? Byte.valueOf(eNd2.aJr()) : null);
    }

    @Override
    public long cbk() {
        int n;
        if (this.hvS != null) {
            this.hvS.a(bas_2.cZC());
            if (this.hvS.bbd() != null) {
                this.fg(this.hvS.bbd().Sn());
            }
            if (this.hvS.bbc() != null) {
                this.hB(this.hvS.bbc().Sn());
            }
        }
        if ((n = this.cXr()) != 0) {
            this.xV(n);
        }
        return super.cbk();
    }

    private int cXr() {
        if (this.hvS.bbf() != null && ((eNl)this.hvS.bbf()).bab() == 33) {
            return -1;
        }
        if (this.hvS.bba() == null) {
            return 0;
        }
        return ((enk_0)this.hvS.bba()).cbj();
    }

    @Override
    protected void caV() {
        int n = this.hvS.d();
        try {
            this.Ae(n);
        }
        catch (Exception exception) {
            dJP.error((Object)"Exception levee lors de l'affichage, on continue cependant l'execution de notre effet", (Throwable)exception);
        }
        this.cXL();
        this.hvS.fHB();
    }

    private void cXL() {
        this.hvS.bbr();
        QD.baX();
        if (this.hvT) {
            this.hvS.bbM();
            this.hvS.a(null, true);
        } else {
            if (this.hvS.Ty()) {
                if (this.hvS.bbd() != null && this.hvS.bbd().baz() != null) {
                    this.hvS.bbd().baz().p(this.hvS);
                }
                this.hvS.bbF();
            }
            if (this.hvS.Ty() && !this.hvS.bbY()) {
                this.hvS.bbU();
            }
            if (!this.hvS.aZQ()) {
                this.hvS.a(this.hvS.bbm(), false);
            }
        }
        this.hvS.fHB();
    }

    private void Ae(int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != this.hvS.bbc() && bgt_02 != this.hvS.bbd() && this.hvS.bbc() != null && fcL.rUh.sw(this.hvS.bbc().Sn()) == null && this.hvS.bbd() != null && fcL.rUh.sw(this.hvS.bbd().Sn()) == null) {
            return;
        }
        if (this.hvS.bbf() != null && ((eNl)this.hvS.bbf()).bab() == 33) {
            return;
        }
        if ((bgg_0.dlO().ju(this.Qy()) != null || fcL.rUh.sw(this.Qy()) != null) && n != 30 && n != 40 && n != 190 && !(this.hvS instanceof erh_0) && (((enk_0)this.hvS.bba()).fAo() || ((enk_0)this.hvS.bba()).fAp() && bgt_02 == this.hvS.bbc() || ((enk_0)this.hvS.bba()).fAq() && bgt_02 == this.hvS.bbd())) {
            ahv_2 ahv_22 = new ahv_2();
            ArrayList<String> arrayList = new ArrayList<String>();
            ahv_22.ceC().e(aPc.ewx).c(bvz_0.ju(this.Qy()).getName()).c(" : ");
            String string = null;
            if (aum_0.cWf().e(13, this.hvS.aZH())) {
                string = aum_0.cWf().J(13, this.hvS.aZH());
            }
            if ((string == null || string.length() == 0) && aum_0.cWf().e(10, n)) {
                string = aum_0.cWf().J(30, n);
            }
            if (string.length() > 0) {
                ahv_22.ceD();
                ahv_22.ceC().e(aPc.eww);
                ahv_22.c(string);
                if (n == enf_0.qUR.d()) {
                    var6_6 = (eor_0)this.hvS;
                    bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(((eor_0)var6_6).ecx());
                    String string2 = String.valueOf(((eor_0)var6_6).fCw());
                    arrayList.add(bmq_02.getName());
                    arrayList.add(string2);
                } else if (n == enf_0.qUT.d()) {
                    var6_6 = (bmq_0)fqX.gjM().Zr(this.hvS.getValue());
                    arrayList.add(((bmq_0)var6_6).getName());
                } else if (n == enf_0.qTR.d()) {
                    arrayList.add(aum_0.cWf().a(6, (long)this.hvS.getValue(), new Object[0]));
                } else {
                    arrayList.add(String.valueOf(this.hvS.getValue()));
                }
                try {
                    aPh.czg().iZ(Bz.a(ahv_22.ceL(), arrayList.toArray()));
                }
                catch (Exception exception) {
                    dJP.error((Object)"Exception during chatInfo", (Throwable)exception);
                }
            }
        }
    }

    private int Ad(int n) {
        eNg eNg2 = (eNg)enf_0.fBb().pT(n);
        if (eNg2 == null) {
            return -1;
        }
        return eNg2.cbt();
    }

    @Override
    public int cWC() {
        return this.hvS.getValue();
    }

    @Override
    public byte cXt() {
        return this.hvS.cXt();
    }

    @Override
    public ero_0 cXu() {
        return this.hvS;
    }

    @Override
    public acd_1 aZw() {
        qu_0 qu_02 = this.hvS.bbd();
        if (qu_02 != null) {
            return new acd_1(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
        }
        return this.hvS.bbe();
    }

    @Override
    public acd_1 bbe() {
        acd_1 acd_12 = this.hvS.bbe();
        if (acd_12 != null) {
            return acd_12;
        }
        qu_0 qu_02 = this.hvS.bbd();
        if (qu_02 != null) {
            return new acd_1(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
        }
        return null;
    }

    @Override
    public acd_1 cXv() {
        qu_0 qu_02 = this.hvS.bbc();
        if (qu_02 != null) {
            return new acd_1(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
        }
        dJP.error((Object)"ATTENTION : on veut r\u00e9cup\u00e9rer la position du caster d'un effet mais celui ci est inconnu, \u00e0 d\u00e9faut on renvoie la cellule cible");
        return this.hvS.bbe();
    }

    @Override
    public acd_1 cXw() {
        QE qE = this.hvS.bbq();
        if (qE == null) {
            return null;
        }
        qu_0 qu_02 = qE.bci();
        if (qu_02 == null) {
            return null;
        }
        return qu_02.aZw();
    }

    @Override
    public int cXx() {
        if (this.hvS instanceof eov_0) {
            return ((eov_0)((Object)this.hvS)).fCF();
        }
        return 0;
    }

    @Override
    public int cXy() {
        if (this.hvS instanceof eov_0) {
            return ((eov_0)((Object)this.hvS)).fCG();
        }
        return 0;
    }
}

