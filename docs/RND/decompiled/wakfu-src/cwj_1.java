/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Renamed from cWJ
 */
public class cwj_1
implements adi_1 {
    public static final cwj_1 nTI = new cwj_1();
    private final cbz_2 nTJ = new cbz_2();
    private final alx_2 nTK = new cwk_1(this);

    private static void a(short s, byte by, Object ... objectArray) {
        ns_0 ns_02 = new ns_0();
        ns_02.Q(s);
        ns_02.C(by);
        for (Object object : objectArray) {
            ns_02.w(object);
        }
        aue_0.cVJ().etu().d(ns_02);
    }

    public static void a(short s, Object ... objectArray) {
        cwj_1.a(s, (byte)2, objectArray);
    }

    public static void b(short s, Object ... objectArray) {
        cwj_1.a(s, (byte)3, objectArray);
    }

    public static void c(short s, Object ... objectArray) {
        cwj_1.a(s, (byte)6, objectArray);
    }

    public static void d(short s, Object ... objectArray) {
        cwj_1.a(s, (byte)1, objectArray);
    }

    public static void a(fud_0 fud_02, fub_0 fub_02, Object object) {
        cwj_1.a((short)284, new Object[]{fud_02.aJr(), fub_02.aJr(), object});
    }

    public static void eWf() {
        cwj_1.a((short)272, new Object[0]);
        cwj_1.a((short)472, new Object[0]);
        cwj_1.b((short)38, new Object[0]);
        fse_1.gFu().a((aef_2)nTI.eWl(), "moderatorPosition", "moderatorInstance");
    }

    public void aB(List<ftY> list) {
        this.nTJ.esO();
        for (ftY ftY2 : list) {
            this.b(ftY2);
        }
    }

    public void b(ftY ftY2) {
        this.nTJ.a(ftY2);
        fse_1.gFu().aT("moderationPanelView", "penalFile");
    }

    public void K(long l, long l2) {
        this.nTJ.G(l, l2);
        fse_1.gFu().aT("moderationPanelView", "penalFile");
    }

    public void eWg() {
        List<cca_2> list = this.nTJ.esP();
        String string = list.stream().map(cca_2::toString).collect(Collectors.joining("\n"));
        cbu_2 cbu_22 = this.nTJ.esQ();
        String string2 = "Penal file of player " + cbu_22.getName() + " - Account Id = " + cbu_22.xl() + " - Character Id = " + cbu_22.KU() + " :";
        if (!bh_0.aI(string2 + "\n\n" + string)) {
            cdn.ol("Cannot automatically copy penal file of player \"" + cbu_22.getName() + "\" to clipboard, permission denied");
        }
    }

    public void eWh() {
        cbu_2 cbu_22 = (cbu_2)this.nTJ.eu("currentPlayer");
        if (cbu_22 == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Account ID: ");
        stringBuilder.append(cbu_22.xl());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Character ID: ");
        stringBuilder.append(cbu_22.KU());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Character Name: ");
        stringBuilder.append(cbu_22.getName());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Ankama Name: ");
        stringBuilder.append(cbu_22.aqN()).append('#').append(cbu_22.getTag());
        stringBuilder.append(System.lineSeparator());
        List list = (List)this.nTJ.eu("logs");
        if (list != null) {
            stringBuilder.append("Player penal history for this session:");
            stringBuilder.append(System.lineSeparator());
            String string = String.valueOf(cbu_22.xl());
            for (int i = list.size() - 1; i >= 0 && i > list.size() - 150; --i) {
                String string2 = (String)list.get(i);
                if (!string2.contains(string)) continue;
                int n = string2.indexOf(40);
                int n2 = string2.indexOf(41);
                if (n2 == -1 || n == -1) continue;
                stringBuilder.append(string2, 0, n);
                stringBuilder.append(string2.substring(n2 + 1));
                stringBuilder.append(System.lineSeparator());
            }
        }
        bh_0.aI(stringBuilder.toString());
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().a(this.nTK);
            ccj_2.g("moderationPanelDialog", 32768L);
            fse_1.gFu().f("moderationPanelView", this.nTJ);
            fyw_0.gqw().d("wakfu.moderationPanel", cfv_2.class);
            if (!aue_0.cVJ().c(cdn.eua())) {
                aue_0.cVJ().a(cdn.eua());
            }
            if (this.nTJ.esU() == cbx_2.lMa) {
                cwj_1.a(fud_0.thz, fub_0.thi, (Object)this.nTJ.esQ().getName());
            }
            if (this.nTJ.esU() == cbx_2.lLZ) {
                cwj_1.eWf();
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.nTK);
            if (fyw_0.gqw().to("moderationPanelDialog")) {
                fyw_0.gqw().tl("moderationPanelDialog");
            }
            fse_1.gFu().vX("moderationPanelView");
            fyw_0.gqw().tc("wakfu.moderationPanel");
            if (aue_0.cVJ().c(cdn.eua())) {
                aue_0.cVJ().b(cdn.eua());
            }
            if (fyw_0.gqw().to("moderationPenalFileDialog")) {
                fyw_0.gqw().tl("moderationPenalFileDialog");
            }
            if (fyw_0.gqw().to("moderationLocalizedSystemMessageDialog")) {
                fyw_0.gqw().tl("moderationLocalizedSystemMessageDialog");
            }
        }
    }

    public static void eWi() {
        if (fyw_0.gqw().to("moderationPenalFileDialog")) {
            fyw_0.gqw().tl("moderationPenalFileDialog");
        } else {
            cwj_1.eWk();
        }
    }

    public static void eWj() {
        if (fyw_0.gqw().to("moderationLocalizedSystemMessageDialog")) {
            fyw_0.gqw().tl("moderationLocalizedSystemMessageDialog");
        } else {
            ccj_2.g("moderationLocalizedSystemMessageDialog", 32768L);
        }
    }

    public void kI(boolean bl) {
        this.nTJ.iY(bl);
    }

    public static void A(Map<Byte, String> map) {
        Object[] objectArray = new Object[map.size() * 2];
        int n = 0;
        for (Map.Entry<Byte, String> entry : map.entrySet()) {
            objectArray[n] = entry.getKey();
            objectArray[++n] = entry.getValue();
            ++n;
        }
        cwj_1.a((short)135, objectArray);
    }

    private static void eWk() {
        ccj_2.g("moderationPenalFileDialog", 32768L);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("moderationPenalFileDialog");
        if (fhs_22 != null) {
            fgo_2 fgo_22 = cwj_1.getTableModel();
            fdq_1 fdq_12 = (fdq_1)fhs_22.uH("penalTable");
            if (fdq_12 != null) {
                fdq_12.setTableModel(fgo_22);
            }
        }
    }

    private static fgo_2 getTableModel() {
        fgo_2 fgo_22 = new fgo_2();
        fgo_22.a("date", new fgq_2(Comparator.comparing(cca_2::etb)));
        fgo_22.a("type", new fgq_2(Comparator.comparing(cca_2::aLZ)));
        fgo_22.a("moderator", new fgq_2(Comparator.comparing(cca_2::eta)));
        fgo_22.a("reason", new fgq_2(Comparator.comparing(object -> ((cca_2)object).etd().toLowerCase())));
        fgo_22.gxy();
        return fgo_22;
    }

    public static String kJ(boolean bl) {
        String string = bl ? "Online" : "Offline";
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().e(bl ? awx_2.dnM : awx_2.dnJ).c(string).ceD();
        return ahv_22.ceL();
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    public cbz_2 eWl() {
        return this.nTJ;
    }

    @Override
    public void dC(long l) {
    }
}

