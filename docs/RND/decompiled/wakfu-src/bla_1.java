/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bla
 */
public class bla_1
extends bkz_1 {
    public static final String isV = "buy-compartment-id";

    public bla_1() {
        super(isV, "", awx_2.doa, (short)Short.MAX_VALUE);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if ("isMarket".equals(string)) {
            return true;
        }
        return super.eu(string);
    }

    @Override
    public boolean chv() {
        return true;
    }
}

