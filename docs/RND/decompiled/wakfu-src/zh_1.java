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
 * Renamed from zH
 */
public final class zh_1
extends GeneratedMessageV3.Builder<zh_1>
implements zi_1 {
    private int an;
    private List<zj_1> aoM = Collections.emptyList();
    private RepeatedFieldBuilderV3<zj_1, zl_1, zm_1> aoP;

    public static final Descriptors.Descriptor azV() {
        return zc_2.aoy;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zc_2.aoz.ensureFieldAccessorsInitialized(zf_2.class, zh_1.class);
    }

    zh_1() {
        this.D();
    }

    zh_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zf_2.aJ()) {
            this.aAe();
        }
    }

    public zh_1 azW() {
        super.clear();
        if (this.aoP == null) {
            this.aoM = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.aoP.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zc_2.aoy;
    }

    public zf_2 azU() {
        return zf_2.azT();
    }

    public zf_2 azX() {
        zf_2 zf_22 = this.azY();
        if (!zf_22.isInitialized()) {
            throw zh_1.newUninitializedMessageException((Message)zf_22);
        }
        return zf_22;
    }

    public zf_2 azY() {
        zf_2 zf_22 = new zf_2(this);
        int n = this.an;
        if (this.aoP == null) {
            if ((this.an & 1) != 0) {
                this.aoM = Collections.unmodifiableList(this.aoM);
                this.an &= 0xFFFFFFFE;
            }
            zf_22.aoM = this.aoM;
        } else {
            zf_22.aoM = this.aoP.build();
        }
        this.onBuilt();
        return zf_22;
    }

    public zh_1 azZ() {
        return (zh_1)super.clone();
    }

    public zh_1 gc(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zh_1)super.setField(fieldDescriptor, object);
    }

    public zh_1 cB(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zh_1)super.clearField(fieldDescriptor);
    }

    public zh_1 cB(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zh_1)super.clearOneof(oneofDescriptor);
    }

    public zh_1 cB(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zh_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zh_1 gd(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zh_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public zh_1 cB(Message message) {
        if (message instanceof zf_2) {
            return this.c((zf_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zh_1 c(zf_2 zf_22) {
        if (zf_22 == zf_2.azT()) {
            return this;
        }
        if (this.aoP == null) {
            if (!zf_22.aoM.isEmpty()) {
                if (this.aoM.isEmpty()) {
                    this.aoM = zf_22.aoM;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.aAa();
                    this.aoM.addAll(zf_22.aoM);
                }
                this.onChanged();
            }
        } else if (!zf_22.aoM.isEmpty()) {
            if (this.aoP.isEmpty()) {
                this.aoP.dispose();
                this.aoP = null;
                this.aoM = zf_22.aoM;
                this.an &= 0xFFFFFFFE;
                this.aoP = zf_2.oB() ? this.aAe() : null;
            } else {
                this.aoP.addAllMessages(zf_22.aoM);
            }
        }
        this.gd(zf_2.b(zf_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.azP(); ++i) {
            if (this.kU(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zh_1 jF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zf_2 zf_22 = null;
        try {
            zf_22 = (zf_2)zf_2.aoO.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zf_22 = (zf_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zf_22 != null) {
                this.c(zf_22);
            }
        }
        return this;
    }

    private void aAa() {
        if ((this.an & 1) == 0) {
            this.aoM = new ArrayList<zj_1>(this.aoM);
            this.an |= 1;
        }
    }

    @Override
    public List<zj_1> azN() {
        if (this.aoP == null) {
            return Collections.unmodifiableList(this.aoM);
        }
        return this.aoP.getMessageList();
    }

    @Override
    public int azP() {
        if (this.aoP == null) {
            return this.aoM.size();
        }
        return this.aoP.getCount();
    }

    @Override
    public zj_1 kU(int n) {
        if (this.aoP == null) {
            return this.aoM.get(n);
        }
        return (zj_1)this.aoP.getMessage(n);
    }

    public zh_1 a(int n, zj_1 zj_12) {
        if (this.aoP == null) {
            if (zj_12 == null) {
                throw new NullPointerException();
            }
            this.aAa();
            this.aoM.set(n, zj_12);
            this.onChanged();
        } else {
            this.aoP.setMessage(n, (AbstractMessage)zj_12);
        }
        return this;
    }

    public zh_1 a(int n, zl_1 zl_12) {
        if (this.aoP == null) {
            this.aAa();
            this.aoM.set(n, zl_12.aAq());
            this.onChanged();
        } else {
            this.aoP.setMessage(n, (AbstractMessage)zl_12.aAq());
        }
        return this;
    }

    public zh_1 a(zj_1 zj_12) {
        if (this.aoP == null) {
            if (zj_12 == null) {
                throw new NullPointerException();
            }
            this.aAa();
            this.aoM.add(zj_12);
            this.onChanged();
        } else {
            this.aoP.addMessage((AbstractMessage)zj_12);
        }
        return this;
    }

    public zh_1 b(int n, zj_1 zj_12) {
        if (this.aoP == null) {
            if (zj_12 == null) {
                throw new NullPointerException();
            }
            this.aAa();
            this.aoM.add(n, zj_12);
            this.onChanged();
        } else {
            this.aoP.addMessage(n, (AbstractMessage)zj_12);
        }
        return this;
    }

    public zh_1 a(zl_1 zl_12) {
        if (this.aoP == null) {
            this.aAa();
            this.aoM.add(zl_12.aAq());
            this.onChanged();
        } else {
            this.aoP.addMessage((AbstractMessage)zl_12.aAq());
        }
        return this;
    }

    public zh_1 b(int n, zl_1 zl_12) {
        if (this.aoP == null) {
            this.aAa();
            this.aoM.add(n, zl_12.aAq());
            this.onChanged();
        } else {
            this.aoP.addMessage(n, (AbstractMessage)zl_12.aAq());
        }
        return this;
    }

    public zh_1 aw(Iterable<? extends zj_1> iterable) {
        if (this.aoP == null) {
            this.aAa();
            AbstractMessageLite.Builder.addAll(iterable, this.aoM);
            this.onChanged();
        } else {
            this.aoP.addAllMessages(iterable);
        }
        return this;
    }

    public zh_1 aAb() {
        if (this.aoP == null) {
            this.aoM = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.aoP.clear();
        }
        return this;
    }

    public zh_1 kW(int n) {
        if (this.aoP == null) {
            this.aAa();
            this.aoM.remove(n);
            this.onChanged();
        } else {
            this.aoP.remove(n);
        }
        return this;
    }

    public zl_1 kX(int n) {
        return (zl_1)this.aAe().getBuilder(n);
    }

    @Override
    public zm_1 kV(int n) {
        if (this.aoP == null) {
            return this.aoM.get(n);
        }
        return (zm_1)this.aoP.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zm_1> azO() {
        if (this.aoP != null) {
            return this.aoP.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.aoM);
    }

    public zl_1 aAc() {
        return (zl_1)this.aAe().addBuilder((AbstractMessage)zj_1.aAm());
    }

    public zl_1 kY(int n) {
        return (zl_1)this.aAe().addBuilder(n, (AbstractMessage)zj_1.aAm());
    }

    public List<zl_1> aAd() {
        return this.aAe().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zj_1, zl_1, zm_1> aAe() {
        if (this.aoP == null) {
            this.aoP = new RepeatedFieldBuilderV3(this.aoM, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.aoM = null;
        }
        return this.aoP;
    }

    public final zh_1 gc(UnknownFieldSet unknownFieldSet) {
        return (zh_1)super.setUnknownFields(unknownFieldSet);
    }

    public final zh_1 gd(UnknownFieldSet unknownFieldSet) {
        return (zh_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gd(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gc(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gd(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cB(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cB(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cB(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gc(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.azW();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.azZ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gd(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cB(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.azW();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cB(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.azZ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gd(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gc(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gd(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cB(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cB(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cB(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gc(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.azZ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.azY();
    }

    public /* synthetic */ Message build() {
        return this.azX();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cB(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.azW();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.azZ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.azY();
    }

    public /* synthetic */ MessageLite build() {
        return this.azX();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.azW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.azU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.azU();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.azZ();
    }

    public /* synthetic */ Object clone() {
        return this.azZ();
    }
}

