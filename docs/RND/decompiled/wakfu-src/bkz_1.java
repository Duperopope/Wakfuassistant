/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkZ
 */
public class bkz_1
implements aeh_2 {
    public static final String isH = "name";
    public static final String isI = "color";
    public static final String isJ = "index";
    public static final String isK = "selected";
    public static final String isL = "isMarket";
    public static final String isM = "isReadOnly";
    public static final String isN = "hovered";
    public static final String isO = "remainingCapacity";
    public static final String isP = "textColor";
    public static final String[] isQ = new String[]{"name", "color", "index", "selected", "isMarket", "isReadOnly", "hovered", "remainingCapacity", "textColor"};
    private final String isR;
    private String p;
    private axb_2 chO;
    private axb_2 isS;
    private short cLw;
    private boolean bWn;
    private boolean ikU;
    private boolean isT;
    private int duV;
    private int isU;

    public bkz_1(String string, String string2, axb_2 axb_22, short s) {
        this(string, string2, axb_22, s, false);
    }

    public bkz_1(String string, String string2, axb_2 axb_22, short s, boolean bl) {
        this.isR = string;
        this.p = string2;
        this.g(axb_22);
        this.cLw = s;
        this.isT = bl;
    }

    @Override
    public String[] bxk() {
        return isQ;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (isH.equals(string)) {
            return this.p;
        }
        if (isI.equals(string)) {
            return this.chO;
        }
        if (isJ.equals(string)) {
            return this.cLw;
        }
        if (isL.equals(string)) {
            return false;
        }
        if (isM.equals(string)) {
            return this.isT;
        }
        if (isK.equals(string)) {
            return this.bWn;
        }
        if (isN.equals(string)) {
            return this.ikU;
        }
        if (isO.equals(string)) {
            return this.duV > 0 ? String.format("%d/%d", this.isU, this.duV) : null;
        }
        if (isP.equals(string)) {
            return this.isS;
        }
        return null;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    public void gk(boolean bl) {
        this.ikU = bl;
    }

    public void setName(String string) {
        this.p = string;
    }

    public final void g(axb_2 axb_22) {
        this.chO = new awx_2(axb_22, 0.75f);
        this.isS = blb_1.i(axb_22) ? awx_2.dnF : awx_2.dnG;
    }

    public void bv(short s) {
        this.cLw = s;
    }

    public void rk(int n) {
        this.duV = n;
    }

    public void DB(int n) {
        this.isU = n;
    }

    public String getName() {
        return this.p;
    }

    public axb_2 getColor() {
        return this.chO;
    }

    public short bEr() {
        return this.cLw;
    }

    public boolean bqr() {
        return this.bWn;
    }

    public boolean dtk() {
        return this.isT;
    }

    public int ajt() {
        return this.duV;
    }

    public int dtl() {
        return this.isU;
    }

    public boolean isFull() {
        return this.isU >= this.duV;
    }

    public String getId() {
        return this.isR;
    }

    public boolean chv() {
        return false;
    }

    public String toString() {
        return "AccountChestListEntryView{m_id='" + this.isR + "', m_name='" + this.p + "', m_color=" + String.valueOf(this.chO) + ", m_index=" + this.cLw + ", m_selected=" + this.bWn + "}";
    }
}

