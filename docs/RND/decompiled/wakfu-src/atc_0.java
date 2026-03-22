/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aTc
 */
public class atc_0
extends aRY {
    public static final int eQm = 1;
    public static final int eQn = 2;
    private final int eQo;
    private final int eQp;
    @NotNull
    private final String eQq;

    public atc_0(int n) {
        this(n, 0, null);
    }

    public atc_0(int n, int n2, @Nullable String string) {
        this.eQo = n;
        this.eQp = n2;
        this.eQq = string == null ? "" : string;
    }

    @Override
    public boolean isValid() {
        switch (this.eQo) {
            case 2: {
                return true;
            }
            case 1: {
                return this.eQp > 0;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        switch (this.eQo) {
            case 1: {
                ayf_2 ayf_22 = aue_0.cVJ().etu();
                if (ayf_22 == null) {
                    aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
                    return;
                }
                ns_0 ns_02 = new ns_0();
                ns_02.C((byte)3);
                ns_02.Q((short)226);
                ns_02.cX(aqw_0.cCv());
                ns_02.nX(this.eQp);
                ns_02.cT(this.eQq);
                ayf_22.d(ns_02);
                break;
            }
            case 2: {
                atc_0.jG("shard (createItem|ci) refId : create item with 4 white shard slots");
                atc_0.jG("shard (createItem|ci) refId slotsColor : create item with specifiedSlots : \"1234\"");
            }
        }
    }

    @Generated
    public int acs() {
        return this.eQp;
    }
}

