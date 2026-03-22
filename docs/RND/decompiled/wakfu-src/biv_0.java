/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from biv
 */
public class biv_0
implements biu_0 {
    public static final int ikB = 3683;
    private static final int ikC = 1500;
    private static final int ikD = 250;
    private static final String[] ikE = new String[]{"worldAndFightBarDialog"};
    public static final String ikF = "ecaflipDice";
    public static final String ikG = "ecaflipClubImage";
    public static final String ikH = "ecaflipClubLabel";
    public static final String ikI = "AnimDe-";
    private final bhJ ikJ;
    private final ArrayList<fax_1> ikK = new ArrayList(1);
    private final List<fbt_1> ikL = new ArrayList<fbt_1>();
    private final ArrayList<fbv_2> ikM = new ArrayList();

    public biv_0(bhJ bhJ2) {
        this.ikJ = bhJ2;
        for (String string : ikE) {
            fbv_2 fbv_22;
            fbt_1 fbt_12;
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
            if (fhs_22 == null) continue;
            fax_1 fax_12 = (fax_1)fhs_22.uH(ikF);
            if (fax_12 != null) {
                this.ikK.add(fax_12);
            }
            if ((fbt_12 = (fbt_1)fhs_22.uH(ikG)) != null) {
                this.ikL.add(fbt_12);
            }
            if ((fbv_22 = (fbv_2)fhs_22.uH(ikH)) == null) continue;
            this.ikM.add(fbv_22);
        }
    }

    @Override
    public void a(rl_0 rl_02) {
        if (rl_02.d() == 1000) {
            ero_0 ero_02 = ((exe_2)rl_02).fOT();
            if (ero_02.d() != enf_0.qPC.d()) {
                return;
            }
            if (ero_02.bbd() != this.ikJ) {
                return;
            }
            fqU fqU2 = ((erh_0)ero_02).fGk();
            if (fqU2.gjy() == 3683) {
                this.bA(fqU2.cmL());
            }
        } else if (rl_02.d() == 1001) {
            ero_0 ero_03 = ((exh_2)rl_02).fOV();
            if (ero_03.d() != enf_0.qPC.d()) {
                return;
            }
            if (ero_03.bbd() != this.ikJ) {
                return;
            }
            fqU fqU3 = ((erh_0)ero_03).fGk();
            if (fqU3.gjy() == 3683) {
                this.bA((short)0);
            }
        }
    }

    private void bA(short s) {
        for (int i = this.ikM.size() - 1; i >= 0; --i) {
            this.ikM.get(i).setText(String.valueOf(s));
        }
    }

    private static void a(List<? extends fes_2> list, Collection<fzc> collection) {
        for (int i = list.size() - 1; i >= 0; --i) {
            collection.add(list.get(i).getAppearance());
        }
    }

    public void bq(byte by) {
        if (by < 1 || by > 6) {
            return;
        }
        if (this.ikM.isEmpty() || this.ikL.isEmpty() || this.ikK.isEmpty()) {
            return;
        }
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        biv_0.a(this.ikM, arrayList);
        biv_0.a(this.ikL, arrayList);
        fes_2 fes_22 = this.ikM.get(0);
        fes_22.a(new fsz_2(awx_2.dnF, awx_2.dnC, arrayList, 0, 250, 1, abn.cdr));
        fes_22.a(new fsz_2(awx_2.dnC, awx_2.dnF, arrayList, 1500, 250, 1, abn.cdr));
        ArrayList<fzc> arrayList2 = new ArrayList<fzc>();
        for (int i = this.ikK.size() - 1; i >= 0; --i) {
            fax_1 fax_12 = this.ikK.get(i);
            fax_12.setAnimName(ikI + by);
            arrayList2.add(fax_12);
        }
        fes_2 fes_23 = this.ikK.get(0);
        fes_23.a(new fsz_2(awx_2.dnC, awx_2.dnF, arrayList2, 0, 250, 1, abn.cdr));
        fes_23.a(new fsz_2(awx_2.dnF, awx_2.dnC, arrayList2, 1500, 250, 1, abn.cdr));
    }

    @Override
    public void clear() {
        biw_0.ikN.b(this.ikJ);
    }

    public String toString() {
        return "EcaflipFightListener{m_character=" + String.valueOf(this.ikJ) + "}";
    }
}

