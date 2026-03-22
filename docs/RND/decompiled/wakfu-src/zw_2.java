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
 *  com.google.protobuf.Internal$IntList
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zw
 */
public final class zw_2
extends GeneratedMessageV3.Builder<zw_2>
implements zx_2 {
    private int an;
    private int aof;
    private List<zq_2> aoh = Collections.emptyList();
    private RepeatedFieldBuilderV3<zq_2, zs_2, zt_2> aoo;
    private Internal.IntList aoj = zu_2.amY();
    private boolean aol;

    public static final Descriptors.Descriptor azd() {
        return zp_2.anK;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zp_2.anL.ensureFieldAccessorsInitialized(zu_2.class, zw_2.class);
    }

    zw_2() {
        this.D();
    }

    zw_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zu_2.aJ()) {
            this.azn();
        }
    }

    public zw_2 aze() {
        super.clear();
        this.aof = 0;
        this.an &= 0xFFFFFFFE;
        if (this.aoo == null) {
            this.aoh = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.aoo.clear();
        }
        this.aoj = zu_2.auN();
        this.an &= 0xFFFFFFFB;
        this.aol = false;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zp_2.anK;
    }

    public zu_2 azc() {
        return zu_2.azb();
    }

    public zu_2 azf() {
        zu_2 zu_22 = this.azg();
        if (!zu_22.isInitialized()) {
            throw zw_2.newUninitializedMessageException((Message)zu_22);
        }
        return zu_22;
    }

    public zu_2 azg() {
        zu_2 zu_22 = new zu_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            zu_22.aof = this.aof;
            n2 |= 1;
        }
        if (this.aoo == null) {
            if ((this.an & 2) != 0) {
                this.aoh = Collections.unmodifiableList(this.aoh);
                this.an &= 0xFFFFFFFD;
            }
            zu_22.aoh = this.aoh;
        } else {
            zu_22.aoh = this.aoo.build();
        }
        if ((this.an & 4) != 0) {
            this.aoj.makeImmutable();
            this.an &= 0xFFFFFFFB;
        }
        zu_22.aoj = this.aoj;
        if ((n & 8) != 0) {
            zu_22.aol = this.aol;
            n2 |= 2;
        }
        zu_22.an = n2;
        this.onBuilt();
        return zu_22;
    }

    public zw_2 azh() {
        return (zw_2)super.clone();
    }

    public zw_2 fY(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zw_2)super.setField(fieldDescriptor, object);
    }

    public zw_2 cz(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zw_2)super.clearField(fieldDescriptor);
    }

    public zw_2 cz(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zw_2)super.clearOneof(oneofDescriptor);
    }

    public zw_2 cz(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zw_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zw_2 fZ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zw_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zw_2 cz(Message message) {
        if (message instanceof zu_2) {
            return this.c((zu_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zw_2 c(zu_2 zu_22) {
        if (zu_22 == zu_2.azb()) {
            return this;
        }
        if (zu_22.ayP()) {
            this.kJ(zu_22.ayQ());
        }
        if (this.aoo == null) {
            if (!zu_22.aoh.isEmpty()) {
                if (this.aoh.isEmpty()) {
                    this.aoh = zu_22.aoh;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.azj();
                    this.aoh.addAll(zu_22.aoh);
                }
                this.onChanged();
            }
        } else if (!zu_22.aoh.isEmpty()) {
            if (this.aoo.isEmpty()) {
                this.aoo.dispose();
                this.aoo = null;
                this.aoh = zu_22.aoh;
                this.an &= 0xFFFFFFFD;
                this.aoo = zu_2.fa() ? this.azn() : null;
            } else {
                this.aoo.addAllMessages(zu_22.aoh);
            }
        }
        if (!zu_22.aoj.isEmpty()) {
            if (this.aoj.isEmpty()) {
                this.aoj = zu_22.aoj;
                this.an &= 0xFFFFFFFB;
            } else {
                this.azo();
                this.aoj.addAll((Collection)zu_22.aoj);
            }
            this.onChanged();
        }
        if (zu_22.ayW()) {
            this.ac(zu_22.ayX());
        }
        this.fZ(zu_2.b(zu_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.ayP()) {
            return false;
        }
        if (!this.ayW()) {
            return false;
        }
        for (int i = 0; i < this.ayT(); ++i) {
            if (this.kG(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zw_2 jz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zu_2 zu_22 = null;
        try {
            zu_22 = (zu_2)zu_2.aon.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zu_22 = (zu_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zu_22 != null) {
                this.c(zu_22);
            }
        }
        return this;
    }

    @Override
    public boolean ayP() {
        return (this.an & 1) != 0;
    }

    @Override
    public int ayQ() {
        return this.aof;
    }

    public zw_2 kJ(int n) {
        this.an |= 1;
        this.aof = n;
        this.onChanged();
        return this;
    }

    public zw_2 azi() {
        this.an &= 0xFFFFFFFE;
        this.aof = 0;
        this.onChanged();
        return this;
    }

    private void azj() {
        if ((this.an & 2) == 0) {
            this.aoh = new ArrayList<zq_2>(this.aoh);
            this.an |= 2;
        }
    }

    @Override
    public List<zq_2> ayR() {
        if (this.aoo == null) {
            return Collections.unmodifiableList(this.aoh);
        }
        return this.aoo.getMessageList();
    }

    @Override
    public int ayT() {
        if (this.aoo == null) {
            return this.aoh.size();
        }
        return this.aoo.getCount();
    }

    @Override
    public zq_2 kG(int n) {
        if (this.aoo == null) {
            return this.aoh.get(n);
        }
        return (zq_2)this.aoo.getMessage(n);
    }

    public zw_2 a(int n, zq_2 zq_22) {
        if (this.aoo == null) {
            if (zq_22 == null) {
                throw new NullPointerException();
            }
            this.azj();
            this.aoh.set(n, zq_22);
            this.onChanged();
        } else {
            this.aoo.setMessage(n, (AbstractMessage)zq_22);
        }
        return this;
    }

    public zw_2 a(int n, zs_2 zs_22) {
        if (this.aoo == null) {
            this.azj();
            this.aoh.set(n, zs_22.ayz());
            this.onChanged();
        } else {
            this.aoo.setMessage(n, (AbstractMessage)zs_22.ayz());
        }
        return this;
    }

    public zw_2 d(zq_2 zq_22) {
        if (this.aoo == null) {
            if (zq_22 == null) {
                throw new NullPointerException();
            }
            this.azj();
            this.aoh.add(zq_22);
            this.onChanged();
        } else {
            this.aoo.addMessage((AbstractMessage)zq_22);
        }
        return this;
    }

    public zw_2 b(int n, zq_2 zq_22) {
        if (this.aoo == null) {
            if (zq_22 == null) {
                throw new NullPointerException();
            }
            this.azj();
            this.aoh.add(n, zq_22);
            this.onChanged();
        } else {
            this.aoo.addMessage(n, (AbstractMessage)zq_22);
        }
        return this;
    }

    public zw_2 a(zs_2 zs_22) {
        if (this.aoo == null) {
            this.azj();
            this.aoh.add(zs_22.ayz());
            this.onChanged();
        } else {
            this.aoo.addMessage((AbstractMessage)zs_22.ayz());
        }
        return this;
    }

    public zw_2 b(int n, zs_2 zs_22) {
        if (this.aoo == null) {
            this.azj();
            this.aoh.add(n, zs_22.ayz());
            this.onChanged();
        } else {
            this.aoo.addMessage(n, (AbstractMessage)zs_22.ayz());
        }
        return this;
    }

    public zw_2 au(Iterable<? extends zq_2> iterable) {
        if (this.aoo == null) {
            this.azj();
            AbstractMessageLite.Builder.addAll(iterable, this.aoh);
            this.onChanged();
        } else {
            this.aoo.addAllMessages(iterable);
        }
        return this;
    }

    public zw_2 azk() {
        if (this.aoo == null) {
            this.aoh = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.aoo.clear();
        }
        return this;
    }

    public zw_2 kK(int n) {
        if (this.aoo == null) {
            this.azj();
            this.aoh.remove(n);
            this.onChanged();
        } else {
            this.aoo.remove(n);
        }
        return this;
    }

    public zs_2 kL(int n) {
        return (zs_2)this.azn().getBuilder(n);
    }

    @Override
    public zt_2 kH(int n) {
        if (this.aoo == null) {
            return this.aoh.get(n);
        }
        return (zt_2)this.aoo.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zt_2> ayS() {
        if (this.aoo != null) {
            return this.aoo.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.aoh);
    }

    public zs_2 azl() {
        return (zs_2)this.azn().addBuilder((AbstractMessage)zq_2.ayv());
    }

    public zs_2 kM(int n) {
        return (zs_2)this.azn().addBuilder(n, (AbstractMessage)zq_2.ayv());
    }

    public List<zs_2> azm() {
        return this.azn().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zq_2, zs_2, zt_2> azn() {
        if (this.aoo == null) {
            this.aoo = new RepeatedFieldBuilderV3(this.aoh, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.aoh = null;
        }
        return this.aoo;
    }

    private void azo() {
        if ((this.an & 4) == 0) {
            this.aoj = zu_2.e(this.aoj);
            this.an |= 4;
        }
    }

    @Override
    public List<Integer> ayU() {
        return (this.an & 4) != 0 ? Collections.unmodifiableList(this.aoj) : this.aoj;
    }

    @Override
    public int ayV() {
        return this.aoj.size();
    }

    @Override
    public int kI(int n) {
        return this.aoj.getInt(n);
    }

    public zw_2 j(int n, int n2) {
        this.azo();
        this.aoj.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public zw_2 kN(int n) {
        this.azo();
        this.aoj.addInt(n);
        this.onChanged();
        return this;
    }

    public zw_2 av(Iterable<? extends Integer> iterable) {
        this.azo();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.aoj);
        this.onChanged();
        return this;
    }

    public zw_2 azp() {
        this.aoj = zu_2.Ac();
        this.an &= 0xFFFFFFFB;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ayW() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean ayX() {
        return this.aol;
    }

    public zw_2 ac(boolean bl) {
        this.an |= 8;
        this.aol = bl;
        this.onChanged();
        return this;
    }

    public zw_2 azq() {
        this.an &= 0xFFFFFFF7;
        this.aol = false;
        this.onChanged();
        return this;
    }

    public final zw_2 fY(UnknownFieldSet unknownFieldSet) {
        return (zw_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zw_2 fZ(UnknownFieldSet unknownFieldSet) {
        return (zw_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fZ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fY(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fZ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cz(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cz(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cz(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fY(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aze();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.azh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fZ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cz(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aze();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cz(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.azh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fZ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fY(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fZ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cz(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cz(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cz(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fY(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.azh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.azg();
    }

    public /* synthetic */ Message build() {
        return this.azf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cz(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aze();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.azh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.azg();
    }

    public /* synthetic */ MessageLite build() {
        return this.azf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aze();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.azc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.azc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jz(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.azh();
    }

    public /* synthetic */ Object clone() {
        return this.azh();
    }
}

