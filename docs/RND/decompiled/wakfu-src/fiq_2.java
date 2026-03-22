/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fIQ
 */
public final class fiq_2 {
    private static final fiq_2 uCE = new fiq_2();
    private static final String uCF = "messageBoxImage";
    private static final String uCG = "messageBoxTextView";
    private static final String uCH = "messageBoxTextEditor";
    private static final String uCI = "messageBoxButtonsContainer";
    private static final String uCJ = "messageBoxButton";
    private String uCK = null;
    private String uCL = null;
    private int uCM = 0;
    private final Map<fin_2, Map<String, fik_2>> uCN = new EnumMap<fin_2, Map<String, fik_2>>(fin_2.class);
    private final LinkedHashMap<String, fik_2> uCO = new LinkedHashMap();

    public static fiq_2 gCw() {
        return uCE;
    }

    private fiq_2() {
    }

    public void vJ(String string) {
        this.uCK = string;
    }

    public void vK(String string) {
        this.uCL = string;
    }

    public boolean gCx() {
        return !this.uCO.isEmpty();
    }

    public Optional<fik_2> b(fin_2 fin_22) {
        if (this.uCN.get((Object)fin_22) == null) {
            return Optional.empty();
        }
        if (this.uCN.get((Object)fin_22).isEmpty()) {
            return Optional.empty();
        }
        return this.uCN.get((Object)fin_22).values().stream().findFirst();
    }

    public boolean d(@NotNull fik_2 fik_22) {
        if (this.uCK == null) {
            return false;
        }
        if (!this.e(fik_22)) {
            return false;
        }
        String string = "MessageBox_" + this.uCM;
        fik_22.setId(string);
        ++this.uCM;
        Optional<fey_2> optional = fyw_0.gqw().ax(this.uCK, string);
        if (optional.isEmpty()) {
            return false;
        }
        this.uCN.computeIfAbsent(fik_22.gCd(), fin_22 -> new HashMap()).put(string, fik_22);
        this.uCO.put(string, fik_22);
        this.a(optional.get(), fik_22);
        fik_22.a(() -> fiq_2.b(((fey_2)optional.get()).getElementMap(), fik_22));
        return true;
    }

    private boolean e(@NotNull fik_2 fik_22) {
        if (!fik_22.gCb()) {
            return true;
        }
        Map<String, fik_2> map = this.uCN.get((Object)fik_22.gCd());
        if (map == null) {
            return true;
        }
        for (fik_2 fik_23 : map.values()) {
            if (fik_23.tL() >= fik_22.tL()) {
                return false;
            }
            if (!fik_23.gCb()) continue;
            this.f(fik_23);
            return true;
        }
        return true;
    }

    public boolean gCy() {
        if (this.uCO.isEmpty()) {
            return false;
        }
        this.f(this.uCO.sequencedValues().getLast());
        return true;
    }

    public void f(@Nullable fik_2 fik_22) {
        this.a(fik_22, true);
    }

    public void a(@Nullable fik_2 fik_22, boolean bl) {
        if (fik_22 == null) {
            return;
        }
        Map<String, fik_2> map = this.uCN.get((Object)fik_22.gCd());
        if (map != null) {
            map.remove(fik_22.getId());
        }
        this.uCO.remove(fik_22.getId());
        fyw_0.gqw().J(fik_22.getId(), false);
        if (bl && fik_22.gCk() != null) {
            fik_22.gCk().onMessageBoxClosed(-1, null);
        }
    }

    public void a(@NotNull fin_2 fin_22, boolean bl) {
        ArrayList<fik_2> arrayList = new ArrayList<fik_2>(this.uCO.sequencedValues());
        for (fik_2 fik_22 : arrayList) {
            if (fik_22.gCd() != fin_22) continue;
            this.a(fik_22, bl);
        }
    }

    private void a(@NotNull fey_2 fey_22, @NotNull fik_2 fik_22) {
        fhs_2 fhs_22 = fey_22.getElementMap();
        this.a(fhs_22, fik_22);
        fiq_2.b(fhs_22, fik_22);
        Optional<fdu_1> optional = fiq_2.c(fhs_22, fik_22);
        fiq_2.a(fhs_22, fik_22, optional);
        optional.ifPresent(fdu_12 -> {
            if (fdu_12.isVisible()) {
                fdu_12.setFocused(true);
            }
        });
    }

