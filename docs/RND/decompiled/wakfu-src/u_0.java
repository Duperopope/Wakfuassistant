/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from U
 */
public final class u_0
extends GeneratedMessageV3.Builder<u_0>
implements ah_2 {
    private bw_2 bS;
    private SingleFieldBuilderV3<bw_2, by_1, cj_2> bX;
    private bw_2 bU;
    private SingleFieldBuilderV3<bw_2, by_1, cj_2> bY;

    public static final Descriptors.Descriptor cR() {
        return c_0.aV;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aW.ensureFieldAccessorsInitialized(S.class, u_0.class);
    }

    u_0() {
        this.D();
    }

    u_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (S.cQ()) {
            // empty if block
        }
    }

    public u_0 cS() {
        super.clear();
        if (this.bX == null) {
            this.bS = null;
        } else {
            this.bS = null;
            this.bX = null;
        }
        if (this.bY == null) {
            this.bU = null;
        } else {
            this.bU = null;
            this.bY = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aV;
    }

    public S cP() {
        return S.cO();
    }

    public S cT() {
        S s = this.cU();
        if (!s.isInitialized()) {
            throw u_0.newUninitializedMessageException((Message)s);
        }
        return s;
    }

    public S cU() {
        S s = new S(this);
        s.bS = this.bX == null ? this.bS : (bw_2)this.bX.build();
        s.bU = this.bY == null ? this.bU : (bw_2)this.bY.build();
        this.onBuilt();
        return s;
    }

    public u_0 cV() {
        return (u_0)super.clone();
    }

    public u_0 q(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (u_0)super.setField(fieldDescriptor, object);
    }

    public u_0 i(Descriptors.FieldDescriptor fieldDescriptor) {
        return (u_0)super.clearField(fieldDescriptor);
    }

    public u_0 i(Descriptors.OneofDescriptor oneofDescriptor) {
        return (u_0)super.clearOneof(oneofDescriptor);
    }

    public u_0 i(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (u_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public u_0 r(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (u_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public u_0 i(Message message) {
        if (message instanceof S) {
            return this.c((S)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public u_0 c(S s) {
        if (s == S.cO()) {
            return this;
        }
        if (s.cF()) {
            this.d(s.cG());
        }
        if (s.cI()) {
            this.f(s.cJ());
        }
        this.r(S.b(s));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public u_0 A(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        S s = null;
        try {
            s = (S)S.bW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            s = (S)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (s != null) {
                this.c(s);
            }
        }
        return this;
    }

    @Override
    public boolean cF() {
        return this.bX != null || this.bS != null;
    }

    @Override
    public bw_2 cG() {
        if (this.bX == null) {
            return this.bS == null ? bw_2.kP() : this.bS;
        }
        return (bw_2)this.bX.getMessage();
    }

    public u_0 c(bw_2 bw_22) {
        if (this.bX == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.bS = bw_22;
            this.onChanged();
        } else {
            this.bX.setMessage((AbstractMessage)bw_22);
        }
        return this;
    }

    public u_0 b(by_1 by_12) {
        if (this.bX == null) {
            this.bS = by_12.kU();
            this.onChanged();
        } else {
            this.bX.setMessage((AbstractMessage)by_12.kU());
        }
        return this;
    }

    public u_0 d(bw_2 bw_22) {
        if (this.bX == null) {
            this.bS = this.bS != null ? bw_2.i(this.bS).k(bw_22).kV() : bw_22;
            this.onChanged();
        } else {
            this.bX.mergeFrom((AbstractMessage)bw_22);
        }
        return this;
    }

    public u_0 cW() {
        if (this.bX == null) {
            this.bS = null;
            this.onChanged();
        } else {
            this.bS = null;
            this.bX = null;
        }
        return this;
    }

    public by_1 cX() {
        this.onChanged();
        return (by_1)this.cY().getBuilder();
    }

    @Override
    public cj_2 cH() {
        if (this.bX != null) {
            return (cj_2)this.bX.getMessageOrBuilder();
        }
        return this.bS == null ? bw_2.kP() : this.bS;
    }

    private SingleFieldBuilderV3<bw_2, by_1, cj_2> cY() {
        if (this.bX == null) {
            this.bX = new SingleFieldBuilderV3((AbstractMessage)this.cG(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.bS = null;
        }
        return this.bX;
    }

    @Override
    public boolean cI() {
        return this.bY != null || this.bU != null;
    }

    @Override
    public bw_2 cJ() {
        if (this.bY == null) {
            return this.bU == null ? bw_2.kP() : this.bU;
        }
        return (bw_2)this.bY.getMessage();
    }

    public u_0 e(bw_2 bw_22) {
        if (this.bY == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.bU = bw_22;
            this.onChanged();
        } else {
            this.bY.setMessage((AbstractMessage)bw_22);
        }
        return this;
    }

    public u_0 c(by_1 by_12) {
        if (this.bY == null) {
            this.bU = by_12.kU();
            this.onChanged();
        } else {
            this.bY.setMessage((AbstractMessage)by_12.kU());
        }
        return this;
    }

    public u_0 f(bw_2 bw_22) {
        if (this.bY == null) {
            this.bU = this.bU != null ? bw_2.i(this.bU).k(bw_22).kV() : bw_22;
            this.onChanged();
        } else {
            this.bY.mergeFrom((AbstractMessage)bw_22);
        }
        return this;
    }

    public u_0 cZ() {
        if (this.bY == null) {
            this.bU = null;
            this.onChanged();
        } else {
            this.bU = null;
            this.bY = null;
        }
        return this;
    }

    public by_1 da() {
        this.onChanged();
        return (by_1)this.db().getBuilder();
    }

    @Override
    public cj_2 cK() {
        if (this.bY != null) {
            return (cj_2)this.bY.getMessageOrBuilder();
        }
        return this.bU == null ? bw_2.kP() : this.bU;
    }

    private SingleFieldBuilderV3<bw_2, by_1, cj_2> db() {
        if (this.bY == null) {
            this.bY = new SingleFieldBuilderV3((AbstractMessage)this.cJ(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.bU = null;
        }
        return this.bY;
    }

    public final u_0 q(UnknownFieldSet unknownFieldSet) {
        return (u_0)super.setUnknownFields(unknownFieldSet);
    }

    public final u_0 r(UnknownFieldSet unknownFieldSet) {
        return (u_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.r(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.q(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.r(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.i(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.i(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.i(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.q(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.cS();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.cV();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.r(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.A(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.i(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.cS();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.i(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.cV();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.r(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.q(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.r(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.i(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.i(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.i(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.q(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.A(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.cV();
    }

    public /* synthetic */ Message buildPartial() {
        return this.cU();
    }

    public /* synthetic */ Message build() {
        return this.cT();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.i(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.cS();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.A(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.cV();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.cU();
    }

    public /* synthetic */ MessageLite build() {
        return this.cT();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.cS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.cP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.cP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.A(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.cV();
    }

    public /* synthetic */ Object clone() {
        return this.cV();
    }
}

