/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bmZ
 */
public class bmz_2 {
    @NotNull
    private final String iFp;
    @NotNull
    private final vb_0 iFq;
    @NotNull
    private final List<Mv> iFr;
    private final short iFs;
    @NotNull
    private final dn_2 iFt;
    private final boolean iFu;
    private final boolean iFv;

    public final String c(bsb_1 bsb_12) {
        return bsb_1.a(bsb_12, this.getName(), this.dxH(), this.dxI());
    }

    @NotNull
    @Generated
    public String getName() {
        return this.iFp;
    }

    @NotNull
    @Generated
    public vb_0 dxH() {
        return this.iFq;
    }

    @NotNull
    @Generated
    public List<Mv> dxI() {
        return this.iFr;
    }

    @Generated
    public short cmL() {
        return this.iFs;
    }

    @NotNull
    @Generated
    public dn_2 qR() {
        return this.iFt;
    }

    @Generated
    public boolean dxJ() {
        return this.iFu;
    }

    @Generated
    public boolean dxK() {
        return this.iFv;
    }

    @Generated
    public bmz_2(@NotNull String string, @NotNull vb_0 vb_02, @NotNull List<Mv> list, short s, @NotNull dn_2 dn_22, boolean bl, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (vb_02 == null) {
            throw new NullPointerException("accountCommunity is marked non-null but is null");
        }
        if (list == null) {
            throw new NullPointerException("languages is marked non-null but is null");
        }
        if (dn_22 == null) {
            throw new NullPointerException("fees is marked non-null but is null");
        }
        this.iFp = string;
        this.iFq = vb_02;
        this.iFr = list;
        this.iFs = s;
        this.iFt = dn_22;
        this.iFu = bl;
        this.iFv = bl2;
    }
}

