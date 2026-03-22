/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fRC
 */
public class frc_1
extends fha_2 {
    public static final String TAG = "Spring";
    static final Logger vah = Logger.getLogger(frc_1.class);
    private int aQL = 0;
    private String vai;
    private String vaj;
    private String vak;
    public static final int val = 3108285;
    public static final int vam = -487784248;
    public static final int van = 1384965862;
    public static final int vao = 111972721;

    public String getEdge() {
        return this.vaj;
    }

    public void setEdge(String string) {
        this.vaj = string;
    }

    public String getReferentEdge() {
        return this.vak;
    }

    public void setReferentEdge(String string) {
        this.vak = string;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getValue() {
        return this.aQL;
    }

    public void setValue(int n) {
        this.aQL = n;
    }

    public String toString() {
        return Integer.toString(this.getValue());
    }

    public static frc_1 a(frc_1 frc_12, frc_1 frc_13) {
        return new frh_1(frc_12, frc_13);
    }

    public static frc_1 b(frc_1 frc_12, frc_1 frc_13) {
        return frc_1.a(frc_12, new frf_1(frc_13));
    }

    public static frc_1 acc(int n) {
        return new frd_1(n);
    }

    public static frc_1 z(fes_2 fes_22) {
        return new fri_1(fes_22);
    }

    public static frc_1 A(fes_2 fes_22) {
        return new fre_1(fes_22);
    }

    public static frc_1 B(fes_2 fes_22) {
        return new frj_1(fes_22);
    }

    public static frc_1 C(fes_2 fes_22) {
        return new frk_1(fes_22);
    }

    public String getReferentId() {
        return this.vai;
    }

    public void setReferentId(String string) {
        this.vai = string;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vaj = null;
        this.vak = null;
        this.vai = null;
        this.aQL = 0;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 3108285) {
            this.setEdge(fic_12.a(string, this.nQt));
        } else if (n == -487784248) {
            this.setReferentEdge(fic_12.a(string, this.nQt));
        } else if (n == 1384965862) {
            this.setReferentId(fic_12.a(string, this.nQt));
        } else if (n == 111972721) {
            this.setValue(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

