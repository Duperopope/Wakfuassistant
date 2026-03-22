/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bpz
 */
public class bpz_0
extends bpx_0 {
    public static final String iWr = "monsterSearchType";
    public static final String iWs = "monsterTypes";
    public static final String iWt = "capturableFilterToggled";
    public static final String iWu = "territories";
    public static final String[] iWv = (String[])ArrayUtils.addAll((Object[])bpx_0.iWa, (Object[])new String[]{"monsterSearchType", "monsterTypes", "capturableFilterToggled", "territories"});
    private final List<bqk_1> iWw = bqk_1.dDZ();
    private final List<bql_1> iWx = Stream.concat(Stream.of(new bqm_1()), bql_1.dDZ().stream()).toList();

    public bpz_0() {
        super(bpr_1.iVl);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iWr -> this.b(buh_0.jot).map(bqd_0::dDH).map(bqc_0::d).orElse(bqc_0.iYO.d());
            case iWt -> this.b(buh_0.joQ).isPresent();
            case iWs -> this.iWw;
            case iWu -> this.iWx;
            default -> super.eu(string);
        };
    }

    public @Unmodifiable List<bql_1> dDj() {
        return this.iWx;
    }

    @Override
    public void gO(boolean bl) {
        this.iWw.forEach(bqk_12 -> bqk_12.gQ(false));
        this.iWx.forEach(bql_12 -> bql_12.gQ(false));
        super.gO(bl);
    }

    @Override
    protected void dCX() {
        EnumSet enumSet = this.b(buh_0.jow).map(bqf_0::dDX).orElseGet(() -> EnumSet.noneOf(bqe_0.class));
        for (bqk_1 object : this.iWw) {
            object.gQ(enumSet.contains((Object)object.dEb()));
        }
        Set set = this.b(buh_0.joR).map(bqh_0::dDY).orElseGet(Collections::emptySet);
        for (bql_1 bql_12 : this.iWx) {
            bql_12.gQ(set.contains(bql_12.clk()));
        }
    }

    @Override
    public String[] bxk() {
        return iWv;
    }
}

