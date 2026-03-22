/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHF
 */
public class fhf_2
extends fkr_1 {
    public static final String TAG = "Sound";
    private int cip = -1;
    public static final int uyJ = -2021995894;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setSoundId(int n) {
        this.cip = n;
    }

    public int getSoundId() {
        return this.cip;
    }

    @Override
    public void run() {
        if (this.cip != -1) {
            fhy_2.gBq().nW(this.cip);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.cip = -1;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fhf_2 fhf_22 = (fhf_2)fhi_22;
        super.a(fhi_22);
        fhf_22.setSoundId(this.getSoundId());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return switch (n) {
            case -2021995894 -> {
                this.setSoundId(Integer.parseInt(string));
                yield true;
            }
            default -> super.setXMLAttribute(n, string, fic_12);
        };
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return switch (n) {
            case -2021995894 -> {
                this.setSoundId(object instanceof Number ? ((Number)object).intValue() : Integer.parseInt(String.valueOf(object)));
                yield true;
            }
            default -> super.setPropertyAttribute(n, object);
        };
    }
}

