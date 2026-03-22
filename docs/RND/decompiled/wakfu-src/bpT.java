/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public final class bpT
extends Enum<bpT> {
    public static final /* enum */ bpT iYr = new bpT(null, fgW.smf);
    public static final /* enum */ bpT iYs = new bpT(fgW.smg, fgW.smh, fgW.smk, fgW.sml);
    public static final /* enum */ bpT iYt = new bpT(fgW.smi, fgW.smj, fgW.smm, fgW.smn);
    private final Set<fgW> iYu;
    private static final /* synthetic */ bpT[] iYv;

    public static bpT[] values() {
        return (bpT[])iYv.clone();
    }

    public static bpT valueOf(String string) {
        return Enum.valueOf(bpT.class, string);
    }

    private bpT(fgW ... fgWArray) {
        this.iYu = Arrays.stream(fgWArray).collect(Collectors.toSet());
    }

    public Set<fgW> dDN() {
        return this.iYu;
    }

    public String dDp() {
        return aum_0.cWf().c("encyclopedia.bind.type.filter." + this.name(), new Object[0]);
    }

    private static /* synthetic */ bpT[] dDO() {
        return new bpT[]{iYr, iYs, iYt};
    }

    static {
        iYv = bpT.dDO();
    }
}

