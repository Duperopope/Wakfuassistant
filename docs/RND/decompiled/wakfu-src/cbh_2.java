/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cbH
 */
public class cbh_2
implements aef_2 {
    public static final String lJC = "widthInput";
    public static final String lJD = "heightInput";
    public static final String lJE = "textureInput";
    public static final String lJF = "withStatesInput";
    public static final String lJG = "gapInput";
    public static final String lJH = "xWestInput";
    public static final String lJI = "xCenterInput";
    public static final String lJJ = "xEastInput";
    public static final String lJK = "yNorthInput";
    public static final String lJL = "yCenterInput";
    public static final String lJM = "ySouthInput";
    public static final String lJN = "westWidthInput";
    public static final String lJO = "centerWidthInput";
    public static final String lJP = "eastWidthInput";
    public static final String lJQ = "northHeightInput";
    public static final String lJR = "centerHeightInput";
    public static final String lJS = "southHeightInput";
    public static final String lJT = "width";
    public static final String lJU = "height";
    public static final String lJV = "texture";
    public static final String lJW = "isValid";
    public static final String lJX = "output";
    public static final String lJY = "textureList";
    public static final String lJZ = "<pixmapBackground scaled=\"true\">\n";
    public static final String lKa = "</pixmapBackground>\n";
    public static final String lKb = "\t<Pixmap texture=\"%s\" position=\"%s\" x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"/>\n";
    private final List<String> lKc = new ArrayList<String>(fyw_0.gqw().gqB().gAm());
    private int brs;
    private int brt;
    private String lKd;
    private boolean lKe;
    private int bSO;
    private int lKf;
    private int lKg;
    private int lKh;
    private int lKi;
    private int lKj;
    private int lKk;
    private int lKl;
    private int lKm;
    private int lKn;
    private int lKo;
    private int lKp;
    private int lKq;
    private String lKr;
    public static final String[] lKs = new String[]{"widthInput", "heightInput", "textureInput", "gapInput", "withStatesInput", "xWestInput", "xCenterInput", "xEastInput", "yNorthInput", "yCenterInput", "ySouthInput", "westWidthInput", "centerWidthInput", "eastWidthInput", "northHeightInput", "centerHeightInput", "southHeightInput", "width", "height", "texture", "isValid", "output", "textureList"};

    public cbh_2() {
        this.lKc.sort((string, string2) -> {
            boolean bl = string.startsWith("tx");
            boolean bl2 = string2.startsWith("tx");
            if (bl && !bl2) {
                return -1;
            }
            if (!bl && bl2) {
                return 1;
            }
            return string.compareTo((String)string2);
        });
    }

    @Override
    public String[] bxk() {
        return lKs;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "width": {
                return this.brs;
            }
            case "height": {
                return this.brt;
            }
            case "texture": {
                return this.lKd;
            }
            case "isValid": {
                return this.isValid();
            }
            case "textureList": {
                return this.lKc;
            }
            case "output": {
                if (this.lKr == null) break;
                return this.lKr.replace("<", "&lt;").replace(">", "&gt;");
            }
        }
        return null;
    }

    private boolean isValid() {
        if (this.lKd == null || this.lKd.isEmpty()) {
            return false;
        }
        return fyw_0.gqw().gqB().uF(this.lKd) != null;
    }

    @Override
    public void c(String string, Object object) {
        switch (string) {
            case "widthInput": {
                this.brs = cbh_2.av(object);
                fse_1.gFu().a((aef_2)this, lJT);
                break;
            }
            case "heightInput": {
                this.brt = cbh_2.av(object);
                fse_1.gFu().a((aef_2)this, lJU);
                break;
            }
            case "textureInput": {
                this.lKd = object.toString();
                fse_1.gFu().a((aef_2)this, lJV);
                break;
            }
            case "withStatesInput": {
                this.lKe = Boolean.parseBoolean(object.toString());
                break;
            }
            case "gapInput": {
                this.bSO = cbh_2.av(object);
                break;
            }
            case "xWestInput": {
                this.lKf = cbh_2.av(object);
                break;
            }
            case "xCenterInput": {
                this.lKg = cbh_2.av(object);
                break;
            }
            case "xEastInput": {
                this.lKh = cbh_2.av(object);
                break;
            }
            case "yNorthInput": {
                this.lKi = cbh_2.av(object);
                break;
            }
            case "yCenterInput": {
                this.lKj = cbh_2.av(object);
                break;
            }
            case "ySouthInput": {
                this.lKk = cbh_2.av(object);
                break;
            }
            case "westWidthInput": {
                this.lKl = cbh_2.av(object);
                break;
            }
            case "centerWidthInput": {
                this.lKm = cbh_2.av(object);
                break;
            }
            case "eastWidthInput": {
                this.lKn = cbh_2.av(object);
                break;
            }
            case "northHeightInput": {
                this.lKo = cbh_2.av(object);
                break;
            }
            case "centerHeightInput": {
                this.lKp = cbh_2.av(object);
                break;
            }
            case "southHeightInput": {
                this.lKq = cbh_2.av(object);
            }
        }
    }

    private static int av(Object object) {
        if (!(object instanceof String)) {
            return 0;
        }
        String string = (String)object;
        if (BH.aU(string)) {
            return 0;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public boolean hP(String string) {
        return string.endsWith("Input");
    }

    public fkd_1 erZ() {
        fkd_1 fkd_12 = fkd_1.checkOut();
        awk_1 awk_12 = null;
        if (!BH.aU(this.lKd)) {
            awk_12 = fyw_0.gqw().gqB().uF(this.lKd);
        }
        if (awk_12 == null) {
            return null;
        }
        fkd_12.setPixmaps(new awg_1(awk_12, this.lKf, this.lKi, this.lKl, this.lKo), new awg_1(awk_12, this.lKg, this.lKi, this.lKm, this.lKo), new awg_1(awk_12, this.lKh, this.lKi, this.lKn, this.lKo), new awg_1(awk_12, this.lKf, this.lKj, this.lKl, this.lKp), new awg_1(awk_12, this.lKg, this.lKj, this.lKm, this.lKp), new awg_1(awk_12, this.lKh, this.lKj, this.lKn, this.lKp), new awg_1(awk_12, this.lKf, this.lKk, this.lKl, this.lKq), new awg_1(awk_12, this.lKg, this.lKk, this.lKm, this.lKq), new awg_1(awk_12, this.lKh, this.lKk, this.lKn, this.lKq));
        fkd_12.setScaled(true);
        return fkd_12;
    }

    public void esa() {
        StringBuilder stringBuilder = new StringBuilder();
        fzy_0[] fzy_0Array = new fzy_0[]{fzy_0.tGa, fzy_0.tGg, fzy_0.tGe, fzy_0.tGc, fzy_0.tGb, fzy_0.tGh, fzy_0.tGf, fzy_0.tGd};
        if (this.lKe) {
            int n = 0;
            for (fzy_0 fzy_02 : fzy_0Array) {
                stringBuilder.append("<!-- ").append((Object)fzy_02).append(" -->\n");
                this.b(stringBuilder, n);
                n += this.brt + this.bSO;
            }
        } else {
            stringBuilder.append("<!-- ").append((Object)fzy_0.tGa.gry()).append(" -->\n");
            this.b(stringBuilder, 0);
        }
        this.lKr = stringBuilder.toString();
        fse_1.gFu().a((aef_2)this, lJX);
    }

    private void b(StringBuilder stringBuilder, int n) {
        stringBuilder.append(lJZ);
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLK.name(), this.lKf, n + this.lKi, this.lKl, this.lKo));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLL.name(), this.lKg, n + this.lKi, this.lKm, this.lKo));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLM.name(), this.lKh, n + this.lKi, this.lKn, this.lKo));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLN.name(), this.lKf, n + this.lKj, this.lKl, this.lKp));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLO.name(), this.lKg, n + this.lKj, this.lKm, this.lKp));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLP.name(), this.lKh, n + this.lKj, this.lKn, this.lKp));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLQ.name(), this.lKf, n + this.lKk, this.lKl, this.lKq));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLR.name(), this.lKg, n + this.lKk, this.lKm, this.lKq));
        stringBuilder.append(String.format(lKb, this.lKd, faa_2.tLS.name(), this.lKh, n + this.lKk, this.lKn, this.lKq));
        stringBuilder.append(lKa);
    }

    @Generated
    public List<String> esb() {
        return this.lKc;
    }

    @Generated
    public int getWidth() {
        return this.brs;
    }

    @Generated
    public int getHeight() {
        return this.brt;
    }

    @Generated
    public String esc() {
        return this.lKd;
    }

    @Generated
    public boolean esd() {
        return this.lKe;
    }

    @Generated
    public int getGap() {
        return this.bSO;
    }

    @Generated
    public int ese() {
        return this.lKf;
    }

    @Generated
    public int esf() {
        return this.lKg;
    }

    @Generated
    public int esg() {
        return this.lKh;
    }

    @Generated
    public int esh() {
        return this.lKi;
    }

    @Generated
    public int esi() {
        return this.lKj;
    }

    @Generated
    public int esj() {
        return this.lKk;
    }

    @Generated
    public int esk() {
        return this.lKl;
    }

    @Generated
    public int esl() {
        return this.lKm;
    }

    @Generated
    public int esm() {
        return this.lKn;
    }

    @Generated
    public int esn() {
        return this.lKo;
    }

    @Generated
    public int eso() {
        return this.lKp;
    }

    @Generated
    public int esp() {
        return this.lKq;
    }

    @Generated
    public String esq() {
        return this.lKr;
    }

    @Generated
    public void setWidth(int n) {
        this.brs = n;
    }

    @Generated
    public void setHeight(int n) {
        this.brt = n;
    }

    @Generated
    public void eh(String string) {
        this.lKd = string;
    }

    @Generated
    public void iW(boolean bl) {
        this.lKe = bl;
    }

    @Generated
    public void setGap(int n) {
        this.bSO = n;
    }

    @Generated
    public void Kz(int n) {
        this.lKf = n;
    }

    @Generated
    public void KA(int n) {
        this.lKg = n;
    }

    @Generated
    public void KB(int n) {
        this.lKh = n;
    }

    @Generated
    public void KC(int n) {
        this.lKi = n;
    }

    @Generated
    public void KD(int n) {
        this.lKj = n;
    }

    @Generated
    public void KE(int n) {
        this.lKk = n;
    }

    @Generated
    public void KF(int n) {
        this.lKl = n;
    }

    @Generated
    public void KG(int n) {
        this.lKm = n;
    }

    @Generated
    public void KH(int n) {
        this.lKn = n;
    }

    @Generated
    public void KI(int n) {
        this.lKo = n;
    }

    @Generated
    public void KJ(int n) {
        this.lKp = n;
    }

    @Generated
    public void KK(int n) {
        this.lKq = n;
    }

    @Generated
    public void nW(String string) {
        this.lKr = string;
    }

    @Generated
    public String toString() {
        return "NinePatchFieldProvider(m_width=" + this.getWidth() + ", m_height=" + this.getHeight() + ", m_texture=" + this.esc() + ", m_withStates=" + this.esd() + ", m_gap=" + this.getGap() + ", m_xWest=" + this.ese() + ", m_xCenter=" + this.esf() + ", m_xEast=" + this.esg() + ", m_yNorth=" + this.esh() + ", m_yCenter=" + this.esi() + ", m_ySouth=" + this.esj() + ", m_westWidth=" + this.esk() + ", m_centerWidth=" + this.esl() + ", m_eastWidth=" + this.esm() + ", m_northHeight=" + this.esn() + ", m_centerHeight=" + this.eso() + ", m_southHeight=" + this.esp() + ")";
    }
}

