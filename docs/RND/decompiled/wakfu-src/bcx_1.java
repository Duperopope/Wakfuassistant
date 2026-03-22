/*
 * Decompiled with CFR 0.152.
 */
import java.util.OptionalInt;

/*
 * Renamed from bcX
 */
public class bcx_1
extends bdb_2 {
    public bcx_1(boolean bl) {
        super(bl);
    }

    @Override
    boolean b(bcl_1 bcl_12) {
        OptionalInt optionalInt = bcx_1.c(bcl_12);
        return optionalInt.isPresent() && optionalInt.getAsInt() != 649;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joC;
    }
}

