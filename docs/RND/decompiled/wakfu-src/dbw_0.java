/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from dbW
 */
public class dbw_0
extends dae_0 {
    private final boolean oef;
    private final List<bhi_1> oeg;

    public dbw_0(bhi_1 bhi_12) {
        this(true, List.of(bhi_12));
    }

    public dbw_0(boolean bl, List<bhi_1> list) {
        this.oef = bl;
        this.oeg = list;
    }

    @Override
    public int d() {
        return 18386;
    }

    @Generated
    public boolean fbi() {
        return this.oef;
    }

    @Generated
    public List<bhi_1> dbN() {
        return this.oeg;
    }
}

