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
 * Renamed from fa
 */
class fa_0
extends AbstractParser<eZ> {
    fa_0() {
    }

    public eZ da(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new eZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.da(codedInputStream, extensionRegistryLite);
    }
}

