/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from bOA
 */
public class boa_2
extends frs_0
implements aeh_2 {
    private static final boa_2 kLQ = new boa_2();
    public static final String kLR = "protectorSatisfactionColor";
    public static final String kLS = "protectorSatisfaction";
    public static final String kLT = "protectorSatisfactionText";
    public static final String kLU = "protectorSatisfactionStyle";
    public static final String kLV = "protectorSatisfactionFirstStar";
    public static final String kLW = "protectorSatisfactionSecondStar";
    public static final String kLX = "protectorSatisfactionThirdStar";
    public static final String kLY = "protectorNationId";
    public static final String kLZ = "protectorNationIcon";
    private static final String[] kMa = new String[]{"protectorSatisfactionColor", "protectorNationId", "protectorNationIcon", "protectorSatisfactionStyle"};
    private bzq_2 kMb;
    private int kMc = -1;
    private String kMd = "protectorPositiveBackground";
    private String kMe = "protectorNeutralBackground";
    private String kMf = "protectorNegativeBackground";

    @Override
    public String[] bxk() {
        return kMa;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kLR)) {
            return this.ehj();
        }
        if (string.equals(kLS)) {
            return this.ehi();
        }
        if (string.equals(kLT)) {
            ArrayList<Boolean> arrayList = this.ehi();
            long l = arrayList.stream().filter(Boolean::booleanValue).count();
            return l + "/" + arrayList.size();
        }
        if (string.equals(kLU)) {
            return this.ehk();
        }
        if (string.equals(kLY)) {
            return this.ehl();
        }
        if (string.equals(kLZ)) {
            return this.ehm();
        }
        if (string.equals(kLV)) {
            ArrayList<Boolean> arrayList = this.ehi();
            if (!arrayList.isEmpty()) {
                return arrayList.getFirst();
            }
            return null;
        }
        if (string.equals(kLW)) {
            ArrayList<Boolean> arrayList = this.ehi();
            if (arrayList.size() > 1) {
                return arrayList.get(1);
            }
            return null;
        }
        if (string.equals(kLX)) {
            ArrayList<Boolean> arrayList = this.ehi();
            if (arrayList.size() > 2) {
                return arrayList.get(2);
            }
            return null;
        }
        return null;
    }

    public int ehh() {
        int n = 0;
        for (boz_2 boz_22 : boc_2.eht().ehs()) {
            if (!boz_22.ehc()) continue;
            ++n;
        }
        for (boz_2 boz_22 : bod_1.ehw().ehv()) {
            if (!boz_22.ehc()) continue;
            ++n;
        }
        return n;
    }

    private ArrayList<Boolean> ehi() {
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        for (boz_2 boz_22 : boc_2.eht().ehs()) {
            if (!boz_22.ehc()) continue;
            arrayList.add(boz_22.ehd());
        }
        for (boz_2 boz_22 : bod_1.ehw().ehv()) {
            if (!boz_22.ehc()) continue;
            arrayList.add(boz_22.ehd());
        }
        arrayList.sort(Comparator.reverseOrder());
        return arrayList;
    }

    private axb_2 ehj() {
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return null;
        }
        fpb fpb2 = bJr2.eaF();
        if (fpb2 == null) {
            return null;
        }
        switch (fpb2) {
            case sNq: {
                return awx_2.dnL;
            }
            case sNp: {
                return awx_2.dnF;
            }
            case sNo: {
                return awx_2.dnJ;
            }
        }
        return null;
    }

    private String ehk() {
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return null;
        }
        fpb fpb2 = bJr2.eaF();
        if (fpb2 == null) {
            return null;
        }
        return switch (fpb2) {
            case fpb.sNq -> this.kMd;
            case fpb.sNp, fpb.sNn -> this.kMe;
            case fpb.sNo -> this.kMf;
            default -> null;
        };
    }

    public int ehl() {
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return 0;
        }
        return bJr2.gfT();
    }

    public String ehm() {
        return auc_0.cVq().zG(this.ehl());
    }

    public static boa_2 ehn() {
        return kLQ;
    }

    public void eho() {
        fse_1.gFu().a((aef_2)this, kLR, kLU);
    }

    public void ehp() {
        fse_1.gFu().a((aef_2)this, kLR, kLS, kLT, kLU);
    }

    public void ID(int n) {
        this.kMc = n;
    }

    public void b(bzq_2 bzq_22) {
        this.kMb = bzq_22;
    }

    public bzr_2 ehq() {
        return this.kMb.JO(this.kMc);
    }

    public float ehr() {
        return (boc_2.eht().ehb() + bod_1.ehw().ehb()) / 2.0f;
    }
}

