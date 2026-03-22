/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

public final class eOV
extends ero_0 {
    private static final aox_1 rcv = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rcv;
    }

    public eOV() {
        this.bby();
    }

    public eOV fDl() {
        eOV eOV2 = new eOV();
        return eOV2;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        if (this.bgG == null) {
            return;
        }
        Collection<QQ> collection = this.bgJ.bai().bdh();
        exP exP2 = null;
        if (this.bgE instanceof exP) {
            exP2 = ((exP)this.bgE).dlL();
        }
        if (exP2 == null) {
            return;
        }
        ArrayList<eSS> arrayList = new ArrayList<eSS>();
        for (QQ qQ : collection) {
            if (!qQ.d(this.bgG) || qQ.aeV() != etm_0.rnB.aHp()) continue;
            arrayList.add((eSS)qQ);
        }
        for (eSS eSS2 : arrayList) {
            eSS2.aC(exP2);
            eSS2.a(this, (anu_1)exP2);
        }
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
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDl();
    }
}

