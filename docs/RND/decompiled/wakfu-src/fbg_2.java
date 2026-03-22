/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fBg
 */
public class fbg_2
extends faw_2 {
    public static final String TAG = "drawer";
    public static final String tRL = "staticContainer";
    public static final String tRM = "popupContainer";
    boolean tRN = false;
    boolean tRO = true;
    private fis_1 tND;
    private fis_1 mTP;
    private fis_1 tNK;
    boolean nax = true;
    faw_2 tRP = null;
    faw_2 tRQ = null;
    private faa_2 tCX = faa_2.tLR;
    private faa_2 tQJ = faa_2.tLL;
    public static final int tRR = 92903173;
    public static final int tRS = 1905963320;
    public static final int tRT = 1597976017;

    @Override
    public void d(fhv_1 fhv_12) {
        faw_2 faw_22;
        String string;
        boolean bl = true;
        if (fhv_12 instanceof faw_2 && (string = (faw_22 = (faw_2)fhv_12).getThemeElementName()) != null) {
            if (string.equals(tRM)) {
                if (this.tRP != null) {
                    this.tRP.aZp();
                }
                bl = false;
                this.tRP = faw_22;
                this.tRP.setVisible(false);
                this.tRP.setModalLevel((short)30000);
                this.eV(this.tRP);
            } else if (string.equals(tRL)) {
                if (this.tRQ != null) {
                    this.tRQ.gAD();
                }
                this.tRQ = faw_22;
            }
        }
        if (bl) {
            super.d(fhv_12);
        }
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (tRL.equalsIgnoreCase(string)) {
            if (this.tRQ != null) {
                return this.tRQ;
            }
        } else if (tRM.equalsIgnoreCase(string) && this.tRP != null) {
            return this.tRP;
        }
        return null;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public @Unmodifiable @NotNull List<fhv_1> getIndirectChildren() {
        ArrayList<fhv_1> arrayList = new ArrayList<fhv_1>(super.getIndirectChildren());
        if (this.tRP != null) {
            arrayList.add(this.tRP);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void setCloseOnClick(boolean bl) {
        this.nax = bl;
    }

    public void setHotSpotPosition(faa_2 faa_22) {
        if (faa_22 != null) {
            this.tQJ = faa_22;
        }
    }

    public void setAlign(faa_2 faa_22) {
        if (faa_22 != null) {
            this.tCX = faa_22;
        }
    }

    @Override
    public void eKI() {
        super.eKI();
        this.setFocusable(true);
    }

    public void c(fbj_1 fbj_12) {
        this.tND = new fbh_1(this);
        fbj_12.a(fzq_0.tJS, this.tND, false);
        this.mTP = new fbi_1(this);
        fbj_12.a(fzq_0.tJT, this.mTP, false);
        this.tNK = new fbj_2(this);
        fbj_12.a(fzq_0.tJF, this.tNK, true);
    }

    public void eV(faw_2 faw_22) {
        faw_22.a(fzq_0.tJU, new fbk_2(this), false);
    }

    public boolean isPopupIsBeingDisplayed() {
        return this.tRN;
    }

    public void gsG() {
        if (this.tRN) {
            this.gsH();
        } else {
            this.gsI();
        }
    }

    void gsH() {
        if (this.tRN) {
            this.tRP.setVisible(false);
            this.tRP.gAC();
            this.tRN = false;
            fhy_2.gBq().eHS();
        }
    }

    private void gsI() {
        if (!this.tRN) {
            int n;
            fsm_1 fsm_12 = this.tRP.getPrefSize();
            int n2 = fsm_12.width;
            int n3 = fsm_12.height;
            int n4 = this.getDisplayX();
            int n5 = this.getDisplayY();
            fbj_1 fbj_12 = fbj_1.getInstance();
            faa_2 faa_22 = this.tCX;
            faa_2 faa_23 = this.tQJ;
            int n6 = this.getDisplayY() + faa_22.uT(this.getHeight()) - faa_23.uT(n3);
            if (n6 < 0 || n6 > fbj_12.getAppearance().getContentHeight() - n3) {
                faa_22 = faa_22.gse();
                faa_23 = faa_23.gse();
            }
            n6 = this.getDisplayY() + faa_22.uT(this.getHeight()) - faa_23.uT(n3);
            n6 = Math.max(0, Math.min(n6, fbj_12.getAppearance().getContentHeight() - n3));
            if (n5 - n3 < 0 && n5 + this.getHeight() + n3 > fbj_12.getHeight()) {
                n3 = n5;
                n6 = 0;
            }
            if ((n = n4 + faa_22.uS(this.getWidth()) - faa_23.uS(n2)) < 0 || n > fbj_12.getAppearance().getContentWidth() - n2) {
                faa_22 = faa_22.gsd();
                faa_23 = faa_23.gsd();
            }
            n = this.getDisplayX() + faa_22.uS(this.getWidth()) - faa_23.uS(n2);
            n = Math.max(0, Math.min(n, fbj_12.getAppearance().getContentWidth() - n2));
            if (n4 - n2 < 0 && n4 + this.getWidth() + n2 > fbj_12.getWidth()) {
                n2 = n4;
                n = 0;
            }
            this.tRP.setSizeToPrefSize();
            n2 = Math.max(this.tRP.getWidth(), n2);
            n3 = Math.max(this.tRP.getHeight(), n3);
            this.tRP.setSize(n2, n3);
            this.tRP.setPosition(n, n6);
            this.tRP.setNonBlocking(false);
            this.tRP.setVisible(true);
            fbj_12.getLayeredContainer().d(this.tRP, 29500);
            this.tRN = true;
            this.tRO = true;
            fhy_2.gBq().eHR();
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        fbj_1.getInstance().b(fzq_0.tJS, this.tND, false);
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        fbj_1.getInstance().b(fzq_0.tJF, this.tNK, true);
        this.mTP = null;
        this.tND = null;
        this.tNK = null;
        this.tCX = null;
        this.tQJ = null;
        this.nax = true;
        this.tRP.gAD();
        this.tRP = null;
        this.tRQ = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fbl_1 fbl_12 = new fbl_1(this);
        fbl_12.aVI();
        this.a(fbl_12);
        this.tRP = faw_2.checkOut();
        this.tRQ = faw_2.checkOut();
        this.ukD = false;
        this.c(fbj_1.getInstance());
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fbg_2 fbg_22 = (fbg_2)fhi_22;
        super.a(fbg_22);
        fbg_22.nax = this.nax;
        fes_2 fes_22 = (fes_2)this.tRP.gAK();
        fes_22.ukM = false;
        fes_22.gAF();
        fbg_22.d(fes_22);
        fbg_22.b(fzq_0.tJS, this.tND, false);
        fbg_22.b(fzq_0.tJT, this.mTP, false);
        fbg_22.b(fzq_0.tJF, this.tND, false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1597976017) {
            this.setCloseOnClick(Bw.aK(string));
        } else if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(faa_2.tI(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1597976017) {
            this.setCloseOnClick(Bw.l(object));
        } else if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == 1905963320) {
            this.setHotSpotPosition((faa_2)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

