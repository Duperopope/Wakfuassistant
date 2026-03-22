/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRm
 */
public class crm_1
extends cpm_1 {
    private static final int nmc = 5;
    private final String nmd;
    private final Runnable nme;

    public crm_1() {
        this.nmd = "ielt.use";
        this.nme = null;
    }

    public crm_1(String string, Runnable runnable) {
        this.nmd = string;
        this.nme = runnable;
    }

    @Override
    public cps_1 eLz() {
        return cps_1.njP;
    }

    @Override
    public void run() {
        if (this.nme == null) {
            return;
        }
        this.nme.run();
    }

    @Override
    public boolean bxO() {
        return this.nme != null;
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.isEnabled() ? nik : nim);
        ahv_22.c(aum_0.cWf().c(this.ely(), new Object[0]));
        ahv_22.cev();
        return ahv_22.ceL();
    }

    @Override
    protected int eLB() {
        return 5;
    }

    @Override
    public String ely() {
        return this.nmd;
    }

    @Override
    public cpm_1 eLD() {
        return new crm_1(this.nmd, this.nme);
    }
}