    private void a(@NotNull fhs_2 fhs_22, @NotNull fik_2 fik_22) {
        String string;
        if (!fhs_22.uK(uCF)) {
            return;
        }
        String string2 = string = fik_22.byf() == null ? this.uCL : fik_22.byf();
        if (string == null) {
            return;
        }
        fbt_1 fbt_12 = (fbt_1)fhs_22.uH(uCF);
        awk_1 awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false);
        if (awk_12 != null) {
            fze fze2 = new fze();
            fze2.aVI();
            fze2.setPixmap(new awg_1(awk_12));
            fbt_12.d(fze2);
        }
    }

    private static void b(@NotNull fhs_2 fhs_22, @NotNull fik_2 fik_22) {
        if (!fhs_22.uK(uCG)) {
            return;
        }
        fdy_1 fdy_12 = (fdy_1)fhs_22.uH(uCG);
        fdy_12.setText(fik_22.getMessage());
        if (fik_22.gCf()) {
            fdy_12.setSelectable(true);
            fdy_12.setEnableShrinking(false);
        }
    }

    private static Optional<fdu_1> c(@NotNull fhs_2 fhs_22, @NotNull fik_2 fik_22) {
        if (!fhs_22.uK(uCH)) {
            return Optional.empty();
        }
        fdu_1 fdu_12 = (fdu_1)fhs_22.uH(uCH);
        fdu_12.setVisible(fik_22.gCh());
        fis_2 fis_22 = fik_22.gCi();
        if (fis_22 != null) {
            fdu_12.setPrefSize(fis_22.getPrefSize());
            fdu_12.setMaxWidth(fis_22.getMaxWidth());
            fdu_12.setMultiline(fis_22.isMultiline());
            fdu_12.setMaxCharacters(fis_22.getMaxCharacters());
            fdu_12.setText(fis_22.gCz());
            fdu_12.setRestrict(fis_22.getRestrict());
        }
        return Optional.of(fdu_12);
    }

    private static void a(@NotNull fhs_2 fhs_22, @NotNull fik_2 fik_22, Optional<fdu_1> optional) {
        Object object;
        Object object2;
        List<fil_2> list;
        if (!fhs_22.uK(uCI)) {
            return;
        }
        if (!fhs_22.uK(uCJ)) {
            return;
        }
        faw_2 faw_22 = (faw_2)fhs_22.uH(uCI);
        fad_1 fad_12 = (fad_1)fhs_22.uH(uCJ);
        faw_22.n(fad_12);
        if (fik_22.gCe()) {
            list = fik_22.gCj();
        } else {
            object2 = fyw_0.gqw().bCh();
            boolean bl = object2 != null && object2.aK(aff.cpO.getKey());
            object = Comparator.comparingInt(fil_2::gCr);
            if (bl && fik_22.isHorizontal()) {
                object = object.reversed();
            }
            list = fik_22.gCj().stream().sorted(object).toList();
        }
        object2 = list.stream().filter(fil_2::gCs).findFirst();
        Object object3 = list.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            fad_1 fad_13 = new fad_1();
            fad_13.aVI();
            fad_12.a(fad_13);
            fad_13.setText(((fil_2)object).getText());
            fad_13.setStyle(((fil_2)object).getStyle());
            fad_13.setOnClick(new fir_2(fik_22, (fil_2)object, optional));
            if (((fil_2)object).gCt() != null) {
                fad_13.setClickSoundId(((fil_2)object).gCt());
            }
            if (((Optional)object2).isPresent() && ((Optional)object2).get() == object) {
                fad_13.setFocusable(true);
                fad_13.setFocused(true);
            }
            fad_13.setElementMap(fad_12.getElementMap());
            fad_13.onChildrenAdded();
            faw_22.d(fad_13);
        }
        if (((Optional)object2).isPresent() && fik_22.gCh() && optional.isPresent()) {
            optional.get().a(fzq_0.tJF, arg_0 -> fiq_2.a(fik_22, (Optional)object2, optional, arg_0), true);
        }
        if ((object3 = (frz_2)faw_22.getLayoutManager()) == null) {
            throw new RuntimeException("No RowLayout in the message box buttons container");
        }
        ((frz_2)object3).setHorizontal(fik_22.isHorizontal());
        fad_12.gAD();
    }

    static void a(@NotNull fik_2 fik_22, @NotNull fil_2 fil_22, @NotNull Optional<fdu_1> optional) {
        if (fil_22.gCu() != null) {
            fil_22.gCu().onButtonClick(optional.map(fdu_1::getText).orElse(null));
        }
        if (fik_22.gCk() != null) {
            fik_22.gCk().onMessageBoxClosed(fil_22.gCr(), optional.map(fdu_1::getText).orElse(null));
        }
        uCE.a(fik_22, false);
    }

    private static /* synthetic */ boolean a(fik_2 fik_22, Optional optional, Optional optional2, fiq_1 fiq_12) {
        if (fiq_12.gBy() != fzq_0.tJF) {
            return false;
        }
        if (!(fiq_12 instanceof fli_2)) {
            return false;
        }
        if (((fli_2)fiq_12).bCC() == 10) {
            fiq_2.a(fik_22, (fil_2)optional.get(), (Optional<fdu_1>)optional2);
            return true;
        }
        return false;
    }
}

