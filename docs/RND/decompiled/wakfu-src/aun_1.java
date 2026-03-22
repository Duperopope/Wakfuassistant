/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from aun
 */
public abstract class aun_1<T extends att_2>
extends auo_1<T> {
    private static final Logger dep = Logger.getLogger(aum_1.class);
    public static final byte deq = 1;
    public static final byte der = 2;

    public static att_2 s(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return auy_1.deH.A(dataInput, f2);
            }
            case 2: {
                return auz_1.deI.B(dataInput, f2);
            }
        }
        dep.error((Object)("type de definition inconnu " + by));
        return null;
    }
}

