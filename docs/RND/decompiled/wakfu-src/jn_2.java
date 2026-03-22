/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from jN
 */
public final class jn_2
extends GeneratedMessageV3.Builder<jn_2>
implements jo_2 {
    private int an;
    private int dL;
    private long Db;
    private long Dd;

    public static final Descriptors.Descriptor WY() {
        return jk_2.CW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CX.ensureFieldAccessorsInitialized(jl_2.class, jn_2.class);
    }

    jn_2() {
        this.D();
    }

    jn_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jl_2.Y()) {
            // empty if block
        }
    }

    public jn_2 WZ() {
        super.clear();
        this.dL = 0;
        this.an &= 0xFFFFFFFE;
        this.Db = 0L;
        this.an &= 0xFFFFFFFD;
        this.Dd = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jk_2.CW;
    }

    public jl_2 WX() {
        return jl_2.WW();
    }

    public jl_2 Xa() {
        jl_2 jl_22 = this.Xb();
        if (!jl_22.isInitialized()) {
            throw jn_2.newUninitializedMessageException((Message)jl_22);
        }
        return jl_22;
    }

    public jl_2 Xb() {
        jl_2 jl_22 = new jl_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jl_22.dL = this.dL;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            jl_22.Db = this.Db;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            jl_22.Dd = this.Dd;
            n2 |= 4;
        }
        jl_22.an = n2;
        this.onBuilt();
        return jl_22;
    }

    public jn_2 Xc() {
        return (jn_2)super.clone();
    }

    public jn_2 dG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jn_2)super.setField(fieldDescriptor, object);
    }

    public jn_2 bq(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jn_2)super.clearField(fieldDescriptor);
    }

    public jn_2 bq(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jn_2)super.clearOneof(oneofDescriptor);
    }

    public jn_2 bq(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jn_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jn_2 dH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jn_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public jn_2 bq(Message message) {
        if (message instanceof jl_2) {
            return this.c((jl_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jn_2 c(jl_2 jl_22) {
        if (jl_22 == jl_2.WW()) {
            return this;
        }
        if (jl_22.oN()) {
            this.fK(jl_22.d());
        }
        if (jl_22.WP()) {
            this.aD(jl_22.WQ());
        }
        if (jl_22.WR()) {
            this.aE(jl_22.WS());
        }
        this.dH(jl_2.b(jl_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.WP()) {
            return false;
        }
        return this.WR();
    }

    public jn_2 fY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jl_2 jl_22 = null;
        try {
            jl_22 = (jl_2)jl_2.Df.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jl_22 = (jl_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jl_22 != null) {
                this.c(jl_22);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public jn_2 fK(int n) {
        this.an |= 1;
        this.dL = n;
        this.onChanged();
        return this;
    }

    public jn_2 Xd() {
        this.an &= 0xFFFFFFFE;
        this.dL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean WP() {
        return (this.an & 2) != 0;
    }

    @Override
    public long WQ() {
        return this.Db;
    }

    public jn_2 aD(long l) {
        this.an |= 2;
        this.Db = l;
        this.onChanged();
        return this;
    }

    public jn_2 Xe() {
        this.an &= 0xFFFFFFFD;
        this.Db = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean WR() {
        return (this.an & 4) != 0;
    }

    @Override
    public long WS() {
        return this.Dd;
    }

    public jn_2 aE(long l) {
        this.an |= 4;
        this.Dd = l;
        this.onChanged();
        return this;
    }

    public jn_2 Xf() {
        this.an &= 0xFFFFFFFB;
        this.Dd = 0L;
        this.onChanged();
        return this;
    }

    public final jn_2 dG(UnknownFieldSet unknownFieldSet) {
        return (jn_2)super.setUnknownFields(unknownFieldSet);
    }

    public final jn_2 dH(UnknownFieldSet unknownFieldSet) {
        return (jn_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bq(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bq(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bq(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.WZ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Xc();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bq(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.WZ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bq(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Xc();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bq(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bq(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bq(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Xc();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Xb();
    }

    public /* synthetic */ Message build() {
        return this.Xa();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bq(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.WZ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Xc();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Xb();
    }

    public /* synthetic */ MessageLite build() {
        return this.Xa();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.WZ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.WX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.WX();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Xc();
    }

    public /* synthetic */ Object clone() {
        return this.Xc();
    }
}

