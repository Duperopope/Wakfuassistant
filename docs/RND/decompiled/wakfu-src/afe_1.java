/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFE
 */
public class afe_1
implements ga_0,
Gz {
    private final String dJq;
    private final String dJr;
    private final aff_2 dJs;
    private final boolean dJt;

    public afe_1(String string, String string2, aff_2 aff_22, boolean bl) {
        assert (aff_22 != null);
        this.dJq = string;
        this.dJr = string2;
        this.dJs = aff_22;
        this.dJt = bl;
    }

    public afe_1(String string, aff_2 aff_22, boolean bl) {
        assert (aff_22 != null);
        this.dJq = string;
        this.dJr = "";
        this.dJs = aff_22;
        this.dJt = bl;
    }

    @Override
    public final String getName() {
        return this.dJq;
    }

    @Override
    public String getDescription() {
        return this.dJr;
    }

    @Override
    public final boolean aNF() {
        return this.dJt;
    }

    public final aff_2 caK() {
        return this.dJs;
    }

    @Override
    public /* synthetic */ gb_0 aNE() {
        return this.caK();
    }
}

