/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqT
 */
public class bqt_0
extends bqq_0 {
    public static final aox_1 jbA = new brw_0(new brv_0("", new aoz_1("iconName", amz_1.cJx), new aoz_1("titleTranslationKey", amz_1.cJx), new aoz_1("textTranslationKey", amz_1.cJx)), new brv_0("En pr\u00e9cisant le type (tuto sinon)", new aoz_1("iconName", amz_1.cJx), new aoz_1("titleTranslationKey", amz_1.cJx), new aoz_1("textTranslationKey", amz_1.cJx), new aoz_1("type", amz_1.cJy)));
    private String cxT;
    private String jbB;
    private String ekQ;
    private int bIi;

    public bqt_0(int n) {
        super(n);
    }

    @Override
    public void bGy() {
        dcg_0 dcg_02 = new dcg_0(this.cxT, this.jbB, this.ekQ, this.bIi, this.d());
        aaw_1.bUq().h(dcg_02);
    }

    @Override
    protected void D(ArrayList<amx_1> arrayList) {
        int n;
        int n2 = arrayList.size();
        if (n2 != 3) {
            jbv.error((Object)("Nombre de param\u00e8tres invalide pour une action de type ClientEventActionLaunchTutorial id=" + this.d() + " paramCount=" + n2));
            return;
        }
        int n3 = 0;
        String string = ((anh_2)arrayList.get(n3++)).getValue();
        String string2 = aum_0.cWf().c(((anh_2)arrayList.get(n3++)).getValue(), new Object[0]);
        String string3 = ((anh_2)arrayList.get(n3++)).getValue();
        if (n2 == n3) {
            n = 0;
        } else {
            try {
                n = (int)((amu_1)arrayList.get(n3)).d(null, null, null, null);
                ++n3;
            }
            catch (ClassCastException classCastException) {
                n = 0;
            }
        }
        String string4 = aum_0.cWf().c(string3, new Object[0]);
        this.ekQ = string;
        this.cxT = string2;
        this.jbB = string4;
        this.bIi = n;
    }

    @Override
    public aox_1 bEt() {
        return jbA;
    }

    public String bAD() {
        return this.cxT;
    }
}

