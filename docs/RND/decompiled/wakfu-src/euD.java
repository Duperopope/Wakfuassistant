/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Scopes
 */
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Scopes;

public final class euD
extends AbstractModule {
    @FT
    public Module eGz() {
        return new aud_0();
    }

    protected void configure() {
        this.bind(euA.class).to(euC.class).in(Scopes.SINGLETON);
    }
}

