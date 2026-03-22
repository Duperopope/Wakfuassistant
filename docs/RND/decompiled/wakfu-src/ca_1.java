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
 * Renamed from ca
 */
class ca_1
extends AbstractParser<bz_2> {
    ca_1() {
    }

    public bz_2 aZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bz_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aZ(codedInputStream, extensionRegistryLite);
    }
}

