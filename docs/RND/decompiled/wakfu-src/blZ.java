/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class blZ
implements aeh_2 {
    public static final String iyi = "presetName";
    public static final String iyj = "iconUrl";
    public static final String iyk = "isActive";
    public static final String iyl = "usage";
    public static final String iym = "usageWithNames";
    public static final String[] iyn = new String[]{"presetName", "iconUrl", "isActive", "usage", "usageWithNames"};
    @NotNull
    private final eks_0 iyo;
    private List<String> iyp;

    public blZ(@NotNull eks_0 eks_02) {
        this.iyo = eks_02;
        this.iyp = this.dvc();
    }

    @NotNull
    private List<String> dvc() {
        Optional<ekr_0> optional = bbs_2.a(eva_1.owz);
        List list = optional.map(ekr_02 -> ekr_02.Qv(this.BJ())).orElse(Collections.emptyList());
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Long l : list) {
            Object t = fcL.rUh.sw(l);
            if (t == null) continue;
            arrayList.add(((exP)t).getName());
        }
        arrayList.sort(String::compareTo);
        return arrayList;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "presetName": {
                return this.getName();
            }
            case "iconUrl": {
                if (this.iyo.BL() == -1) {
                    return "txDefaultPresetIcon";
                }
                ffV ffV2 = fgD.fXh().Ve(this.iyo.BL());
                if (ffV2 == null) {
                    return "txDefaultPresetIcon";
                }
                return auc_0.cVq().a((fjm)ctb_2.eQw(), ffV2);
            }
            case "isActive": {
                Optional<ekr_0> optional = bbs_2.a(eva_1.owz);
                return optional.flatMap(ekr_02 -> ekr_02.qd(ctb_2.eQw().Sn())).map(eks_02 -> eks_02.BJ() == this.BJ()).orElse(false);
            }
            case "usage": {
                return this.iyp.size();
            }
            case "usageWithNames": {
                return aum_0.cWf().c("cosmetic.preset.usage", String.join((CharSequence)"\n", this.iyp));
            }
        }
        return null;
    }

    public int BJ() {
        return this.iyo.BJ();
    }

    public int bnd() {
        return this.iyo.BL();
    }

    public String getName() {
        return bjf_1.lM(this.iyo.getName());
    }

    public void dvd() {
        this.iyp = this.dvc();
        fse_1.gFu().a((aef_2)this, iyk, iyl, iym);
    }

    @Override
    public String[] bxk() {
        return iyn;
    }

    public String toString() {
        return "CosmeticPresetView{id=" + this.BJ() + ", name=" + this.getName() + "}";
    }
}

