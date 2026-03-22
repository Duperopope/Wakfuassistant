/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fAJ
 */
public class faj_2
extends frs_1 {
    final /* synthetic */ fad_1 tPt;

    public faj_2(fad_1 fad_12) {
        this.tPt = fad_12;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fsm_1 fsm_13 = this.tPt.mZy != null ? this.tPt.mZy.getMinSize() : new fsm_1();
        fsm_1 fsm_14 = fsm_12 = this.tPt.tOU != null ? this.tPt.tOU.getMinSize() : new fsm_1();
        if (this.tPt.tOV == fzx_0.tLt || this.tPt.tOV == fzx_0.tLs) {
            fsm_13.height = Math.max(fsm_13.height, fsm_12.height);
            fsm_13.width += fsm_12.width;
            if (this.tPt.mZy != null && this.tPt.tOU != null) {
                fsm_13.width += this.tPt.getAppearance().getGap();
            }
        } else {
            fsm_13.height += fsm_12.height;
            fsm_13.width = Math.max(fsm_13.width, fsm_12.width);
            if (this.tPt.mZy != null && this.tPt.tOU != null) {
                fsm_13.height += this.tPt.getAppearance().getGap();
            }
        }
        return fsm_13;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fsm_1 fsm_13 = this.tPt.mZy != null && !this.tPt.mZy.isUnloading() ? this.tPt.mZy.getPrefSize() : new fsm_1();
        fsm_1 fsm_14 = fsm_12 = this.tPt.tOU != null && !this.tPt.tOU.isUnloading() ? this.tPt.tOU.getPrefSize() : new fsm_1();
        if (this.tPt.tOV == fzx_0.tLt || this.tPt.tOV == fzx_0.tLs) {
            fsm_13.height = Math.max(fsm_13.height, fsm_12.height);
            fsm_13.width += fsm_12.width;
            if (this.tPt.mZy != null && this.tPt.tOU != null) {
                fsm_13.width += this.tPt.getAppearance().getGap();
            }
        } else {
            fsm_13.height += fsm_12.height;
            fsm_13.width = Math.max(fsm_13.width, fsm_12.width);
            if (this.tPt.mZy != null && this.tPt.tOU != null) {
                fsm_13.height += this.tPt.getAppearance().getGap();
            }
        }
        return fsm_13;
    }

    @Override
    public void a(faw_2 faw_22) {
        fsm_1 fsm_12 = new fsm_1(0, 0);
        Point point = new Point(0, 0);
        fsm_1 fsm_13 = new fsm_1(0, 0);
        Point point2 = new Point(0, 0);
        if (this.tPt.tOU != null && this.tPt.tOU.isVisibleForLayout() && !this.tPt.tOU.isUnloading()) {
            fsm_12 = this.tPt.tOU.getPrefSize();
            fsm_12.hi(this.tPt.uki.getContentWidth(), this.tPt.uki.getContentHeight());
        }
        if (this.tPt.mZy != null && this.tPt.mZy.isVisibleForLayout() && !this.tPt.mZy.isUnloading()) {
            fsm_13 = this.tPt.mZy.getPrefSize();
            switch (this.tPt.tOV) {
                case tLq: {
                    point2.y += fsm_12.height;
                    if (this.tPt.tOU == null) break;
                    point2.y += this.tPt.getAppearance().getGap();
                    break;
                }
                case tLr: {
                    point.y += fsm_13.height;
                    if (this.tPt.tOU == null) break;
                    point.y += this.tPt.getAppearance().getGap();
                    break;
                }
                case tLs: {
                    point2.x += fsm_12.width;
                    if (this.tPt.tOU == null) break;
                    point2.x += this.tPt.getAppearance().getGap();
                    break;
                }
                case tLt: {
                    point.x += fsm_13.width;
                    if (this.tPt.tOU == null) break;
                    point.x += this.tPt.getAppearance().getGap();
                }
            }
        }
        int n = 0;
        int n2 = 0;
        switch (this.tPt.tOV) {
            case tLq: 
            case tLr: {
                if (fsm_12.width > fsm_13.width) {
                    point2.x += (fsm_12.width - fsm_13.width) / 2;
                } else {
                    point.x += (fsm_13.width - fsm_12.width) / 2;
                }
                n = fsm_12.height + fsm_13.height;
                n2 = Math.max(fsm_12.width, fsm_13.width);
                if (this.tPt.tOU == null || this.tPt.mZy == null) break;
                n += this.tPt.getAppearance().getGap();
                break;
            }
            case tLs: 
            case tLt: {
                if (fsm_12.height > fsm_13.height) {
                    point2.y += (fsm_12.height - fsm_13.height) / 2;
                } else {
                    point.y += (fsm_13.height - fsm_12.height) / 2;
                }
                n = Math.max(fsm_12.height, fsm_13.height);
                n2 = fsm_12.width + fsm_13.width;
                if (this.tPt.tOU == null || this.tPt.mZy == null) break;
                n2 += this.tPt.getAppearance().getGap();
            }
        }
        point.x += this.tPt.tCX.cf(n2, this.tPt.uki.getContentWidth());
        point2.x += this.tPt.tCX.cf(n2, this.tPt.uki.getContentWidth());
        point.y += this.tPt.tCX.cg(n, this.tPt.uki.getContentHeight());
        point2.y += this.tPt.tCX.cg(n, this.tPt.uki.getContentHeight());
        if (this.tPt.mZy != null && !this.tPt.mZy.isUnloading()) {
            this.tPt.mZy.setSize(fsm_13);
            this.tPt.mZy.setPosition(point2);
        }
        if (this.tPt.tOU != null && !this.tPt.tOU.isUnloading()) {
            this.tPt.tOU.setSize(fsm_12);
            this.tPt.tOU.setPosition(point);
        }
    }
}

