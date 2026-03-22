/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from fIB
 */
public class fib_2 {
    protected static final Logger uBG = Logger.getLogger(fib_2.class);
    private static fib_2 uBH;
    private fes_2 tCV;
    private boolean uBI = false;
    private faa_2 uBJ = faa_2.tLQ;
    private int bRf = 0;
    private int bRg = 0;
    private int bap = 0;
    private int baq = 0;
    private byte uBK = (byte)-1;
    protected final TByteObjectHashMap<fia_1> uBL = new TByteObjectHashMap();

    protected fib_2() {
        uBH = this;
        this.uBL.put((byte)1, (Object)new fic_2(this));
        this.uBL.put((byte)2, (Object)new fid_1(this));
        this.uBL.put((byte)3, (Object)new fie_1(this));
    }

    public void setWidget(fes_2 fes_22) {
        this.tCV = fes_22;
    }

    public static fib_2 gBU() {
        if (uBH == null) {
            uBH = new fib_2();
        }
        return uBH;
    }

    public void hc(int n, int n2) {
        this.bap = n;
        this.baq = n2;
        this.bnK();
    }

    public void bnK() {
        if (this.tCV != null) {
            int n = this.bap - this.uBJ.uS(this.tCV.getWidth()) + this.bRf;
            int n2 = this.baq - this.uBJ.uT(this.tCV.getHeight()) + this.bRg - this.tCV.getHeight() / 2;
            this.tCV.setPosition(n, n2);
        }
    }

    public void a(String string, String string2, int n, int n2, faa_2 faa_22) {
        fiz_2 fiz_22 = this.aP(string, string2);
        if (fiz_22 == null) {
            uBG.warn((Object)("Impossible de cr\u00e9er les data pour iconUrl=" + string + " et text=" + string2));
            return;
        }
        this.a(fiz_22, n, n2, faa_22);
    }

    public void a(fiz_2 fiz_22, int n, int n2, faa_2 faa_22) {
        fes_2 fes_22;
        this.eKH();
        this.uBK = fiz_22.aFW();
        fia_1 fia_12 = (fia_1)this.uBL.get(fiz_22.aFW());
        if (fia_12 == null) {
            return;
        }
        try {
            fes_22 = fia_12.a(fiz_22);
        }
        catch (Exception exception) {
            uBG.error((Object)"Exception levee", (Throwable)exception);
            return;
        }
        if (fes_22 == null) {
            return;
        }
        this.setWidget(fes_22);
        this.setXOffset(n);
        this.setYOffset(n2);
        this.a(faa_22);
        this.cDD();
        fes_22.grg();
        this.hc(fhz_2.gAS().getX(), fhz_2.gAS().getY());
    }

    private fiz_2 aP(String string, String string2) {
        if (string != null && string2 != null) {
            return new fig_1(string, string2);
        }
        if (string != null) {
            return new fif_1(string);
        }
        if (string2 != null) {
            return new fih_2(string2);
        }
        return null;
    }

    public void cDD() {
        if (this.uBI) {
            return;
        }
        fbw_1 fbw_12 = fyw_0.gqw().gqD().getMasterRootContainer().getLayeredContainer();
        fbw_12.d(this.tCV, 40000);
        this.uBI = true;
    }

    public void eKH() {
        if (this.tCV == null || !this.uBI) {
            return;
        }
        fia_1 fia_12 = (fia_1)this.uBL.get(this.uBK);
        if (fia_12 == null) {
            return;
        }
        fia_12.e(this.tCV);
        this.tCV = null;
        this.uBI = false;
    }

    public faa_2 gBV() {
        return this.uBJ;
    }

    public void a(faa_2 faa_22) {
        this.uBJ = faa_22;
        this.bnK();
    }

    public int getXOffset() {
        return this.bRf;
    }

    public void setXOffset(int n) {
        this.bRf = n;
        this.bnK();
    }

    public int getYOffset() {
        return this.bRg;
    }

    public void setYOffset(int n) {
        this.bRg = n;
        this.bnK();
    }

    fes_2 vC(String string) {
        return this.a(string, null, null);
    }

