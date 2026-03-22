/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ClassToInstanceMap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.inject.Module
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Module;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Unmodifiable;

class FL {
    private final FI aBV;
    private final ClassToInstanceMap<Module> aBW;
    private final Iterable<Module> aBX;
    private final Set<FC> aBY = Sets.newLinkedHashSet();
    private final Set<FC> aBZ = Sets.newHashSet();
    private final Map<FR, Fy> aCa = Maps.newLinkedHashMap();
    private final List<FR> aCb;

    public FL(FI fI, Iterable<Module> iterable, ClassToInstanceMap<Module> classToInstanceMap, List<FR> list) {
        this.aBV = fI;
        this.aBX = iterable;
        this.aBW = classToInstanceMap;
        this.aCb = list;
    }

    public FK aLp() {
        Fw fw = new Fw();
        this.aBY.add(fw);
        for (Object object2 : this.aBX) {
            this.a((FC)fw, (Module)object2);
        }
        Object object = this.i(Module.class).iterator();
        while (object.hasNext()) {
            Object object2;
            object2 = (FR)object.next();
            this.a((FC)fw, (FR)object2);
        }
        this.aBZ.add(fw);
        while ((object = (FC)Iterables.getFirst(this.aLq(), null)) != null) {
            this.b((FC)object);
        }
        return new FK(this.aBY, fw, Iterables.filter((Iterable)Lists.transform(this.aCb, (Function)Functions.forMap(this.aCa, null)), (Predicate)Predicates.notNull()));
    }

    private @Unmodifiable List<FR> i(Class<? extends Module> clazz) {
        return this.aCb.stream().filter(fR -> fR.aLv() == clazz).toList();
    }

    private void a(FC fC, Module module) {
        FM fM = new FM(module);
        this.a(fC, fM);
    }

    private void a(FC fC, FC fC2) {
        this.a(FB.aBD, fC, fC2);
    }

    private Fy a(FB fB, FC fC, FC fC2) {
        Preconditions.checkArgument((boolean)this.aBY.contains(fC), (Object)"Cannot add a link if source is not in graph.");
        this.aBY.add(fC2);
        Fy fy = new Fy(fB, fC, (FC)Iterables.find(this.aBY, (Predicate)Predicates.equalTo((Object)fC2)));
        fC.c(fy);
        return fy;
    }

    private Set<FC> aLq() {
        return Sets.difference(this.aBY, this.aBZ);
    }

    private void b(FC fC) {
        if (fC instanceof FO) {
            this.a((FO)fC);
        } else if (fC instanceof FM) {
            this.a((FM)fC);
        }
    }

    private void a(FM fM) {
        Module module = fM.aLr();
        this.a(fM, module);
        this.b(fM, module);
        this.c(fM, module);
        this.aBZ.add(fM);
    }

    private void a(FM fM, Module module) {
        Iterable<Module> iterable = this.aBV.a(module);
        for (Module module2 : iterable) {
            this.a((FC)fM, module2);
        }
    }

    private void b(FM fM, Module module) {
        Iterable<Class<? extends Module>> iterable = this.aBV.b(module);
        for (Class<? extends Module> clazz : iterable) {
            this.a((FC)fM, new FO(clazz));
        }
    }

    private void c(FM fM, Module module) {
        List<FR> list = this.i(module.getClass());
        if (list.isEmpty()) {
            return;
        }
        for (FR fR : list) {
            this.a((FC)fM, fR);
        }
    }

    private void a(FO fO) {
        Class<? extends Module> clazz = fO.aLs();
        Module module = (Module)this.aBW.get(clazz);
        if (module == null) {
            throw new IllegalArgumentException("No implementation configured for " + clazz.getName());
        }
        this.a((FC)fO, module);
        this.aBZ.add(fO);
    }

    private void a(FC fC, FR fR) {
        ImmutableList<Module> immutableList = fR.aLw();
        if (immutableList.isEmpty()) {
            return;
        }
        Fw fw = new Fw();
        Fy fy = this.a(FB.aBE, fC, fw);
        this.aCa.put(fR, fy);
        for (Module module : immutableList) {
            this.a(FB.aBD, fw, new FM(module));
        }
        this.aBZ.add(fw);
    }
}

