/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fDh
 */
public class fdh_1
extends faw_2
implements fsa_1 {
    public static final String TAG = "TabbedContainer";
    private static final String ucG = "tab";
    private static final String ucH = "separator";
    private static final String ucI = "backgroundTabsContainer";
    private static final String ucJ = "increaseButton";
    private static final String ucK = "decreaseButton";
    private static final String ucL = "tabSeparator";
    HashMap<fcu_1, frz_1> ucM;
    Map<frz_1, faw_2> ucN;
    ArrayList<fcu_1> ucO;
    faw_2 ucP;
    faw_2 ucQ;
    fbt_1 ucR;
    faw_2 ucS;
    private fcu_1 ucT;
    Rectangle ucU = new Rectangle();
    double ucV;
    fzx_0 ucW;
    fzY ucX;
    private fzx_0 tOV = fzx_0.tLt;
    private faa_2 ucY = faa_2.tLO;
    private fzu_0 tOW = fzu_0.tKE;
    private fry_1 ucZ;
    fcu_1 uda;
    boolean udb;
    boolean udc;
    fad_1 uah;
    fad_1 uai;
    private faw_2 udd;
    int ude;
    boolean udf;
    boolean dGB = true;
    private boolean udg;
    int udh;
    int udi;
    private boolean udj = false;
    private boolean udk = true;
    private boolean udl = false;
    public static final String udm = "tabsRadiogGroup";
    public static int udn;
    public static final int udo = 866098950;
    public static final int udp = -1182011501;
    public static final int udq = 1641575257;
    public static final int udr = -1258980872;
    public static final int uds = -1693803515;
    public static final int udt = 1734729837;
    public static final int udu = 913232583;
    public static final int udv = -316714927;
    public static final int udw = 728975971;
    public static final int udx = 797913549;
    public static final int udy = 1685417230;
    public static final int udz = -2138722491;
    public static final int udA = 1495959491;
    public static final int udB = -2098222524;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof frz_1) {
            frz_1 frz_12 = (frz_1)fhv_12;
            fcu_1 fcu_12 = this.setupRadioButtonForTabItem(frz_12);
            frz_12.a(this);
            this.ucM.put(fcu_12, frz_12);
            if (!this.ucO.isEmpty()) {
                faw_2 faw_22 = new faw_2();
                faw_22.aVI();
                this.udd.a(faw_22);
                this.ucS.d(faw_22);
                faw_22.onChildrenAdded();
                this.ucN.put(frz_12, faw_22);
            }
            this.ucO.add(fcu_12);
            this.ucS.d(fcu_12);
        }
    }

    public void f(@NotNull frz_1 frz_12) {
        Optional<fcu_1> optional = this.ucM.entrySet().stream().filter(entry -> entry.getValue() == frz_12).map(Map.Entry::getKey).findFirst();
        if (optional.isEmpty()) {
            return;
        }
        fcu_1 fcu_12 = optional.get();
        fcu_1 fcu_13 = this.setupRadioButtonForTabItem(frz_12);
        this.ucM.remove(fcu_12);
        this.ucM.put(fcu_13, frz_12);
        this.ucO.remove(fcu_12);
        this.ucO.add(fcu_13);
        this.ucS.a(fcu_12, (fes_2)fcu_13);
        if (this.ucT == fcu_12) {
            this.setSelectedTab(fcu_13);
        }
        fcu_12.aVH();
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    @NotNull
    private fcu_1 setupRadioButtonForTabItem(@NotNull frz_1 frz_12) {
        fcu_1 fcu_12;
        fcu_1 fcu_13 = frz_12.getButton();
        String string = TAG + this.getStyle() + "$tab" + String.valueOf((Object)this.ucW);
        if (fcu_13 != null) {
            fcu_12 = fcu_13;
            if (frz_12.isKeepButtonParameters()) {
                fcu_12.setStyle(string, true);
            }
        } else {
            fcu_12 = new fcu_1();
            fcu_12.aVI();
            fcu_12.setStyle(string, true);
            frz_12.setButton(fcu_12);
            fcu_12.setChildrenAdded(true);
            fcu_12.setNeedsScissor(true);
        }
        fcu_12.setElementMap(this.nQt);
        fcu_12.setGroupId(this.ucZ.getId());
        fcu_12.setValue(Integer.toString(this.ucM.size()));
        fcu_12.setTextOrientation(this.tOW);
        fcu_12.setPixmapAlign(this.tOV);
        fcu_12.setClickSoundId(-2);
        fcu_12.setOverrideClickSound(false);
        fcu_12.a(fzq_0.tJS, (fiq_1 fiq_12) -> {
            if (fcu_12 != this.ucT) {
                this.setSelectedTab(fcu_12);
            }
            return false;
        }, false);
        return fcu_12;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setElementMap(fhs_2 fhs_22) {
        super.setElementMap(fhs_22);
        this.ucZ.setElementMap(fhs_22);
    }

    public boolean isScrollButtonsNearby() {
        return this.udc;
    }

    public void setScrollButtonsNearby(boolean bl) {
        this.udc = bl;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public boolean isScrollButtonsPositionedBeforeTabs() {
        return this.udb;
    }

    public void setScrollButtonsPositionedBeforeTabs(boolean bl) {
        this.udb = bl;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public fzx_0 getTabsPosition() {
        return this.ucW;
    }

    public void setTabsSizesEquilibrate(boolean bl) {
        this.udg = bl;
    }

    public int getTabXOffset() {
        return this.udh;
    }

    public void setTabsXOffset(int n) {
        this.udh = n;
    }

    public int getTabYOffset() {
        return this.udi;
    }

    public void setTabsYOffset(int n) {
        this.udi = n;
    }

    public void setTabsPosition(fzx_0 fzx_02) {
        frz_2 frz_22 = (frz_2)this.ucS.getLayoutManager();
        switch (fzx_02) {
            case tLq: {
                frz_22.setHorizontal(true);
                break;
            }
            case tLr: {
                frz_22.setHorizontal(true);
                break;
            }
            case tLt: {
                frz_22.setHorizontal(false);
                break;
            }
            case tLs: {
                frz_22.setHorizontal(false);
            }
        }
        this.ucW = fzx_02;
        this.ucS.gsm();
        this.guz();
    }

    public fzY getTabsAlignment() {
        return this.ucX;
    }

    public void setTabsAlignment(fzY fzY2) {
        this.ucX = fzY2;
        this.ucS.gsm();
    }

    public faa_2 getTabsLabelAlignment() {
        return this.ucY;
    }

    public void setTabsLabelAlignment(faa_2 faa_22) {
        this.ucY = faa_22;
        for (fcu_1 fcu_12 : this.ucO) {
            fcu_12.setAlign(this.ucY);
        }
    }

    public fzx_0 getPixmapAlignment() {
        return this.tOV;
    }

    public void setPixmapAlignment(fzx_0 fzx_02) {
        this.tOV = fzx_02;
        for (fcu_1 fcu_12 : this.ucO) {
            fcu_12.setPixmapAlign(fzx_02);
        }
    }

    public fzu_0 getTextOrientation() {
        return this.tOW;
    }

    public void setTextOrientation(fzu_0 fzu_02) {
        if (this.tOW != fzu_02) {
            this.tOW = fzu_02;
            for (fcu_1 fcu_12 : this.ucO) {
                fcu_12.setTextOrientation(fzu_02);
            }
        }
    }

    public fad_1 getSelectedTab() {
        return this.ucT;
    }

    public int getSelectedTabIndex() {
        for (int i = 0; i < this.ucO.size(); ++i) {
            if (this.ucO.get(i) != this.ucT) continue;
            return i;
        }
        return -1;
    }

    public void setSelectedTab(fcu_1 fcu_12) {
        Runnable runnable = () -> fcu_12.getAppearance().grr();
        faw_2 faw_22 = this.ucM.get(fcu_12).getData();
        if (this.udk && !faw_22.isVisible()) {
            faw_22.a(new fdi_1(this, faw_22, runnable));
        } else {
            runnable.run();
        }
        this.ucT = fcu_12;
        this.uda = fcu_12;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public void setSelectedTabIndex(int n) {
        fcu_1 fcu_12 = this.ucO.get(n);
        if (fcu_12.isVisible()) {
            this.setSelectedTab(fcu_12);
        } else {
            this.guA();
        }
    }

    public void setDataContainer(faw_2 faw_23) {
        if (faw_23 == this.ucP) {
            return;
        }
        boolean bl = this.udl && !faw_23.isVisible();
        Runnable runnable = () -> {
            this.d(faw_23);
            faw_23.bFM();
            this.ucP = faw_23;
        };
        Consumer<@Nullable faw_2> consumer = faw_22 -> {
            if (faw_22 == null) {
                return;
            }
            this.j((fhv_1)faw_22);
        };
        Runnable runnable2 = this.udl ? () -> {
            if (faw_23 == this.ucP) {
                return;
            }
            faw_2 faw_23 = this.ucP;
            runnable.run();
            if (faw_23 == null) {
                return;
            }
            if (bl && !faw_23.isValid()) {
                this.setNeedsToPostProcess();
                faw_23.a(new fdj_2(this, faw_23, consumer, faw_23));
            } else {
                consumer.accept(faw_23);
            }
        } : () -> {
            if (faw_23 == this.ucP) {
                return;
            }
            consumer.accept(this.ucP);
            runnable.run();
        };
        if (bl) {
            faw_23.a(new fdk_1(this, faw_23, runnable2));
        } else {
            runnable2.run();
        }
        if (this.udj) {
            faw_23.setVisible(true);
        }
    }

    public void setForceVisibilityOfTabItemContent(boolean bl) {
        this.udj = bl;
    }

    public boolean isForceVisibilityOfTabItemContent() {
        return this.udj;
    }

    public void setSyncTabButtonStateAndTab(boolean bl) {
        this.udk = bl;
    }

    public boolean isSyncTabButtonStateAndTab() {
        return this.udk;
    }

    public void setChangeTabWhenReady(boolean bl) {
        this.udl = bl;
    }

    public boolean isChangeTabWhenReady() {
        return this.udl;
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || !this.bmg || !this.getAppearance().gE(n, n2) || fbj_1.getInstance().isMovePointMode()) {
            return null;
        }
        fes_2 fes_22 = this.ukD ? null : this;
        int n3 = this.ucS.getX();
        int n4 = this.ucS.getY() + (int)this.ucV;
        if ((n -= this.getAppearance().getLeftInset()) > n3 && (double)n < (double)n3 + this.ucU.getWidth() && (n2 -= this.getAppearance().getBottomInset()) > n4 && (double)n2 < (double)n4 + this.ucU.getHeight()) {
            fes_22 = this.ucS.getWidget(n - this.ucS.ukp.x, n2 - this.ucS.ukp.y);
        }
        if (fes_22 != null) {
            return fes_22;
        }
        for (int i = 0; i < this.tRe.size(); ++i) {
            fes_2 fes_23 = (fes_2)this.tRe.get(i);
            if (fes_23 == this.ucS || fes_23.isUnloading() || (fes_23 = fes_23.getWidget(n - fes_23.ukp.x, n2 - fes_23.ukp.y)) == null) continue;
            fes_22 = fes_23;
        }
        return fes_22;
    }

    private void setButtonsMinHeight(int n) {
        for (fcu_1 fcu_12 : this.ucO) {
            fcu_12.setPrefSize(new fsm_1(0, n));
        }
    }

    @Override
    public void setStyle(String string, boolean bl) {
        super.setStyle(string, bl);
        this.guz();
    }

    private void setButtonsMinWidth(int n) {
        for (fcu_1 fcu_12 : this.ucO) {
            fcu_12.setPrefSize(new fsm_1(n, 0));
        }
    }

    private int oA(boolean bl) {
        int n = 0;
        n = (int)Math.max(bl ? this.uah.getMinSize().getWidth() : this.uah.getMinSize().getHeight(), (double)n);
        n = (int)Math.max(bl ? this.uai.getMinSize().getWidth() : this.uai.getMinSize().getHeight(), (double)n);
        for (fcu_1 fcu_12 : this.ucO) {
            n = (int)Math.max(bl ? fcu_12.getMinSize().getWidth() : fcu_12.getMinSize().getHeight(), (double)n);
        }
        return n;
    }

    @Override
    public void onChildrenAdded() {
        this.ucZ.onChildrenAdded();
        this.ucS.onChildrenAdded();
        this.ucQ.onChildrenAdded();
        this.ucR.onChildrenAdded();
        this.uah.onChildrenAdded();
        this.uai.onChildrenAdded();
        super.onChildrenAdded();
    }

    @Override
    public void aVH() {
        if (this.ucP != null) {
            this.uxK.remove(this.ucP);
        }
        super.aVH();
        this.ucM.clear();
        this.ucN.clear();
        this.udd.aVH();
        this.udd = null;
        this.ucU = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ucM = new HashMap();
        this.ucN = new HashMap<frz_1, faw_2>();
        this.ucO = new ArrayList();
        fdo_1 fdo_12 = new fdo_1(this);
        ((fhi_2)fdo_12).aVI();
        this.a(fdo_12);
        this.ucZ = new fry_1();
        this.ucZ.aVI();
        this.ucZ.setId(udm + udn++);
        this.ucS = faw_2.checkOut();
        fdp_2 fdp_22 = new fdp_2(this);
        this.ucS.getEntity().a(fdp_22);
        this.ucS.getEntity().b(fdp_22);
        this.ucQ = new faw_2();
        this.ucQ.aVI();
        this.ucR = new fbt_1();
        this.ucR.aVI();
        this.uah = new fad_1();
        this.uah.aVI();
        this.uah.a(fzq_0.tJU, new fdl_2(this), false);
        this.uai = new fad_1();
        this.uai.aVI();
        this.uai.a(fzq_0.tJU, new fdm_1(this), false);
        this.udd = new faw_2();
        this.udd.aVI();
        this.ucS.setNeedsScissor(true);
        this.d(this.ucQ);
        this.d(this.ucS);
        this.d(this.ucR);
        this.d(this.uah);
        this.d(this.uai);
        this.setTabsPosition(fzx_0.tLq);
        this.setTabsAlignment(fzY.tLy);
        this.ukW = true;
        this.udj = false;
        this.udk = true;
        this.udl = false;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.dGB) {
            this.bFM();
            this.dGB = false;
        }
        return bl;
    }

    @Override
    public void grg() {
        if (this.ucT != null) {
            this.setDataContainer(this.ucM.get(this.ucT).getData());
        } else if (this.ucO.isEmpty()) {
            this.ucT = null;
            this.ucP = null;
        } else {
            for (fcu_1 fcu_12 : this.ucO) {
                if (fcu_12.getValue() == null || !fcu_12.getValue().equalsIgnoreCase(this.ucZ.getValue())) continue;
                this.setSelectedTab(fcu_12);
            }
            if (this.ucT == null) {
                this.guA();
            }
            if (this.ucT != null) {
                this.setDataContainer(this.ucM.get(this.ucT).getData());
            }
        }
        super.grg();
    }

    @Override
    public void guy() {
        super.guy();
        this.guz();
    }

    private void guz() {
        if (this.ucM != null) {
            for (frz_1 fhv_12 : this.ucM.values()) {
                if (fhv_12.gFr()) continue;
                fcu_1 fcu_12 = fhv_12.getButton();
                fcu_12.uki.grd();
                fcu_12.setStyle(TAG + this.getStyle() + "$tab" + String.valueOf((Object)this.ucW), true);
                fhv_12.gFs();
            }
        }
        if (this.ucR != null) {
            this.ucR.uki.grd();
            this.ucR.setStyle(TAG + this.getStyle() + "$separator" + String.valueOf((Object)this.ucW), true);
        }
        if (this.ucQ != null) {
            this.ucQ.uki.grd();
            this.ucQ.setStyle(TAG + this.getStyle() + "$backgroundTabsContainer" + String.valueOf((Object)this.ucW), true);
        }
        if (this.uah != null) {
            this.uah.uki.grd();
            this.uah.setStyle(TAG + this.getStyle() + "$increaseButton" + String.valueOf((Object)this.ucW), true);
        }
        if (this.uai != null) {
            this.uai.uki.grd();
            this.uai.setStyle(TAG + this.getStyle() + "$decreaseButton" + String.valueOf((Object)this.ucW), true);
        }
        if (this.udd != null) {
            this.udd.uki.grd();
            this.udd.setStyle(TAG + this.getStyle() + "$tabSeparator" + String.valueOf((Object)this.ucW), true);
            for (faw_2 faw_22 : this.ucN.values()) {
                faw_22.uki.grd();
                faw_22.setStyle(TAG + this.getStyle() + "$tabSeparator" + String.valueOf((Object)this.ucW), true);
            }
        }
    }

    @Override
    public void gsm() {
        super.gsm();
        switch (this.ucW) {
            case tLq: 
            case tLr: {
                this.ucS.setPrefSize(new fsm_1(0, this.oA(false)));
                if (!this.udg) break;
                this.setButtonsMinWidth(this.oA(true));
                break;
            }
            case tLt: 
            case tLs: {
                this.ucS.setPrefSize(new fsm_1(this.oA(true), 0));
                if (!this.udg) break;
                this.setButtonsMinHeight(this.oA(false));
            }
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fdh_1 fdh_12 = (fdh_1)fhi_22;
        super.a(fdh_12);
        fdh_12.ucW = this.ucW;
        fdh_12.ucX = this.ucX;
        fdh_12.tOV = this.tOV;
        fdh_12.ucY = this.ucY;
        fdh_12.tOW = this.tOW;
        fdh_12.udb = this.udb;
        fdh_12.udc = this.udc;
        fdh_12.udh = this.udh;
        fdh_12.udi = this.udi;
        fdh_12.udj = this.udj;
        fdh_12.udk = this.udk;
        fdh_12.udl = this.udl;
    }

    @Override
    public void oB(boolean bl) {
        if (!this.uwp) {
            return;
        }
        this.tRg.a(this.getContainer());
        if (this.ucT != null) {
            this.guA();
        }
    }

    public void guA() {
        for (int i = 0; i < this.ucO.size(); ++i) {
            fcu_1 fcu_12 = this.ucO.get(i);
            if (fcu_12 == null || !this.ucM.get(fcu_12).isVisible()) continue;
            this.setSelectedTab(fcu_12);
            return;
        }
    }

    ArrayList<fcu_1> getVisibleTabs() {
        ArrayList<fcu_1> arrayList = new ArrayList<fcu_1>();
        for (fcu_1 fcu_12 : this.ucO) {
            if (!this.ucM.get(fcu_12).isVisible()) continue;
            arrayList.add(fcu_12);
        }
        return arrayList;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 866098950) {
            this.setPixmapAlignment(fzx_0.tF(string));
        } else if (n == -1182011501) {
            this.setScrollButtonsNearby(Bw.aK(string));
        } else if (n == -1258980872) {
            this.setSelectedTabIndex(Bw.m(string));
        } else if (n == 1641575257) {
            this.setScrollButtonsPositionedBeforeTabs(Bw.aK(string));
        } else if (n == -1693803515) {
            this.setTabsAlignment(fzY.tG(string));
        } else if (n == 1734729837) {
            this.setTabsLabelAlignment(faa_2.tI(string));
        } else if (n == 913232583) {
            this.setTabsPosition(fzx_0.tF(string));
        } else if (n == 728975971) {
            this.setTextOrientation(fzu_0.tC(string));
        } else if (n == 797913549) {
            this.udh = Bw.m(string);
        } else if (n == 1685417230) {
            this.udi = Bw.m(string);
        } else if (n == -316714927) {
            this.udg = Bw.aK(string);
        } else if (n == -2138722491) {
            this.setForceVisibilityOfTabItemContent(Bw.aK(string));
        } else if (n == 1495959491) {
            this.setSyncTabButtonStateAndTab(Bw.aK(string));
        } else if (n == -2098222524) {
            this.setChangeTabWhenReady(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 866098950) {
            this.setPixmapAlignment((fzx_0)((Object)object));
        } else if (n == -1258980872) {
            this.setSelectedTabIndex(Bw.m(object));
        } else if (n == -1182011501) {
            this.setScrollButtonsNearby(Bw.l(object));
        } else if (n == 1641575257) {
            this.setScrollButtonsPositionedBeforeTabs(Bw.l(object));
        } else if (n == -1693803515) {
            this.setTabsAlignment((fzY)((Object)object));
        } else if (n == 1734729837) {
            this.setTabsLabelAlignment((faa_2)((Object)object));
        } else if (n == 913232583) {
            this.setTabsPosition((fzx_0)((Object)object));
        } else if (n == 728975971) {
            this.setTextOrientation((fzu_0)((Object)object));
        } else if (n == 797913549) {
            this.udh = Bw.m(object);
        } else if (n == 1685417230) {
            this.udi = Bw.m(object);
        } else if (n == -316714927) {
            this.udg = Bw.l(object);
        } else if (n == -2138722491) {
            this.setForceVisibilityOfTabItemContent(Bw.l(object));
        } else if (n == 1495959491) {
            this.setSyncTabButtonStateAndTab(Bw.l(object));
        } else if (n == -2098222524) {
            this.setChangeTabWhenReady(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

