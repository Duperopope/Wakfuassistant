/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJy
 */
public class fjy_2
extends fjm_2 {
    public static final String TAG = "ListCondition";
    public static final String uEB = "evenIndex";
    public static final String uEC = "oddIndex";
    public static final String uED = "index";
    public static final String uEE = "tableIndex";
    public static final String uEF = "nthChild";
    public static final int uEG = -2034141178;
    public static final int uEH = 1349330650;
    private int uEI;
    private int uEJ;

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -2034141178) {
            this.setNthUnit(Integer.parseInt(fic_12.a(string, this.nQt)));
        } else if (n == 1349330650) {
            this.setNthChild(Integer.parseInt(fic_12.a(string, this.nQt)));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -2034141178) {
            this.setNthUnit(Integer.parseInt((String)object));
        } else if (n == 1349330650) {
            this.setNthChild(Integer.parseInt((String)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjy_2 fjy_22 = (fjy_2)fhi_22;
        fjy_22.uEI = this.uEI;
        fjy_22.uEJ = this.uEJ;
        super.a(fhi_22);
    }

    public void setNthUnit(int n) {
        this.uEI = n;
    }

    public void setNthChild(int n) {
        this.uEJ = n;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        Object object2;
        fcv_1 fcv_12;
        if (this.uEh) {
            object = this.uEg;
        }
        if (object instanceof fcv_1) {
            fcv_12 = (fcv_1)object;
        } else if (object instanceof fhv_1) {
            object2 = (fhv_1)object;
            fcv_12 = ((fhv_1)object2).getRenderableParent();
        } else {
            fcv_12 = this.getParentOfType(fcv_1.class);
        }
        if (fcv_12 == null) {
            return false;
        }
        object2 = fcv_12.getRenderableCollection();
        if (object2 == null) {
            return false;
        }
        if (this.cpF != null) {
            if (this.cpF.equalsIgnoreCase(uEB)) {
                int n = object2.getTableIndex(fcv_12);
                return this.uEb.isValid(n % 2 == 0);
            }
            if (this.cpF.equalsIgnoreCase(uEC)) {
                int n = object2.getTableIndex(fcv_12);
                return this.uEb.isValid(n % 2 != 0);
            }
            if (this.cpF.equalsIgnoreCase(uED)) {
                int n = object2.getItemIndex(fcv_12.getItemValue());
                return this.uEb.isValid(n);
            }
            if (this.cpF.equalsIgnoreCase(uEE)) {
                int n = object2.getTableIndex(fcv_12);
                return this.uEb.isValid(n);
            }
            if (this.cpF.equals(uEF)) {
                int n = object2.getTableIndex(fcv_12);
                return n % this.uEI == this.uEJ - 1;
            }
        }
        return false;
    }
}

