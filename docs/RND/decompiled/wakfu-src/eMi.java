/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.collect.Sets;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

public class eMi {
    private final fhi_0 qMu;
    private final Set<ffS> qMv;

    public eMi(fhi_0 fhi_02, @NotNull ffS[] ffSArray) {
        this.qMu = fhi_02;
        this.qMv = Sets.newHashSet((Object[])ffSArray);
    }

    public eMi(fhi_0 fhi_02, ffS ffS2) {
        this.qMu = fhi_02;
        this.qMv = ffS2 == null ? new HashSet() : Sets.newHashSet((Object[])new ffS[]{ffS2});
    }

    @NotNull
    public List<String> fAi() {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.qMu == null) {
            return arrayList;
        }
        boolean bl = ewo_0.oBF.k(ewr_0.oDI);
        this.qMu.dTS().forEach((arg_0, arg_1) -> this.a(bl, arrayList, arg_0, arg_1));
        return arrayList;
    }

    @NotNull
    public static eLT<eLZ> a(fhc_0 fhc_02, boolean bl, short s) {
        eLZ eLZ2 = new eLZ(fhc_02);
        return new eMh(eLZ2, 0, s, bl);
    }

    private static void a(fhc_0 fhc_02, ArrayList<String> arrayList) {
        eLZ eLZ2 = new eLZ(fhc_02);
        eLT<eLZ> eLT2 = new eLT<eLZ>(eLZ2, 0, 1);
        arrayList.addAll(eLT2.fzQ());
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void a(boolean var1_1, ArrayList var2_2, Byte var3_3, fhn_0 var4_4) {
        var5_5 = var4_4.fYW();
        if (var5_5.isEmpty()) {
            return;
        }
        if (var4_4.dBe() == rd_0.bjA && !var1_1) {
            return;
        }
        var6_6 = var5_5.get();
        var7_7 = var6_6.dSY();
        if (var7_7 == null) ** GOTO lbl-1000
        if (var7_7.fYF().stream().anyMatch((Predicate<ffS>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, contains(java.lang.Object ), (LffS;)Z)(this.qMv))) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var8_8 = v0;
        var9_9 = eMi.a(var6_6, var8_8, var4_4.cmL());
        var10_10 = var4_4.dBe() == rd_0.bjA ? awx_2.dnG : awx_2.dnX;
        var9_9.fzQ().forEach((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, a(java.util.ArrayList axb_2 java.lang.String ), (Ljava/lang/String;)V)((ArrayList)var2_2, (axb_2)var10_10));
    }

    private static /* synthetic */ void a(ArrayList arrayList, axb_2 axb_22, String string) {
        arrayList.add(new ahv_2().e(axb_22).c(string).ceL());
    }
}

