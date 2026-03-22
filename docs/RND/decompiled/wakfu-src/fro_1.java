/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fRO
 */
public class fro_1
extends frs_1 {
    private static Logger oO = Logger.getLogger(fro_1.class);
    public static final String TAG = "StaticLayout";
    public static final String vaI = "sl";
    private boolean vaJ = false;
    private static final HashMap<String, fes_2> vaK = new HashMap();
    public static final int vaL = 60846749;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean gEI() {
        return this.vaJ;
    }

    public boolean getAdaptToContentSize() {
        return this.vaJ;
    }

    public void setAdaptToContentSize(boolean bl) {
        this.vaJ = bl;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        if (this.vaJ) {
            int n = 0;
            int n2 = 0;
            ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
            for (int i = 0; i < arrayList.size(); ++i) {
                fsm_1 fsm_12;
                fes_2 fes_22 = arrayList.get(i);
                if (!fes_22.isVisibleForLayout()) continue;
                frp_1 frp_12 = (frp_1)fes_22.getLayoutData();
                int n3 = 0;
                int n4 = 0;
                if (frp_12.isXInit()) {
                    n3 = frp_12.getX();
                }
                if (frp_12.isYInit()) {
                    n4 = frp_12.getY();
                }
                if (frp_12.getSize() != null) {
                    int n5;
                    fsm_12 = frp_12.getSize();
                    fsm_1 fsm_13 = fes_22.getMinSize();
                    if (fsm_12.gGd() == -1.0f) {
                        n5 = (int)fsm_12.getWidth();
                        n = Math.max(fsm_12.width + n3, n);
                        if (n5 == -1) {
                            n5 = fes_22.ukt.width;
                        } else if (n5 == -2) {
                            n5 = (int)fsm_13.getWidth();
                        }
                        n = Math.max(n5 + n3, n);
                    } else {
                        n = Math.max(Math.round((float)fsm_13.width / fsm_12.gGd() * 100.0f) + n3, n);
                    }
                    if (fsm_12.gGe() == -1.0f) {
                        n5 = (int)fsm_12.getHeight();
                        n = Math.max(fsm_12.height + n4, n);
                        if (n5 == -1) {
                            n5 = fes_22.ukt.height;
                        } else if (n5 == -2) {
                            n5 = (int)fsm_13.getHeight();
                        }
                        n = Math.max(n5 + n4, n);
                        continue;
                    }
                    n = Math.max(Math.round((float)fsm_13.height / fsm_12.gGe() * 100.0f) + n4, n);
                    continue;
                }
                fsm_12 = fes_22.getMinSize();
                n = Math.max(fsm_12.width + n3, n);
                n2 = Math.max(fsm_12.height + n4, n2);
            }
            return new fsm_1(n, n2);
        }
        return new fsm_1(0, 0);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        if (this.vaJ) {
            int n = 0;
            int n2 = 0;
            ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
            for (int i = 0; i < arrayList.size(); ++i) {
                fsm_1 fsm_12;
                frp_1 frp_12;
                fes_2 fes_22 = arrayList.get(i);
                if (!fes_22.isVisibleForLayout() || !(fes_22.getLayoutData() instanceof frp_1) || (frp_12 = (frp_1)fes_22.getLayoutData()) == null) continue;
                int n3 = 0;
                int n4 = 0;
                if (frp_12.isXInit()) {
                    n3 = frp_12.getX();
                }
                if (frp_12.isYInit()) {
                    n4 = frp_12.getY();
                }
                if (frp_12.getSize() != null) {
                    int n5;
                    fsm_12 = frp_12.getSize();
                    fsm_1 fsm_13 = fes_22.getPrefSize();
                    if (fsm_12.gGd() == -1.0f) {
                        n5 = (int)fsm_12.getWidth();
                        n = Math.max(fsm_12.width + n3, n);
                        if (n5 == -1) {
                            n5 = fes_22.ukt.width;
                        } else if (n5 == -2) {
                            n5 = (int)fsm_13.getWidth();
                        }
                        n = Math.max(n5 + n3, n);
                    } else {
                        n = Math.max(Math.round((float)fsm_13.width / fsm_12.gGd() * 100.0f) + n3, n);
                    }
                    if (fsm_12.gGe() == -1.0f) {
                        n5 = (int)fsm_12.getHeight();
                        n2 = Math.max(fsm_12.height + n4, n2);
                        if (n5 == -1) {
                            n5 = fes_22.ukt.height;
                        } else if (n5 == -2) {
                            n5 = (int)fsm_13.getHeight();
                        }
                        n2 = Math.max(n5 + n4, n2);
                        continue;
                    }
                    n2 = Math.max(Math.round((float)fsm_13.height / fsm_12.gGe() * 100.0f) + n4, n2);
                    continue;
                }
                fsm_12 = fes_22.getPrefSize();
                n = Math.max(fsm_12.width + n3, n);
                n2 = Math.max(fsm_12.height + n4, n2);
            }
            return new fsm_1(n, n2);
        }
        return new fsm_1(0, 0);
    }

    @Override
    public fsm_1 getContentGreedySize(faw_2 faw_22, fes_2 fes_22, fsm_1 fsm_12) {
        int n;
        int n2;
        fsm_1 fsm_13;
        if (!this.vaJ || faw_22 == null || fes_22 == null) {
            return new fsm_1(0, 0);
        }
        if (!(fes_22.getLayoutData() instanceof frp_1)) {
            return new fsm_1(0, 0);
        }
        int n3 = fsm_12.width;
        int n4 = fsm_12.height;
        frp_1 frp_12 = (frp_1)fes_22.getLayoutData();
        int n5 = 0;
        int n6 = 0;
        if (frp_12.isXInit()) {
            n5 = frp_12.getX();
        }
        if (frp_12.isYInit()) {
            n6 = frp_12.getY();
        }
        if ((fsm_13 = frp_12.getSize()) != null) {
            n2 = fsm_13.gGd() == -1.0f ? n3 - n5 : (int)((float)n3 * fsm_13.gGd() / 100.0f) - n5;
            n = fsm_13.gGe() == -1.0f ? n4 - n6 : (int)((float)n4 * fsm_13.gGe() / 100.0f) - n6;
        } else {
            n2 = n3 - n5;
            n = n4 - n6;
        }
        return new fsm_1(n2, n);
    }

    public static boolean c(faw_2 faw_22, fes_2 fes_22) {
        int n;
        Object object;
        Object object2;
        if (faw_22 == null || fes_22 == null) {
            return false;
        }
        if (fes_22 == null || fes_22.getLayoutData() == null || !fes_22.isVisibleForLayout() || !(fes_22.getLayoutData() instanceof frp_1)) {
            return false;
        }
        frp_1 frp_12 = (frp_1)fes_22.getLayoutData();
        if (!frp_12.isUsable()) {
            return false;
        }
        frp_12.setUsable(false);
        if (!frp_12.isInitValue() || !fes_22.isSizeInitByUserDefinition()) {
            if (frp_12.getSize() != null) {
                object2 = frp_12.getSize();
                object = fes_22.getPrefSize();
                n = ((fsm_1)object2).gGd() != -1.0f ? (int)Math.round((double)((float)faw_22.getAppearance().getContentWidth() * ((fsm_1)object2).gGd()) / 100.0) : ((fsm_1)object2).width;
                int n2 = ((fsm_1)object2).gGe() != -1.0f ? (int)Math.round((double)((float)faw_22.getAppearance().getContentHeight() * ((fsm_1)object2).gGe()) / 100.0) : ((fsm_1)object2).height;
                if (n2 == -1) {
                    n2 = fes_22.ukt.height;
                } else if (n2 == -2) {
                    n2 = (int)((Dimension)object).getHeight();
                }
                if (n == -1) {
                    n = fes_22.ukt.width;
                } else if (n == -2) {
                    n = (int)((Dimension)object).getWidth();
                }
                fes_22.setSize(n, n2);
            } else {
                fes_22.setSizeToPrefSize();
            }
        }
        if (!frp_12.isInitValue() || !fes_22.isPositionInitByUserDefinition()) {
            if (frp_12.isXInit()) {
                fes_22.setX(frp_12.getX());
            }
            if (frp_12.isYInit()) {
                fes_22.setY(frp_12.getY());
            }
            if (frp_12.getAlignment() != null) {
                object2 = frp_12.getAlignment();
                int n3 = frp_12.isXOffsetInit() ? frp_12.getXOffset() : 0;
                n = frp_12.isYOffsetInit() ? frp_12.getYOffset() : 0;
                fes_22.setX(((fzw_0)((Object)object2)).cf(fes_22.getSize().width, faw_22.getAppearance().getContentWidth()) + n3);
                fes_22.setY(((fzw_0)((Object)object2)).cg(fes_22.getSize().height, faw_22.getAppearance().getContentHeight()) + n);
            }
            if (frp_12.getXPerc() != null) {
                fes_22.setX((int)(frp_12.getXPerc().glb() / 100.0 * (double)(faw_22.getAppearance().getContentWidth() - fes_22.getSize().width)));
            }
            if (frp_12.getYPerc() != null) {
                fes_22.setY((int)(frp_12.getYPerc().glb() / 100.0 * (double)(faw_22.getAppearance().getContentHeight() - fes_22.getSize().height)));
            }
            if (frp_12.isAutoPositionable()) {
                object2 = frp_12.getReferentWidget();
                object = ((fes_2)object2).getWidgetParentOfType(fch_1.class);
                ((fch_1)object).getWindowManager().b(frp_12.getControlGroup(), (fes_2)object2);
                frp_12.setControlGroup(null);
                frp_12.setReferentWidget(null);
                frp_12.setCascadeMethodEnabled(false);
            }
        }
        if (frp_12.isInitValue() && fes_22.isPositionInitByUserDefinition()) {
            object2 = fes_22.getWidgetParentOfType(fch_1.class);
            fes_22.setX(Math.max(0, Math.min(fes_22.getX((faw_2)object2), ((fes_2)object2).getWidth() - fes_22.getWidth())));
            fes_22.setY(Math.max(0, Math.min(fes_22.getY((faw_2)object2), ((fes_2)object2).getHeight() - fes_22.getHeight())));
        }
        return true;
    }

    public static void a(faw_2 faw_22, ArrayList<fes_2> arrayList) {
        fes_2 fes_22;
        if (faw_22 == null || arrayList == null) {
            return;
        }
        vaK.clear();
        int n = faw_22.getAppearance().getContentWidth();
        int n2 = faw_22.getAppearance().getContentHeight();
        int n3 = arrayList.size();
        for (int i = 0; i < n3; ++i) {
            int n4;
            int n5;
            frp_1 frp_12;
            frr_1 frr_12;
            fes_22 = arrayList.get(i);
            if (fes_22 == null || (frr_12 = fes_22.getLayoutData()) == null || !fes_22.isVisibleForLayout() || !(frr_12 instanceof frp_1) || !(frp_12 = (frp_1)frr_12).isUsable()) continue;
            frp_12.setUsable(false);
            if (!frp_12.isInitValue() || !fes_22.isSizeInitByUserDefinition()) {
                fsm_1 fsm_12 = frp_12.getSize();
                if (fsm_12 != null) {
                    fsm_1 fsm_13 = fes_22.getPrefSize();
                    n5 = fsm_12.gGd() != -1.0f ? GC.A((float)n * fsm_12.gGd() / 100.0f) : fsm_12.width;
                    n4 = fsm_12.gGe() != -1.0f ? GC.A((float)n2 * fsm_12.gGe() / 100.0f) : fsm_12.height;
                    if (n4 == -1) {
                        n4 = fes_22.ukt.height;
                    } else if (n4 == -2) {
                        n4 = (int)fsm_13.getHeight();
                    }
                    if (n5 == -1) {
                        n5 = fes_22.ukt.width;
                    } else if (n5 == -2) {
                        n5 = (int)fsm_13.getWidth();
                    }
                    fes_22.setSize(n5, n4);
                } else {
                    fes_22.setSizeToPrefSize();
                }
            }
            int n6 = fes_22.getX();
            int n7 = fes_22.getY();
            if (!frp_12.isInitValue() || !fes_22.isPositionInitByUserDefinition()) {
                if (frp_12.isXInit()) {
                    n6 = frp_12.getX();
                }
                if (frp_12.isYInit()) {
                    n7 = frp_12.getY();
                }
                n5 = fes_22.getSize().width;
                n4 = fes_22.getSize().height;
                if (frp_12.getAlignment() != null) {
                    fzw_0 fzw_02 = frp_12.getAlignment();
                    int n8 = frp_12.isXOffsetInit() ? frp_12.getXOffset() : 0;
                    int n9 = frp_12.isYOffsetInit() ? frp_12.getYOffset() : 0;
                    n6 = fzw_02.cf(n5, n) + n8;
                    n7 = fzw_02.cg(n4, n2) + n9;
                }
                if (frp_12.getXPerc() != null) {
                    int n10 = frp_12.isXOffsetInit() ? frp_12.getXOffset() : 0;
                    n6 = (int)GC.e(frp_12.getXPerc().glb() / 100.0 * (double)(n - n5)) + n10;
                }
                if (frp_12.getYPerc() != null) {
                    int n11 = frp_12.isYOffsetInit() ? frp_12.getYOffset() : 0;
                    n7 = (int)GC.e(frp_12.getYPerc().glb() / 100.0 * (double)(n2 - n4)) + n11;
                }
                if (frp_12.isAutoPositionable()) {
                    vaK.put(frp_12.getControlGroup(), frp_12.getReferentWidget());
                    frp_12.setReferentWidget(null);
                }
            } else {
                fch_1 fch_12 = fes_22.getWidgetParentOfType(fch_1.class);
                n6 = Math.max(0, Math.min(fes_22.getX(fch_12), fch_12.getWidth() - fes_22.getWidth()));
                n7 = Math.max(0, Math.min(fes_22.getY(fch_12), fch_12.getHeight() - fes_22.getHeight()));
            }
            fes_22.setPosition(n6, n7);
        }
        if (vaK.size() != 0) {
            for (Map.Entry<String, fes_2> entry : vaK.entrySet()) {
                fes_22 = entry.getValue().getWidgetParentOfType(fch_1.class);
                ((fch_1)fes_22).getWindowManager().b(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public void a(faw_2 faw_22) {
        fro_1.a(faw_22, faw_22.getWidgetChildren());
    }

    @Override
    public void b(faw_2 faw_22, fes_2 fes_22) {
        fro_1.c(faw_22, fes_22);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        ((fro_1)fhi_22).setAdaptToContentSize(this.vaJ);
    }

    public fro_1 gET() {
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        this.a((fhi_2)fro_12);
        return fro_12;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uZB = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 60846749: {
                this.setAdaptToContentSize(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 60846749: {
                this.setAdaptToContentSize(Bw.l(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gET();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gET();
    }
}

