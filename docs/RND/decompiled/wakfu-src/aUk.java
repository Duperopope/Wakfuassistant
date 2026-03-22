/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aUk
implements aeh_2 {
    public static final String gxH = "name";
    public static final String gxI = "shortcuts";
    public static final String gxJ = "listFilter";
    private final String[] gxK = new String[]{"name", "shortcuts", "listFilter"};
    private ArrayList<aUl> cGV = new ArrayList();
    private final String gxL;
    private final fez_1 gxM = new fez_1();

    public aUk(String string) {
        this.gxL = string;
    }

    public void A(ArrayList<aUl> arrayList) {
        this.cGV = arrayList;
    }

    public String getName() {
        return this.gxL;
    }

    public void ke(String string) {
        this.gxM.bc(string);
    }

    @Override
    public String[] bxk() {
        return this.gxK;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return aum_0.cWf().c(this.gxL, new Object[0]);
            }
            case "shortcuts": {
                return this.cGV;
            }
            case "listFilter": {
                return this.gxM;
            }
        }
        return null;
    }
}

