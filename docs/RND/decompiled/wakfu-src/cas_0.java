/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Provides
 *  com.google.inject.Scopes
 *  com.google.inject.Singleton
 */
import com.google.common.collect.ImmutableList;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import java.util.List;

/*
 * Renamed from cAs
 */
public final class cas_0
extends AbstractModule {
    @FT
    public Module eGz() {
        return new cac_0();
    }

    protected void configure() {
        this.bind(caq_0.class).to(car_0.class).in(Scopes.SINGLETON);
    }

    @Provides
    @Singleton
    List<cap_0> a(cax_0 cax_02) {
        return ImmutableList.of((Object)cax_02);
    }
}

