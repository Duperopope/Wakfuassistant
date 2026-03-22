/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beQ
 */
public class beq_2
extends bwq {
    public static final String hOh = "leftCategories";
    public static final String hOi = "rightCategories";
    public static final String hOj = "currentAptitudeSheet";
    public static final String hOk = "hasAnyPoints";
    private static final String[] hOl = (String[])ArrayUtils.addAll((Object[])bwq.jxX, (Object[])new String[]{"leftCategories", "rightCategories", "currentAptitudeSheet", "hasAnyPoints"});
    public static final String hOm = "aptitudes";
    @NotNull
    private beo_2 hOn;
    private final List<ber_2> hOo = new ArrayList<ber_2>();

    public beq_2(@NotNull beo_2 beo_22) {
        this.hOn = beo_22;
        this.deQ();
    }

    @Override
    protected int deP() {
        return 2;
    }

    @Override
    protected String dbi() {
        return hOm;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "leftCategories": {
                int n = this.hOo.size() / 2 + this.hOo.size() % 2;
                return this.hOo.subList(0, n);
            }
            case "rightCategories": {
                int n = this.hOo.size() / 2 + this.hOo.size() % 2;
                return this.hOo.subList(n, this.hOo.size());
            }
            case "currentAptitudeSheet": {
                return this.hOn;
            }
            case "hasAnyPoints": {
                return this.hOo.stream().anyMatch(ber_2::deU);
            }
        }
        return super.eu(string);
    }

    private void deQ() {
        this.hOo.clear();
        eHK.qsX.f(ehx_02 -> {
            ber_2 ber_22 = new ber_2((ehx_0)ehx_02, (ehy_0)this.hOn.deN());
            this.hOo.add(ber_22);
        });
        this.hOo.sort(ber_2.hOx);
        fse_1.gFu().a((aef_2)this, hOh, hOi, hOj, hOk);
    }

    public void a(beo_2 beo_22) {
        this.hOn = beo_22;
        this.deQ();
    }

    public void deR() {
        for (ber_2 ber_22 : this.hOo) {
            ber_22.deW();
        }
        fse_1.gFu().a((aef_2)this, hOk);
    }

    public void deS() {
        fse_1.gFu().a((aef_2)this.hOn, "sheetCode");
        fse_1.gFu().a((aef_2)this, hOk);
    }

    @Override
    public String[] bxk() {
        return hOl;
    }
}

