/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import java.util.stream.Stream;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bwd
implements aeh_2 {
    public static final String jwk = "buildSheetList";
    public static final String jwl = "isDirectionToOther";
    public static final String jwm = "canCopyBuild";
    private static final String[] jwn = new String[]{"buildSheetList", "isDirectionToOther", "canCopyBuild"};
    @NotNull
    final bwf_0 jwo;
    final bfF jwp;
    private final @Unmodifiable List<bwe_0> jwq;
    private @Unmodifiable @Nullable List<bwe_0> jwr = null;
    private boolean jws = false;
    @Nullable
    private Integer jwt;
    @Nullable
    private String hVA;
    @Nullable
    private bfF jwu;
    private final bwg jwv = new bwg();

    public bwd(bfE bfE2, boolean bl) {
        this.jwp = bfE2.dgT();
        this.jwo = bl ? bwf_0.jwA : bwf_0.jwz;
        this.jwq = bfE2.dgU().stream().map(bfF2 -> new bwe_0(this, (bfF)bfF2)).toList();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "buildSheetList": {
                return this.jwr != null ? this.jwr : this.jwq;
            }
            case "isDirectionToOther": {
                return this.jwo == bwf_0.jwA;
            }
            case "canCopyBuild": {
                return this.dLq();
            }
        }
        return null;
    }

    public void dLp() {
        ccj_2.g("heroBuildCopyBuildDialog", 33024L);
        fse_1.gFu().a((aef_2)this, jwk);
    }

    public void mC(@Nullable String string) {
        this.hVA = string == null || string.isEmpty() ? null : BH.aT(string);
        this.cUR();
    }

    public void U(@Nullable Integer n) {
        this.jwt = n;
        this.cUR();
    }

    private void cUR() {
        if (this.jwt == null && this.hVA == null) {
            this.jwr = null;
        } else {
            Stream<Object> stream = this.jwq.stream();
            if (this.jwt != null) {
                stream = stream.filter(bwe_02 -> bwe_02.jwx.dhd().tL() == this.jwt.intValue());
            }
            if (this.hVA != null) {
                stream = stream.filter(bwe_02 -> BH.aT(bwe_02.jwx.getName()).contains(this.hVA));
            }
            this.jwr = stream.toList();
        }
        fse_1.gFu().a((aef_2)this, jwk);
    }

    public void he(boolean bl) {
        this.jws = bl;
    }

    public void f(@Nullable bfF bfF2) {
        this.jwu = bfF2;
        fse_1.gFu().a((aef_2)this, jwm);
    }

    public void hf(boolean bl) {
        this.jwv.jwC = bl;
        fse_1.gFu().a((aef_2)this, jwm);
    }

    public void hg(boolean bl) {
        this.jwv.jwD = bl;
        fse_1.gFu().a((aef_2)this, jwm);
    }

    public void hh(boolean bl) {
        this.jwv.jwE = bl;
        fse_1.gFu().a((aef_2)this, jwm);
    }

    public boolean dLq() {
        return this.jwu != null && this.jwv.dLy() && new eIn().P(cvu_2.cCv(), this.jwu.wp());
    }

    @Override
    public String[] bxk() {
        return jwn;
    }

    @NotNull
    @Generated
    public bwf_0 dLr() {
        return this.jwo;
    }

    @Generated
    public boolean dLs() {
        return this.jws;
    }

    @Nullable
    @Generated
    public bfF dLt() {
        return this.jwu;
    }

    @Generated
    public bwg dLu() {
        return this.jwv;
    }
}

