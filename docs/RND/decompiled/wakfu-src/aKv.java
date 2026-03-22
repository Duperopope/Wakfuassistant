/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class aKv {
    final aad_0 eev;
    final aad_0 eew;
    final aad_0 eex;
    final ese_0 eey = new ese_0();
    private final aKz eez = new aKz(this);
    private final aKy<?, ?> eeA = new aKy(this);
    private final aKx<?, ?> eeB = new aKx(this);

    aKv(aad_0 aad_02, aad_0 aad_03, aad_0 aad_04) {
        this.eev = aad_02;
        this.eew = aad_03;
        this.eex = aad_04;
    }

    public void a(List<eNl> list, bgy bgy2, acd_1 acd_12) {
        this.clear();
        short s = list.get(list.size() - 1).cmL();
        this.a(list, bgy2, acd_12, s);
    }

    public void L(acd_1 acd_12) {
        this.clear();
        if (this.eev == null) {
            return;
        }
        this.eev.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    void a(List<eNl> list, bgy bgy2, acd_1 acd_12, short s) {
        if (list == null) {
            throw new IllegalArgumentException("containers == null");
        }
        eNl eNl2 = list.get(list.size() - 1);
        if (eNl2 == null) {
            throw new IllegalArgumentException("container == null");
        }
        if (this.eev == null && this.eew == null && this.eex == null) {
            return;
        }
        if (bgy2 == null || !bgy2.ddI().isVisible()) {
            return;
        }
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return;
        }
        rh_0 rh_02 = bsj_02.bag();
        for (enk_0 enk_02 : eNl2) {
            if (enk_02.aZG() != 2 || enk_02.df(1L) || enk_02.a(eNi.qWr) || s > enk_02.fAw() || s < enk_02.fAv()) continue;
            this.a(bgy2, acd_12, rh_02, enk_02);
            this.a(list, bgy2, acd_12, bsj_02, rh_02, enk_02, s);
        }
    }

    private void a(bgy bgy2, acd_1 acd_12, rh_0 rh_02, enk_0 enk_02) {
        if (this.eex == null) {
            return;
        }
        aoh_1 aoh_12 = enk_02.fAB();
        if (aoh_12 == null) {
            return;
        }
        Iterable<int[]> iterable = aoh_12.b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), bgy2.bcB());
        for (int[] nArray : iterable) {
            int n;
            int n2 = nArray[0];
            if (!rh_02.T(n2, n = nArray[1])) continue;
            short s = rh_02.Z(n2, n);
            this.eex.E(n2, n, s);
        }
    }

    public void a(List<eNl> list, bgy bgy2, acd_1 acd_12, bsj_0 bsj_02, rh_0 rh_02, enk_0 enk_02, short s) {
        if (this.eev == null && this.eew == null) {
            return;
        }
        if (!this.a(bgy2, acd_12, bsj_02, rh_02, enk_02)) {
            return;
        }
        if (this.a(enk_02)) {
            this.b(bgy2, acd_12, enk_02, s, list);
            return;
        }
        aoh_1 aoh_12 = enk_02.aZS();
        if (aoh_12.bEl() == aoi_1.cLv) {
            this.a(bgy2, acd_12, bsj_02, enk_02);
        } else {
            this.a(list, bgy2, acd_12, rh_02, enk_02, aoh_12, s);
        }
    }

    private boolean a(bgy bgy2, acd_1 acd_12, bsj_0 bsj_02, rh_0 rh_02, enk_0 enk_02) {
        aoh_1 aoh_12 = enk_02.fAB();
        if (aoh_12 != null) {
            Iterable<int[]> iterable = aoh_12.b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), bgy2.bcB());
            for (int[] nArray : iterable) {
                if (rh_02.X(nArray[0], nArray[1]) == null) continue;
                return false;
            }
        }
        return enk_02.fAx() == null || enk_02.fAx().b(bgy2, acd_12, enk_02, bsj_02);
    }

    private void a(bgy bgy2, acd_1 acd_12, enk_0 enk_02, List<eNl> list, short s) {
        this.eeB.c(bgy2, acd_12, enk_02, s, list);
    }

    private void a(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        QQ<enk_0, etj_0> qQ = eQN.a(enk_02, list.get(list.size() - 1));
        if (qQ != null) {
            LinkedList<eNl> linkedList = new LinkedList<eNl>(list);
            linkedList.add((eNl)((Object)qQ));
            this.eeA.c(bgy2, acd_12, enk_02, s, linkedList);
        }
    }

    private void b(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        int n = enk_02.aZH();
        fqB fqB2 = bmi_0.giD().Za(n);
        if (fqB2 == null) {
            return;
        }
        LinkedList<eNl> linkedList = new LinkedList<eNl>(list);
        linkedList.add(fqB2);
        this.eez.c(bgy2, acd_12, enk_02, s, linkedList);
    }

    private boolean a(enk_0 enk_02) {
        int n = enk_02.avZ();
        return enh_0.qWn.contains(n);
    }

    boolean b(enk_0 enk_02) {
        int n = enk_02.avZ();
        return n == enf_0.qTT.d() || n == enf_0.qTO.d() || n == enf_0.qTV.d() || this.d(enk_02) || this.c(enk_02);
    }

    private boolean c(enk_0 enk_02) {
        return enk_02.avZ() == enf_0.qTQ.d();
    }

    private boolean d(enk_0 enk_02) {
        return enk_02.avZ() == enf_0.qTU.d();
    }

    private void a(List<eNl> list, bgy bgy2, acd_1 acd_12, rh_0 rh_02, enk_0 enk_02, aoh_1 aoh_12, short s) {
        if (this.c(enk_02)) {
            this.a(bgy2, acd_12, enk_02, s, list);
        } else if (this.d(enk_02)) {
            QQ<enk_0, etj_0> qQ = eQN.a(enk_02, list.get(list.size() - 1));
            if (qQ != null) {
                LinkedList<eNl> linkedList = new LinkedList<eNl>(list);
                list.add((eNl)((Object)qQ));
                this.a(linkedList, bgy2, acd_12, s);
            }
        } else {
            this.a(bgy2, acd_12, enk_02, list, s);
        }
    }

    private void a(bgy bgy2, acd_1 acd_12, bsj_0 bsj_02, enk_0 enk_02) {
        Iterator<qu_0> iterator = bsj_02.ban();
        while (iterator.hasNext()) {
            qu_0 qu_02 = iterator.next();
            azx_1<any_1, ArrayList<qu_0>> azx_12 = enk_02.aZI().a(qu_02, bgy2);
            switch (azx_12.getFirst()) {
                case cKR: 
                case cKV: 
                case cKS: {
                    this.eev.E(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
                }
            }
        }
        this.eev.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        if (this.eex != null) {
            this.eex.G(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        }
    }

    void a(String string, agb_0 agb_02) {
        if (this.eev != null) {
            this.eev.a(string, agb_02);
        }
        if (this.eew != null) {
            this.eew.a(string, agb_02);
        }
    }

    public void clear() {
        if (this.eev != null) {
            this.eev.bqC();
        }
        if (this.eew != null) {
            this.eew.bqC();
        }
        if (this.eex != null) {
            this.eex.bqC();
        }
    }
}

