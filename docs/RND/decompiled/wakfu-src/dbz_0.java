/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from dbZ
 */
public class dbz_0
extends dae_0 {
    private final List<bhi_1> oek;

    public dbz_0(bhi_1 bhi_12) {
        this.oek = List.of(bhi_12);
    }

    public dbz_0(List<bhi_1> list) {
        this.oek = list;
    }

    @Override
    public int d() {
        return 18008;
    }

    @Generated
    public List<bhi_1> dbN() {
        return this.oek;
    }
}

