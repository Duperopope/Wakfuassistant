/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Module
 *  com.google.inject.util.Modules
 */
import com.google.common.base.Preconditions;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import java.util.List;
import java.util.Set;

class Fx {
    Fx() {
    }

    public Module a(FK fK) {
        List<Set<Module>> list = new FQ(fK).aLu();
        Preconditions.checkArgument((!list.isEmpty() ? 1 : 0) != 0);
        Module module = Modules.combine((Iterable)list.get(0));
        for (int i = 1; i < list.size(); ++i) {
            module = Modules.override((Module[])new Module[]{module}).with((Iterable)list.get(i));
        }
        return module;
    }
}

