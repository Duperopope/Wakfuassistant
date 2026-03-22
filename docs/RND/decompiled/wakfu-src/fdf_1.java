/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fDf
 */
public class fdf_1
extends faz_2<Object>
implements fcx_1,
fiz_1,
fjm_1 {
    public static final String TAG = "StackList";
    private boolean tMi = true;
    private fjf_1 tMx;
    private final ArrayList<fcv_1> uch = new ArrayList();
    private final ArrayList<fmz_1> uci = new ArrayList();
    private fcv_1 tTz = null;
    private int tTA = -1;
    private boolean ucj = false;
    @NotNull
    private fzj_0 uck = fzj_0.tHe;
    private boolean tMe = true;
    private boolean tTu = true;
    private boolean tTt = true;
    private boolean tTv = true;
    private boolean ucl = true;
    private boolean ucm = false;
    private int tDu;
    private fcv_1 tMw;
    private final ArrayList<fjb_1> ucn = new ArrayList();
    private boolean tMK = false;
    private final ArrayList<Object> uco = new ArrayList();
    private Object ucp;
    private fey_1 tLX;
    private boolean tLY = false;
    private String tMB = null;
    private fhs_2 tMC = null;
    public static final int ucq = 1384730090;
    public static final int ucr = -1466575902;
    public static final int ucs = -1872656916;
    public static final int uct = 1387629604;
    public static final int ucu = "selected".hashCode();
    public static final int ucv = "selectedValue".hashCode();
    public static final int ucw = 1039818982;
    public static final int ucx = -2013533217;
    public static final int ucy = -1763504454;
    public static final int ucz = "listFilter".hashCode();
    public static final int ucA = 400843111;
    public static final int ucB = 1701580481;

    public void a(fjb_1 fjb_12) {
        if (fjb_12 != null && !this.ucn.contains(fjb_12)) {
            this.ucn.add(fjb_12);
        }
    }

    public void b(fjb_1 fjb_12) {
        this.ucn.remove(fjb_12);
    }

    @Override
    public fza getAppearance() {
        return (fza)this.uki;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fje_2) {
            this.tMx.aB((fje_2)fhv_12);
        }
    }

    @Override
    public void aW(Object object) {
    }

    @Override
    public void aV(Object object) {
    }

    @Override
    public boolean f(int n, Object object) {
        return false;
    }

    @Override
    public int p(Object object, Object object2) {
        return -1;
    }

    @Override
    public boolean r(Object object, Object object2) {
        return false;
    }

    @Override
    public fes_2 getWidget(String string, int n) {
        if (n >= 0 && n < this.uch.size()) {
            return this.uch.get(n);
        }
        return null;
    }

    @Override
    public ArrayList<fcv_1> getRenderables() {
        return this.uch;
    }

    public boolean getSelectionable() {
        return this.tTu;
    }

    public void setSelectionable(boolean bl) {
        this.tTu = bl;
    }

    @Override
    public boolean isSelectable() {
        return this.getSelectionable();
    }

    public boolean getSelectionTogglable() {
        return this.tTt;
    }

    public void setSelectionTogglable(boolean bl) {
        this.tTt = bl;
    }

    public boolean isSelectOnlyOnLeftClick() {
        return this.tTv;
    }

    public void setSelectOnlyOnLeftClick(boolean bl) {
        this.tTv = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (fcv_1 fcv_12 : this.uch) {
            fcv_12.setEnabled(bl);
            this.l(fcv_12);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (fcv_1 fcv_12 : this.uch) {
            fcv_12.setNetEnabled(bl);
            this.l(fcv_12);
        }
    }

    public void setEnableDND(boolean bl) {
        this.tMe = bl;
    }

    public boolean getEnableDND() {
        return this.tMe;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        ((frz_2)this.tRg).setHorizontal(bl);
        this.tMi = bl;
        this.gsm();
    }

    public boolean isInnerExpandable() {
        return this.ucl;
    }

    public void setInnerExpandable(boolean bl) {
        if (this.ucl != bl) {
            this.ucl = bl;
            for (int i = 0; i < this.uch.size(); ++i) {
                this.uch.get(i).setExpandable(this.ucl);
            }
        }
    }

    public boolean getInnerNonBlocking() {
        return this.ucm;
    }

    public void setInnerNonBlocking(boolean bl) {
        if (this.ucm != bl) {
            this.ucm = bl;
            for (int i = 0; i < this.uch.size(); ++i) {
                this.uch.get(i).setNonBlocking(this.ucm);
            }
        }
    }

    public int getSelectedOffsetByValue(Object object) {
        int n;
        int n2 = this.uco.size();
        for (n = 0; n < n2 && this.uco.get(n) != object; ++n) {
        }
        if (n == n2) {
            return -1;
        }
        return n;
    }

    @Override
    public Object getSelectedValue() {
        fcv_1 fcv_12 = this.getSelected();
        if (fcv_12 == null) {
            return null;
        }
        return fcv_12.getItemValue();
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.uwm) {
            return;
        }
        int n = this.tTA;
        Object object = this.getSelectedValue();
        this.uco.clear();
        for (Object object2 : iterable) {
            if (this.tLX != null && !this.tLX.aG(object2)) continue;
            this.uco.add(object2);
        }
        int n2 = this.getSelectedOffsetByValue(object);
        if (n2 == -1 && n != -1) {
            this.setSelectedOffset(n2, fdg_1.ucD);
            this.h(new flk_2(this, null, object, n, false));
            this.h(new flk_2(this, null, null, -1, true));
        }
        this.aaH(this.uco.size());
        this.ebw();
        this.tMK = true;
    }

    public ArrayList<Object> getItems() {
        return this.uco;
    }

    @Override
    public Object getValue(int n) {
        if (n >= 0 && n < this.uco.size()) {
            return this.uco.get(n);
        }
        return null;
    }

    @Override
    public fcv_1 getSelected() {
        return this.tTz;
    }

    @Override
    public int getTableIndex(fcv_1 fcv_12) {
        return this.uch.indexOf(fcv_12);
    }

    @Override
    public int getItemIndex(Object object) {
        return this.uco.indexOf(object);
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    public int getOffsetByRenderable(fcv_1 fcv_12) {
        return this.uch.indexOf(fcv_12);
    }

    public void setSelected(fsc_1 fsc_12) {
        this.setSelectedOffset(this.uco.indexOf(fsc_12), fdg_1.ucC);
    }

    private void setSelectedOffset(int n, fdg_1 fdg_12) {
        this.tTA = n;
        this.gth();
        switch (fdg_12.ordinal()) {
            case 0: {
                if (this.uck.tHh) {
                    this.ucj = true;
                }
            }
            case 1: {
                if (this.uck.tHi) {
                    this.ucj = true;
                }
            }
            case 2: {
                if (!this.uck.tHj) break;
                this.ucj = true;
            }
        }
    }

    @Override
    public void gsN() {
        super.gsN();
        this.guw();
    }

    private void guw() {
        if (!this.ucj) {
            return;
        }
        fhv_1 fhv_12 = this.getParent();
        LinkedHashMap<fes_2, fdf_1> linkedHashMap = new LinkedHashMap<fes_2, fdf_1>();
        fes_2 fes_22 = this;
        do {
            if (fhv_12 instanceof fcq_2) {
                int n;
                fes_2 fes_23;
                fes_2 fes_24;
                fes_2 fes_25;
                long l;
                double d2;
                fcv_1 fcv_13 = this.getSelected();
                fcq_2 fcq_22 = (fcq_2)fhv_12;
                if (fcq_22.guo()) {
                    d2 = 0.0;
                    l = this.uch.stream().mapToLong(fcv_12 -> fcv_12.getHeight() + fcv_12.getAppearance().getInsetHeight()).sum();
                    if (fcv_13 != null) {
                        for (int i = 0; i < this.uch.size() && i <= this.tTA; ++i) {
                            fcv_1 object2 = this.uch.get(i);
                            d2 += (double)(object2.getHeight() + object2.getAppearance().getInsetHeight());
                        }
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        fes_25 = (fes_2)entry.getKey();
                        fes_24 = (fes_2)entry.getValue();
                        for (fhv_1 fhv_13 : fes_25.getChildren()) {
                            if (!(fhv_13 instanceof fes_2) || !(fes_23 = (fes_2)fhv_13).isVisible()) continue;
                            n = (fes_23 != this ? fes_23.getHeight() : 0) + fes_23.getAppearance().getInsetHeight();
                            if (fes_23.getY() <= fes_24.getY()) {
                                d2 += (double)n;
                            }
                            l += (long)n;
                        }
                    }
                    float f2 = (float)(d2 / (double)l);
                    fcq_22.setVerticalScrollBarPosition(1.0f - f2);
                }
                if (!fcq_22.gup()) break;
                d2 = 0.0;
                l = this.uch.stream().mapToLong(fcv_12 -> fcv_12.getWidth() + fcv_12.getAppearance().getInsetWidth()).sum();
                if (fcv_13 != null) {
                    for (int i = 0; i < this.uch.size() && i <= this.tTA; ++i) {
                        fcv_1 fcv_14 = this.uch.get(i);
                        d2 += (double)(fcv_14.getWidth() + fcv_14.getAppearance().getInsetWidth());
                    }
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    fes_25 = (fes_2)entry.getKey();
                    fes_24 = (fes_2)entry.getValue();
                    for (fhv_1 fhv_13 : fes_25.getChildren()) {
                        if (!(fhv_13 instanceof fes_2) || !(fes_23 = (fes_2)fhv_13).isVisible()) continue;
                        n = (fes_23 != this ? fes_23.getWidth() : 0) + fes_23.getAppearance().getInsetWidth();
                        if (fes_23.getX() < fes_24.getX()) {
                            d2 += (double)n;
                        }
                        l += (long)n;
                    }
                }
                float f3 = (float)(d2 / (double)l);
                fcq_22.setHorizontalScrollBarPosition(f3);
                break;
            }
            if (fhv_12 == null) continue;
            if (fhv_12 instanceof fes_2) {
                linkedHashMap.put((fes_2)fhv_12, (fdf_1)fes_22);
                fes_22 = (fes_2)fhv_12;
            }
            fhv_12 = fhv_12.getParent();
        } while (fhv_12 != null);
        this.ucj = false;
    }

    public int getClickSoundId() {
        return this.tDu;
    }

    public void setClickSoundId(int n) {
        this.tDu = n;
    }

    public int getSelectedOffset() {
        return this.tTA;
    }

    public void setSelectedValue(Object object) {
        if (this.uco == null) {
            return;
        }
        int n = this.tTA;
        int n2 = -1;
        for (int i = 0; i < this.uco.size(); ++i) {
            if (this.uco.get(i) != object) continue;
            n2 = i;
            break;
        }
        if (n != n2) {
            this.setSelectedOffset(n2, fdg_1.ucC);
            if (n != -1) {
                this.h(new flk_2(this, this.uch.get(this.tTA), this.uco.get(n), n, false));
            }
            if (this.tTA != -1) {
                this.h(new flk_2(this, this.uch.get(this.tTA), this.uco.get(this.tTA), this.tTA, true));
            }
        }
    }

    public void setFilter(fey_1 fey_12) {
        if (fey_12 == null) {
            return;
        }
        this.tLX = fey_12;
        this.tLX.a(this);
        this.tLX.jR(this.tLY);
    }

    public boolean isEnableFilterCache() {
        return this.tLY;
    }

    public void setEnableFilterCache(boolean bl) {
        this.tLY = bl;
        if (this.tLX != null) {
            this.tLX.jR(bl);
        }
    }

    @NotNull
    public fzj_0 getAutoScrollBehaviour() {
        return this.uck;
    }

    public void setAutoScrollBehaviour(@NotNull fzj_0 fzj_02) {
        this.uck = fzj_02;
    }

    @Override
    protected void b(fiq_1 fiq_12, boolean bl) {
        if (!(fiq_12.gBF() || fiq_12.gBy() != fzq_0.tJB && fiq_12.gBy() != fzq_0.tJC)) {
            fiq_12.oZ(true);
            switch (this.tDu) {
                case -1: {
                    fhy_2.gBq().eHP();
                    break;
                }
                case -2: {
                    fhy_2.gBq().eHQ();
                    break;
                }
                default: {
                    fhy_2.gBq().nW(this.tDu);
                }
            }
        }
    }

    private void ebw() {
        if (this.uch == null) {
            return;
        }
        this.tTz = null;
        boolean bl = false;
        int n = this.uch.size();
        for (int i = 0; i < n; ++i) {
            fcv_1 fcv_12 = this.uch.get(i);
            fcv_12.setContentProperty(this.tMB + "#" + i, this.tMC);
            if (this.uco != null && i < this.uco.size()) {
                if (i == this.tTA && !bl) {
                    bl = true;
                    this.tTz = fcv_12;
                } else if (fdf_1.eU(fcv_12)) {
                    this.n(fcv_12);
                }
                fcv_12.setContent(this.uco.get(i));
                continue;
            }
            fcv_12.setContent(null);
        }
        if (!bl) {
            this.tTz = null;
        }
    }

    private void gth() {
        this.n(this.tTz);
        this.tTz = this.tTA != -1 ? this.uch.get(this.tTA) : null;
        this.setSelectedAppearanceState(this.tTz);
    }

    private void p(fcv_1 fcv_12) {
        flk_2 flk_22;
        fcv_1 fcv_13 = this.tTz;
        if (fcv_12 == this.tTz) {
            return;
        }
        Object object = this.getSelectedValue();
        this.n(this.tTz);
        this.tTz = fcv_12;
        this.setSelectedAppearanceState(this.tTz);
        if (this.tTz != null) {
            this.setSelectedOffset(this.getOffsetByRenderable(this.tTz), fdg_1.ucE);
        } else {
            this.setSelectedOffset(-1, fdg_1.ucE);
        }
        Object object2 = this.tTA == -1 ? null : this.uco.get(this.tTA);
        if (fcv_13 != null) {
            flk_22 = new flk_2(this);
            flk_22.C(fcv_13);
            flk_22.setSelected(false);
            flk_22.setValue(object);
            this.h(flk_22);
        }
        if (this.tTz != null) {
            flk_22 = new flk_2(this);
            flk_22.C(this.tTz);
            flk_22.setSelected(true);
            flk_22.setValue(object2);
            this.h(flk_22);
        }
    }

    @Override
    public void setOnClick(fmz_1 fmz_12) {
        super.setOnClick(fmz_12);
        this.uci.add(fmz_12);
    }

    @Override
    @NotNull
    protected fcv_1 gsk() {
        fcv_1 fcv_12 = super.gsk();
        fcv_12.setCollection(this);
        fcv_12.setNonBlocking(this.ukD);
        fcv_12.setRendererManager(this.tMx);
        fcv_12.setEnableDND(this.tMe);
        fcv_12.setEnabled(this.cHn);
        fcv_12.setNetEnabled(this.ivk);
        this.l(fcv_12);
        fcv_12.setExpandable(this.ucl);
        fcv_12.setNonBlocking(this.ucm);
        if (this.mUW != null) {
            fcv_12.setCursorType(this.mUW);
        }
        this.uci.forEach(fmz_12 -> fcv_12.a(fmz_12.gBy(), (fis_1)fmz_12, false));
        this.uci.clear();
        fcv_12.a(fzq_0.tJS, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12;
                this.setMousePressedAppearanceState(fcv_12, this.tTz == (fcv_12 = (fcv_1)fiq_12.gBD()));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJU, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                fcv_1 fcv_13 = this.tTt && this.tTz == fcv_12 ? null : fcv_12;
                this.p(fcv_13);
                this.setMousePressedAppearanceState(fcv_12, this.tTz == fcv_12);
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJT, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                fcv_1 fcv_12;
                this.setMouseOverAppearanceState(fcv_12, this.tTz == (fcv_12 = (fcv_1)fiq_12.gBD()));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJQ, (fiq_1 fiq_12) -> {
            fcv_1 fcv_12;
            if (this.isEnabledFull() && (fcv_12 = (fcv_1)fiq_12.gBD()).getItemValue() != null) {
                this.o(this.tMw);
                this.tMw = fcv_12;
                this.setMouseOverAppearanceState(this.tMw, this.tTz == fcv_12);
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJR, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                this.b(this.tMw, this.tTz == fcv_12);
                this.tMw = null;
                this.setNeedsToResetMeshes();
            }
            return false;
        }, false);
        return fcv_12;
    }

    public boolean isSelectEvent(fiq_1 fiq_12) {
        if (!this.tTu) {
            return false;
        }
        if (!this.tTv) {
            return true;
        }
        if (!(fiq_12 instanceof flp_2)) {
            return false;
        }
        return ((flp_2)fiq_12).gEk();
    }

    protected void r(fcv_1 fcv_12) {
        this.uch.add(fcv_12);
        this.d(fcv_12);
        int n = this.uch.indexOf(fcv_12);
        this.a(fcv_12, this.tTA == n);
    }

    private void aaH(int n) {
        int n2;
        for (n2 = this.uch.size(); n2 < n; ++n2) {
            fcv_1 fcv_12 = this.gsk();
            if (this.cHc != null) {
                fcv_12.setId(this.cHc + "RenderableContainer" + n2);
            }
            this.r(fcv_12);
        }
        n2 = this.uch.size();
        for (int i = n2 - 1; i >= n; --i) {
            fcv_1 fcv_13 = this.uch.remove(i);
            if (fcv_13 == this.tMw) {
                this.tMw = null;
            }
            fcv_13.gAD();
        }
    }

    @Override
    public void setHideContainerWithoutItem(boolean bl) {
        super.setHideContainerWithoutItem(bl);
        for (fcv_1 fcv_12 : this.uch) {
            fcv_12.setHideWithoutItem(this.isHideContainerWithoutItem());
        }
    }

    @Override
    public int aVo() {
        return this.uco != null ? this.uco.size() : 0;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tMB = null;
        this.tMC = null;
        this.tTz = null;
        this.tMw = null;
        this.uch.clear();
        this.uco.clear();
        this.tMB = null;
        this.tMC = null;
        this.tMx = null;
        this.ucn.clear();
        if (this.tLX != null) {
            this.tLX.a(null);
            this.tLX.brX();
        }
        this.tLX = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ukD = false;
        this.tMK = false;
        fza fza2 = new fza();
        fza2.aVI();
        fza2.setWidget(this);
        this.d(fza2);
        this.tMx = new fjf_1();
        this.tTA = -1;
        this.ucj = false;
        this.tMe = true;
        this.ukW = true;
        this.tDu = -1;
        this.tTu = true;
        this.tTt = true;
        this.tTv = true;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.tMK) {
            for (int i = this.ucn.size() - 1; i >= 0; --i) {
                this.ucn.get(i).eOq();
            }
            this.tMK = false;
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fdf_1 fdf_12 = (fdf_1)fhi_22;
        super.a(fhi_22);
        fdf_12.setHorizontal(this.tMi);
        fdf_12.setEnableDND(this.tMe);
        fdf_12.setInnerExpandable(this.ucl);
        fdf_12.setInnerNonBlocking(this.ucm);
        fdf_12.setClickSoundId(this.tDu);
        fdf_12.setFilter(this.tLX);
        fdf_12.setEnableFilterCache(this.tLY);
        fdf_12.setSelectionable(this.tTu);
        fdf_12.setSelectionTogglable(this.tTt);
        fdf_12.setSelectOnlyOnLeftClick(this.tTv);
        for (int i = fdf_12.tRe.size() - 1; i >= 0; --i) {
            fes_2 fes_22 = (fes_2)fdf_12.tRe.get(i);
            fes_22.gAD();
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1384730090) {
            this.setInnerExpandable(Bw.aK(string));
        } else if (n == -1466575902) {
            this.setClickSoundId(Bw.m(string));
        } else if (n == -1872656916) {
            this.setInnerNonBlocking(Bw.aK(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == 1039818982) {
            this.setSelectionable(Bw.aK(string));
        } else if (n == -2013533217) {
            this.setSelectionTogglable(Bw.aK(string));
        } else if (n == 400843111) {
            this.setEnableFilterCache(Bw.aK(string));
        } else if (n == -1763504454) {
            this.setSelectOnlyOnLeftClick(Bw.aK(string));
        } else if (n == 1701580481) {
            this.setAutoScrollBehaviour(fic_12.b(fzj_0.class, string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1384730090) {
            this.setInnerExpandable(Bw.l(object));
        } else if (n == -1466575902) {
            this.setClickSoundId(Bw.m(object));
        } else if (n == -1872656916) {
            this.setInnerNonBlocking(Bw.l(object));
        } else if (n == ucu) {
            this.setSelected((fsc_1)object);
        } else if (n == ucv) {
            this.setSelectedValue(object);
        } else if (n == ucz) {
            this.setFilter((fey_1)object);
        } else if (n == 400843111) {
            this.setEnableFilterCache(Bw.l(object));
        } else if (n == 1701580481) {
            this.setAutoScrollBehaviour(fzj_0.valueOf(object.toString()));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public boolean setContentProperty(@Nullable Object object) {
        this.ucp = object;
        return super.setContentProperty(object);
    }

    public Object getBaseValue() {
        return this.ucp;
    }

    @Override
    public Iterable<Object> getUnfilteredContent() {
        return (Iterable)this.getBaseValue();
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

