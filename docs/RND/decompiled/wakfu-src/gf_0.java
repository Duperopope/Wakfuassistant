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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gF
 */
public final class gf_0
extends GeneratedMessageV3.Builder<gf_0>
implements gK {
    private int an;
    private List<gG> sD = Collections.emptyList();
    private RepeatedFieldBuilderV3<gG, gI, gJ> sG;

    public static final Descriptors.Descriptor EK() {
        return gc_0.sx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gc_0.sy.ensureFieldAccessorsInitialized(gd_0.class, gf_0.class);
    }

    gf_0() {
        this.D();
    }

    gf_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gd_0.aJ()) {
            this.ET();
        }
    }

    public gf_0 EL() {
        super.clear();
        if (this.sG == null) {
            this.sD = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.sG.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gc_0.sx;
    }

    public gd_0 EJ() {
        return gd_0.EI();
    }

    public gd_0 EM() {
        gd_0 gd_02 = this.EN();
        if (!gd_02.isInitialized()) {
            throw gf_0.newUninitializedMessageException((Message)gd_02);
        }
        return gd_02;
    }

    public gd_0 EN() {
        gd_0 gd_02 = new gd_0(this);
        int n = this.an;
        if (this.sG == null) {
            if ((this.an & 1) != 0) {
                this.sD = Collections.unmodifiableList(this.sD);
                this.an &= 0xFFFFFFFE;
            }
            gd_02.sD = this.sD;
        } else {
            gd_02.sD = this.sG.build();
        }
        this.onBuilt();
        return gd_02;
    }

    public gf_0 EO() {
        return (gf_0)super.clone();
    }

    public gf_0 ck(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gf_0)super.setField(fieldDescriptor, object);
    }

    public gf_0 aF(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gf_0)super.clearField(fieldDescriptor);
    }

    public gf_0 aF(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gf_0)super.clearOneof(oneofDescriptor);
    }

    public gf_0 aF(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gf_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gf_0 cl(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gf_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public gf_0 aF(Message message) {
        if (message instanceof gd_0) {
            return this.c((gd_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gf_0 c(gd_0 gd_02) {
        if (gd_02 == gd_0.EI()) {
            return this;
        }
        if (this.sG == null) {
            if (!gd_02.sD.isEmpty()) {
                if (this.sD.isEmpty()) {
                    this.sD = gd_02.sD;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.EP();
                    this.sD.addAll(gd_02.sD);
                }
                this.onChanged();
            }
        } else if (!gd_02.sD.isEmpty()) {
            if (this.sG.isEmpty()) {
                this.sG.dispose();
                this.sG = null;
                this.sD = gd_02.sD;
                this.an &= 0xFFFFFFFE;
                this.sG = gd_0.oB() ? this.ET() : null;
            } else {
                this.sG.addAllMessages(gd_02.sD);
            }
        }
        this.cl(gd_0.b(gd_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.EE(); ++i) {
            if (this.cY(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public gf_0 dR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gd_0 gd_02 = null;
        try {
            gd_02 = (gd_0)gd_0.sF.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gd_02 = (gd_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gd_02 != null) {
                this.c(gd_02);
            }
        }
        return this;
    }

    private void EP() {
        if ((this.an & 1) == 0) {
            this.sD = new ArrayList<gG>(this.sD);
            this.an |= 1;
        }
    }

    @Override
    public List<gG> EC() {
        if (this.sG == null) {
            return Collections.unmodifiableList(this.sD);
        }
        return this.sG.getMessageList();
    }

    @Override
    public int EE() {
        if (this.sG == null) {
            return this.sD.size();
        }
        return this.sG.getCount();
    }

    @Override
    public gG cY(int n) {
        if (this.sG == null) {
            return this.sD.get(n);
        }
        return (gG)this.sG.getMessage(n);
    }

    public gf_0 a(int n, gG gG2) {
        if (this.sG == null) {
            if (gG2 == null) {
                throw new NullPointerException();
            }
            this.EP();
            this.sD.set(n, gG2);
            this.onChanged();
        } else {
            this.sG.setMessage(n, (AbstractMessage)gG2);
        }
        return this;
    }

    public gf_0 a(int n, gI gI2) {
        if (this.sG == null) {
            this.EP();
            this.sD.set(n, gI2.Fi());
            this.onChanged();
        } else {
            this.sG.setMessage(n, (AbstractMessage)gI2.Fi());
        }
        return this;
    }

    public gf_0 a(gG gG2) {
        if (this.sG == null) {
            if (gG2 == null) {
                throw new NullPointerException();
            }
            this.EP();
            this.sD.add(gG2);
            this.onChanged();
        } else {
            this.sG.addMessage((AbstractMessage)gG2);
        }
        return this;
    }

    public gf_0 b(int n, gG gG2) {
        if (this.sG == null) {
            if (gG2 == null) {
                throw new NullPointerException();
            }
            this.EP();
            this.sD.add(n, gG2);
            this.onChanged();
        } else {
            this.sG.addMessage(n, (AbstractMessage)gG2);
        }
        return this;
    }

    public gf_0 a(gI gI2) {
        if (this.sG == null) {
            this.EP();
            this.sD.add(gI2.Fi());
            this.onChanged();
        } else {
            this.sG.addMessage((AbstractMessage)gI2.Fi());
        }
        return this;
    }

    public gf_0 b(int n, gI gI2) {
        if (this.sG == null) {
            this.EP();
            this.sD.add(n, gI2.Fi());
            this.onChanged();
        } else {
            this.sG.addMessage(n, (AbstractMessage)gI2.Fi());
        }
        return this;
    }

    public gf_0 x(Iterable<? extends gG> iterable) {
        if (this.sG == null) {
            this.EP();
            AbstractMessageLite.Builder.addAll(iterable, this.sD);
            this.onChanged();
        } else {
            this.sG.addAllMessages(iterable);
        }
        return this;
    }

    public gf_0 EQ() {
        if (this.sG == null) {
            this.sD = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.sG.clear();
        }
        return this;
    }

    public gf_0 da(int n) {
        if (this.sG == null) {
            this.EP();
            this.sD.remove(n);
            this.onChanged();
        } else {
            this.sG.remove(n);
        }
        return this;
    }

    public gI db(int n) {
        return (gI)this.ET().getBuilder(n);
    }

    @Override
    public gJ cZ(int n) {
        if (this.sG == null) {
            return this.sD.get(n);
        }
        return (gJ)this.sG.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends gJ> ED() {
        if (this.sG != null) {
            return this.sG.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.sD);
    }

    public gI ER() {
        return (gI)this.ET().addBuilder((AbstractMessage)gG.Fe());
    }

    public gI dc(int n) {
        return (gI)this.ET().addBuilder(n, (AbstractMessage)gG.Fe());
    }

    public List<gI> ES() {
        return this.ET().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gG, gI, gJ> ET() {
        if (this.sG == null) {
            this.sG = new RepeatedFieldBuilderV3(this.sD, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.sD = null;
        }
        return this.sG;
    }

    public final gf_0 ck(UnknownFieldSet unknownFieldSet) {
        return (gf_0)super.setUnknownFields(unknownFieldSet);
    }

    public final gf_0 cl(UnknownFieldSet unknownFieldSet) {
        return (gf_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cl(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ck(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cl(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aF(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aF(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aF(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ck(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.EL();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.EO();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cl(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aF(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.EL();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aF(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.EO();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cl(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ck(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cl(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aF(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aF(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aF(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ck(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.EO();
    }

    public /* synthetic */ Message buildPartial() {
        return this.EN();
    }

    public /* synthetic */ Message build() {
        return this.EM();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aF(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.EL();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.EO();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.EN();
    }

    public /* synthetic */ MessageLite build() {
        return this.EM();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.EL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.EJ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.EJ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.EO();
    }

    public /* synthetic */ Object clone() {
        return this.EO();
    }
}

