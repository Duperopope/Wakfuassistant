/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Font;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cHJ
 */
public class chj_2
extends feq_1 {
    private static final Logger nah = Logger.getLogger(chj_2.class);
    public static final String TAG = "interactiveBubble";
    public static final String nai = "buttonContainer";
    public static final String naj = "clickLabel";
    public static final String nak = "text";
    public static final String nal = "image";
    private final ArrayList<fad_1> nam = new ArrayList();
    private int nan;
    private int nao;
    private int nap;
    private String naq = "Arial Unicode MS";
    private int nar = 0;
    private int nas = 12;
    private boolean nat = false;
    private boolean nau = false;
    private boolean nav = true;
    private boolean naw = false;
    private boolean nax = true;
    private fis_1 nay = null;
    public static final int naz = -1393501002;
    public static final int naA = 163334105;
    public static final int naB = 3556653;
    public static final int naC = 1597976017;
    public static final int naD = 799849652;

    public void a(String string, fis_1 fis_12, boolean bl) {
        if (!this.naw) {
            fad_1 fad_12 = new fad_1();
            this.nam.add(fad_12);
            fad_12.aVI();
            fad_12.setText(string);
            fad_12.setExpandable(false);
            fad_12.a(fzq_0.tJU, fis_12, true);
            fad_12.setEnabled(bl);
            fes_2 fes_22 = this.getWidgetByThemeElementName(nai, false);
            if (fes_22 instanceof faw_2) {
                fes_22.d(fad_12);
            }
            fad_12.onChildrenAdded();
            fad_12.setStyle(TAG + this.getStyle() + "$button", true);
            fes_22 = this.getWidgetByThemeElementName(naj, false);
            if (fes_22 != null) {
                fes_22.setVisible(false);
            }
        } else {
            this.a(fzq_0.tJU, fis_12, true);
            fes_2 fes_23 = this.getWidgetByThemeElementName(naj, false);
            if (fes_23 != null) {
                fes_23.setVisible(true);
            }
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public chl_2 getAppearance() {
        return (chl_2)this.uki;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof chl_2;
    }

    public void k(int n, String string) {
        fad_1 fad_12 = this.nam.get(n);
        if (fad_12 != null) {
            fad_12.setText(string);
        }
    }

    public void a(int n, fis_1 fis_12, fis_1 fis_13) {
        chj_2 chj_22;
        fes_2 fes_22 = chj_22 = this.naw ? this : (fes_2)this.nam.get(n);
        if (chj_22 != null) {
            chj_22.b(fzq_0.tJU, fis_12, true);
            chj_22.a(fzq_0.tJU, fis_13, true);
        }
    }

    public void setText(String string) {
        fes_2 fes_22 = this.getWidgetByThemeElementName(nak, false);
        if (fes_22 != null && fes_22 instanceof fdz_1) {
            ((fdz_1)fes_22).setText(string);
        } else {
            nah.warn((Object)"Le champ de texte n'a pas \u00e9t\u00e9 d\u00e9fini dans le XML");
        }
    }

    public void setIconUrl(String string) {
        fes_2 fes_22 = this.getWidgetByThemeElementName(nal, false);
        if (fes_22 instanceof fbt_1) {
            awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false);
            if (awk_12 == null) {
                return;
            }
            fze fze2 = new fze();
            fze2.aVI();
            fze2.setPixmap(new awg_1(awk_12));
            fes_22.d(fze2);
        }
    }

    public boolean getActAsButton() {
        return this.naw;
    }

    public void setActAsButton(boolean bl) {
        if (bl != this.naw) {
            this.naw = bl;
        }
    }

    public final void setBubbleFontName(String string) {
        this.naq = string;
        this.bFM();
    }

    public final void setBubbleFontStyle(int n) {
        this.nar = n;
        this.bFM();
    }

    public final void setBubbleFontSize(int n) {
        this.nas = n;
        this.bFM();
    }

    public final void setBubbleText(String string) {
        this.setText(string);
    }

    public void setForcedDisplaySpark(boolean bl) {
        this.nau = true;
        this.nat = bl;
        chl_2 chl_22 = this.getAppearance();
        if (chl_22 != null && chl_22.getBubbleBorder() != null) {
            chl_22.getBubbleBorder().setDisplaySpark(this.nat);
        }
        if ((chl_22 = (chl_2)this.ukj) != null && chl_22.getBubbleBorder() != null) {
            chl_22.getBubbleBorder().setDisplaySpark(this.nat);
        }
    }

    public boolean isCloseOnClick() {
        return this.nax;
    }

    public void setCloseOnClick(boolean bl) {
        if (this.nax != bl) {
            this.nax = bl;
            this.jS(this.nax);
        }
    }

    private void jS(boolean bl) {
        if (bl) {
            if (this.nay != null) {
                this.b(fzq_0.tJU, this.nay, false);
            }
            this.nay = new chk_2(this);
            this.a(fzq_0.tJU, this.nay, false);
        } else {
            this.b(fzq_0.tJU, this.nay, false);
        }
    }

    public void clear() {
        this.gAD();
    }

    public void reset() {
        this.setText("");
        for (int i = this.nam.size() - 1; i >= 0; --i) {
            this.nam.get(i).gAD();
        }
        this.nam.clear();
    }

    public final void eKG() {
        this.setVisible(true);
    }

    public final void eKH() {
        this.setVisible(false);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        chj_2 chj_22 = (chj_2)fhi_22;
        if (this.nau) {
            chj_22.setForcedDisplaySpark(this.nat);
        }
        this.setActAsButton(this.naw);
        this.setCloseOnClick(this.nax);
    }

    @Override
    public void eKI() {
        super.eKI();
        this.jS(this.nax);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.nam.clear();
        this.nay = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        Font font = new Font(this.naq, this.nar, this.nas);
        this.nau = false;
        this.nat = false;
        this.nav = true;
        this.naw = false;
        this.nax = true;
        chl_2 chl_22 = new chl_2();
        chl_22.aVI();
        chl_22.setWidget(this);
        this.d(chl_22);
        this.setNeedsToPostProcess();
    }

    @Override
    public final boolean LY(int n) {
        super.LY(n);
        return true;
    }

    @Override
    public final void bFM() {
        super.bFM();
        this.a(this.getTarget(), this.nan, this.nao, this.nap);
    }

    @Override
    public void a(WQ wQ, int n, int n2, int n3) {
        Object object;
        boolean bl;
        if (!this.isUseTargetPositionning()) {
            return;
        }
        this.nan = n;
        this.nao = n2;
        this.nap = n3;
        boolean bl2 = bl = this.nau ? this.nat : true;
        if (!this.nat) {
            float f2;
            object = fyw_0.gqw().gqD();
            float f3 = ((axq_1)object).bRq();
            float f4 = ((axq_1)object).bRr();
            float f5 = (float)n + f3 * 0.5f;
            if (f5 < 0.0f || f5 > f3) {
                bl = false;
            }
            if ((f2 = (float)n2 + f4 * 0.5f + (float)n3) < 0.0f || f2 > f4) {
                bl = false;
            }
        }
        if (bl != this.nav && (object = this.getAppearance()) != null && ((chl_2)object).getBubbleBorder() != null) {
            ((chl_2)object).getBubbleBorder().setDisplaySpark(bl);
            this.nav = bl;
        }
        super.a(wQ, n, n2 + n3, 0);
    }

    @Override
    public acc_1 getComputedPosition(int n, int n2, int n3) {
        return this.getPositionWithOutOfScreen(n, n2, n3);
    }

    @Override
    public void setOffset(int n, int n2) {
        super.setOffset(n, n2);
    }

    @Override
    public String toString() {
        fes_2 fes_22 = this.getWidgetByThemeElementName(nak, false);
        String string = "";
        if (fes_22 != null && fes_22 instanceof fdz_1) {
            string = ((fdz_1)fes_22).getText();
        }
        return "InteractiveBubble{m_text=" + string + ", m_targetX=" + this.nan + ", m_targetY=" + this.nao + ", m_screenX=" + this.getDisplayX() + ", m_screenY=" + this.getDisplayY() + "}";
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1393501002) {
            this.setActAsButton(Bw.aK(string));
        } else if (n == 163334105) {
            this.setBubbleText(fic_12.a(string, this.nQt));
        } else if (n == 3556653) {
            this.setText(fic_12.a(string, this.nQt));
        } else if (n == 1597976017) {
            this.setCloseOnClick(Bw.aK(string));
        } else if (n == 799849652) {
            this.setForcedDisplaySpark(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1393501002) {
            this.setActAsButton(Bw.l(object));
        } else if (n == 163334105) {
            if (object == null) {
                this.setBubbleText(null);
            } else {
                this.setBubbleText(String.valueOf(object));
            }
        } else if (n == 3556653) {
            if (object == null) {
                this.setText(null);
            } else {
                this.setText(String.valueOf(object));
            }
        } else if (n == 1597976017) {
            this.setCloseOnClick(Bw.l(object));
        } else if (n == 799849652) {
            this.setForcedDisplaySpark(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    static /* synthetic */ fhs_2 a(chj_2 chj_22) {
        return chj_22.nQt;
    }
}

