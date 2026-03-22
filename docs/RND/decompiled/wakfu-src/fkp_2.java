/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKp
 */
public abstract class fkp_2
extends fkn_2
implements fko_2 {
    protected String bdo = null;
    public static final int uGi = 102727412;
    public static final int uGj = 109757585;

    @Override
    public void setLabel(String string) {
        this.bdo = string;
    }

    @Override
    public void setState(String string) {
        this.setLabel(string);
    }

    @Override
    public String getLabel() {
        return this.bdo;
    }

    @Override
    public String getState() {
        return this.getLabel();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.bdo = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fkp_2 fkp_22 = (fkp_2)fhi_22;
        super.a(fkp_22);
        fkp_22.bdo = this.bdo;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 102727412 && n != 109757585) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setLabel(fic_12.a(string, this.nQt));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 102727412 && n != 109757585) {
            return super.setPropertyAttribute(n, object);
        }
        this.setLabel(String.valueOf(object));
        return true;
    }
}

