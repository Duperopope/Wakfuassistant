/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eQc
 */
public class eqc_0
extends ero_0 {
    protected static final aox_1 reS = new enz_0(new eny_0("Default", new enx_0[0]), new eny_0("Getion nombre max d'effets \u00e0 ex\u00e9cuter", new enx_0("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eNA.qYC)), new eny_0("Gestion r\u00e9ussite", new enx_0("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eNA.qYC), new enx_0("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eNA.qYD)), new eny_0("Gestion cible ou cellule", new enx_0("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eNA.qYC), new enx_0("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eNA.qYD), new enx_0("0 : effet sur cellule, 1 : effet sur cible (default)", eNA.qYD)), new eny_0("Gestion probabilit\u00e9 relative", new enx_0("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eNA.qYC), new enx_0("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eNA.qYD), new enx_0("0 : effet sur cellule, 1 : effet sur cible (default)", eNA.qYD), new enx_0("0 : rien (default), 1 : proba relative (on ne garde que les effets valides et on recalcule leurs proba entre eux) ", eNA.qYD)), new eny_0("Gestion tansmission cible ou cellule de la cible aux effets enfants", new enx_0("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eNA.qYC), new enx_0("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eNA.qYD), new enx_0("0 : effet sur cellule, 1 : effet sur cible (default)", eNA.qYD), new enx_0("0 : rien (default), 1 : proba relative (on ne garde que les effets valides et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("0 : transmet la cellule de la cible, 1 : transmet la cible (default)", eNA.qYD)), new eny_0("Gestion modifications caster et target", new enx_0("valeur <= 0 : pas de limite (default), valeur > 0 : limit\u00e9", eNA.qYC), new enx_0("0 : effet standard (default), 1 : effet avec r\u00e9ussite", eNA.qYD), new enx_0("0 : effet sur cellule, 1 : effet sur cible (default)", eNA.qYD), new enx_0("0 : rien (default), 1 : proba relative (on ne garde que les effets valides et on recalcule leurs proba entre eux) ", eNA.qYD), new enx_0("0 : transmet la cellule de la cible, 1 : transmet la cible (default)", eNA.qYD), new enx_0("0 : rien (default), 1 : target devient caster : 1, 2 : inverse target et caster", eNA.qYD)));
    public static final byte reT = 0;
    public static final byte reU = 1;
    public static final byte reV = 2;
    private int reA = 0;
    private boolean reW = false;
    private boolean reX = false;
    protected boolean reY = true;
    private byte reZ = 0;
    protected fqB rfa;
    private final ArrayList<enk_0> rfb = new ArrayList();

    @Override
    public aox_1 bEt() {
        return reS;
    }

    public eqc_0 fES() {
        eqc_0 eqc_02 = new eqc_0();
        eqc_02.rfa = null;
        eqc_02.reA = this.reA;
        eqc_02.reW = this.reW;
        eqc_02.reX = this.reX;
        eqc_02.reY = this.reY;
        return eqc_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.rfa != null && this.bbt()) {
            this.fFe();
            if (this.reX) {
                short s = this.fHf();
                int n = 0;
                this.rfb.clear();
                for (enk_0 enk_02 : this.rfa) {
                    Iterable<qu_0> iterable = anv_1.bEg().a(this.bbc(), this.bgJ.bae(), enk_02.fAB(), this.bgG.getX(), this.bgG.getY(), this.bgG.bdi(), enk_02.aZI());
                    if (iterable.iterator().hasNext()) continue;
                    int n2 = enk_02.fAv();
                    int n3 = enk_02.fAw();
                    if (s < n2 || s > n3) continue;
                    if (enk_02.aZQ()) {
                        n = (short)((float)n + enk_02.eb(s));
                        this.rfb.add(enk_02);
                        continue;
                    }
                    if (enk_02.fAx() != null) {
                        if (!enk_02.fAx().b(qD != null ? qD.bbc() : this.bgE, this.bgF, this, this.bgJ)) continue;
                        n = (short)((float)n + enk_02.eb(s));
                        this.rfb.add(enk_02);
                        continue;
                    }
                    n = (short)((float)n + enk_02.eb(s));
                    this.rfb.add(enk_02);
                }
                Iterator<enk_0> iterator = this.rfb.iterator();
                while (iterator.hasNext()) {
                    enk_0 enk_02;
                    enk_02 = iterator.next();
                    if (ve_0.pV(n) <= VJ.bt(enk_02.eb(s))) continue;
                    iterator.remove();
                }
                this.a(this.rfb.iterator(), qD, true);
            } else {
                this.a(this.rfa.iterator(), qD, false);
            }
        }
        this.mk(true);
    }

    private void fFe() {
        if (this.reZ == 0) {
            return;
        }
        if (this.reZ == 1) {
            if (this.bgF != null) {
                this.bgE = this.bgF;
            } else {
                bgA.error((Object)("On veut changer le caster d'un groupe d'effet pas la cible mais la cible est nulle, on ne fait rien, effectId = " + this.aZH()));
            }
        } else if (this.reZ == 2) {
            if (this.bgF != null && this.bgE != null) {
                qu_0 qu_02 = this.bgF;
                this.bgF = this.bgE;
                this.bgE = qu_02;
            } else {
                bgA.error((Object)("On veut inverser le caster et la target d'un groupe mais l'un des deux est null, on ne fait rien, effectId = " + this.aZH()));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Iterator<enk_0> iterator, QD qD, boolean bl) {
        enq_0 enq_02 = this.d((ero_0)qD, bl);
        try {
            if (this.a(eNi.qWD) && enq_02.Oh() == -1) {
                enq_02.RT(this.fHf());
            }
            this.a(iterator, enq_02);
        }
        catch (Exception exception) {
            bgA.error((Object)("Exception levee lors de l'execution d'un groupe d'effets id " + (this.bgC == null ? -1 : ((enk_0)this.bgC).aZH())), (Throwable)exception);
        }
        finally {
            enq_02.aZp();
        }
    }

    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = enq_0.a(bl, false, ero_02);
        enq_02.lR(false);
        return enq_02;
    }

    private void a(Iterator<enk_0> iterator, enq_0 enq_02) {
        int n = 0;
        int n2 = 0;
        block2: while (iterator.hasNext()) {
            qs_0 qs_02;
            enk_0 enk_02 = iterator.next();
            if (this.reA > 0 && (!this.reW ? n >= this.reA : n2 >= this.reA)) break;
            if (this.bbB()) {
                if (this.bgF == null) {
                    bgA.error((Object)("Impossible d'executer l'effet " + enk_02.aZH() + " on a plus de cible"));
                    return;
                }
                try {
                    qs_02 = enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.reY ? this.bgF : null, enq_02, true);
                }
                catch (Exception exception) {
                    bgA.error((Object)("Pb a l''execution de l'effet " + enk_02.aZH()), (Throwable)exception);
                    return;
                }
                if (qs_02 != null && qs_02.bau() > 0) {
                    ++n2;
                }
                ++n;
                if (qs_02 == null) continue;
                qs_02.clear();
                continue;
            }
            acd_1 acd_12 = new acd_1(this.fFf());
            if (this.bgC == null || ((enk_0)this.bgC).aZS() == null) continue;
            aoh_1 aoh_12 = ((enk_0)this.bgC).aZS();
            Iterable<int[]> iterable = aoh_12.b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), this.bgE.bcC(), this.bgE.bcD(), this.bgE.bcE(), this.bgE.bcB());
            for (int[] nArray : iterable) {
                acd_12.setX(nArray[0]);
                acd_12.setY(nArray[1]);
                if (this.as(acd_12) && this.bgJ.bag().aK(acd_12.getX(), acd_12.getY())) {
                    qs_02 = enk_02.a((Qk)this.bbf(), this.bbc(), this.bbh(), enf_0.fBb(), acd_12.getX(), acd_12.getY(), acd_12.bdi(), null, enq_02, true);
                    if (qs_02 != null && qs_02.bau() > 0) {
                        ++n2;
                    }
                    ++n;
                    if (qs_02 != null) {
                        qs_02.clear();
                    }
                }
                if (this.reA <= 0 || !(this.reW ? n2 >= this.reA : n >= this.reA)) continue;
                continue block2;
            }
        }
    }

    private boolean as(acd_1 acd_12) {
        short s;
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            bgA.error((Object)("On tente d'execute un groupe d'effets sur cellule sans FightMap " + ((enk_0)this.bgC).aZH()));
            return false;
        }
        if (rh_02.T(acd_12.getX(), acd_12.getY()) && (s = rh_02.Z(acd_12.getX(), acd_12.getY())) != Short.MIN_VALUE) {
            acd_12.aM(s);
            return true;
        }
        return false;
    }

    @Override
    public void bbS() {
        super.bbS();
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.rfa = null;
        this.reW = false;
        this.reX = false;
        this.reZ = 0;
        this.reA = 0;
        if (this.bgC == null) {
            return;
        }
        if (fqC.giD() == null) {
            return;
        }
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 != null) {
            this.rfa = fqB2.ci(s);
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.reA = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            boolean bl = this.reW = ((enk_0)this.bgC).a(1, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 4) {
            boolean bl = this.reX = ((enk_0)this.bgC).a(3, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 5) {
            boolean bl = this.reY = ((enk_0)this.bgC).a(4, s, ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 6) {
            this.reZ = (byte)((enk_0)this.bgC).a(5, s, ene_0.qPu);
        }
    }

    @NotNull
    public acd_1 fFf() {
        return this.bbe();
    }

    public boolean fFg() {
        return false;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    protected boolean bce() {
        return true;
    }

    public boolean fFh() {
        return this.reZ == 1;
    }

    public boolean fFi() {
        return this.reY;
    }

    @Override
    public boolean bbB() {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 3) {
            return ((enk_0)this.bgC).Rz(2) == 1.0f;
        }
        return true;
    }

    @Override
    public boolean bbC() {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() >= 3) {
            return ((enk_0)this.bgC).Rz(2) == 0.0f;
        }
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.reW = false;
        this.reX = false;
        this.reA = -1;
        this.reY = true;
        this.reZ = 0;
        this.rfa = null;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fES();
    }
}

