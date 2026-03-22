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
 * Renamed from lV
 */
public final class lv_1
extends GeneratedMessageV3.Builder<lv_1>
implements lw_0 {
    private int an;
    private List<lx_0> Fr = Collections.emptyList();
    private RepeatedFieldBuilderV3<lx_0, lz_0, ma_0> Fw;

    public static final Descriptors.Descriptor ajd() {
        return ls_1.Jm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ls_1.Jn.ensureFieldAccessorsInitialized(lt_1.class, lv_1.class);
    }

    lv_1() {
        this.D();
    }

    lv_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lt_1.aJ()) {
            this.abF();
        }
    }

    public lv_1 aje() {
        super.clear();
        if (this.Fw == null) {
            this.Fr = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.Fw.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ls_1.Jm;
    }

    public lt_1 ajc() {
        return lt_1.ajb();
    }

    public lt_1 ajf() {
        lt_1 lt_12 = this.ajg();
        if (!lt_12.isInitialized()) {
            throw lv_1.newUninitializedMessageException((Message)lt_12);
        }
        return lt_12;
    }

    public lt_1 ajg() {
        lt_1 lt_12 = new lt_1(this);
        int n = this.an;
        if (this.Fw == null) {
            if ((this.an & 1) != 0) {
                this.Fr = Collections.unmodifiableList(this.Fr);
                this.an &= 0xFFFFFFFE;
            }
            lt_12.Fr = this.Fr;
        } else {
            lt_12.Fr = this.Fw.build();
        }
        this.onBuilt();
        return lt_12;
    }

    public lv_1 ajh() {
        return (lv_1)super.clone();
    }

    public lv_1 eI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lv_1)super.setField(fieldDescriptor, object);
    }

    public lv_1 bR(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lv_1)super.clearField(fieldDescriptor);
    }

    public lv_1 bR(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lv_1)super.clearOneof(oneofDescriptor);
    }

    public lv_1 bR(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lv_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lv_1 eJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lv_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public lv_1 bR(Message message) {
        if (message instanceof lt_1) {
            return this.c((lt_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lv_1 c(lt_1 lt_12) {
        if (lt_12 == lt_1.ajb()) {
            return this;
        }
        if (this.Fw == null) {
            if (!lt_12.Fr.isEmpty()) {
                if (this.Fr.isEmpty()) {
                    this.Fr = lt_12.Fr;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.abB();
                    this.Fr.addAll(lt_12.Fr);
                }
                this.onChanged();
            }
        } else if (!lt_12.Fr.isEmpty()) {
            if (this.Fw.isEmpty()) {
                this.Fw.dispose();
                this.Fw = null;
                this.Fr = lt_12.Fr;
                this.an &= 0xFFFFFFFE;
                this.Fw = lt_1.oB() ? this.abF() : null;
            } else {
                this.Fw.addAllMessages(lt_12.Fr);
            }
        }
        this.eJ(lt_1.b(lt_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.abn(); ++i) {
            if (this.hL(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public lv_1 hB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lt_1 lt_12 = null;
        try {
            lt_12 = (lt_1)lt_1.Jt.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lt_12 = (lt_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lt_12 != null) {
                this.c(lt_12);
            }
        }
        return this;
    }

    private void abB() {
        if ((this.an & 1) == 0) {
            this.Fr = new ArrayList<lx_0>(this.Fr);
            this.an |= 1;
        }
    }

    @Override
    public List<lx_0> abl() {
        if (this.Fw == null) {
            return Collections.unmodifiableList(this.Fr);
        }
        return this.Fw.getMessageList();
    }

    @Override
    public int abn() {
        if (this.Fw == null) {
            return this.Fr.size();
        }
        return this.Fw.getCount();
    }

    @Override
    public lx_0 hL(int n) {
        if (this.Fw == null) {
            return this.Fr.get(n);
        }
        return (lx_0)this.Fw.getMessage(n);
    }

    public lv_1 a(int n, lx_0 lx_02) {
        if (this.Fw == null) {
            if (lx_02 == null) {
                throw new NullPointerException();
            }
            this.abB();
            this.Fr.set(n, lx_02);
            this.onChanged();
        } else {
            this.Fw.setMessage(n, (AbstractMessage)lx_02);
        }
        return this;
    }

    public lv_1 a(int n, lz_0 lz_02) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.set(n, lz_02.ajG());
            this.onChanged();
        } else {
            this.Fw.setMessage(n, (AbstractMessage)lz_02.ajG());
        }
        return this;
    }

    public lv_1 a(lx_0 lx_02) {
        if (this.Fw == null) {
            if (lx_02 == null) {
                throw new NullPointerException();
            }
            this.abB();
            this.Fr.add(lx_02);
            this.onChanged();
        } else {
            this.Fw.addMessage((AbstractMessage)lx_02);
        }
        return this;
    }

    public lv_1 b(int n, lx_0 lx_02) {
        if (this.Fw == null) {
            if (lx_02 == null) {
                throw new NullPointerException();
            }
            this.abB();
            this.Fr.add(n, lx_02);
            this.onChanged();
        } else {
            this.Fw.addMessage(n, (AbstractMessage)lx_02);
        }
        return this;
    }

    public lv_1 a(lz_0 lz_02) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.add(lz_02.ajG());
            this.onChanged();
        } else {
            this.Fw.addMessage((AbstractMessage)lz_02.ajG());
        }
        return this;
    }

    public lv_1 b(int n, lz_0 lz_02) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.add(n, lz_02.ajG());
            this.onChanged();
        } else {
            this.Fw.addMessage(n, (AbstractMessage)lz_02.ajG());
        }
        return this;
    }

    public lv_1 ad(Iterable<? extends lx_0> iterable) {
        if (this.Fw == null) {
            this.abB();
            AbstractMessageLite.Builder.addAll(iterable, this.Fr);
            this.onChanged();
        } else {
            this.Fw.addAllMessages(iterable);
        }
        return this;
    }

    public lv_1 aji() {
        if (this.Fw == null) {
            this.Fr = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.Fw.clear();
        }
        return this;
    }

    public lv_1 hN(int n) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.remove(n);
            this.onChanged();
        } else {
            this.Fw.remove(n);
        }
        return this;
    }

    public lz_0 hO(int n) {
        return (lz_0)this.abF().getBuilder(n);
    }

    @Override
    public ma_0 hM(int n) {
        if (this.Fw == null) {
            return this.Fr.get(n);
        }
        return (ma_0)this.Fw.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ma_0> abm() {
        if (this.Fw != null) {
            return this.Fw.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Fr);
    }

    public lz_0 ajj() {
        return (lz_0)this.abF().addBuilder((AbstractMessage)lx_0.ajC());
    }

    public lz_0 hP(int n) {
        return (lz_0)this.abF().addBuilder(n, (AbstractMessage)lx_0.ajC());
    }

    public List<lz_0> abE() {
        return this.abF().getBuilderList();
    }

    private RepeatedFieldBuilderV3<lx_0, lz_0, ma_0> abF() {
        if (this.Fw == null) {
            this.Fw = new RepeatedFieldBuilderV3(this.Fr, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fr = null;
        }
        return this.Fw;
    }

    public final lv_1 eI(UnknownFieldSet unknownFieldSet) {
        return (lv_1)super.setUnknownFields(unknownFieldSet);
    }

    public final lv_1 eJ(UnknownFieldSet unknownFieldSet) {
        return (lv_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bR(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bR(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bR(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aje();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ajh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bR(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aje();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bR(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ajh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bR(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bR(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bR(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ajh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ajg();
    }

    public /* synthetic */ Message build() {
        return this.ajf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bR(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aje();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ajh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ajg();
    }

    public /* synthetic */ MessageLite build() {
        return this.ajf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aje();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ajc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ajc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hB(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ajh();
    }

    public /* synthetic */ Object clone() {
        return this.ajh();
    }
}

