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
 * Renamed from bq
 */
class bq_1
extends AbstractParser<bp_1> {
    bq_1() {
    }

    public bp_1 ay(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bp_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ay(codedInputStream, extensionRegistryLite);
    }
}

