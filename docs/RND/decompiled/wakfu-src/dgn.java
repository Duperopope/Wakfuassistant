/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class dgn
extends dgh {
    private static final Logger oks = Logger.getLogger(dgn.class);

    public dgn(dgx dgx2, String string) {
        super(dgx2, false, string);
    }

    protected abstract String fcP();

    @Override
    protected void a(boolean bl, String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            return;
        }
        int n = this.okj;
        this.okj = bl ? 150 : this.okj;
        this.d((fes_2)fhs_22.uH("container1"), bl);
        this.d((fes_2)fhs_22.uH("image1"), bl);
        this.d((fes_2)fhs_22.uH("image2"), bl);
        this.d((fes_2)fhs_22.uH("image3"), bl);
        this.d((fes_2)fhs_22.uH("text"), bl);
        if (bl) {
            this.okj = 10;
        }
        this.d((fes_2)fhs_22.uH("animatedElementLeft"), bl);
        this.d((fes_2)fhs_22.uH("animatedElementRight"), bl);
        this.okj = n;
    }

    @Override
    public void a(dgv dgv2) {
        String string;
        dgo dgo2 = (dgo)dgv2;
        super.a(dgv2);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(this.okl);
        if (fhs_22 == null) {
            return;
        }
        fax_1 fax_12 = (fax_1)fhs_22.uH("animatedElementLeft");
        fax_1 fax_13 = (fax_1)fhs_22.uH("animatedElementRight");
        try {
            string = this.fcP();
        }
        catch (fu_0 fu_02) {
            return;
        }
        fax_12.setFilePath(string);
        fax_12.setAnimName(dgo2.aJi() + "-G");
        fax_12.setDirection(0);
        fax_12.setScale(1.0f);
        fax_13.setFilePath(string);
        fax_13.setAnimName(dgo2.aJi() + "-D");
        fax_13.setDirection(0);
        fax_13.setScale(1.0f);
        dgn.c(fax_12);
        dgn.c(fax_13);
    }

    @Override
    protected void rs(String string) {
    }
}

