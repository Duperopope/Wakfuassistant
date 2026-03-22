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
 * Renamed from bIh
 */
public class bih_1
implements aeh_2 {
    public static final String keL = "name";
    public static final String keM = "icon";
    public static final String keN = "shardStyle";
    @NotNull
    private final fjd keO;
    private final String keP;
    private final String keQ;

    public bih_1(@NotNull fjd fjd2) {
        this.keO = fjd2;
        this.keP = bES.a(fjd2, false);
        this.keQ = bih_1.a(fjd2);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.keQ;
            }
            case "icon": 
            case "shardStyle": {
                return this.keP;
            }
        }
        return null;
    }

    public static String a(fjd fjd2) {
        return aum_0.cWf().c("market.slot.color." + fjd2.d(), new Object[0]);
    }

    @Override
    public String[] bxk() {
        return new String[]{keL, keM, keN};
    }

    @NotNull
    @Generated
    public fjd dXy() {
        return this.keO;
    }

    @Generated
    public String dXz() {
        return this.keP;
    }

    @Generated
    public String getName() {
        return this.keQ;
    }

    @Generated
    public String toString() {
        return "MarketSlotColorView(m_slotColor=" + String.valueOf((Object)this.dXy()) + ", m_icon=" + this.dXz() + ", m_name=" + this.getName() + ")";
    }

    @Generated
    public bih_1(@NotNull fjd fjd2, String string, String string2) {
        if (fjd2 == null) {
            throw new NullPointerException("slotColor is marked non-null but is null");
        }
        this.keO = fjd2;
        this.keP = string;
        this.keQ = string2;
    }
}

