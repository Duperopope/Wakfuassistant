/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fIo
 */
public abstract class fio_1
extends fip_1
implements fis_1 {
    private static final Logger uAR = Logger.getLogger(fio_1.class);
    private fiq_1 uAS;

    public abstract fzq_0 gBy();

    public Object O(fiq_1 fiq_12) {
        this.uAS = fiq_12;
        Object t = fiq_12.gBD();
        if (t != null) {
            super.setElementMap(((fhv_1)t).getElementMap());
        }
        return super.gBz();
    }

    @Override
    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        list.add(this.uAS.getClass());
        list2.add(this.uAS);
        super.a(stringArray, list, list2);
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        Object object = this.O(fiq_12);
        this.uAS = null;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return false;
    }
}

