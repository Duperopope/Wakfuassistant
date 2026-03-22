/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;

class aKz
extends aKy<eqc_0, fqB> {
    aKz(aKv aKv2) {
        super(aKv2);
    }

    @Override
    protected boolean ciP() {
        return true;
    }

    @Override
    protected boolean ciO() {
        return false;
    }

    protected eqc_0 b(enk_0 enk_02, qm_0 qm_02, qu_0 qu_02, qu_0 qu_03, acd_1 acd_12, List<eNl> list) {
        eqc_0 eqc_02 = (eqc_0)super.a(enk_02, qm_02, qu_02, qu_03, acd_12, list);
        eqc_02.E(null);
        return eqc_02;
    }

    protected boolean a(eqc_0 eqc_02) {
        return eqc_02.fFh();
    }

    protected boolean b(eqc_0 eqc_02) {
        return eqc_02.fFi();
    }

    @Override
    public void c(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        LinkedList<eNl> linkedList = new LinkedList<eNl>(list);
        linkedList.remove(linkedList.size() - 1);
        this.a(bgy2, acd_12, enk_02, s, list, linkedList);
    }

    @Override
    protected /* synthetic */ boolean w(QD qD) {
        return this.b((eqc_0)qD);
    }

    @Override
    protected /* synthetic */ boolean v(QD qD) {
        return this.a((eqc_0)qD);
    }

    @Override
    protected /* synthetic */ QD a(enk_0 enk_02, qm_0 qm_02, qu_0 qu_02, qu_0 qu_03, acd_1 acd_12, List list) {
        return this.b(enk_02, qm_02, qu_02, qu_03, acd_12, list);
    }
}

