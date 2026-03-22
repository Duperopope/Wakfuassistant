/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dde
 */
public class dde_0
implements fis_1 {
    private final afx_1 ogj;
    private final String ogk;
    private afq_2[] cEr;

    public dde_0(afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.ogj = afx_12;
        this.ogk = string;
        this.cEr = afq_2Array;
    }

    dde_0(afx_1 afx_12, String string) {
        this.ogj = afx_12;
        this.ogk = string;
        this.cEr = null;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.ogj.a(this.ogk, this.cEr, this.d(fiq_12));
        return false;
    }

    public boolean fcu() {
        this.ogj.a(this.ogk, this.cEr, new afp_2[0]);
        return false;
    }

    public void d(afq_2[] afq_2Array) {
        this.cEr = afq_2Array;
    }

    private afp_2 d(fiq_1 fiq_12) {
        switch (fiq_12.gBy()) {
            case tJU: 
            case tJV: 
            case tJT: 
            case tJS: 
            case tJM: 
            case tJW: 
            case tJQ: 
            case tJR: {
                afp_2 afp_22 = new afp_2("event");
                flp_2 flp_22 = (flp_2)fiq_12;
                afp_22.g("button", flp_22.fca());
                afp_22.g("x", flp_22.getScreenX());
                afp_22.g("y", flp_22.getScreenY());
                afp_22.g("rotation", flp_22.gEo());
                return afp_22;
            }
            case tJs: {
                afp_2 afp_23 = new afp_2("event");
                flp_1 flp_12 = (flp_1)fiq_12;
                return afp_23;
            }
            case tJt: {
                afp_2 afp_24 = new afp_2("event");
                flr_2 flr_22 = (flr_2)fiq_12;
                axb_2 axb_22 = flr_22.gDx().getColor();
                afp_24.g("r", Float.valueOf(axb_22.aIU()));
                afp_24.g("g", Float.valueOf(axb_22.aIV()));
                afp_24.g("b", Float.valueOf(axb_22.aIW()));
                afp_24.g("a", Float.valueOf(axb_22.aIX()));
                return afp_24;
            }
            case tKa: {
                afp_2 afp_25 = new afp_2("event");
                flw_2 flw_22 = (flw_2)fiq_12;
                afp_25.g("value", Float.valueOf(flw_22.getValue()));
                return afp_25;
            }
            case tJF: 
            case tJG: 
            case tJH: {
                afp_2 afp_26 = new afp_2("event");
                fli_2 fli_22 = (fli_2)fiq_12;
                afp_26.g("keyChar", Character.valueOf(fli_22.gDW()));
                afp_26.g("keyCode", fli_22.bCC());
                afp_26.g("modifiers", fli_22.fcn());
                return afp_26;
            }
        }
        return null;
    }
}

