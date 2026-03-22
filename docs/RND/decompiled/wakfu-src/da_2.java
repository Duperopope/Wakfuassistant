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
 * Renamed from dA
 */
class da_2
extends AbstractParser<dz_2> {
    da_2() {
    }

    public dz_2 bY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new dz_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bY(codedInputStream, extensionRegistryLite);
    }
}

