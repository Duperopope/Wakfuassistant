/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fRw
 */
public class frw_2
extends frs_1 {
    private static Logger oO = Logger.getLogger(frw_2.class);
    public static final String TAG = "GlidingLayout";
    public static final String uZK = "gl";
    private boolean tMi = true;
    private short uZL = 0;
    private short uZM = 0;
    public static final int uZN = 3200366;
    public static final int uZO = 3617440;
    public static final int uZP = 1387629604;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        boolean bl = true;
        if (this.tMi) {
            for (fes_2 fes_22 : faw_22.getWidgetChildren()) {
                if (!fes_22.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n += this.uZL;
                }
                n += fes_22.getMinSize().width;
                n2 = Math.max(n2, fes_22.getMinSize().height);
            }
            n += 2 * this.uZL;
            n2 += 2 * this.uZM;
        } else {
            for (fes_2 fes_23 : faw_22.getWidgetChildren()) {
                if (!fes_23.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.uZM;
                }
                n2 += fes_23.getMinSize().height;
                n = Math.max(n, fes_23.getMinSize().width);
            }
            n += 2 * this.uZL;
            n2 += 2 * this.uZM;
        }
        return new fsm_1(n, n2);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        boolean bl = true;
        if (this.tMi) {
            for (int i = faw_22.getWidgetChildren().size() - 1; i >= 0; --i) {
                fes_2 fes_22 = faw_22.getWidget(i);
                if (!fes_22.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n += this.uZL;
                }
                n += fes_22.getPrefSize().width;
                n2 = Math.max(n2, fes_22.getPrefSize().height);
            }
            n += 2 * this.uZL;
            n2 += 2 * this.uZM;
        } else {
            for (int i = faw_22.getWidgetChildren().size() - 1; i >= 0; --i) {
                fes_2 fes_23 = faw_22.getWidget(i);
                if (!fes_23.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.uZM;
                }
                n2 += fes_23.getPrefSize().height;
                n = Math.max(n, fes_23.getPrefSize().width);
            }
            n += 2 * this.uZL;
            n2 += 2 * this.uZM;
        }
        return new fsm_1(n, n2);
    }

    public short getHgap() {
        return this.uZL;
    }

    public void setHgap(short s) {
        this.uZL = s;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
    }

    public short getVgap() {
        return this.uZM;
    }

    public void setVgap(short s) {
        this.uZM = s;
    }

    @Override
    public void a(faw_2 faw_22) {
        boolean bl = false;
        boolean bl2 = false;
        ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
        if (this.tMi) {
            int n = faw_22.getAppearance().getContentHeight();
            int n2 = faw_22.getAppearance().getContentWidth();
            for (int i = 0; i < arrayList.size(); ++i) {
                fes_2 fes_22 = arrayList.get(i);
                frx_2 frx_22 = null;
                if (fes_22.getLayoutData() instanceof frx_2) {
                    frx_22 = (frx_2)fes_22.getLayoutData();
                }
                if (!fes_22.isVisibleForLayout()) continue;
                int n3 = fes_22.getPrefSize().width;
                int n4 = 0;
                int n5 = fes_22.getX();
                int n6 = frx_22 != null ? fes_22.getPrefSize().height : n;
                if (frx_22 != null) {
                    faa_2 faa_22 = frx_22.getInitAlign();
                    if ((!frx_22.isInitValue() || !fes_22.isPositionInitByUserDefinition() || fbj_1.getInstance().isResized()) && frx_22.isUsable() && faa_22 != null) {
                        n5 = faa_22.cf(n3, n2);
                        frx_22.setUsable(false);
                    }
                    n4 += frx_22.getAlign().cg(n6, n);
                }
                fes_22.setSize(n3, n6);
                fes_22.setPosition(n5, n4);
            }
        } else {
            int n = faw_22.getAppearance().getContentWidth();
            int n7 = faw_22.getAppearance().getContentHeight();
            for (int i = 0; i < arrayList.size(); ++i) {
                fes_2 fes_23 = arrayList.get(i);
                frx_2 frx_23 = null;
                if (fes_23.getLayoutData() instanceof frx_2) {
                    frx_23 = (frx_2)fes_23.getLayoutData();
                }
                if (!fes_23.isVisibleForLayout()) continue;
                int n8 = fes_23.getPrefSize().height;
                int n9 = 0;
                int n10 = fes_23.getY();
                int n11 = frx_23 != null ? fes_23.getPrefSize().width : n;
                if (frx_23 != null) {
                    faa_2 faa_23 = frx_23.getInitAlign();
                    if ((!frx_23.isInitValue() || !fes_23.isPositionInitByUserDefinition() || fbj_1.getInstance().isResized()) && frx_23.isUsable() && faa_23 != null) {
                        n10 = faa_23.cg(n8, n7);
                        frx_23.setUsable(false);
                    }
                    n9 += frx_23.getAlign().cf(n11, n);
                }
                fes_23.setSize(n11, n8);
                fes_23.setPosition(n9, fes_23.getY());
            }
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frw_2 frw_22 = (frw_2)fhi_22;
        super.a((fhi_2)frw_22);
        frw_22.uZL = this.uZL;
        frw_22.uZM = this.uZM;
        frw_22.tMi = this.tMi;
    }

    public frw_2 gEM() {
        frw_2 frw_22 = new frw_2();
        frw_22.aVI();
        this.a((fhi_2)frw_22);
        return frw_22;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 3200366: {
                this.setHgap(Bw.r(string));
                return true;
            }
            case 3617440: {
                this.setVgap(Bw.r(string));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 3200366: {
                this.setHgap(Bw.r(object));
                return true;
            }
            case 3617440: {
                this.setVgap(Bw.r(object));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Bw.l(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gEM();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gEM();
    }
}

