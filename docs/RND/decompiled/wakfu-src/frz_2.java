/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fRz
 */
public class frz_2
extends frs_1
implements ayz_2 {
    private static final Logger uZV = Logger.getLogger(frz_2.class);
    public static final String TAG = "RowLayout";
    public static final String uZW = "rl";
    private static final ObjectPool uZX = new ayv_2(new fra_1(), 2000);
    private boolean tMi = true;
    private short uZL = 0;
    private short uZM = 0;
    private boolean uZY = false;
    private faa_2 tCX = faa_2.tLO;
    public static final int uZZ = 3200366;
    public static final int vaa = 3617440;
    public static final int vab = 2104043469;
    public static final int vac = 1387629604;
    public static final int vad = 92903173;

    public static frz_2 checkOut() {
        frz_2 frz_22;
        try {
            frz_22 = (frz_2)uZX.borrowObject();
            frz_22.uth = uZX;
        }
        catch (Exception exception) {
            uZV.error((Object)"Probl\u00e8me au borrowObject.");
            frz_22 = new frz_2();
            frz_22.aVI();
        }
        return frz_22;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
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
                fsm_1 fsm_12 = fes_22.getMinSize();
                n += fsm_12.width;
                n2 = Math.max(n2, fsm_12.height);
            }
        } else {
            for (fes_2 fes_23 : faw_22.getWidgetChildren()) {
                if (!fes_23.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.uZM;
                }
                fsm_1 fsm_13 = fes_23.getMinSize();
                n2 += fsm_13.height;
                n = Math.max(n, fsm_13.width);
            }
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
                fsm_1 fsm_12 = fes_22.getPrefSize();
                n += fsm_12.width;
                n2 = Math.max(n2, fsm_12.height);
            }
        } else {
            for (int i = faw_22.getWidgetChildren().size() - 1; i >= 0; --i) {
                fes_2 fes_23 = faw_22.getWidget(i);
                if (!fes_23.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.uZM;
                }
                fsm_1 fsm_13 = fes_23.getPrefSize();
                n2 += fsm_13.height;
                n = Math.max(n, fsm_13.width);
            }
        }
        return new fsm_1(n, n2);
    }

    @Override
    public fsm_1 getContentGreedySize(faw_2 faw_22, fes_2 fes_22, fsm_1 fsm_12) {
        int n = fsm_12.width;
        int n2 = fsm_12.height;
        boolean bl = true;
        if (this.tMi) {
            for (int i = faw_22.getWidgetChildren().size() - 1; i >= 0; --i) {
                fes_2 fes_23 = faw_22.getWidget(i);
                if (!fes_23.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n -= this.uZL;
                }
                if (fes_23 == fes_22) continue;
                n -= fes_23.getPrefSize().width;
            }
        } else {
            for (int i = faw_22.getWidgetChildren().size() - 1; i >= 0; --i) {
                fes_2 fes_24 = faw_22.getWidget(i);
                if (!fes_24.isVisibleForLayout()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 -= this.uZM;
                }
                if (fes_24 == fes_22) continue;
                n2 -= fes_24.getPrefSize().height;
            }
        }
        return new fsm_1(n, n2);
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

    public void setVgap(short s) {
        this.uZM = s;
    }

    public void setUseLegacyVGapBehaviour(boolean bl) {
        this.uZY = bl;
    }

    public boolean isUseLegacyVGapBehaviour() {
        return this.uZY;
    }

    private ArrayList<azx_1<fes_2, Integer>> d(ArrayList<fes_2> arrayList, int n) {
        int n2;
        int n3;
        ArrayList<azx_1<fes_2, Integer>> arrayList2 = new ArrayList<azx_1<fes_2, Integer>>();
        ArrayList<fes_2> arrayList3 = new ArrayList<fes_2>();
        if (arrayList != null) {
            for (fes_2 fes_22 : arrayList) {
                if (!fes_22.isShrinkable()) continue;
                arrayList3.add(fes_22);
            }
        }
        if (arrayList3 == null || arrayList3.size() == 0) {
            return arrayList2;
        }
        for (fes_2 fes_22 : arrayList3) {
            azx_1<fes_2, Integer> azx_12;
            fsm_1 fsm_12 = fes_22.getPrefSize();
            n3 = this.tMi ? fsm_12.width : fsm_12.height;
            for (n2 = arrayList2.size() - 1; n2 >= 0 && (azx_12 = arrayList2.get(n2)).aHI() <= n3; --n2) {
            }
            arrayList2.add(n2 + 1, new azx_1<fes_2, Integer>(fes_22, n3));
        }
        int n4 = n;
        while (n4 > 0) {
            int n5 = arrayList2.get(0).aHI();
            int n6 = 0;
            n3 = 0;
            for (azx_1<fes_2, Integer> azx_13 : arrayList2) {
                if (azx_13.aHI() == n5) {
                    ++n6;
                    continue;
                }
                n3 = azx_13.aHI();
                break;
            }
            if (n4 < n6) {
                for (int i = 0; i < n6 && n4 > 0; --n4, ++i) {
                    arrayList2.get(i).N(arrayList2.get(i).aHI() - 1);
                }
                break;
            }
            n2 = n5 - n3;
            if (n2 * n6 > n4 || n2 <= 0) {
                n2 = (int)Math.floor((double)n4 / (double)n6);
            }
            n4 -= n2 * n6;
            for (int i = 0; i < n6; ++i) {
                arrayList2.get(i).N(n5 - n2);
            }
        }
        return arrayList2;
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        boolean bl = false;
        ArrayList<azx_1<fes_2, Integer>> arrayList = null;
        ArrayList<fes_2> arrayList2 = faw_22.getWidgetChildren();
        if (this.tMi) {
            int n7;
            int n8 = faw_22.getAppearance().getContentHeight();
            int n9 = faw_22.getAppearance().getContentWidth();
            int n10 = arrayList2.size();
            for (n7 = 0; n7 < n10; ++n7) {
                fes_2 fes_22 = arrayList2.get(n7);
                if (!fes_22.isVisibleForLayout()) continue;
                n9 -= fes_22.getPrefSize().width;
                ++n3;
                if (fes_22.isExpandable()) {
                    ++n4;
                }
                if (!fes_22.isShrinkable()) continue;
                ++n5;
            }
            if ((n9 -= (n3 - 1) * this.uZL) < 0) {
                bl = true;
                n6 = -n9;
                n9 = 0;
                arrayList = this.d(arrayList2, n6);
            }
            n7 = 0;
            if (n4 > 0) {
                n7 = (int)Math.floor((double)n9 / (double)n4);
            }
            n10 = 0;
            if (n4 > 0) {
                n10 = n9 - n7 * n4;
            }
            n = n4 == 0 ? this.tCX.uS(n9) : 0;
            n2 = 0;
            for (int i = 0; i < arrayList2.size(); ++i) {
                int n11;
                fes_2 fes_23 = arrayList2.get(i);
                if (!fes_23.isVisibleForLayout()) continue;
                fsm_1 fsm_12 = fes_23.getPrefSize();
                int n12 = fsm_12.width;
                int n13 = n2;
                if (bl && fes_23.isShrinkable() && arrayList != null) {
                    for (azx_1<fes_2, Integer> azx_12 : arrayList) {
                        if (azx_12.getFirst() != fes_23) continue;
                        n12 = azx_12.aHI();
                        break;
                    }
                }
                if (fes_23.isExpandable()) {
                    n12 += n7;
                    if (n10 > 0) {
                        ++n12;
                        --n10;
                    }
                }
                if (fes_23.getLayoutData() instanceof frb_1) {
                    n11 = fsm_12.height;
                    n13 += ((frb_1)fes_23.getLayoutData()).getAlign().cg(n11, n8);
                } else {
                    n11 = n8;
                }
                fes_23.setSize(n12, n11);
                fes_23.setPosition(n, n13);
                n += n12 + this.uZL;
            }
        } else {
            int n14;
            int n15 = faw_22.getAppearance().getContentWidth();
            int n16 = faw_22.getAppearance().getContentHeight();
            int n17 = arrayList2.size();
            for (n14 = 0; n14 < n17; ++n14) {
                fes_2 fes_24 = arrayList2.get(n14);
                if (!fes_24.isVisibleForLayout()) continue;
                n16 -= fes_24.getPrefSize().height;
                ++n3;
                if (fes_24.isExpandable()) {
                    ++n4;
                }
                if (!fes_24.isShrinkable()) continue;
                ++n5;
            }
            if ((n16 -= (n3 - 1) * this.uZM) < 0) {
                bl = true;
                n6 = -n16;
                n16 = 0;
                arrayList = this.d(arrayList2, n6);
            }
            n14 = 0;
            if (n4 > 0) {
                n14 = (int)Math.floor((double)n16 / (double)n4);
            }
            n17 = 0;
            if (n4 > 0) {
                n17 = n16 - n14 * n4;
            }
            n = 0;
            n2 = faw_22.getAppearance().getContentHeight() - (n4 == 0 ? n16 - this.tCX.uT(n16) : 0);
            boolean bl2 = true;
            for (int i = 0; i < arrayList2.size(); ++i) {
                int n18;
                fes_2 fes_25 = arrayList2.get(i);
                if (!fes_25.isVisibleForLayout()) continue;
                fsm_1 fsm_13 = fes_25.getPrefSize();
                int n19 = fsm_13.height;
                int n20 = n;
                if (bl && fes_25.isShrinkable() && arrayList != null) {
                    for (azx_1<fes_2, Integer> azx_13 : arrayList) {
                        if (azx_13.getFirst() != fes_25) continue;
                        n19 = azx_13.aHI();
                        break;
                    }
                }
                if (fes_25.isExpandable()) {
                    n19 += n14;
                    if (n17 > 0) {
                        ++n19;
                        --n17;
                    }
                }
                if (fes_25.getLayoutData() instanceof frb_1) {
                    n18 = fsm_13.width;
                    n20 += ((frb_1)fes_25.getLayoutData()).getAlign().cf(n18, n15);
                } else {
                    n18 = n15;
                }
                fes_25.setSize(n18, n19);
                n2 -= n19;
                if (!this.isUseLegacyVGapBehaviour() && bl2) {
                    bl2 = false;
                } else {
                    n2 -= this.uZM;
                }
                fes_25.setPosition(n20, n2);
            }
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frz_2 frz_22 = (frz_2)fhi_22;
        super.a((fhi_2)frz_22);
        frz_22.uZL = this.uZL;
        frz_22.uZM = this.uZM;
        frz_22.tMi = this.tMi;
        frz_22.tCX = this.tCX;
        frz_22.uZY = this.uZY;
    }

    public frz_2 gEN() {
        frz_2 frz_22 = frz_2.checkOut();
        this.a((fhi_2)frz_22);
        return frz_22;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tMi = true;
        this.uZL = 0;
        this.uZM = 0;
        this.uZY = false;
        this.tCX = faa_2.tLO;
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
            case 2104043469: {
                this.setUseLegacyVGapBehaviour(Bw.aK(string));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Bw.aK(string));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.tI(string));
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
            case 2104043469: {
                this.setUseLegacyVGapBehaviour(Bw.l(object));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Bw.l(object));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.aU(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gEN();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gEN();
    }
}

