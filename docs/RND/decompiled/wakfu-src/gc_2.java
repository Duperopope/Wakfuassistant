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
 * Renamed from gc
 */
public final class gc_2
extends GeneratedMessageV3.Builder<gc_2>
implements gd_2 {
    private int an;
    private gj_1 rD;
    private SingleFieldBuilderV3<gj_1, gl_1, gn_1> rI;
    private dz_2 rF;
    private SingleFieldBuilderV3<dz_2, db_1, dh_2> rJ;

    public static final Descriptors.Descriptor Db() {
        return fz_2.rz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fz_2.rA.ensureFieldAccessorsInitialized(ga_2.class, gc_2.class);
    }

    gc_2() {
        this.D();
    }

    gc_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ga_2.aJ()) {
            this.Di();
            this.Dl();
        }
    }

    public gc_2 Dc() {
        super.clear();
        if (this.rI == null) {
            this.rD = null;
        } else {
            this.rI.clear();
        }
        this.an &= 0xFFFFFFFE;
        if (this.rJ == null) {
            this.rF = null;
        } else {
            this.rJ.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fz_2.rz;
    }

    public ga_2 Da() {
        return ga_2.CZ();
    }

    public ga_2 Dd() {
        ga_2 ga_22 = this.De();
        if (!ga_22.isInitialized()) {
            throw gc_2.newUninitializedMessageException((Message)ga_22);
        }
        return ga_22;
    }

    public ga_2 De() {
        ga_2 ga_22 = new ga_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ga_22.rD = this.rI == null ? this.rD : (gj_1)this.rI.build();
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ga_22.rF = this.rJ == null ? this.rF : (dz_2)this.rJ.build();
            n2 |= 2;
        }
        ga_22.an = n2;
        this.onBuilt();
        return ga_22;
    }

    public gc_2 Df() {
        return (gc_2)super.clone();
    }

    public gc_2 ca(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gc_2)super.setField(fieldDescriptor, object);
    }

    public gc_2 aA(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gc_2)super.clearField(fieldDescriptor);
    }

    public gc_2 aA(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gc_2)super.clearOneof(oneofDescriptor);
    }

    public gc_2 aA(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gc_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gc_2 cb(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gc_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public gc_2 aA(Message message) {
        if (message instanceof ga_2) {
            return this.c((ga_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gc_2 c(ga_2 ga_22) {
        if (ga_22 == ga_2.CZ()) {
            return this;
        }
        if (ga_22.CQ()) {
            this.b(ga_22.CR());
        }
        if (ga_22.CT()) {
            this.g(ga_22.CU());
        }
        this.cb(ga_2.b(ga_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.CQ()) {
            return false;
        }
        if (!this.CR().isInitialized()) {
            return false;
        }
        return !this.CT() || this.CU().isInitialized();
    }

    public gc_2 dC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ga_2 ga_22 = null;
        try {
            ga_22 = (ga_2)ga_2.rH.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ga_22 = (ga_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ga_22 != null) {
                this.c(ga_22);
            }
        }
        return this;
    }

    @Override
    public boolean CQ() {
        return (this.an & 1) != 0;
    }

    @Override
    public gj_1 CR() {
        if (this.rI == null) {
            return this.rD == null ? gj_1.DD() : this.rD;
        }
        return (gj_1)this.rI.getMessage();
    }

    public gc_2 a(gj_1 gj_12) {
        if (this.rI == null) {
            if (gj_12 == null) {
                throw new NullPointerException();
            }
            this.rD = gj_12;
            this.onChanged();
        } else {
            this.rI.setMessage((AbstractMessage)gj_12);
        }
        this.an |= 1;
        return this;
    }

    public gc_2 a(gl_1 gl_12) {
        if (this.rI == null) {
            this.rD = gl_12.DH();
            this.onChanged();
        } else {
            this.rI.setMessage((AbstractMessage)gl_12.DH());
        }
        this.an |= 1;
        return this;
    }

    public gc_2 b(gj_1 gj_12) {
        if (this.rI == null) {
            this.rD = (this.an & 1) != 0 && this.rD != null && this.rD != gj_1.DD() ? gj_1.c(this.rD).e(gj_12).DI() : gj_12;
            this.onChanged();
        } else {
            this.rI.mergeFrom((AbstractMessage)gj_12);
        }
        this.an |= 1;
        return this;
    }

    public gc_2 Dg() {
        if (this.rI == null) {
            this.rD = null;
            this.onChanged();
        } else {
            this.rI.clear();
        }
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public gl_1 Dh() {
        this.an |= 1;
        this.onChanged();
        return (gl_1)this.Di().getBuilder();
    }

    @Override
    public gn_1 CS() {
        if (this.rI != null) {
            return (gn_1)this.rI.getMessageOrBuilder();
        }
        return this.rD == null ? gj_1.DD() : this.rD;
    }

    private SingleFieldBuilderV3<gj_1, gl_1, gn_1> Di() {
        if (this.rI == null) {
            this.rI = new SingleFieldBuilderV3((AbstractMessage)this.CR(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.rD = null;
        }
        return this.rI;
    }

    @Override
    public boolean CT() {
        return (this.an & 2) != 0;
    }

    @Override
    public dz_2 CU() {
        if (this.rJ == null) {
            return this.rF == null ? dz_2.rv() : this.rF;
        }
        return (dz_2)this.rJ.getMessage();
    }

    public gc_2 f(dz_2 dz_22) {
        if (this.rJ == null) {
            if (dz_22 == null) {
                throw new NullPointerException();
            }
            this.rF = dz_22;
            this.onChanged();
        } else {
            this.rJ.setMessage((AbstractMessage)dz_22);
        }
        this.an |= 2;
        return this;
    }

    public gc_2 b(db_1 db_12) {
        if (this.rJ == null) {
            this.rF = db_12.rz();
            this.onChanged();
        } else {
            this.rJ.setMessage((AbstractMessage)db_12.rz());
        }
        this.an |= 2;
        return this;
    }

    public gc_2 g(dz_2 dz_22) {
        if (this.rJ == null) {
            this.rF = (this.an & 2) != 0 && this.rF != null && this.rF != dz_2.rv() ? dz_2.c(this.rF).e(dz_22).rA() : dz_22;
            this.onChanged();
        } else {
            this.rJ.mergeFrom((AbstractMessage)dz_22);
        }
        this.an |= 2;
        return this;
    }

    public gc_2 Dj() {
        if (this.rJ == null) {
            this.rF = null;
            this.onChanged();
        } else {
            this.rJ.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public db_1 Dk() {
        this.an |= 2;
        this.onChanged();
        return (db_1)this.Dl().getBuilder();
    }

    @Override
    public dh_2 CV() {
        if (this.rJ != null) {
            return (dh_2)this.rJ.getMessageOrBuilder();
        }
        return this.rF == null ? dz_2.rv() : this.rF;
    }

    private SingleFieldBuilderV3<dz_2, db_1, dh_2> Dl() {
        if (this.rJ == null) {
            this.rJ = new SingleFieldBuilderV3((AbstractMessage)this.CU(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.rF = null;
        }
        return this.rJ;
    }

    public final gc_2 ca(UnknownFieldSet unknownFieldSet) {
        return (gc_2)super.setUnknownFields(unknownFieldSet);
    }

    public final gc_2 cb(UnknownFieldSet unknownFieldSet) {
        return (gc_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cb(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ca(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cb(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aA(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aA(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aA(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ca(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Dc();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Df();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cb(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aA(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Dc();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aA(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Df();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cb(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ca(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cb(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aA(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aA(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aA(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ca(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Df();
    }

    public /* synthetic */ Message buildPartial() {
        return this.De();
    }

    public /* synthetic */ Message build() {
        return this.Dd();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aA(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Dc();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Df();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.De();
    }

    public /* synthetic */ MessageLite build() {
        return this.Dd();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Dc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Da();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Da();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Df();
    }

    public /* synthetic */ Object clone() {
        return this.Df();
    }
}

