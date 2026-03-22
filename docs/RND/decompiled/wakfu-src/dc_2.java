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
 * Renamed from dc
 */
class dc_2
extends AbstractParser<db_2> {
    dc_2() {
    }

    public db_2 bJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new db_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bJ(codedInputStream, extensionRegistryLite);
    }
}

