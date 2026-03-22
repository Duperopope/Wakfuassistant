/*
 * Decompiled with CFR 0.152.
 */
public class dgq
extends dgh {
    public static final String oku = "container1";
    public static final String okv = "container2";
    public static final String okw = "image1";
    public static final String okx = "image2";

    public dgq() {
        super(dgx.okL, false, "messageContainerFight");
    }

    @Override
    protected void a(boolean bl, String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            return;
        }
        int n = this.okj;
        this.okj = bl ? 150 : this.okj;
        this.d((fes_2)fhs_22.uH(oku), bl);
        this.d((fes_2)fhs_22.uH(okw), bl);
        this.d((fes_2)fhs_22.uH(okx), bl);
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
        super.a(dgv2);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("messageContainerFight");
        if (fhs_22 == null) {
            return;
        }
        dgq.c((fax_1)fhs_22.uH("animatedElementLeft"));
        dgq.c((fax_1)fhs_22.uH("animatedElementRight"));
    }

    @Override
    protected void rs(String string) {
    }
}

