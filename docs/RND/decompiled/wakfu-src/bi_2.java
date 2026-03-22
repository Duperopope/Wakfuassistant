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
 * Renamed from bi
 */
class bi_2
extends AbstractParser<bh_1> {
    bi_2() {
    }

    public bh_1 as(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bh_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.as(codedInputStream, extensionRegistryLite);
    }
}

