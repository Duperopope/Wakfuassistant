/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from Ag
 */
class ag_0
extends AbstractParser<Af> {
    ag_0() {
    }

    public Af jW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new Af(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jW(codedInputStream, extensionRegistryLite);
    }
}

