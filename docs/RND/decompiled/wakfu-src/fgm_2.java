/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGm
 */
public class fgm_2
extends fhv_1 {
    public static final String TAG = "tableColumn";
    private String p;
    private String dFo;
    private String usM;
    private faa_2 usN = faa_2.tLO;
    private int uqT;
    private int usO;
    private boolean usP;
    private final fjf_1 usQ = new fjf_1();
    private boolean bmg = true;
    private fgn_2 usR;
    public static final int usS = 3373707;
    public static final int usT = 97427706;
    public static final int usU = 1662225400;
    public static final int usV = -855241956;
    public static final int usW = -623419631;
    public static final int usX = 1622491524;
    public static final int usY = 466743410;
    public static final int usZ = 0x666E6DD6;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fje_2) {
            this.usQ.aB((fje_2)fhv_12);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fjf_1 getRendererManager() {
        return this.usQ;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public String getField() {
        return this.dFo;
    }

    public void setField(String string) {
        this.dFo = string;
    }

    public boolean getSortable() {
        return this.usP;
    }

    public void setSortable(boolean bl) {
        this.usP = bl;
    }

    public int getColumnIndex() {
        return this.usO;
    }

    public void setColumnIndex(int n) {
        this.usO = n;
    }

    public String getColumnId() {
        return this.usM;
    }

    public void setColumnId(String string) {
        this.usM = string;
    }

    public int getCellWidth() {
        return this.uqT;
    }

    public void setCellWidth(int n) {
        this.uqT = n;
    }

    public void setVisible(boolean bl) {
        boolean bl2 = this.bmg != bl;
        this.bmg = bl;
        if (bl2 && this.usR != null) {
            this.usR.a(this, bl);
        }
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public faa_2 getHeaderAlignment() {
        return this.usN;
    }

    public void setHeaderAlignment(faa_2 faa_22) {
        this.usN = faa_22;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fgm_2 fgm_22 = (fgm_2)fhi_22;
        fgm_22.setName(this.p);
        fgm_22.setField(this.dFo);
        fgm_22.setSortable(this.usP);
        fgm_22.setColumnIndex(this.usO);
        fgm_22.setColumnId(this.usM);
        fgm_22.setCellWidth(this.uqT);
        fgm_22.setVisible(this.bmg);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.p = null;
        this.dFo = null;
        this.usM = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.usO = -1;
        this.uqT = 30;
        this.usP = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 3373707) {
            this.setName(fic_12.a(string, this.nQt));
        } else if (n == 97427706) {
            this.setField(string);
        } else if (n == 1662225400) {
            this.setSortable(Bw.aK(string));
        } else if (n == -855241956) {
            this.setColumnIndex(Bw.m(string));
        } else if (n == -623419631) {
            this.setColumnId(string);
        } else if (n == 1622491524) {
            this.setCellWidth(Bw.m(string));
        } else if (n == 466743410) {
            this.setVisible(Bw.aK(string));
        } else if (n == 0x666E6DD6) {
            this.setHeaderAlignment(faa_2.tI(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3373707) {
            this.setName((String)object);
        } else if (n == 97427706) {
            this.setField((String)object);
        } else if (n == 1662225400) {
            this.setSortable(Bw.l(object));
        } else if (n == -855241956) {
            this.setColumnIndex(Bw.m(object));
        } else if (n == -623419631) {
            this.setColumnId((String)object);
        } else if (n == 466743410) {
            this.setVisible(Bw.l(object));
        } else if (n == 0x666E6DD6) {
            this.setHeaderAlignment((faa_2)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    public void setVisibilityListener(fgn_2 fgn_22) {
        this.usR = fgn_22;
    }

    public String toString() {
        return "TableColumn{m_name='" + this.p + "', m_columnId='" + this.usM + "', m_columnIndex=" + this.usO + "}";
    }
}

