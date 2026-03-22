/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fJa
 */
public interface fja_2
extends fjh_2 {
    public void aW(Object var1);

    public void aV(Object var1);

    public boolean f(int var1, Object var2);

    public int p(Object var1, Object var2);

    public boolean r(Object var1, Object var2);

    public Object getValue(int var1);

    public int getTableIndex(fcv_1 var1);

    public int getItemIndex(Object var1);

    public ArrayList<fcv_1> getRenderables();

    public int aVo();

    default public boolean aJG() {
        return this.aVo() == 0;
    }
}

