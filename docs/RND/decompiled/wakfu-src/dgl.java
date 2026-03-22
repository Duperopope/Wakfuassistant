/*
 * Decompiled with CFR 0.152.
 */
public class dgl
extends dgh {
    public dgl() {
        super(dgx.okM, false, "messageContainer4");
    }

    @Override
    protected void a(boolean bl, String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            return;
        }
        int n = this.okj;
        this.okj = bl ? 150 : this.okj;
        this.d((fes_2)fhs_22.uH("container1"), bl);
        if (bl) {
            this.okj = 10;
        }
        this.d((fes_2)fhs_22.uH("animatedElement"), bl);
        this.okj = n;
    }

    @Override
    public void a(dgv dgv2) {
        super.a(dgv2);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("messageContainer4");
        if (fhs_22 == null) {
            return;
        }
        dgm dgm2 = (dgm)dgv2;
        float f2 = aie_0.cfn().bmC().bqL().byC();
        fax_1 fax_12 = (fax_1)fhs_22.uH("animatedElement");
        fax_12.setFilePath(dgm2.fcQ());
        fax_12.setAnimName(dgm2.getAnimName());
        fax_12.setDirection(dgm2.fcR());
        fax_12.setScale(f2);
        dgl.c(fax_12);
    }

    @Override
    protected void rs(String string) {
    }
}

