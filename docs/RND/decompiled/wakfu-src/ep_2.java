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
 * Renamed from ep
 */
class ep_2
extends AbstractParser<eo_2> {
    ep_2() {
    }

    public eo_2 cz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new eo_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cz(codedInputStream, extensionRegistryLite);
    }
}

