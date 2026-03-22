/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fIS
 */
public final class fis_2 {
    private int uuw;
    private int djV;
    private boolean utH;
    private fsm_1 ukw;
    private String uCS;
    private String uCT;

    @Generated
    public fis_2() {
    }

    @Generated
    public int getMaxCharacters() {
        return this.uuw;
    }

    @Generated
    public int getMaxWidth() {
        return this.djV;
    }

    @Generated
    public boolean isMultiline() {
        return this.utH;
    }

    @Generated
    public fsm_1 getPrefSize() {
        return this.ukw;
    }

    @Generated
    public String gCz() {
        return this.uCS;
    }

    @Generated
    public String getRestrict() {
        return this.uCT;
    }

    @Generated
    public void setMaxCharacters(int n) {
        this.uuw = n;
    }

    @Generated
    public void setMaxWidth(int n) {
        this.djV = n;
    }

    @Generated
    public void setMultiline(boolean bl) {
        this.utH = bl;
    }

    @Generated
    public void setPrefSize(fsm_1 fsm_12) {
        this.ukw = fsm_12;
    }

    @Generated
    public void vL(String string) {
        this.uCS = string;
    }

    @Generated
    public void setRestrict(String string) {
        this.uCT = string;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fis_2)) {
            return false;
        }
        fis_2 fis_22 = (fis_2)object;
        if (this.getMaxCharacters() != fis_22.getMaxCharacters()) {
            return false;
        }
        if (this.getMaxWidth() != fis_22.getMaxWidth()) {
            return false;
        }
        if (this.isMultiline() != fis_22.isMultiline()) {
            return false;
        }
        fsm_1 fsm_12 = this.getPrefSize();
        fsm_1 fsm_13 = fis_22.getPrefSize();
        if (fsm_12 == null ? fsm_13 != null : !((Object)fsm_12).equals(fsm_13)) {
            return false;
        }
        String string = this.gCz();
        String string2 = fis_22.gCz();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getRestrict();
        String string4 = fis_22.getRestrict();
        return !(string3 == null ? string4 != null : !string3.equals(string4));
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.getMaxCharacters();
        n2 = n2 * 59 + this.getMaxWidth();
        n2 = n2 * 59 + (this.isMultiline() ? 79 : 97);
        fsm_1 fsm_12 = this.getPrefSize();
        n2 = n2 * 59 + (fsm_12 == null ? 43 : ((Object)fsm_12).hashCode());
        String string = this.gCz();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.getRestrict();
        n2 = n2 * 59 + (string2 == null ? 43 : string2.hashCode());
        return n2;
    }

    @Generated
    public String toString() {
        return "TextEditorParameters(m_maxCharacters=" + this.getMaxCharacters() + ", m_maxWidth=" + this.getMaxWidth() + ", m_multiline=" + this.isMultiline() + ", m_prefSize=" + String.valueOf(this.getPrefSize()) + ", m_defaultText=" + this.gCz() + ", m_restrict=" + this.getRestrict() + ")";
    }
}

