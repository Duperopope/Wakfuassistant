/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bna
 */
public class bna_2
implements aeh_2 {
    public static final String iFw = "name";
    public static final String iFx = "level";
    public static final String iFy = "jobLevel";
    public static final String iFz = "jobName";
    public static final String iFA = "mpEnabled";
    public static final String iFB = "ignored";
    public static final String iFC = "fee";
    public static final String iFD = "itsMe";
    public static final String iFE = "inSameGuild";
    public static final String[] iFF = new String[]{"name", "level", "jobLevel", "jobName", "mpEnabled", "ignored", "fee", "itsMe", "inSameGuild"};
    @NotNull
    private final bmz_2 iFG;
    private final int iFH;
    private final boolean iFI;
    @NotNull
    private eKR iqy;
    @NotNull
    private final eki_0 iFJ;

    public bna_2(@NotNull bmz_2 bmz_22, int n, boolean bl, @NotNull eKR eKR2) {
        this.iFG = bmz_22;
        this.iFH = n;
        this.iFI = bl;
        this.iqy = eKR2;
        this.iFJ = new eky_0();
        this.iFJ.i(this.iFG.qR());
    }

    @Override
    public String[] bxk() {
        return iFF;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        switch (string) {
            case "name": {
                return this.iFG.c(((bsg_1)aie_0.cfn().bmH()).enc());
            }
            case "level": 
            case "jobLevel": {
                return this.iFG.cmL();
            }
            case "jobName": {
                return this.dxN();
            }
            case "mpEnabled": {
                return this.dxL();
            }
            case "ignored": {
                return this.iFI;
            }
            case "fee": {
                return this.dxM();
            }
            case "itsMe": {
                return this.iFG.dxK();
            }
            case "inSameGuild": {
                return this.iFG.dxJ();
            }
        }
        return null;
    }

    public boolean dxL() {
        return !this.iFI && !this.iFG.dxK();
    }

    private int dxM() {
        return this.iFG.dxK() ? 0 : this.iFJ.a(this.iqy, this.iFG.dxJ());
    }

    private String dxN() {
        if (eKQ.qEb.QV(this.iFH) == null) {
            return aum_0.cWf().c("unknown", new Object[0]);
        }
        return aum_0.cWf().a(43, (long)this.iFH, new Object[0]);
    }

    public void f(@NotNull eKR eKR2) {
        this.iqy = eKR2;
        fse_1.gFu().a((aef_2)this, iFC);
    }

    public String dxO() {
        return this.iFG.getName();
    }

    @NotNull
    @Generated
    public bmz_2 dxP() {
        return this.iFG;
    }

    @Generated
    public int cms() {
        return this.iFH;
    }

    @Generated
    public boolean dxQ() {
        return this.iFI;
    }

    @NotNull
    @Generated
    public eKR dxR() {
        return this.iqy;
    }

    @NotNull
    @Generated
    public eki_0 cZr() {
        return this.iFJ;
    }
}

