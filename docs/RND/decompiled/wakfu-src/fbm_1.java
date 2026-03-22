/*
 * Decompiled with CFR 0.152.
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/*
 * Renamed from fBm
 */
public class fbm_1
extends fes_2
implements awh_1,
fzc {
    public static final String TAG = "FlippingImage";
    private final ArrayList<awg_1> tRZ = new ArrayList();
    ffq_1 tSa;
    protected fzw_0 ogW = fzw_0.tLg;
    private boolean tQh;
    private int bMn;
    private int bUj;
    private int tSb;
    private boolean btq;
    private fbn_1 tSc;
    boolean kuf;
    private boolean tSd;
    public static final int tSe = "textures".hashCode();
    public static final int tSf = -1992012396;
    public static final int tSg = 1538563234;
    public static final int tSh = -1984141450;
    public static final int tSi = -903579675;
    public static final int tSj = -1156593849;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        if (this.bVe != null && this.tSa.getEntity() != null) {
            this.bVe.g(this.tSa.getEntity());
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ogW = null;
        this.gsP();
        if (this.tSa != null) {
            awg_1 awg_12 = this.tSa.getPixmap();
            if (awg_12 != null) {
                awg_12.b(this);
            }
            this.tSa.aVH();
            this.tSa = null;
        }
    }

    private void gsP() {
        int n = this.tRZ.size();
        for (int i = 0; i < n; ++i) {
            this.tRZ.get(i).setTexture(null);
        }
        this.tRZ.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tSa = new ffq_1();
        this.tSa.aVI();
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
    }

    @Override
    public void grg() {
        if (this.tSa != null) {
            this.gsQ();
            this.tSa.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
        }
        super.grg();
    }

    public fzw_0 getAlign() {
        return this.ogW;
    }

    public void setAlign(fzw_0 fzw_02) {
        if (fzw_02 != this.ogW) {
            this.ogW = fzw_02;
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    private void gsQ() {
        if (this.tSa == null) {
            return;
        }
        awg_1 awg_12 = this.tSa.getPixmap();
        if (awg_12 == null) {
            return;
        }
        this.setMeshBoundsFromComponent(this.uki.getContentWidth(), this.uki.getContentHeight(), this.uki.getContentWidth(), this.uki.getContentHeight());
    }

    private void setMeshBoundsFromComponent(int n, int n2, int n3, int n4) {
        int n5 = this.ogW.cf(n, n3);
        int n6 = this.ogW.cg(n2, n4);
        this.setMeshBounds(n5, n6, n, n2);
    }

    private void setMeshBounds(int n, int n2, int n3, int n4) {
        this.tSa.setX(n);
        this.tSa.setY(n2);
        this.tSa.setWidth(n3);
        this.tSa.setHeight(n4);
    }

    public boolean gsR() {
        boolean bl = false;
        int n = this.getBiggestWidth();
        int n2 = this.getBiggestHeight();
        if (this.uku == null || this.uku.width != n || this.uku.height != n2) {
            this.setMinSize(new fsm_1(n, n2));
            bl = true;
        }
        return bl;
    }

    private int getBiggestWidth() {
        int n = 0;
        for (awg_1 awg_12 : this.tRZ) {
            int n2 = awg_12.getWidth();
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    private int getBiggestHeight() {
        int n = 0;
        for (awg_1 awg_12 : this.tRZ) {
            int n2 = awg_12.getHeight();
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tSd) {
            for (awg_1 awg_12 : this.tRZ) {
                if (awg_12.bHg().bPe()) continue;
                return true;
            }
            this.gsR();
            this.tSd = false;
        }
        if (this.tSa != null && (this.tQh || this.tSa.getPixmap() != null && this.tSa.getPixmap().bOX())) {
            boolean bl2 = this.gsR();
            this.gsQ();
            try {
                if (this.uki != null) {
                    this.tSa.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
                }
            }
            catch (NullPointerException nullPointerException) {
                uxJ.error((Object)("imageMesh = " + String.valueOf(this.tSa) + ", appearance = " + String.valueOf(this.uki)), (Throwable)nullPointerException);
            }
            if (bl2 && this.uko != null) {
                this.uko.gsm();
            }
            this.tQh = false;
        }
        return bl;
    }

    public String getShader() {
        return this.tSa.getShader();
    }

    public void setShader(String string) {
        this.tSa.setShader(string);
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.tSa != null) {
            this.tSa.setModulationColor(axb_22);
        }
    }

    @Override
    public axb_2 getModulationColor() {
        return this.tSa != null ? this.tSa.getModulationColor() : null;
    }

    @Override
    public void a(awg_1 awg_12) {
        this.tQh = true;
        this.setNeedsToPreProcess();
    }

    public void setPixmaps(String[] stringArray) {
        this.gsP();
        if (stringArray.length == 0) {
            return;
        }
        for (String string : stringArray) {
            this.tK(string);
        }
        this.setTextureIndex(0);
        this.gsR();
        this.tSd = true;
        this.setNeedsToPreProcess();
    }

    public void setTextures(Iterable<String> iterable) {
        this.tRZ.clear();
        for (String string : iterable) {
            this.tK(string);
        }
        this.setTextureIndex(0);
        this.gsR();
        this.tSd = true;
        this.setNeedsToPreProcess();
    }

    private void tK(String string) {
        try {
            URL uRL = fo_0.bA(string);
            if (!bl_0.a(uRL)) {
                uxJ.error((Object)("Impossible de charger la texture=" + string));
                return;
            }
            awk_1 awk_12 = fmu_1.gEF().k(uRL);
            this.tRZ.add(new awg_1(awk_12));
        }
        catch (MalformedURLException malformedURLException) {
            uxJ.error((Object)("Could not get url from textureUrl " + string), (Throwable)malformedURLException);
        }
    }

    public void setTextureIndex(int n) {
        this.bUj = n;
        if (n < 0 || n >= this.tRZ.size()) {
            uxJ.error((Object)("Index de texture inconnu=" + n));
            return;
        }
        this.tSa.setPixmap(this.tRZ.get(n));
        this.tQh = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fbm_1 fbm_12 = (fbm_1)fhi_22;
        super.a(fhi_22);
        fbm_12.setAlign(this.ogW);
        fbm_12.setModulationColor(this.getModulationColor());
        fbm_12.setShader(this.getShader());
        fbm_12.setDuration(this.bMn);
        fbm_12.setFlipCount(this.tSb);
        fbm_12.setVertical(this.kuf);
        fbm_12.ukM = true;
    }

    public void setDuration(int n) {
        this.bMn = n;
    }

    public void start() {
        if (this.tRZ.isEmpty()) {
            uxJ.error((Object)"Impossible de lancer le flip sans texture !!!");
            return;
        }
        this.btq = true;
        this.x(fbn_1.class);
        this.tSc = new fbn_1(this, Float.valueOf(0.0f), Float.valueOf((float)Math.PI * 2), 0, this.bMn, abn.cdp, this.tSb);
        this.a(this.tSc);
    }

    public void bhk() {
        this.btq = false;
        this.tSc.cbz();
        this.x(fbn_1.class);
    }

    public void setFlipCount(int n) {
        this.tSb = n;
        if (this.btq) {
            this.bhk();
        }
    }

    public void setVertical(boolean bl) {
        this.kuf = bl;
    }

    void gsS() {
        int n = this.bUj + 1;
        if (n >= this.tRZ.size()) {
            n = 0;
        }
        this.setTextureIndex(n);
    }

    public void gsT() {
        this.gsS();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1992012396) {
            this.setDuration(Bw.m(string));
        } else if (n == 1538563234) {
            this.setFlipCount(Bw.m(string));
        } else if (n == -1984141450) {
            this.setVertical(Bw.aK(string));
        } else if (n == -903579675) {
            this.setShader(string);
        } else if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == tSe) {
            if (object == null || object instanceof String[]) {
                this.setPixmaps((String[])object);
                return true;
            } else {
                if (!(object instanceof Iterable)) return false;
                this.setTextures((Iterable)object);
            }
            return true;
        } else if (n == -1992012396) {
            this.setDuration(Bw.m(object));
            return true;
        } else if (n == 1538563234) {
            this.setFlipCount(Bw.m(object));
            return true;
        } else if (n == -1984141450) {
            this.setVertical(Bw.l(object));
            return true;
        } else {
            if (n != -903579675) return super.setPropertyAttribute(n, object);
            this.setShader(Bw.k(object));
        }
        return true;
    }
}

