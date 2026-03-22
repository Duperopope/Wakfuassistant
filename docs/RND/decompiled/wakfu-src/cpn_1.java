/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPN
 */
public abstract class cpn_1
extends cpo_1 {
    @Override
    public boolean bxO() {
        return this.cqO instanceof bxJ;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getLabel() {
        if (!(this.cqO instanceof bxJ)) {
            return this.ely();
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(super.getLabel());
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        return "manageBookcase";
    }

    @Override
    protected void eLE() {
        csd_2.eOn().a((bxJ)this.cqO);
    }

    @Override
    protected int eLB() {
        return crc_2.nms.nnW;
    }
}

