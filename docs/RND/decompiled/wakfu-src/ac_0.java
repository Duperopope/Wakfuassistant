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
 * Renamed from AC
 */
class ac_0
extends AbstractParser<ab_0> {
    ac_0() {
    }

    public ab_0 kl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ab_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kl(codedInputStream, extensionRegistryLite);
    }
}

