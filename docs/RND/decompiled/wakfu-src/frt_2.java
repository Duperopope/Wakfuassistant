/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fRt
 */
public class frt_2
extends frs_1 {
    private static Logger oO = Logger.getLogger(frt_2.class);
    public static final String TAG = "BorderLayout";
    public static final String uZC = "bl";
    private int tPz = 0;
    private int tPy = 0;
    public static final int uZD = 3200366;
    public static final int uZE = 3617440;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setHGap(int n) {
        this.tPz = n;
    }

    public void setVGap(int n) {
        this.tPy = n;
    }

    private fes_2 getWidgetByConstraint(faw_2 faw_22, fzt_0 fzt_02) {
        for (fes_2 fes_22 : faw_22.getWidgetChildren()) {
            fru_1 fru_12;
            if (!fes_22.isVisibleForLayout() || !(fes_22.getLayoutData() instanceof fru_1) || (fru_12 = (fru_1)fes_22.getLayoutData()).getData() != fzt_02) continue;
            return fes_22;
        }
        return null;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fsm_1 fsm_13 = new fsm_1(0, 0);
        fes_2 fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKz);
        if (fes_22 != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getMinSize();
            fsm_13.width += fsm_12.width + this.tPz;
            fsm_13.height = Math.max(fsm_12.height, fsm_13.height);
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKA)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getMinSize();
            fsm_13.width += fsm_12.width + this.tPz;
            fsm_13.height = Math.max(fsm_12.height, fsm_13.height);
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKw)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getMinSize();
            fsm_13.width += fsm_12.width;
            fsm_13.height = Math.max(fsm_12.height, fsm_13.height);
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKx)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getMinSize();
            fsm_13.width = Math.max(fsm_12.width, fsm_13.width);
            fsm_13.height += fsm_12.height + this.tPy;
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKy)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getMinSize();
            fsm_13.width = Math.max(fsm_12.width, fsm_13.width);
            fsm_13.height += fsm_12.height + this.tPy;
        }
        return fsm_13;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fsm_1 fsm_13 = new fsm_1(0, 0);
        fes_2 fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKz);
        if (fes_22 != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            fsm_13.width += fsm_12.width + this.tPz;
            fsm_13.height = Math.max(fsm_12.height, fsm_13.height);
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKA)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            fsm_13.width += fsm_12.width + this.tPz;
            fsm_13.height = Math.max(fsm_12.height, fsm_13.height);
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKw)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            fsm_13.width += fsm_12.width;
            fsm_13.height = Math.max(fsm_12.height, fsm_13.height);
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKx)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            fsm_13.width = Math.max(fsm_12.width, fsm_13.width);
            fsm_13.height += fsm_12.height + this.tPy;
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKy)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            fsm_13.width = Math.max(fsm_12.width, fsm_13.width);
            fsm_13.height += fsm_12.height + this.tPy;
        }
        return fsm_13;
    }

    @Override
    public void a(faw_2 faw_22) {
        int n;
        int n2;
        fsm_1 fsm_12;
        int n3 = faw_22.getAppearance().getContentHeight();
        int n4 = 0;
        int n5 = 0;
        int n6 = faw_22.getAppearance().getContentWidth();
        fes_2 fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKy);
        if (fes_22 != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            n2 = n5;
            if (fes_22.isExpandable()) {
                n = n6 - n5;
            } else {
                n = (int)fsm_12.getWidth();
                n2 += (n6 - n5 - n) / 2;
            }
            fes_22.setSize(n, fsm_12.height);
            fes_22.setPosition(n2, n4);
            n4 += fsm_12.height + this.tPy;
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKx)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            n2 = n5;
            if (fes_22.isExpandable()) {
                n = n6 - n5;
            } else {
                n = (int)fsm_12.getWidth();
                n2 += (n6 - n5 - n) / 2;
            }
            fes_22.setSize(n, fsm_12.height);
            fes_22.setPosition(n2, n3 - fsm_12.height);
            n3 -= fsm_12.height + this.tPy;
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKz)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            n2 = n4;
            if (fes_22.isExpandable()) {
                n = n3 - n4;
            } else {
                n = (int)fsm_12.getHeight();
                n2 += (n3 - n4 - n) / 2;
            }
            fes_22.setSize(fsm_12.width, n);
            fes_22.setPosition(n6 - fsm_12.width, n2);
            n6 -= fsm_12.width + this.tPz;
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKA)) != null && fes_22.isVisibleForLayout()) {
            fsm_12 = fes_22.getPrefSize();
            n2 = n4;
            if (fes_22.isExpandable()) {
                n = n3 - n4;
            } else {
                n = fsm_12.height;
                n2 += (n3 - n4 - n) / 2;
            }
            fes_22.setSize(fsm_12.width, n);
            fes_22.setPosition(n5, n2);
            n5 += fsm_12.width + this.tPz;
        }
        if ((fes_22 = this.getWidgetByConstraint(faw_22, fzt_0.tKw)) != null && fes_22.isVisibleForLayout()) {
            if (fes_22.isExpandable()) {
                fes_22.setSize(n6 - n5, n3 - n4);
                fes_22.setPosition(n5, n4);
            } else {
                fes_22.setSizeToPrefSize();
                fes_22.setPosition(n5 + (n6 - n5 - fes_22.getWidth()) / 2, n4 + (n3 - n4 - fes_22.getHeight()) / 2);
            }
        }
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frt_2 frt_22 = (frt_2)fhi_22;
        super.a((fhi_2)frt_22);
        frt_22.tPz = this.tPz;
        frt_22.tPy = this.tPy;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 3200366: {
                this.setHGap(Bw.m(string));
                return true;
            }
            case 3617440: {
                this.setVGap(Bw.m(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 3200366: {
                this.setHGap(Bw.m(object));
                return true;
            }
            case 3617440: {
                this.setVGap(Bw.m(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }

    public frt_2 gEK() {
        frt_2 frt_22 = new frt_2();
        frt_22.aVI();
        this.a((fhi_2)frt_22);
        return frt_22;
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gEK();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gEK();
    }
}

