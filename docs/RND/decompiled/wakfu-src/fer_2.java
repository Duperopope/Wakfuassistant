/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.ArrayList;

/*
 * Renamed from fER
 */
public class fer_2
extends feq_2 {
    public static final String TAG = "basicColorPicker";
    ArrayList<fad_1> nam;
    ArrayList<faw_2> kwE;
    private ArrayList<fkk_1> unU;
    boolean tMi = true;
    int unV = 0;
    private fis_1 nay;
    public static final int unW = 1387629604;
    public static final int unX = 1810594434;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        if (this.tMi == bl) {
            return;
        }
        this.tMi = bl;
        this.gsm();
    }

    public int getNumByLines() {
        return this.unV;
    }

    public void setNumByLines(int n) {
        if (this.unV == n) {
            return;
        }
        this.unV = n;
        this.gsm();
    }

    @Override
    protected void gvx() {
        fhv_1 fhv_12;
        int n;
        int n2 = this.nam.size();
        int n3 = this.dpf.size();
        for (n = n2; n < n3; ++n) {
            fhv_12 = faw_2.checkOut();
            ((faw_2)fhv_12).getAppearance().setMargin(new Insets(1, 1, 0, 0));
            fro_1 fro_12 = new fro_1();
            fro_12.aVI();
            fro_12.setAdaptToContentSize(true);
            ((faw_2)fhv_12).a(fro_12);
            faw_2 faw_22 = faw_2.checkOut();
            frp_1 frp_12 = new frp_1();
            frp_12.aVI();
            frp_12.setSize(new fsm_1(100.0f, 100.0f));
            faw_22.d(frp_12);
            fkk_1 fkk_12 = new fkk_1();
            fkk_12.aVI();
            faw_22.getAppearance().d(fkk_12);
            faw_22.getAppearance().setMargin(new Insets(1, 1, 1, 1));
            fad_1 fad_12 = new fad_1();
            fad_12.aVI();
            fad_12.setElementMap(this.nQt);
            String string = this.getStyle();
            fad_12.setStyle(TAG + (string != null ? string : "") + "$button");
            fad_12.setPrefSize(new fsm_1(20, 15));
            frp_1 frp_13 = new frp_1();
            frp_13.aVI();
            frp_13.setSize(new fsm_1(100.0f, 100.0f));
            fad_12.d(frp_13);
            fad_12.onChildrenAdded();
            ((fes_2)fhv_12).d(faw_22);
            ((fes_2)fhv_12).d(fad_12);
            this.d(fhv_12);
            this.nam.add(fad_12);
            this.unU.add(fkk_12);
            this.kwE.add((faw_2)fhv_12);
        }
        for (n = n3; n < n2; ++n) {
            this.nam.remove(this.nam.size() - 1);
            this.unU.remove(this.unU.size() - 1);
            fhv_12 = this.kwE.remove(this.kwE.size() - 1);
            fhv_12.gAD();
        }
        if (n2 != n3) {
            this.gsm();
        }
        assert (this.nam.size() == this.dpf.size()) : "m_buttons devrait avoir la m\u00eame taille que m_colors";
        for (n = 0; n < n3; ++n) {
            fhv_12 = this.unU.get(n);
            ((fkk_1)fhv_12).setColor((axb_2)this.dpf.get(n));
        }
    }

    private void gvy() {
        this.nay = new fes_1(this);
        this.a(fzq_0.tJU, this.nay, false);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fer_2 fer_22 = (fer_2)fhi_22;
        super.a(fer_22);
        fer_22.unV = this.unV;
        fer_22.tMi = this.tMi;
        fer_22.b(fzq_0.tJU, this.nay, false);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.nam = null;
        this.unU = null;
        this.kwE = null;
        this.nay = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fet_2 fet_22 = new fet_2(this);
        fet_22.aVI();
        this.a(fet_22);
        this.unV = 0;
        this.tMi = true;
        this.nam = new ArrayList();
        this.unU = new ArrayList();
        this.kwE = new ArrayList();
        this.gvy();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == 1810594434) {
            this.setNumByLines(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.l(object));
        } else if (n == 1810594434) {
            this.setNumByLines(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

