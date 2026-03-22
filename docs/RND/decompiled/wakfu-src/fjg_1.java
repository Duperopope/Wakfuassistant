/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from fJg
 */
public interface fjg_1
extends fja_2,
fjm_1 {
    public Collection<fcv_1> getSelecteds();

    @Override
    default public fcv_1 getSelected() {
        return this.getSelecteds().stream().findFirst().orElse(null);
    }

    public Collection<Object> getSelectedValues();

    @Override
    default public Object getSelectedValue() {
        return this.getSelectedValues().stream().findFirst().orElse(null);
    }
}

