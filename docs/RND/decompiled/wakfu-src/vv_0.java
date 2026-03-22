/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from Vv
 */
public class vv_0
extends vw_0
implements LO {
    private final HashMap<String, Object> bIh = new HashMap();
    private final int bIi;

    public vv_0(int n) {
        this.bIi = n;
    }

    public int aeV() {
        return this.bIi;
    }

    public void b(String string, Object object) {
        this.bIh.put(string, object);
    }

    public byte do(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (Byte)object : (byte)0;
        }
        throw new ada_1(string);
    }

    public boolean dp(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (Boolean)object : false;
        }
        throw new ada_1(string);
    }

    public int dq(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (Integer)object : 0;
        }
        throw new ada_1(string);
    }

    public long dr(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            if (object != null) {
                if (object instanceof Long) {
                    return (Long)object;
                }
                if (object instanceof BigInteger) {
                    return ((BigInteger)object).longValue();
                }
            }
            return 0L;
        }
        throw new ada_1(string);
    }

    public float ds(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? ((Float)object).floatValue() : 0.0f;
        }
        throw new ada_1(string);
    }

    public double dt(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (Double)object : 0.0;
        }
        throw new ada_1(string);
    }

    @Nullable
    public String du(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (String)object : null;
        }
        throw new ada_1(string);
    }

    @Nullable
    public Timestamp dv(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (Timestamp)object : null;
        }
        throw new ada_1(string);
    }

    @Nullable
    public Date dw(String string) {
        if (this.cC(string)) {
            Object object = this.bIh.get(string);
            return object != null ? (Date)object : null;
        }
        throw new ada_1(string);
    }

    @Override
    public Object cB(String string) {
        if (this.cC(string)) {
            return this.bIh.get(string);
        }
        throw new ada_1(string);
    }

    @Override
    public boolean cC(String string) {
        return this.bIh != null && this.bIh.containsKey(string);
    }

    public Set<String> bkr() {
        return this.bIh.keySet();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestResultMessage : ");
        stringBuilder.append(this.getClass().getName()).append('\n');
        stringBuilder.append("Properties {\n");
        for (Map.Entry<String, Object> entry : this.bIh.entrySet()) {
            stringBuilder.append('\t').append(entry.getKey()).append(" = ").append(entry.getValue()).append('\n');
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

