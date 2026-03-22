/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePY
 */
public class epy_0
extends ero_0 {
    private static final aox_1 reL = new enz_0(new eny_0("Zones", new enx_0("Zone a retirer (-1 pour tout retirer)", eNA.qYC), new enx_0("Zone a poser (infinie) (-1 pour ne rien poser)", eNA.qYC)), new eny_0("Zones", new enx_0("Zone a retirer", eNA.qYC), new enx_0("Zone a poser (-1 pour ne rien poser)", eNA.qYC), new enx_0("Dur\u00e9e (0=dur\u00e9e de l'effet, 1=infinie(defaut))", eNA.qYD)));
    private static final int reM = -1;
    private int reN;
    private int reO;
    private boolean reP;

    @Override
    public aox_1 bEt() {
        return reL;
    }

    public epy_0() {
        this.bby();
    }

    public epy_0 fEV() {
        return new epy_0();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() < 1) {
            return;
        }
        this.reN = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.reO = ((enk_0)this.bgC).fAn() < 2 ? -1 : ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        this.reP = ((enk_0)this.bgC).fAn() < 3 ? true : ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        Object object;
        Object object2;
        if (!this.bbt()) {
            return;
        }
        if (this.bgJ == null) {
            return;
        }
        QQ qQ = null;
        if (this.bgF == null || !(this.bgF instanceof QQ)) {
            object2 = this.bgJ.bai().bdh();
            object = object2.iterator();
            while (object.hasNext()) {
                QQ qQ2 = object.next();
                if (this.y(qQ2) || !qQ2.d(this.bgG)) continue;
                qQ = qQ2;
                break;
            }
            this.bgF = qQ;
        } else {
            qQ = (QQ)this.bgF;
            if (this.y(qQ)) {
                qQ = null;
            }
        }
        if (qQ == null) {
            this.fHg();
            return;
        }
        if (!qQ.bcI()) {
            this.fHg();
            return;
        }
        this.d(qD, bl);
        object2 = qQ.bci();
        this.bgJ.bai().b(qQ);
        if (this.reO == -1) {
            return;
        }
        object = eQN.a(this.bgJ, this.bgG, this.reO);
        ((QD)object).e((qu_0)object2);
        ((eQN)object).md(this.reP);
        ((eQN)object).eo((short)1);
        ((QD)object).b((enk_0)this.bgC);
        ((QD)object).a((eNl)this.bbf());
        ((QD)object).g(this);
        ((ero_0)object).bbK();
        if (object2 != null) {
            object2.baz().p((QD)object);
        }
    }

    protected boolean y(QQ qQ) {
        return this.reN != -1 && qQ.bcw() != (long)this.reN;
    }

    @Override
    public boolean bbA() {
        return false;
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
    public void aVH() {
        this.reN = 0;
        this.reO = 0;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEV();
    }
}