    fes_2 vD(String string) {
        return this.a(null, string, null);
    }

    fes_2 aQ(String string, String string2) {
        return this.a(string, string2, null);
    }

    private fes_2 c(String string, fhs_2 fhs_22) {
        if (fhs_22 == null) {
            fhs_22 = this.gBW();
        }
        try {
            fbt_1 fbt_12 = new fbt_1();
            URL uRL = fo_0.bA(string);
            fze fze2 = new fze();
            fze2.aVI();
            fze2.setPixmap(new awg_1(fmu_1.gEF().k(uRL)));
            fbt_12.aVI();
            fbt_12.setNonBlocking(true);
            fbt_12.setExpandable(false);
            fbt_12.d(fze2);
            fbt_12.gsR();
            fbt_12.setId("image");
            fhs_22.a(fbt_12.getId(), fbt_12);
            fbt_12.setElementMap(fhs_22);
            fbt_12.setSizeToPrefSize();
            return fbt_12;
        }
        catch (MalformedURLException malformedURLException) {
            uBG.warn((Object)("URL malform\u00e9e : \"" + string + "\""));
            return null;
        }
    }

    private fes_2 d(String string, fhs_2 fhs_22) {
        if (fhs_22 == null) {
            fhs_22 = this.gBW();
        }
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setExpandable(false);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("White14Bordered");
        fdy_12.setText(string);
        fdy_12.setSizeToPrefSize();
        fdy_12.setId("text");
        fhs_22.a(fdy_12.getId(), fdy_12);
        fdy_12.setElementMap(fhs_22);
        fdy_12.onChildrenAdded();
        return fdy_12;
    }

    private fhs_2 gBW() {
        return new fhs_2("test", fyw_0.gqw().gqC());
    }

    private fes_2 a(String string, String string2, fhs_2 fhs_22) {
        frb_1 frb_12;
        fes_2 fes_22;
        if (fhs_22 == null) {
            fhs_22 = this.gBW();
        }
        frz_2 frz_22 = new frz_2();
        frz_22.aVI();
        frz_22.setAlign(faa_2.tLL);
        frz_22.setHorizontal(false);
        faw_2 faw_22 = new faw_2();
        faw_22.aVI();
        faw_22.setLayoutManager(frz_22);
        if (string != null) {
            fes_22 = this.c(string, fhs_22);
            frb_12 = new frb_1();
            frb_12.aVI();
            frb_12.setAlign(faa_2.tLN);
            fes_22.setExpandable(false);
            fes_22.setLayoutData(frb_12);
            faw_22.d(fes_22);
        }
        if (string2 != null) {
            fes_22 = this.d(string2, fhs_22);
            frb_12 = new frb_1();
            frb_12.aVI();
            frb_12.setAlign(faa_2.tLN);
            fes_22.setExpandable(false);
            fes_22.setLayoutData(frb_12);
            faw_22.d(fes_22);
        }
        faw_22.setElementMap(fhs_22);
        faw_22.setPack(true);
        faw_22.guy();
        faw_22.onChildrenAdded();
        return faw_22;
    }

    public void setText(String string) {
        if (this.tCV == null) {
            return;
        }
        fhv_1 fhv_12 = this.tCV.getElementMap().uH("text");
        if (fhv_12 == null) {
            return;
        }
        ((fdy_1)fhv_12).setText(string);
        this.bnK();
    }

    public void setIconUrl(String string) {
        if (this.tCV == null) {
            return;
        }
        fhv_1 fhv_12 = this.tCV.getElementMap().uH("image");
        if (fhv_12 == null) {
            return;
        }
        try {
            URL uRL = fo_0.bA(string);
            fze fze2 = new fze();
            fze2.aVI();
            fze2.setPixmap(new awg_1(fmu_1.gEF().k(uRL)));
            fhv_12.d(fze2);
            this.bnK();
        }
        catch (MalformedURLException malformedURLException) {
            uBG.warn((Object)("URL malform\u00e9e : \"" + string + "\""));
        }
    }

    public boolean bjv() {
        return this.tCV == null;
    }

    public boolean isVisible() {
        return this.tCV != null && this.tCV.isVisible();
    }
}

