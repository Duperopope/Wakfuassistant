/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from bsG
 */
public final class bsg_0 {
    public static final bsg_0 jia = new bsg_0();
    private final Set<QQ<?, ?>> jib = new HashSet();
    private static final Set<Integer> jic = ImmutableSet.of((Object)etm_0.rnA.aHp(), (Object)etm_0.rnr.aHp(), (Object)etm_0.rnu.aHp());

    private bsg_0() {
    }

    public void aO(bgy bgy2) {
        this.a(bgy2, etm_0.rnu);
        if (bgy2.doV() == eym.pia) {
            this.a(bgy2, etm_0.rnr);
            return;
        }
        if (bgy2.doV() == eym.phY || bgy2.i(ezj_0.pua)) {
            this.a(bgy2, etm_0.rnA);
        }
    }

    public void aP(bgy bgy2) {
        for (QQ<?, ?> qQ : this.jib) {
            if (qQ.aeV() != etm_0.rnu.aHp() || qQ.bci() != bgy2) continue;
            akj_0.ciY().o(qQ);
        }
        this.a(bgy2, etm_0.rnu);
    }

    public void b(QQ<?, ?> qQ, bgy bgy2) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (!bsj_02.u(qQ) || !jic.contains(qQ.aeV())) {
            return;
        }
        this.a(qQ, bsj_02);
    }

    private void a(bgy bgy2, etm_0 etm_02) {
        if (bgy2 == null) {
            return;
        }
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return;
        }
        QR qR = bsj_02.bai();
        Collection<QQ> collection = qR.bdh();
        for (QQ qQ : collection) {
            if (qQ.bci() != bgy2 && qQ.bci() != bgy2.djY() || qQ.aeV() != etm_02.aHp()) continue;
            this.a(qQ, bsj_02);
        }
    }

    private void a(QQ<?, ?> qQ, bsj_0 bsj_02) {
        if (!bsj_02.u(qQ)) {
            return;
        }
        akj_0.ciY().l(qQ);
        this.jib.add(qQ);
    }

    public void dGl() {
        int n = fcL.rUh.sA(aue_0.cVJ().cVO().xl());
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        for (QQ<?, ?> qQ : this.jib) {
            if (n == 1 && qQ.bci() == bgt_02) continue;
            akj_0.ciY().o(qQ);
        }
    }
}

