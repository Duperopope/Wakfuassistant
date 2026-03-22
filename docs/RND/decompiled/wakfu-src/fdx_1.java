/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fDX
 */
class fdx_1
extends frs_1 {
    static final /* synthetic */ boolean uiG;
    final /* synthetic */ fdp_1 uiH;

    fdx_1(fdp_1 fdp_12) {
        this.uiH = fdp_12;
    }

    public boolean gsn() {
        return false;
    }

    private axl_2 isRadiusValid(int n, boolean bl, ArrayList<fad_1> arrayList) {
        int n2 = arrayList.size();
        if (n2 == 1) {
            fsm_1 fsm_12 = arrayList.get(0).getPrefSize();
            return axl_2.t(0, 0, fsm_12.width, fsm_12.height);
        }
        if (!uiG && n2 <= 1) {
            throw new AssertionError((Object)"Le nombre de boutons est inf\u00e9rieur \u00e0 2");
        }
        float f2 = fdp_1.aaJ(n2);
        float f3 = n2 == 8 ? 4.712389f : 1.5707964f + (float)(n2 - 1) * f2 / 2.0f;
        axl_2 axl_22 = axl_2.bQO();
        axl_2 axl_23 = axl_2.bQO();
        axl_2 axl_24 = axl_2.bQO();
        axl_2 axl_25 = null;
        for (int i = 0; i < n2; ++i) {
            fes_2 fes_22 = arrayList.get(i);
            fsm_1 fsm_13 = bl ? fes_22.getMinSize() : fes_22.getPrefSize();
            axl_23.setWidth(fsm_13.width);
            axl_23.setHeight(fsm_13.height);
            axl_23.setX((int)((float)n * GC.H(f3)) + n);
            axl_23.setY((int)((float)n * GC.G(f3)) + n);
            axl_24.b(axl_23);
            if (axl_25 != null) {
                if (axl_23.d(axl_25)) {
                    axl_24.aZp();
                    axl_23.aZp();
                    axl_22.aZp();
                    axl_25.aZp();
                    return null;
                }
            } else {
                axl_25 = axl_2.bQO();
            }
            axl_25.e(axl_23);
            if (i == 0) {
                axl_22.e(axl_23);
            }
            f3 -= f2;
        }
        if (axl_23.d(axl_22)) {
            axl_24.aZp();
            axl_23.aZp();
            axl_22.aZp();
            if (axl_25 != null) {
                axl_25.aZp();
            }
            return null;
        }
        axl_23.aZp();
        axl_22.aZp();
        if (axl_25 != null) {
            axl_25.aZp();
        }
        return axl_24;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fdp_1 fdp_12 = (fdp_1)faw_22;
        if (fdp_12.uiu.size() == 0) {
            fsm_12 = new fsm_1(0, 0);
        } else {
            ArrayList<fad_1> arrayList = fdp_12.uiu.get((int)fdp_12.uiv).uiF;
            int n = 40;
            axl_2 axl_22 = this.isRadiusValid(n, true, arrayList);
            while (axl_22 == null) {
                axl_22 = this.isRadiusValid(n += 5, true, arrayList);
            }
            this.uiH.brI = n;
            fsm_12 = new fsm_1(this.uiH.brI * 2, this.uiH.brI * 2);
            if (this.uiH.uiu.size() > 1) {
                if (arrayList.size() > 3) {
                    fsm_12.width += this.uiH.uah.getMinSize().width + this.uiH.uai.getMinSize().width;
                    fsm_12.height += this.uiH.uah.getMinSize().height + this.uiH.uai.getMinSize().height;
                }
                fsm_12.width = Math.max(this.uiH.uah.getMinSize().width + this.uiH.uai.getMinSize().width, fsm_12.width);
                fsm_12.height = Math.max(this.uiH.uah.getMinSize().height + this.uiH.uai.getMinSize().height, fsm_12.height);
            }
        }
        return fsm_12;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fdp_1 fdp_12 = (fdp_1)faw_22;
        if (fdp_12.uiu.size() == 0) {
            fsm_12 = new fsm_1(0, 0);
        } else {
            fsm_1 fsm_13 = fdp_12.uiu.get((int)0).uiF.get(0).getPrefSize();
            int n = fsm_13.width;
            int n2 = fsm_13.height;
            this.uiH.brI = 40;
            int n3 = fdp_12.uiu.size();
            for (int i = 0; i < n3; ++i) {
                fdw_2 fdw_22 = fdp_12.uiu.get(i);
                ArrayList<fad_1> arrayList = fdw_22.uiF;
                fdw_22.brI = 40;
                axl_2 axl_22 = this.isRadiusValid(fdw_22.brI, false, arrayList);
                while (axl_22 == null) {
                    fdw_22.brI += 5;
                    axl_22 = this.isRadiusValid(fdw_22.brI, false, arrayList);
                }
                fdw_22.brI = Math.max(fdw_22.brI, Math.max(axl_22.getHeight(), axl_22.getWidth()) / 2);
                axl_22.aZp();
                this.uiH.brI = Math.max(this.uiH.brI, fdw_22.brI);
            }
            fsm_12 = new fsm_1(n + this.uiH.brI * 2, n2 + this.uiH.brI * 2);
        }
        return fsm_12;
    }

    @Override
    public void a(faw_2 faw_22) {
        int n;
        int n2;
        if (this.uiH.uiu.size() == 0) {
            return;
        }
        fdw_2 fdw_22 = this.uiH.uiu.get(this.uiH.uiv);
        ArrayList<fad_1> arrayList = fdw_22.uiF;
        int n3 = arrayList.size();
        float f2 = fdp_1.aaJ(n3);
        float f3 = n3 == 8 ? 4.712389f : 1.5707964f + (float)(n3 - 1) * f2 / 2.0f;
        for (n2 = 0; n2 < n3; ++n2) {
            arrayList.get(n2).setSizeToPrefSize();
        }
        n2 = this.uiH.brI - fdw_22.brI;
        if (this.uiH.uiu.size() > 1) {
            this.uiH.uai.setVisible(true);
            this.uiH.uai.setSizeToPrefSize();
            n = fzY.tLz.cf(this.uiH.uai.getWidth(), faw_22.getAppearance().getContentWidth()) - this.uiH.uai.getWidth();
            int n4 = fzY.tLz.cg(this.uiH.uai.getHeight(), faw_22.getAppearance().getContentHeight());
            this.uiH.uai.setPosition(this.uiH.brI, this.uiH.brI);
            this.uiH.uai.setUsePositionTween(true);
            this.uiH.uai.setPosition(n, n4);
            this.uiH.uai.setUsePositionTween(false);
            this.uiH.uah.setVisible(true);
            this.uiH.uah.setSizeToPrefSize();
            n = fzY.tLz.cf(this.uiH.uah.getWidth(), faw_22.getAppearance().getContentWidth()) + this.uiH.uah.getWidth();
            n4 = fzY.tLz.cg(this.uiH.uah.getHeight(), faw_22.getAppearance().getContentHeight());
            this.uiH.uah.setPosition(this.uiH.brI, this.uiH.brI);
            this.uiH.uah.setUsePositionTween(true);
            this.uiH.uah.setPosition(n, n4);
            this.uiH.uah.setUsePositionTween(false);
        } else {
            this.uiH.uai.setVisible(false);
            this.uiH.uah.setVisible(false);
        }
        for (n = 0; n < n3; ++n) {
            fes_2 fes_22 = arrayList.get(n);
            fes_22.setVisible(true);
            int n5 = (int)Math.round(Math.toDegrees(f3)) % 360;
            switch (n5) {
                case 0: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonEast", true);
                    break;
                }
                case -315: 
                case -300: 
                case 45: 
                case 60: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonNorthEast", true);
                    break;
                }
                case -270: 
                case 90: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonNorth", true);
                    break;
                }
                case -240: 
                case -225: 
                case 120: 
                case 135: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonNorthWest", true);
                    break;
                }
                case -180: 
                case 180: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonWest", true);
                    break;
                }
                case -135: 
                case -120: 
                case 225: 
                case 240: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonSouthWest", true);
                    break;
                }
                case -90: 
                case 270: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonSouth", true);
                    break;
                }
                case -60: 
                case -45: 
                case 300: 
                case 315: {
                    fes_22.setStyle("MRU" + this.uiH.getStyle() + "$buttonSouthEast", true);
                }
            }
            int n6 = (int)((double)fdw_22.brI * Math.cos(f3)) + fdw_22.brI + n2;
            int n7 = (int)((double)fdw_22.brI * Math.sin(f3)) + fdw_22.brI + n2;
            fes_22.setPosition(n6, n7);
            f3 -= f2;
        }
    }

    static {
        uiG = !fdp_1.class.desiredAssertionStatus();
    }
}

