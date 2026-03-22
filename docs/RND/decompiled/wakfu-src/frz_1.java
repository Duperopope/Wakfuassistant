/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fRZ
 */
public class frz_1
extends fha_2 {
    private static Logger oO = Logger.getLogger(frz_1.class);
    public static final String TAG = "TabItem";
    private fcu_1 vch = null;
    private boolean vci = false;
    private faw_2 vcj = null;
    private fze vck = null;
    private String bKP = null;
    private Boolean vcl = true;
    private boolean bmg = true;
    private final ArrayList<fsa_1> vcm = new ArrayList();
    private boolean vcn = false;
    public static final int vco = 3556653;
    public static final int vcp = -1609594047;
    public static final int vcq = 466743410;
    public static final int vcr = 1408414817;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fcu_1) {
            fdh_1 fdh_12;
            boolean bl = this.vch != null;
            this.setButton((fcu_1)fhv_12, true);
            if (bl && (fdh_12 = this.getParentOfType(fdh_1.class)) != null) {
                fdh_12.f(this);
            }
            return;
        }
        if (fhv_12 instanceof faw_2) {
            this.vcj = (faw_2)fhv_12;
            return;
        }
        if (fhv_12 instanceof fze) {
            if (this.vch != null) {
                this.vch.setPixmap((fze)fhv_12);
            }
            this.vck = (fze)fhv_12;
        }
        super.d(fhv_12);
    }

    public void a(fsa_1 fsa_12) {
        if (!this.vcm.contains(fsa_12)) {
            this.vcm.add(fsa_12);
        }
    }

    public void b(fsa_1 fsa_12) {
        this.vcm.remove(fsa_12);
    }

    public void pm(boolean bl) {
        for (int i = this.vcm.size() - 1; i >= 0; --i) {
            this.vcm.get(i).oB(bl);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean gFr() {
        return this.vci;
    }

    public fcu_1 getButton() {
        return this.vch;
    }

    public void setButton(fcu_1 fcu_12) {
        this.setButton(fcu_12, false);
    }

    public void setButton(fcu_1 fcu_12, boolean bl) {
        this.vch = fcu_12;
        this.vch.setEnabled(this.vcl);
        this.vch.setVisible(this.bmg);
        this.pm(this.bmg);
        this.vci = bl;
        if ((!this.vci || this.vcn) && this.bKP != null) {
            this.vch.setText(this.bKP);
        }
    }

    public faw_2 getData() {
        return this.vcj;
    }

    public void setData(faw_2 faw_22) {
        this.vcj = faw_22;
    }

    public String getText() {
        return this.bKP;
    }

    public void setText(String string) {
        this.bKP = string;
        if (this.vch != null) {
            this.vch.setText(this.bKP);
        }
    }

    public void setEnabled(boolean bl) {
        this.vcl = bl;
        if (this.vch != null) {
            this.vch.setEnabled(this.vcl);
        }
    }

    private void setVisible(boolean bl) {
        boolean bl2 = bl != this.bmg;
        this.bmg = bl;
        if (this.vch != null) {
            this.vch.setVisible(this.bmg);
            if (bl2) {
                this.pm(bl2);
            }
        }
    }

    public boolean isKeepButtonParameters() {
        return this.vcn;
    }

    public void setKeepButtonParameters(boolean bl) {
        this.vcn = bl;
    }

    public void gFs() {
        if (this.vch != null && this.vck != null) {
            this.vch.setPixmap(this.vck);
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frz_1 frz_12 = (frz_1)fhi_22;
        super.a(frz_12);
        frz_12.vch = this.vch;
        frz_12.vci = this.vci;
        frz_12.bKP = this.bKP;
        frz_12.vcl = this.vcl;
        frz_12.bmg = this.bmg;
        frz_12.vcn = this.vcn;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 3556653) {
            this.setText(fic_12.a(string, this.nQt));
        } else if (n == -1609594047) {
            this.setEnabled(Bw.aK(string));
        } else if (n == 466743410) {
            this.setVisible(Bw.aK(string));
        } else if (n == 1408414817) {
            this.setKeepButtonParameters(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            this.setText(String.valueOf(object));
        } else if (n == -1609594047) {
            this.setEnabled(Bw.l(object));
        } else if (n == 466743410) {
            this.setVisible(Bw.l(object));
        } else if (n == 1408414817) {
            this.setKeepButtonParameters(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.vcj != null) {
            this.vcj.aZp();
            this.vcj = null;
        }
        this.vcm.clear();
        if (this.vch != null) {
            this.vch = null;
        }
        this.vci = false;
        this.vcn = false;
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    public boolean isVisible() {
        return this.bmg;
    }
}

