/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAZ
 */
public abstract class faz_2<Content>
extends fay_1<Content> {
    public static final String tRr = "renderableTemplate";
    private fcv_1 tRs;
    private boolean tRt = false;
    private boolean tQK = false;
    public static final int tRu = -148547300;
    public static final int tRv = 907928063;

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (tRr.equalsIgnoreCase(string)) {
            return this.tRs;
        }
        return null;
    }

    @NotNull
    protected fcv_1 gsk() {
        fcv_1 fcv_12 = new fcv_1();
        fcv_12.aVI();
        this.tRs.a(fcv_12);
        faw_2.a((faw_2)fcv_12, this.cHn ? fzy_0.tGa : fzy_0.tGc, this.isKeepPreviousStateOnMissingState());
        fcv_12.setHideWithoutItem(this.tRt);
        return fcv_12;
    }

    protected void l(fcv_1 fcv_12) {
        if (fcv_12.isEnabledFull()) {
            this.m(fcv_12);
        } else {
            this.setDisabledAppearanceState(fcv_12);
        }
    }

    protected void a(fcv_1 fcv_12, boolean bl) {
        if (bl) {
            this.setSelectedAppearanceState(fcv_12);
        } else {
            this.n(fcv_12);
        }
    }

    protected void setDisabledAppearanceState(@Nullable fcv_1 fcv_12) {
        faw_2.a((faw_2)fcv_12, (fys_0 fys_02) -> {
            fzy_0 fzy_02 = fys_02.getCurrentAppearanceState();
            switch (fzy_02) {
                case tGf: 
                case tGe: 
                case tGh: 
                case tGg: {
                    return fzy_02;
                }
                case tGd: 
                case tGb: {
                    return fzy_0.tGd;
                }
            }
            return fzy_0.tGc;
        }, this.isKeepPreviousStateOnMissingState());
    }

    protected void m(@Nullable fcv_1 fcv_12) {
        faw_2.a((faw_2)fcv_12, (fys_0 fys_02) -> {
            fzy_0 fzy_02 = fys_02.getCurrentAppearanceState();
            switch (fzy_02) {
                case tGf: 
                case tGe: 
                case tGh: 
                case tGg: {
                    return fzy_02;
                }
                case tGd: 
                case tGb: {
                    return fzy_0.tGb;
                }
            }
            return fzy_0.tGa;
        }, this.isKeepPreviousStateOnMissingState());
    }

    protected void setSelectedAppearanceState(@Nullable fcv_1 fcv_12) {
        faw_2.a((faw_2)fcv_12, (fys_0 fys_02) -> fys_02.getCurrentAppearanceState().grx(), this.isKeepPreviousStateOnMissingState());
    }

    protected void n(@Nullable fcv_1 fcv_12) {
        faw_2.a((faw_2)fcv_12, (fys_0 fys_02) -> fys_02.getCurrentAppearanceState().gry(), this.isKeepPreviousStateOnMissingState());
    }

    protected void setMouseOverAppearanceState(@Nullable fcv_1 fcv_12, boolean bl) {
        faw_2.a((faw_2)fcv_12, bl ? fzy_0.tGh : fzy_0.tGg, this.isKeepPreviousStateOnMissingState());
    }

    protected void o(@Nullable fcv_1 fcv_12) {
        faw_2.a((faw_2)fcv_12, (fys_0 fys_02) -> {
            fzy_0 fzy_02 = fys_02.getCurrentAppearanceState();
            switch (fzy_02) {
                case tGd: 
                case tGc: 
                case tGf: 
                case tGe: {
                    return fzy_02;
                }
                case tGh: 
                case tGb: {
                    return fzy_0.tGb;
                }
            }
            return fzy_0.tGa;
        }, this.isKeepPreviousStateOnMissingState());
    }

    protected void setMousePressedAppearanceState(@Nullable fcv_1 fcv_12, boolean bl) {
        faw_2.a((faw_2)fcv_12, bl ? fzy_0.tGf : fzy_0.tGe, this.isKeepPreviousStateOnMissingState());
    }

    protected void b(@Nullable fcv_1 fcv_12, boolean bl) {
        faw_2.a((faw_2)fcv_12, bl ? (this.cHn ? fzy_0.tGb : fzy_0.tGd) : (this.cHn ? fzy_0.tGa : fzy_0.tGc), this.isKeepPreviousStateOnMissingState());
    }

    public void setHideContainerWithoutItem(boolean bl) {
        this.tRt = bl;
    }

    public boolean isHideContainerWithoutItem() {
        return this.tRt;
    }

    public void setKeepPreviousStateOnMissingState(boolean bl) {
        this.tQK = bl;
    }

    public boolean isKeepPreviousStateOnMissingState() {
        return this.tQK;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tRs = new fcv_1();
        this.tRs.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tRs = null;
        this.tRt = false;
        this.tQK = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        faz_2 faz_22 = (faz_2)fhi_22;
        faz_22.tRt = this.tRt;
        faz_22.tQK = this.tQK;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case -148547300: {
                this.setHideContainerWithoutItem(Bw.aK(string));
                return true;
            }
            case 907928063: {
                this.setKeepPreviousStateOnMissingState(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -148547300: {
                this.setHideContainerWithoutItem(Bw.l(object));
                return true;
            }
            case 907928063: {
                this.setKeepPreviousStateOnMissingState(Bw.l(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

