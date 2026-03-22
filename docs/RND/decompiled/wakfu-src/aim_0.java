/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Scopes
 *  com.google.inject.assistedinject.FactoryModuleBuilder
 */
import com.ankamagames.wakfu.client.WakfuClient;
import com.google.common.collect.ImmutableList;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import java.util.List;

/*
 * Renamed from aIm
 */
public final class aim_0
extends AbstractModule {
    @FT
    public List<Module> aPa() {
        return ImmutableList.of((Object)((Object)new cas_0()));
    }

    public void configure() {
        this.bind(WakfuClient.class).in(Scopes.SINGLETON);
        this.bind(cpw_2.class).to(btZ.class);
        this.bind(cpd_1.class).to(cik_1.class);
        this.bind(cpe_1.class).to(cip_1.class);
        this.bind(cpf_1.class).to(ciq_1.class);
        this.install(new FactoryModuleBuilder().implement(fam_0.class, caj_2.class).build(cpb_1.class));
    }
}

