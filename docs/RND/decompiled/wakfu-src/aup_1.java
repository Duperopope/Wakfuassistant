/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from aup
 */
public abstract class aup_1<T extends ats_1>
extends auo_1<T> {
    private static final Logger des = Logger.getLogger(aup_1.class);
    public static final byte det = 1;
    public static final byte deu = 2;

    public static ats_1 w(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return auu_1.deB.y(dataInput, f2);
            }
            case 2: {
                return auv_1.deC.z(dataInput, f2);
            }
        }
        des.error((Object)("type de condition inconnu " + by));
        return null;
    }
}

