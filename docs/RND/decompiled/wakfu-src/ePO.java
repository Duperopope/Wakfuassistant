/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;

public final class ePO
extends ero_0 {
    private static final aox_1 reB = new enz_0(new eny_0("Id de la Zone a retirer", new enx_0("Id", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return reB;
    }

    public ePO() {
        this.bby();
    }

    public ePO fET() {
        return new ePO();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() < 1) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!this.bbt()) {
            return;
        }
        if (this.bgJ == null) {
            return;
        }
        QR qR = this.bgJ.bai();
        Collection<QQ> collection = qR.bdh();
        HashSet<QQ> hashSet = new HashSet<QQ>();
        for (QQ qQ : collection) {
            if (qQ.bcw() != (long)this.aQL) continue;
            hashSet.add(qQ);
        }
        for (QQ qQ : hashSet) {
            qR.a(qQ, this.bgE);
        }
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
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fET();
    }
}

