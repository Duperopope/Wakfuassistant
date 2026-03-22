/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from auq
 */
public abstract class auq_1<T extends atw_2>
extends auo_1<T> {
    private static final Logger dev = Logger.getLogger(auq_1.class);
    public static final byte dew = 1;
    public static final byte dex = 2;

    public static atw_2 x(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return auh_1.deW.C(dataInput, f2);
            }
            case 2: {
                return aui_1.deX.D(dataInput, f2);
            }
        }
        dev.error((Object)("type de condition inconnu " + by));
        return null;
    }

    protected abstract boolean a(T var1, T var2);

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atw_2)object, (atw_2)object2);
    }
}

